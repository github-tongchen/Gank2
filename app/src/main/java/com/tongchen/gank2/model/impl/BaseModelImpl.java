package com.tongchen.gank2.model.impl;

import com.tongchen.gank2.model.BaseModel;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by TongChen on 2017/10/17.
 * <p>
 * Description:
 */

public class BaseModelImpl implements BaseModel {

    private CompositeDisposable mCompositeDisposable;

    @Override
    public void registerDisposable(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }

    @Override
    public void unRegisterDisposable() {
        if (mCompositeDisposable != null) {
            //  mCompositeDisposable.dispose();
            mCompositeDisposable.clear();
        }
    }
}
