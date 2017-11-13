package com.tongchen.gank2.view;

import com.tongchen.gank2.data.Android;
import com.tongchen.gank2.data.GankData;

/**
 * Created by TongChen on 2017/11/10.
 * <p>
 * Description:
 */

public interface GankView {

    void showError(String msg);

    void showResult(GankData<Android> result);
}
