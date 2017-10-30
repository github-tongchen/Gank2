package com.tongchen.gank2.base;

/**
 * Created by TongChen on 2017/10/30.
 * <p>
 * Description:仿Google 官方 Android Architecture源码 todo-mvp-dagger 分支编写
 */

public interface BasePresenter<T> {

    /**
     * Binds presenter with a view when resumed. The Presenter will perform initialization here.
     *
     * @param view the view associated with this presenter
     */
    void takeView(T view);

    /**
     * Drops the reference to the view when destroyed
     */
    void dropView();
}
