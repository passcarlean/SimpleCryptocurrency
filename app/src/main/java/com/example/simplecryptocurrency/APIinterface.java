package com.example.simplecryptocurrency;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface APIinterface {
    @Headers("X-CMC_PRO_API_KEY: dd41d785-df93-4129-8b2c-71e998b83b07")
    @GET("/v1/cryptocurrency/listings/latest?")
    Call<CardItems> getList(@Query("limit") String rows);
}
