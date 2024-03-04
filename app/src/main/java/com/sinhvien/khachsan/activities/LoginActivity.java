package com.sinhvien.khachsan.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import com.sinhvien.khachsan.R;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText txtUsrName, txtPassword;

    private void setComponents() {
        this.btnLogin = findViewById(R.id.btnLogin);
        this.txtUsrName = findViewById(R.id.txtUsrName);
        this.txtPassword = findViewById(R.id.txtPassword);
    }
    private void setActionLogin() {
        this.btnLogin.setOnClickListener(e -> {
            String usrName = this.txtUsrName.
                    getText().toString().trim();
            String password = this.txtPassword.
                    getText().toString().trim();
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        setComponents();
    }
}