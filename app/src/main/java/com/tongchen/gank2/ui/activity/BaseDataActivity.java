package com.tongchen.gank2.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by TongChen on 2017/11/16.
 * <p>
 * Description: Activity 基类，需要处理数据的继承此类
 */

public abstract class BaseDataActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    protected abstract void inject2Activity();
}
