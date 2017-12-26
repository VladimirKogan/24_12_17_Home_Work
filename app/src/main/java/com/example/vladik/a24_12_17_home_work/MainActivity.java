package com.example.vladik.a24_12_17_home_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startName = findViewById(R.id.name_btn);
        startName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name_str = findViewById(R.id.name_input);
                str = String.valueOf(name_str.getText());
                Intent intent = new Intent("telran.java17.name.action");
                intent.putExtra("VALUE", str);
                startActivity(intent);
            }
        });

        Button startPhone = findViewById(R.id.phone_btn);
        startPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText phone_str = findViewById(R.id.phone_input);
                str = String.valueOf(phone_str.getText());
                Intent intent = new Intent("telran.java17.phone.action");
                intent.putExtra("VALUE", str);
                startActivity(intent);
            }
        });

        Button startAdress = findViewById(R.id.adress_btn);
        startAdress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText adress_str = findViewById(R.id.adress_input);
                str = String.valueOf(adress_str.getText());
                Intent intent = new Intent("telran.java17.adress.action");
                intent.putExtra("VALUE", str);
                startActivity(intent);
            }
        });
    }
}
