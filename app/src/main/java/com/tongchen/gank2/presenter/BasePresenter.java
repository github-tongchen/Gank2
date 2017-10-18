package com.tongchen.gank2.presenter;

/**
 * Created by TongChen on 2017/10/16.
 * <p>
 * Description:
 */

public interface BasePresenter<T> {

    void attachView(T view);

    boolean isAttached();

    T getView();

    void detachView();
}
