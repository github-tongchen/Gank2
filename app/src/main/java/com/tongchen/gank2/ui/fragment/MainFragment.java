package com.tongchen.gank2.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tongchen.gank2.R;
import com.tongchen.gank2.bean.Gank;
import com.tongchen.gank2.presenter.impl.GankPresenterImpl;
import com.tongchen.gank2.ui.base.BaseDataFragment;
import com.tongchen.gank2.view.GankView;


public class MainFragment extends BaseDataFragment<GankView, GankPresenterImpl> implements GankView {


    public MainFragment() {

    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    @Override
    public void requestByCategorySuccess(Gank gank) {

    }

    @Override
    public void requestFailed(String msg) {

    }

}
