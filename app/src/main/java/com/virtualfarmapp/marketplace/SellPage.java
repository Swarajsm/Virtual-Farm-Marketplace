package com.virtualfarmapp.marketplace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class SellPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_page);
    }
    TextInputEditText pName = findViewById(R.id.ad_title);
    TextInputEditText desc = findViewById(R.id.description);
    TextInputEditText price = findViewById(R.id.price);

}