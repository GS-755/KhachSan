package com.sinhvien.khachsan.data.accounts;

import android.util.Log;

import com.sinhvien.khachsan.api.client.Client;
import com.sinhvien.khachsan.models.User;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsersData {
    private ArrayList<User> users;
    private Call<ArrayList<User>> client;

    public UsersData() {
        this.users = new ArrayList<>();
        this.client = Client.getInstance().
                getMyClient().getUsers();
    }

    public User findUser(String cid) {
        String tmpCid = cid.trim();
        for(User item : this.users) {
            if(item.getCid().trim().equals(tmpCid)) {
                return item;
            }
        }

        return new User();
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public int getItemCount() {
        return this.users.size();
    }

    public void fetchUsers() {
        this.client.enqueue(new Callback<ArrayList<User>>() {
            @Override
            public void onResponse(Call<ArrayList<User>> call,
                                   Response<ArrayList<User>> response) {
                if(response.isSuccessful() || response.code() == 201) {
                    users = response.body();
                }
                else if(response.code() == 409) {
                    Log.d("API-ERR", "Conflict entity detected");
                }
                else {
                    Log.d("API-ERR", "Error fetching API");
                }
            }
            @Override
            public void onFailure(Call<ArrayList<User>> call, Throwable t) {
                Log.d("API-ERR", "Fetching API exception: " + t.getMessage());
            }
        });
    }
}
