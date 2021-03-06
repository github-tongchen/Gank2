package com.tongchen.gank2.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tongchen.gank2.GankApp;
import com.tongchen.gank2.di.component.ActivityComponent;
import com.tongchen.gank2.di.component.DaggerActivityComponent;
import com.tongchen.gank2.di.module.ActivityModule;
import com.tongchen.gank2.view.BaseView;

/**
 * Created by TongChen on 2017/11/16.
 * <p>
 * Description: Activity 基类，需要处理数据的继承此类
 */

public abstract class BaseDataActivity extends BaseActivity implements BaseView {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .appComponent(GankApp.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build();
    }

    protected abstract void inject2Activity();
}
