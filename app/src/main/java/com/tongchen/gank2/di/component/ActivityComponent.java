package com.tongchen.gank2.di.component;

import com.tongchen.gank2.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by TongChen on 2017/11/16.
 * <p>
 * Description:
 */

@Component(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject();
}
