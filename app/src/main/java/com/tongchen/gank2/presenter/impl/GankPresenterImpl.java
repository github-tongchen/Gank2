package com.tongchen.gank2.presenter.impl;

import com.tongchen.gank2.model.impl.GankModelImpl;
import com.tongchen.gank2.presenter.GankPresenter;
import com.tongchen.gank2.view.GankView;

/**
 * Created by TongChen on 2017/10/14.
 * <p>
 * Description:
 */

public class GankPresenterImpl implements GankPresenter {

    private GankView mGankView;
    private GankModelImpl mGankModel;

    public GankPresenterImpl(GankView gankView) {
        this.mGankView = gankView;
        mGankModel = new GankModelImpl();
    }

    @Override
    public void requestByCategory(String category, int count, int pageNo) {
        mGankModel.requestByCategory(category, count, pageNo);
    }
}
