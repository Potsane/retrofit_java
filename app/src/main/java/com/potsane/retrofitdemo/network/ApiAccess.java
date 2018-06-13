package com.potsane.retrofitdemo.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by PMohale on 2018/06/13.
 */

public class ApiAccess {

    private static Retrofit retrofit = null;
    public static final String URL = "http://api.themoviedb.org/3/";

    public static Retrofit createRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
