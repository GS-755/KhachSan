package com.sinhvien.khachsan.data.accounts;

import android.util.Log;

import com.sinhvien.khachsan.api.client.Client;
import com.sinhvien.khachsan.models.Account;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AccountsData {
    private Account account;
    private Call<Account> action;

    public AccountsData(Account registerAccount) {
        this.account = new Account();
        this.action = Client.getInstance().
                getMyClient().register(registerAccount);
    }
    public AccountsData(String userName, String password) {
        this.account = new Account();
        this.action = Client.getInstance().
                getMyClient().login(userName.trim(), password);
    }

    public Account getAccount() { return this.account; }
    public void setAccount(Account account) {
        this.account = account;
    }

    public void fetchAccount() {
        this.action.enqueue(new Callback<Account>() {
            @Override
            public void onResponse(Call<Account> call,
                                   Response<Account> response) {
                if(response.isSuccessful() || response.code() == 201) {
                    account = response.body();
                }
                else if(response.code() == 409) {
                    Log.d("API-ERR", "Conflict entity detected");
                }
                else {
                    Log.d("API-ERR", "Error fetching API");
                }
            }
            @Override
            public void onFailure(Call<Account> call, Throwable t) {
                Log.d("API-ERR", "Error fetching API: " + t.getMessage());
            }
        });
    }
}
