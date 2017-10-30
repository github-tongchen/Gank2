package com.tongchen.gank2.ui;

import android.os.Bundle;
import android.support.v4.app.SupportActivity;
import android.widget.RelativeLayout;

import com.tongchen.gank2.R;

import me.yokeyword.fragmentation.Fragmentation;

public class MainActivity extends SupportActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout container=(RelativeLayout) findViewById(R.id.container);


        initViews();

    }

    private void initViews() {
        Fragmentation.builder()
                .stackViewMode(Fragmentation.BUBBLE)

                .install();

       /* FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        MainFragment fragment=MainFragment.newInstance();
        transaction.add(R.id.container,fragment);
        transaction.commit();*/


    }


}
