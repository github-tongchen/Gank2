package com.tongchen.gank2.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.tongchen.gank2.R;
import com.tongchen.gank2.bean.Gank;
import com.tongchen.gank2.bean.Result;
import com.tongchen.gank2.presenter.impl.GankPresenterImpl;
import com.tongchen.gank2.view.GankView;

public class MainActivity extends AppCompatActivity implements GankView {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        initViews();




    }

    private void initViews() {
        GankPresenterImpl gank = new GankPresenterImpl(this);
        gank.attachView((GankView) this);
        gank.requestByCategory("Android", 10, 1);
    }


    @Override
    public void requestByCategorySuccess(Gank gank) {
        for (Result result : gank.getResults()) {
            Log.d("Success", result.getUrl());
        }
    }

    @Override
    public void requestFailed(String msg) {

    }
}
