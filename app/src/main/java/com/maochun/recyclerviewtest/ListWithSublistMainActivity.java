package com.maochun.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class ListWithSublistMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_with_sublist_main);

        String[] itemArray = new String[10];
        for(int i=0; i<10; i++){
            itemArray[i] = "Test item " + i;
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_test);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        MainListAdapter theAdapter = new MainListAdapter(this, itemArray);
        recyclerView.setAdapter(theAdapter);
    }
}