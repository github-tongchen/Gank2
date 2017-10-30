package com.tongchen.gank2.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tongchen.gank2.presenter.impl.BasePresenterImpl;

/**
 * Created by TongChen on 2017/10/18.
 * <p>
 * Description:
 */

public class BaseDataFragment<V, T extends BasePresenterImpl<V>> extends BaseFragment {

    private T mPresenterImpl;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPresenterImpl.attachView((V)this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        mPresenterImpl.detachView();
    }
}
