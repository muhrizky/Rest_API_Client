package com.student.muhammadrizqi.kontak.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Muhammad Rizqi on 22/03/2018.
 */

public class ApiClient {
    public static final String BASE_URL = "http://192.168.1.7/rest_ci/index.php/";
    private static Retrofit retrofit = null;
    public  static Retrofit getClient(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
