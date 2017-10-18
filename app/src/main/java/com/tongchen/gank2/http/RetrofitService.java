package com.tongchen.gank2.http;


import com.tongchen.gank2.bean.Gank;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by TongChen on 2017/10/9.
 * <p>
 * Description:
 */

public interface RetrofitService {

    /**
     * 按日期获取数据
     *
     * @param year  年
     * @param month 月
     * @param date  日
     */
    @GET("day/{year}/{month}/{date}")
    Observable<Gank> requestByDate(@Path("year") String year, @Path("month") String month, @Path("date") String date);

    /**
     * 按分类获取数据
     *
     * @param category 数据类型： 福利 | Android | iOS | 休息视频 | 拓展资源 | 前端 | all
     * @param count    请求个数： 数字，大于0
     * @param pageNo   第几页：   数字，大于0
     */
    @GET("data/{category}/{count}/{page}")
    Observable<Gank> requestByCategory(@Path("category") String category, @Path("count") int count, @Path("page") int pageNo);

}
