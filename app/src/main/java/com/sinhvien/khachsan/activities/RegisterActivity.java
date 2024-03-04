package com.sinhvien.khachsan.activities;

import static com.sinhvien.khachsan.R.layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.sinhvien.khachsan.R;

public class RegisterActivity extends AppCompatActivity {
    private ImageView img_signup_back;

    private void setComponents() {
        this.img_signup_back = findViewById(R.id.img_signup_back_2nd);
    }
    private void setActionBack() {
        this.img_signup_back.setOnClickListener(e -> {
            Intent i = new Intent(this, WelcomeActivity.class);
            startActivity(i);
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.register_layout);

        setComponents();
        setActionBack();
    }
}