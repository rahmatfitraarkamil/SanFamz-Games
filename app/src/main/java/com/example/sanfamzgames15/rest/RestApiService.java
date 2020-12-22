package com.example.sanfamzgames15.rest;

import com.example.sanfamzgames15.activities.GameListModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiService {
    @GET("api/games?page=1")
    Call<GameListModel> getList();
}
