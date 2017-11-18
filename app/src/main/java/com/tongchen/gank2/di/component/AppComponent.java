package com.tongchen.gank2.di.component;

import android.content.Context;

import com.tongchen.gank2.GankApi;
import com.tongchen.gank2.di.module.ActivityModule;
import com.tongchen.gank2.di.module.AppModule;
import com.tongchen.gank2.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;

/**
 * Created by TongChen on 2017/11/12.
 * <p>
 * Description:
 * 1.Component中的方法，如果有返回值必须是从上面指定的依赖库(xxx.class)中取得的对象,方法名可以不一致，因为它主要是根据返回值类型来找依赖的，但是为了方便阅读，建议保持一致。
 * 2.另外如果Module没有提供@Provides方法，就需要在构造方法上加@Inject注解（Dagger查找实例的顺序是先找@Provides，再找@Inject）。
 * 3.当Component要被别的Component依赖时(使用dependencies时)，这里就必须写有对应返回值的方法，不写代表不向别的Component暴露此依赖。
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    ActivityComponent addSubComponent(ActivityModule module);

    Context provideApplicationContext();

    GankApi provideGankApi();

}
