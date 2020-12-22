package com.example.sanfamzgames15.rest;

import com.example.sanfamzgames15.rest.RestApiService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    private static RestApiService service;

    public static RestApiService getService(){
        if (service==null){
            String BASE_URL = "https://api.rawg.io/";

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

            Retrofit retrofit = builder.client(httpClient.build()).build();

            service = retrofit.create(RestApiService.class);
        }
        return service;
    }
}
