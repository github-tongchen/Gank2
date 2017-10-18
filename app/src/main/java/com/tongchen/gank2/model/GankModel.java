package com.tongchen.gank2.model;

import com.tongchen.gank2.RequestCallback;
import com.tongchen.gank2.bean.Gank;

/**
 * Created by TongChen on 2017/10/10.
 * <p>
 * Description:
 */

public interface GankModel {

    void requestByCategory(String category, int count, int pageNo, RequestCallback<Gank> requestCallback);
}
