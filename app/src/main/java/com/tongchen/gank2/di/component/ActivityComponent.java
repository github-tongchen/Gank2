package com.tongchen.gank2.di.component;

import com.tongchen.gank2.di.module.ActivityModule;
import com.tongchen.gank2.di.scope.ActivityScope;
import com.tongchen.gank2.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by TongChen on 2017/11/16.
 * <p>
 * Description:
 */

@ActivityScope
@Component(dependencies = {AppComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity activity);


}
