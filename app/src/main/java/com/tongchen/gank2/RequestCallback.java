package com.tongchen.gank2;

/**
 * Created by TongChen on 2017/10/17.
 * <p>
 * Description:
 */

public interface RequestCallback<T> {

    void requestSuccess(T t);

    void requestFailed(String errorMsg);
}
