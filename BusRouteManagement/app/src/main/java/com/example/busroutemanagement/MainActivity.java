package com.example.busroutemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvStart, tvDest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStart = findViewById(R.id.tvStart);
        tvDest = findViewById(R.id.tvDest);

        tvStart.setText(getIntent().getStringExtra("txtStart"));
        tvDest.setText(getIntent().getStringExtra("txtDest"));
    }
}