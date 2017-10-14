package com.tongchen.gank2.model.impl;

import com.tongchen.gank2.model.GankModel;
import com.tongchen.gank2.request.GankRequest;

/**
 * Created by TongChen on 2017/10/10.
 * <p>
 * Description:
 */

public class GankModelImpl implements GankModel {


    @Override
    public void requestByCategory(String category, int count, int pageNo) {
        GankRequest gankRequest=new GankRequest(category,count,pageNo);


    }
}
