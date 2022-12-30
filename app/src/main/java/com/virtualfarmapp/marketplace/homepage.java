package com.virtualfarmapp.marketplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }
    public void openBuy(View view){
        Intent i = new Intent(this, BuyPage.class);
        startActivity(i);
    }
    public void openSell(View view){
        Intent i = new Intent(this, SellPage.class);
        startActivity(i);
    }
}