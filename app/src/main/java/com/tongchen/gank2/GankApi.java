package com.tongchen.gank2;

import com.tongchen.gank2.data.Android;
import com.tongchen.gank2.data.GankData;
import com.tongchen.gank2.request.CategoryRequest;


import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;

/**
 * Created by TongChen on 2017/11/11.
 * <p>
 * Description:
 */

public interface GankApi {

    @GET
    Observable<GankData<Android>> getAndroidData(@Body CategoryRequest categoryRequest);

}
