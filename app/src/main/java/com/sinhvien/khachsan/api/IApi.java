package com.sinhvien.khachsan.api;

import com.sinhvien.khachsan.config.AppProperties;
import com.sinhvien.khachsan.models.Location;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IApi {
    String API_URL = AppProperties.getInstance().
            getApiUrl().trim();

    //add the following method
    @GET("locations")
    Call<ArrayList<Location>> getLocations();
}
