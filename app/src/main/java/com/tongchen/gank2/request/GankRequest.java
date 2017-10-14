package com.tongchen.gank2.request;

/**
 * Created by TongChen on 2017/10/14.
 * <p>
 * Description:
 */

public class GankRequest {

    private String category;
    private int count;
    private int pageNo;

    public GankRequest(String category, int count, int pageNo) {
        this.category = category;
        this.count = count;
        this.pageNo = pageNo;
    }
}
