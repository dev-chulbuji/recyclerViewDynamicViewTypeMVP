package com.example.ladmusiciankim.exercisedynamicviewtype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ladmusiciankim.exercisedynamicviewtype.presenter.AnimalPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_lv) RecyclerView mLvItems;

    private AnimalPresenter mPresenter;
    private AnimalAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();

        getItems();
    }

    private void initView() {
        mAdapter = new AnimalAdapter(this);
        mLvItems.setAdapter(mAdapter);
        mLvItems.setLayoutManager(new LinearLayoutManager(this));
        mLvItems.setHasFixedSize(true);
    }

    private void getItems() {
        mPresenter = new AnimalPresenter(mAdapter);
        mPresenter.loadItems();
    }
}
