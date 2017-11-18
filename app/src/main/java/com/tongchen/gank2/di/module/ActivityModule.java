package com.tongchen.gank2.di.module;

import android.support.v4.content.res.FontResourcesParserCompat;

import com.tongchen.gank2.view.BaseView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by TongChen on 2017/11/16.
 * <p>
 * Description:
 */

@Module
public class ActivityModule {

    BaseView mBaseView;

    public ActivityModule(BaseView baseView) {
        this.mBaseView = baseView;
    }


    @Provides
    BaseView provideBaseView() {
        return mBaseView;
    }
}
