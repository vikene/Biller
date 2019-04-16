package com.vigneashsundar.biller.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vigneashsundar.biller.R;

import org.w3c.dom.Text;

public class cart_items_view_holder extends RecyclerView.ViewHolder {
    public ImageView cartImage;
    public TextView    cartItemName;
    public TextView    cartItemDescription;
    public TextView    cartItemPrice;
    public TextView    cartItemQuantity;
    public cart_items_view_holder(@NonNull View itemView) {
        super(itemView);
        cartImage = itemView.findViewById(R.id.cart_item_image);
        cartItemName = itemView.findViewById(R.id.cart_item_name);
        cartItemDescription = itemView.findViewById(R.id.cart_item_description);
        cartItemPrice = itemView.findViewById(R.id.cart_item_price);
        cartItemQuantity = itemView.findViewById(R.id.cart_item_quantity);
    }
}
