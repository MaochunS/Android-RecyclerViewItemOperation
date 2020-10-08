package com.maochun.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class SublistAdapter extends RecyclerView.Adapter<SublistAdapter.ViewHolder>  {

    Context mContext;
    String[] mItemArray = null;

    public SublistAdapter(Context context, String[] itemList) {
        this.mContext = context;
        mItemArray = itemList;
    }

    @Override
    public SublistAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater ll = LayoutInflater.from(mContext);
        View view = LayoutInflater.from(mContext).inflate(R.layout.cardview_subitem, parent, false);

        return new SublistAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final SublistAdapter.ViewHolder holder, int position) {

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