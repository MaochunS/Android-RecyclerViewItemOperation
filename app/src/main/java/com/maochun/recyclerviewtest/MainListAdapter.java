package com.maochun.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.ViewHolder>  {

    Context mContext;
    String[] mItemArray = null;

    public MainListAdapter(Context context, String[] itemList) {
        this.mContext = context;
        mItemArray = itemList;
    }

    @Override
    public MainListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater ll = LayoutInflater.from(mContext);
        View view = LayoutInflater.from(mContext).inflate(R.layout.cardview_mainitem, parent, false);

        return new MainListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MainListAdapter.ViewHolder holder, int position) {

        holder.textviewItem.setText(String.valueOf(mItemArray[position]));
    }

    @Override
    public int getItemCount() {
        return mItemArray.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView textviewItem;
        RecyclerView testRecyclerView;
        SublistAdapter mAdapter;

        ViewHolder(View itemView) {
            super(itemView);

            String[] itemArray = new String[10];
            for(int i=0; i<10; i++){
                itemArray[i] = "Subitem " + i;
            }

            textviewItem = itemView.findViewById(R.id.textView_test);
            //final CardView cardView = itemView.findViewById(R.id.recyclerview_subitem);

            testRecyclerView = (RecyclerView)itemView.findViewById(R.id.recyclerview_subitem);
            testRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

            mAdapter = new SublistAdapter(mContext, itemArray);
            testRecyclerView.setAdapter(mAdapter);

        }

    }
}