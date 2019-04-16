package com.vigneashsundar.biller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class manul_pos extends AppCompatActivity {
    private TextView posScreen;
    private RelativeLayout r1;
    private RelativeLayout r2;
    private RelativeLayout r3;
    private RelativeLayout r4;
    private RelativeLayout r5;
    private RelativeLayout r6;
    private RelativeLayout r7;
    private RelativeLayout r8;
    private RelativeLayout r9;
    private RelativeLayout r10;
    private RelativeLayout r11;
    private RelativeLayout r12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manul_pos);
        posScreen = findViewById(R.id.display);
        r1 = findViewById(R.id.number_1);
        r2 = findViewById(R.id.number_2);
        r3 = findViewById(R.id.number_3);
        r4 = findViewById(R.id.number_4);
        r5 = findViewById(R.id.number_5);
        r6 = findViewById(R.id.number_6);
        r7 = findViewById(R.id.number_7);
        r8 = findViewById(R.id.number_8);
        r9 = findViewById(R.id.number_9);
        r10 = findViewById(R.id.number_0);
        r11 = findViewById(R.id.number_dot);
        r12 = findViewById(R.id.number_back);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"1");
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"2");
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"3");
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"4");
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"5");
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"6");
            }
        });
        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"7");
            }
        });
        r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"8");
            }
        });
        r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"9");
            }
        });
        r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+"0");
            }
        });
        r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posScreen.setText(posScreen.getText()+".");
            }
        });
        r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(posScreen.getText().toString().length() != 1) {
                    posScreen.setText(posScreen.getText().toString().substring(0, posScreen.getText().toString().length() - 2));
                }
            }
        });

    }
}
