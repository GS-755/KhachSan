package com.sinhvien.khachsan.api;

import com.sinhvien.khachsan.config.AppProperties;
import com.sinhvien.khachsan.models.Account;
import com.sinhvien.khachsan.models.Location;
import com.sinhvien.khachsan.models.User;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IApi {
    String API_URL = AppProperties.getInstance().
            getApiUrl().trim();

    // Locations API
    @GET("locations")
    Call<ArrayList<Location>> getLocations();
    // Users API
    @GET("users")
    Call<ArrayList<User>> getUsers();
    @GET("users")
    Call<ArrayList<User>> getUsers(@Query("id") String id);
    // Accounts API
    @POST("accounts")
    Call<Account> login(@Query("usrName") String usrName,
                                   @Query("password") String password);
    @Headers("Content-Type: application/json")
    @POST("accounts")
    Call<Account> register(@Body Account account);
}
