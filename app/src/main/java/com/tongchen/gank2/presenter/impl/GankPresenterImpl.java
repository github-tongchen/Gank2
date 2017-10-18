package com.tongchen.gank2.presenter.impl;

import android.content.Context;

import com.tongchen.gank2.RequestCallback;
import com.tongchen.gank2.bean.Gank;
import com.tongchen.gank2.model.impl.GankModelImpl;
import com.tongchen.gank2.presenter.GankPresenter;
import com.tongchen.gank2.view.GankView;

/**
 * Created by TongChen on 2017/10/14.
 * <p>
 * Description:
 */

public class GankPresenterImpl extends BasePresenterImpl<GankView> implements GankPresenter {

    private GankModelImpl mGankModel;

    public GankPresenterImpl(Context context) {
        mGankModel = new GankModelImpl(context);
    }

    @Override
    public void requestByCategory(String category, int count, int pageNo) {
        mGankModel.requestByCategory(category, count, pageNo, new RequestCallback<Gank>() {
            @Override
            public void requestSuccess(Gank gank) {
                //if (isAttached()) {
                    getView().requestByCategorySuccess(gank);
                //}
            }

            @Override
            public void requestFailed(String errorMsg) {
                if (isAttached()) {
                    getView().requestFailed(errorMsg);
                }
            }
        });
    }

    @Override
    protected void requestCancel() {

    }
}
