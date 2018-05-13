package com.example.damian.lmapp.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Damian on 13.05.2018.
 */

public class ApiService {

    public static ApiClient getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.theaudiodb.com/api/v1/json/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiClient.class);


    }

}
