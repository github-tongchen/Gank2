package com.tongchen.gank2.http;

import android.content.Context;
import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by TongChen on 2017/10/17.
 * <p>
 * Description:
 */

public class RetrofitHelper {

    private Context mContext;
    private static RetrofitHelper mInstance = null;
    private Retrofit mRetrofit = null;

    public static RetrofitHelper getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new RetrofitHelper(context);
        }
        return mInstance;
    }

    public RetrofitService getServer() {
        return mRetrofit.create(RetrofitService.class);
    }

    private RetrofitHelper(Context context) {
        mContext = context;
        create();
    }

    private void create() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(HttpUrl.GANK_BASE_URL)
                .client(provideOkHttpClient(new OkHttpClient.Builder(), mContext))
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    private OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder, Context context) {
        int cacheSize = 10 * 1024 * 1024;
        File dir = new File(context.getCacheDir(), "GankCache");
        Cache cache = new Cache(dir, cacheSize);
        return builder
                .cache(cache)
                .addInterceptor(provideHttpLoggingInterceptor())
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build();
    }

    private HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                //打印retrofit日志
                Log.i("RetrofitLog", "retrofitBack = " + message);
            }
        }).setLevel(HttpLoggingInterceptor.Level.BODY);
    }


}
