package com.vigneashsundar.biller.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.vigneashsundar.biller.R;
import com.vigneashsundar.biller.model.shoppingitem;
import com.vigneashsundar.biller.sharedObjects.sharedCartData;
import com.vigneashsundar.biller.viewHolder.cart_items_view_holder;

import java.util.List;

public class cart_page_item_adapter extends RecyclerView.Adapter<cart_items_view_holder> {
    List<shoppingitem> cartItems;
    LayoutInflater mInflater;
    Context mContext;
    public cart_page_item_adapter(Context context){
        cartItems = sharedCartData.getInstance().cartItems;
        mInflater = LayoutInflater.from(context);
        mContext = context;
    }
    @NonNull
    @Override
    public cart_items_view_holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = mInflater.inflate(R.layout.cart_item,viewGroup,false);
        return new cart_items_view_holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull cart_items_view_holder cart_items_view_holder, int i) {
        shoppingitem currentItem = cartItems.get(i);
        cart_items_view_holder.cartItemName.setText(currentItem.getItem_name());
        cart_items_view_holder.cartItemDescription.setText(currentItem.getItem_description());
        cart_items_view_holder.cartItemQuantity.setText("Unit: 1");
        cart_items_view_holder.cartItemPrice.setText("$"+currentItem.getItem_price().toString());
        Glide.with(mContext)
                .load(currentItem.getItem_image())
                .fitCenter()
                .into(cart_items_view_holder.cartImage);

    }

    @Override
    public int getItemCount() {
        return cartItems.size();
    }
}
