package com.potsane.retrofitdemo.network;

import com.potsane.retrofitdemo.entity.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by PMohale on 2018/06/13.
 */

public interface MovieService {

    @GET("movie/top_rated")
    Call<MoviesResponse> topMovies(@Query("api_key") String apiKey);
}
