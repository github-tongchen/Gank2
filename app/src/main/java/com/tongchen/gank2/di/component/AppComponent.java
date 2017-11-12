package com.tongchen.gank2.di.component;

import com.tongchen.gank2.di.module.HttpModule;

import dagger.Component;

/**
 * Created by TongChen on 2017/11/12.
 * <p>
 * Description:
 */

@Component(modules = {HttpModule.class})
public interface AppComponent {


}
