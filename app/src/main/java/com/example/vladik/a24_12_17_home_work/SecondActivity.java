package com.example.vladik.a24_12_17_home_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if(intent.getAction().contains("name")){
            TextView tx = findViewById(R.id.name_output);
            String name = intent.getExtras().getString("VALUE", "EMPTY");
            tx.append(name);
            tx.setVisibility(View.VISIBLE);
        }

        if(intent.getAction().contains("phone")){
            TextView tx = findViewById(R.id.phone_output);
            String name = intent.getExtras().getString("VALUE", "EMPTY");
            tx.append(name);
            tx.setVisibility(View.VISIBLE);

        }

        if(intent.getAction().contains("adress")){
            TextView tx = findViewById(R.id.adress_output);
            String name = intent.getExtras().getString("VALUE", "EMPTY");
            tx.append(name);
            tx.setVisibility(View.VISIBLE);
        }
    }
}
