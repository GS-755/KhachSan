package com.sinhvien.khachsan.data;

import android.util.Log;

import com.sinhvien.khachsan.api.client.Client;
import com.sinhvien.khachsan.models.Location;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LocationsData {
    // Locations data
    private ArrayList<Location> locations;

    // Singleton instance
    private static LocationsData
            instance = new LocationsData();

    private LocationsData() {
        try {
            fetchLocations();
        }
        catch(Exception ex) {
            Log.e("API-BUG", "Error fetching API: " + ex.getMessage());
        }
    }
    // Getter & setter for Singleton instance
    public static LocationsData getInstance() {
        return instance;
    }
    private static void setInstance(LocationsData instance) {
        LocationsData.instance = instance;
    }

    public ArrayList<Location> getLocations() {
        return this.locations;
    }
    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    private void fetchLocations() {
        Call<ArrayList<Location>> callLocations = Client.getInstance().
                getMyClient().getLocations();
        callLocations.enqueue(new Callback<ArrayList<Location>>() {
            @Override
            public void onResponse(Call<ArrayList<Location>> call,
                                   Response<ArrayList<Location>> response) {
                if(response.isSuccessful()) {
                    locations = response.body();
                }
                else {
                    Log.d("API-ERR", "API Error: " + response.message());
                }
            }
            @Override
            public void onFailure(Call<ArrayList<Location>> call, Throwable t) {
                Log.e("API-BUG", "Error fetching API: " + t.getMessage());
            }
        });
    }
}
