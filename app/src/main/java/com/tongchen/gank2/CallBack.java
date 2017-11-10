package com.tongchen.gank2;

/**
 * Created by TongChen on 2017/11/10.
 * <p>
 * Description:
 */

public interface CallBack<T, V> {

    void success(T data);

    void failed(V data);
}
