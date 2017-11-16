package com.tongchen.gank2.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by TongChen on 2017/11/16.
 * <p>
 * Description:
 */

@Module
public class AppModule {

    Context mApplicationContext;

    public AppModule(Application application) {
        this.mApplicationContext = application.getApplicationContext();
    }

    @Singleton
    @Provides
    Context provideApplicationContext() {
        return mApplicationContext;
    }
}
