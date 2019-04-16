package com.vigneashsundar.biller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vigneashsundar.biller.adapter.shopping_page_adapter;
import com.vigneashsundar.biller.interfaces.iStoreCart;
import com.vigneashsundar.biller.model.shoppingitem;

import java.util.ArrayList;
import java.util.List;

public class storeHome extends AppCompatActivity implements iStoreCart {
    shopping_page_adapter mAdapter;
    List<shoppingitem> mList;
    private ImageView cartButton;
    private ImageView manualPOS;
    private TextView cartCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_home);
        RecyclerView store_home_rv = findViewById(R.id.store_home_recycler);
        mList = new ArrayList<>();
        mAdapter = new shopping_page_adapter(mList,getApplicationContext(),this);
        GridLayoutManager grid = new GridLayoutManager(getApplicationContext(),2);
        cartButton = findViewById(R.id.cartButton);
        manualPOS = findViewById(R.id.manual_pos);
        cartCount = findViewById(R.id.cartCount);
        cartCount.setText("0");
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cartItem = new Intent(getApplicationContext(), store_cart_item.class);
                startActivity(cartItem);
            }
        });
        manualPOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manual = new Intent(getApplicationContext(),manul_pos.class);
                startActivity(manual);
            }
        });
        store_home_rv.setLayoutManager(grid);

        store_home_rv.setAdapter(mAdapter);
        mAdapter.setAdapter(mAdapter);
        updateUI();

    }
    public void updateUI(){
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));
        mList.add(new shoppingitem("Off White","Polo sneakers","https://i.pinimg.com/originals/06/e6/d2/06e6d2936dd7ba0b7cb5aa7705353cf7.jpg",125.00));

        mAdapter.dataChanged();
    }

    @Override
    public void updateCartData(String value) {
        cartCount.setText(value);
    }
}
