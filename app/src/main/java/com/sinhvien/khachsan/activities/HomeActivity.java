package com.sinhvien.khachsan.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import com.sinhvien.khachsan.R;
import com.sinhvien.khachsan.api.client.Client;
import com.sinhvien.khachsan.models.Location;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {
    ArrayList<Location> locations;

    protected void setComponents() {
        this.locations = new ArrayList<>();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        setComponents();
    }
}
