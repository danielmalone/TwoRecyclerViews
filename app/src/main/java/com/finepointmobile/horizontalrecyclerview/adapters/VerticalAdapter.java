package com.finepointmobile.horizontalrecyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.finepointmobile.horizontalrecyclerview.R;

import java.util.ArrayList;

/**
 * Created by danielmalone on 2/3/17.
 */

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.ViewHolder> {

    private ArrayList<String> mDataset;

    public VerticalAdapter(ArrayList<String> dataset) {
        mDataset = dataset;
    }

    @Override
    public VerticalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lower_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VerticalAdapter.ViewHolder holder, int position) {
        holder.mTitle.setText(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            mTitle = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
