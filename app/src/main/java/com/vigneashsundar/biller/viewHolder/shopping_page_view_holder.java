package com.vigneashsundar.biller.viewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.vigneashsundar.biller.R;

public class shopping_page_view_holder extends RecyclerView.ViewHolder {
    public ImageView shoping_item_image;
    public TextView shoping_item_name;
    public TextView shoping_item_description;
    public TextView shoping_item_price;
    public RelativeLayout shopping_item_click;
    public ImageView shoping_item_add_to_cart;

    public shopping_page_view_holder(@NonNull View itemView) {
        super(itemView);
        shoping_item_add_to_cart = itemView.findViewById(R.id.store_card_add_item);
        shoping_item_description = itemView.findViewById(R.id.store_card_item_description);
        shoping_item_image = itemView.findViewById(R.id.store_card_item_image);
        shoping_item_name = itemView.findViewById(R.id.store_card_item_name);
        shoping_item_price = itemView.findViewById(R.id.store_card_item_price);
        shopping_item_click = itemView.findViewById(R.id.store_card_item_layout);
    }
}
