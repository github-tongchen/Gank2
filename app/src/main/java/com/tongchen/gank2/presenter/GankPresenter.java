package com.tongchen.gank2.presenter;

import com.tongchen.gank2.CallBack;

/**
 * Created by TongChen on 2017/11/10.
 * <p>
 * Description:
 */

public interface GankPresenter {

    void getGankData(String category, int page, int size, CallBack callBack);
}
