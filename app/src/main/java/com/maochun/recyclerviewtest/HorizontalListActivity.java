package com.maochun.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class HorizontalListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_list);


        String[] itemArray = new String[100];
        for(int i=0; i<100; i++){
            itemArray[i] = "Test item " + i;
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_test);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));
        TestListAdapter theAdapter = new TestListAdapter(this, itemArray);
        recyclerView.setAdapter(theAdapter);
    }
}