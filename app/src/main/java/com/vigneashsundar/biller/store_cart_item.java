package com.vigneashsundar.biller;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.vigneashsundar.biller.adapter.cart_page_item_adapter;
import com.vigneashsundar.biller.dialogs.paymentDialog;

public class store_cart_item extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private cart_page_item_adapter mAdapter;
    private paymentDialog mPaymentDialog;
    private Button mPayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_cart_item);
        mRecyclerView = findViewById(R.id.cart_recycler);
        mAdapter = new cart_page_item_adapter(getApplicationContext());
        LinearLayoutManager mLinearLayout = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLinearLayout);
        mRecyclerView.setAdapter(mAdapter);
        mPaymentDialog = new paymentDialog(this);
        mPayButton = findViewById(R.id.payButton);
        mPayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaymentDialog.showDialog();
            }
        });

    }
}
