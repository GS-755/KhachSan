package com.sinhvien.khachsan.api.client;

import com.sinhvien.khachsan.api.IApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
    private static Client instance = new Client();
    private IApi myClient;

    private Client() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(this.myClient.API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.myClient = retrofit.create(IApi.class);
    }

    public IApi getMyClient() {
        return this.myClient;
    }
    public static synchronized Client getInstance() {
        return Client.instance;
    }
}
