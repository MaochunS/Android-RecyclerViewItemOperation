package com.maochun.recyclerviewtest;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;

/**
 * Created by maochuns.sun@gmail.com on 2020/6/15
 */
public class TestListAdapter extends RecyclerView.Adapter<TestListAdapter.ViewHolder>  {

    Context mContext;
    String[] mItemArray = null;

    public TestListAdapter(Context context, String[] itemList) {
        this.mContext = context;
        mItemArray = itemList;
    }

    @Override
    public TestListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater ll = LayoutInflater.from(mContext);
        View view = LayoutInflater.from(mContext).inflate(R.layout.cardview_test, parent, false);

        return new TestListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final TestListAdapter.ViewHolder holder, int position) {

        holder.textviewItem.setText(String.valueOf(mItemArray[position]));
    }

    @Override
    public int getItemCount() {
        return mItemArray.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView textviewItem;
        ViewHolder(View itemView) {
            super(itemView);

            textviewItem = itemView.findViewById(R.id.textView_test);
            final CardView cardView = itemView.findViewById(R.id.cardView_test);

            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){


                }
            });

        }

    }
}
