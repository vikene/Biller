package com.vigneashsundar.biller.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.vigneashsundar.biller.R;
import com.vigneashsundar.biller.interfaces.iStoreCart;
import com.vigneashsundar.biller.model.shoppingitem;
import com.vigneashsundar.biller.sharedObjects.sharedCartData;
import com.vigneashsundar.biller.storeHome;
import com.vigneashsundar.biller.viewHolder.shopping_page_view_holder;

import java.util.ArrayList;
import java.util.List;


public class shopping_page_adapter extends RecyclerView.Adapter<shopping_page_view_holder> {
    private List<shoppingitem> availableitems;
    private LayoutInflater mInflater;
    private Context mContext;
    private shopping_page_adapter  myself;
    private iStoreCart updateReference;
    private List<shoppingitem> cartItems;
    public shopping_page_adapter(List<shoppingitem> availableitem, Context applicationContext, storeHome strh){
        this.availableitems = availableitem;
        this.mInflater = LayoutInflater.from(applicationContext);
        this.mContext = applicationContext;
        updateReference = strh;
        cartItems = sharedCartData.getInstance().cartItems;
    }
    public void setAdapter(shopping_page_adapter my){
        myself = my;
    }
    public void dataChanged(){
        myself.notifyDataSetChanged();
    }
    @NonNull
    @Override
    public shopping_page_view_holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =  mInflater.inflate(R.layout.store_card_item,viewGroup,false);
        return new shopping_page_view_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull shopping_page_view_holder shopping_page_view_holder, int i) {
        final shoppingitem currentItem = availableitems.get(i);
        shopping_page_view_holder.shoping_item_name.setText(currentItem.getItem_name());
        shopping_page_view_holder.shoping_item_description.setText(currentItem.getItem_description());
        shopping_page_view_holder.shoping_item_price.setText(currentItem.getItem_price().toString());
        Glide.with(mContext)
                .load(currentItem.getItem_image())
                .centerCrop()
                .placeholder(R.drawable.bitmap)
                .into(shopping_page_view_holder.shoping_item_image);
        Glide.with(mContext)
                .load(R.drawable.ic_add_black_24dp)
                .into(shopping_page_view_holder.shoping_item_add_to_cart);
        shopping_page_view_holder.shopping_item_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cartItems.add(currentItem);
                updateReference.updateCartData(cartItems.size()+"");
            }
        });
    }

    @Override
    public int getItemCount() {
        return availableitems.size();
    }
}
