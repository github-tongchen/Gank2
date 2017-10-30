package com.tongchen.gank2.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by TongChen on 2017/10/18.
 * <p>
 * Description:
 */

public class BaseFragment extends SupportFragment {

    private Unbinder mUnbinder;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //  绑定ButterKnife
        mUnbinder = ButterKnife.bind(this, view);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //  解绑ButterKnife
        mUnbinder.unbind();
    }
}
