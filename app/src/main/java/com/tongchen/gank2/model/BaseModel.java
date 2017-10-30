package com.tongchen.gank2.model;

import io.reactivex.disposables.Disposable;

/**
 * Created by TongChen on 2017/10/17.
 * <p>
 * Description:
 */

public interface BaseModel {

    void registerDisposable(Disposable disposable);

    void unRegisterDisposable();
}
