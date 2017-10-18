package com.tongchen.gank2.model.impl;

import android.content.Context;

import com.tongchen.gank2.RequestCallback;
import com.tongchen.gank2.bean.Gank;
import com.tongchen.gank2.http.RetrofitHelper;
import com.tongchen.gank2.http.RetrofitService;
import com.tongchen.gank2.model.GankModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by TongChen on 2017/10/10.
 * <p>
 * Description:
 */

public class GankModelImpl extends BaseModelImpl implements GankModel {

    private Context mContext;

    public GankModelImpl(Context context) {
        mContext = context;
    }

    @Override
    public void requestByCategory(String category, int count, int pageNo, final RequestCallback<Gank> requestCallback) {

        RetrofitService server = RetrofitHelper.getInstance(mContext).getServer();

        regist(server.requestByCategory(category, count, pageNo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())

                .subscribe(new Consumer<Gank>() {
                    @Override
                    public void accept(Gank gank) throws Exception {
                        requestCallback.requestSuccess(gank);
                    }
                }));

    }
}
