package com.tongchen.gank2.view;

import com.tongchen.gank2.bean.Gank;

/**
 * Created by TongChen on 2017/10/14.
 * <p>
 * Description:
 */

public interface GankView {

    void requestByCategorySuccess(Gank gank);

    void requestFailed(String msg);
}
