package com.tongchen.gank2.di.component;

import com.tongchen.gank2.di.module.GankModule;
import com.tongchen.gank2.model.GankModel;
import com.tongchen.gank2.ui.MainActivity;

import dagger.Component;

/**
 * Created by TongChen on 2017/11/13.
 * <p>
 * Description:
 */

@Component(modules = {GankModule.class})
public interface GankComponent {



    void inject(MainActivity activity);

}
