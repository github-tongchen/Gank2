package com.tongchen.gank2.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by TongChen on 2017/11/16.
 * <p>
 * Description: Activity基类,不需处理数据的继承此类
 */

public abstract class BaseActivity extends SupportActivity {

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        ButterKnife.bind(this);
        initView();
    }

    protected abstract void initView();
}
