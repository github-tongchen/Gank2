package com.tongchen.gank2.presenter.impl;

import com.tongchen.gank2.CallBack;
import com.tongchen.gank2.data.GankData;
import com.tongchen.gank2.presenter.GankPresenter;
import com.tongchen.gank2.view.GankView;

import javax.inject.Inject;

/**
 * Created by TongChen on 2017/11/10.
 * <p>
 * Description:
 */

public class GankPresenterImpl implements GankPresenter, CallBack<GankData, String> {

    @Inject
    GankView mGankView;

    @Inject
    public GankPresenterImpl(GankView gankView) {
        this.mGankView = gankView;
    }

    @Override
    public void getGankData(String category, int page, int size, CallBack callBack) {

    }

    @Override
    public void success(GankData data) {
        mGankView.showResult(data);
    }

    @Override
    public void failed(String data) {
        mGankView.showError(data);
    }
}
