package com.tongchen.gank2.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.SupportActivity;
import android.widget.RelativeLayout;

import com.tongchen.gank2.R;
import com.tongchen.gank2.ui.activity.BaseActivity;
import com.tongchen.gank2.ui.activity.BaseDataActivity;

import me.yokeyword.fragmentation.Fragmentation;

public class MainActivity extends BaseDataActivity {

    private static final String TAG = "MainActivity";


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout container = findViewById(R.id.container);


    }

    @Override
    protected void initView() {

    }

    @Override
    protected void inject2Activity() {

    }

}
