package com.tongchen.gank2.contract;

import com.tongchen.gank2.base.BasePresenter;
import com.tongchen.gank2.base.BaseView;

/**
 * Created by TongChen on 2017/10/30.
 * <p>
 * Description: 仿Google 官方 Android Architecture源码 todo-mvp-dagger 分支编写
 * <p>
 * This specifies the contract between the view and the presenter.
 */

public interface AndroidContract {

    interface View extends BaseView<Presenter> {

    }


    interface Presenter extends BasePresenter<View> {

    }
}
