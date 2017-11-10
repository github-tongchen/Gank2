package com.tongchen.gank2.presenter.impl;

import com.tongchen.gank2.CallBack;
import com.tongchen.gank2.data.GankData;
import com.tongchen.gank2.presenter.GankPresenter;

/**
 * Created by TongChen on 2017/11/10.
 * <p>
 * Description:
 */

public class GankPresenterImpl implements GankPresenter, CallBack<GankData, String> {


    @Override
    public void getGankData(String category, int page, int size, CallBack callBack) {

    }

    @Override
    public void success(GankData data) {

    }

    @Override
    public void failed(String data) {

    }
}
