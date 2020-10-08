package com.maochun.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MultipleItemListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_item_list);

        String[] itemArray = new String[20];
        for(int i=0; i<20; i++){
            itemArray[i] = "Test item " + i;
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_test);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL));
        TestListAdapter theAdapter = new TestListAdapter(this, itemArray);
        recyclerView.setAdapter(theAdapter);

    }
}