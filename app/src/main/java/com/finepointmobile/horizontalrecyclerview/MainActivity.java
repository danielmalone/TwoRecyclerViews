package com.finepointmobile.horizontalrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.finepointmobile.horizontalrecyclerview.adapters.MainAdapter;
import com.finepointmobile.horizontalrecyclerview.adapters.VerticalAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mLowerRecyclerView;

    private RecyclerView.Adapter mLowerAdapter;
    private RecyclerView.LayoutManager mLowerLayoutManager;

    private ArrayList<String> mDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDataset = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            mDataset.add("Item # " + i);
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new MainAdapter(mDataset);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mLowerRecyclerView = (RecyclerView) findViewById(R.id.lower_recycler_view);
        mLowerAdapter = new VerticalAdapter(mDataset);
        mLowerLayoutManager = new LinearLayoutManager(this);
        mLowerRecyclerView.setLayoutManager(mLowerLayoutManager);
        mLowerRecyclerView.setAdapter(mLowerAdapter);
    }
}
