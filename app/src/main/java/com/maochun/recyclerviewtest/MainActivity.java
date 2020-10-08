package com.maochun.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button verticalListButton = findViewById(R.id.button_single_vlist);
        Button horizontalButton = findViewById(R.id.button_single_hlist);
        Button multiListButton = findViewById(R.id.button_single_multilist);
        Button withSublistButton = findViewById(R.id.button_list_with_sub);

        verticalListButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(MainActivity.this, VerticalListActivity.class);
                startActivity(newIntent);
            }
        });

        horizontalButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(MainActivity.this, HorizontalListActivity.class);
                startActivity(newIntent);
            }
        });

        multiListButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(MainActivity.this, MultipleItemListActivity.class);
                startActivity(newIntent);
            }
        });

        withSublistButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(MainActivity.this, ListWithSublistMainActivity.class);
                startActivity(newIntent);
            }
        });

    }
}
