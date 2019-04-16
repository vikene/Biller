package com.vigneashsundar.biller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class landing extends AppCompatActivity {
    private TextView loginText;
    private Button signupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        signupButton = findViewById(R.id.signupbutton);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent(getApplicationContext(), com.vigneashsundar.biller.signup.class);
                startActivity(signup);
            }
        });
        loginText = findViewById(R.id.landinglogin);
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginActivity = new Intent(getApplicationContext(), login.class);
                startActivity(loginActivity);
            }
        });
    }
}
