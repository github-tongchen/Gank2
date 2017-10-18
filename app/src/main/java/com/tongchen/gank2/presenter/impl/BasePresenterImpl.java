package com.tongchen.gank2.presenter.impl;

import com.tongchen.gank2.presenter.BasePresenter;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Created by TongChen on 2017/10/16.
 * <p>
 * Description:
 */

public abstract class BasePresenterImpl<T> implements BasePresenter<T> {

    private Reference<T> mViewRef;

    @Override
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    @Override
    public boolean isAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    @Override
    public T getView() {
        return mViewRef.get();
    }

    @Override
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
        requestCancel();
    }

    protected abstract void requestCancel();
}
