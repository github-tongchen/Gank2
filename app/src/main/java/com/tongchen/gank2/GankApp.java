package com.tongchen.gank2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.tongchen.gank2.di.component.AppComponent;
import com.tongchen.gank2.di.component.DaggerAppComponent;
import com.tongchen.gank2.di.module.AppModule;

import me.yokeyword.fragmentation.Fragmentation;

/**
 * Created by TongChen on 2017/11/12.
 * <p>
 * Description:
 */

public class GankApp extends Application {

    private static AppComponent mAppComponent;
    private static Application mInstance;

    public static AppComponent getAppComponent() {
        if (mAppComponent == null) {
            mAppComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(mInstance))
                    .build();
        }
        return mAppComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        initFragmentation();
    }

    private void initFragmentation() {
        Fragmentation.builder()
                // 设置 栈视图 模式为 悬浮球模式
                // BUBBLE：悬浮球模式 SHAKE：摇一摇唤出   NONE：隐藏
                .stackViewMode(Fragmentation.BUBBLE)
                // debug参数为true时，遇到异常："Can not perform this action after onSaveInstanceState!"时，会抛出
                // false时，不会抛出，会捕获，可以在handleException()里监听到
                .debug(BuildConfig.DEBUG)
                // 在debug=false时，即线上环境时，上述异常会被捕获并回调ExceptionHandler
                .handleException(e -> {
                    // 建议在该回调处上传至我们的Crash监测服务器
                    // 以Bugtags为例子: 手动把捕获到的 Exception 传到 Bugtags 后台。
                    // Bugtags.sendException(e);
                })
                .install();
    }


}
