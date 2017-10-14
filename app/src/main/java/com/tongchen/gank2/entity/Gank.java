package com.tongchen.gank2.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by TongChen on 2017/10/9.
 * <p>
 * Description: JSON的最外层
 */
public class Gank {

    @SerializedName("error")
    private Boolean mError;
    @SerializedName("results")
    private List<Result> mResults;

    public Boolean getError() {
        return mError;
    }

    public void setError(Boolean error) {
        mError = error;
    }

    public List<Result> getResults() {
        return mResults;
    }

    public void setResults(List<Result> results) {
        mResults = results;
    }

}
