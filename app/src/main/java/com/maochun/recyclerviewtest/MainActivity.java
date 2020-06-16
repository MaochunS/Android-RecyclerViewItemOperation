package com.maochun.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] itemArray = new String[100];
        for(int i=0; i<100; i++){
            itemArray[i] = "Test item " + i;
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_test);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        TestListAdapter theAdapter = new TestListAdapter(this, itemArray);
        recyclerView.setAdapter(theAdapter);
    }
}
