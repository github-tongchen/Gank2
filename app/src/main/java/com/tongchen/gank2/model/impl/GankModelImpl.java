package com.tongchen.gank2.model.impl;

import com.tongchen.gank2.CallBack;
import com.tongchen.gank2.CategoryRequest;
import com.tongchen.gank2.data.GankData;
import com.tongchen.gank2.model.GankModel;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by TongChen on 2017/11/10.
 * <p>
 * Description:
 */

public class GankModelImpl implements GankModel {

    private CallBack mCallBack;

    @Override
    public void getGankData(String category, int page, int size) {


        CategoryRequest request = new CategoryRequest();
        request.mCategoryName = category;
        request.mPage = page;
        request.mSize = size;

        Observable.create(new ObservableOnSubscribe<GankData>() {
            @Override
            public void subscribe(ObservableEmitter<GankData> e) throws Exception {

            }
        })

                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GankData>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(GankData gankData) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
