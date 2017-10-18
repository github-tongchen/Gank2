package com.tongchen.gank2.model;

import io.reactivex.disposables.Disposable;

/**
 * Created by TongChen on 2017/10/17.
 * <p>
 * Description:
 */

public interface BaseModel {

    void register(Disposable disposable);

    void unRegister();
}
