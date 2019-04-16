package com.vigneashsundar.biller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent landing = new Intent(splashScreen.this, com.vigneashsundar.biller.landing.class);
        startActivity(landing);
    }
}
