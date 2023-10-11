package com.example.busroutemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    TextView tvStart, tvDest, tvDateTime;
    EditText edtStart, edtDest, edtDateTime;

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShow = findViewById(R.id.tvShow);

        btnSubmit = findViewById(R.id.btnSubmit);
        tvStart = findViewById(R.id.tvStart);
        tvDest = findViewById(R.id.tvDest);
        tvDateTime = findViewById(R.id.tvDateTime);
        edtStart = findViewById(R.id.edtStart);
        edtDest = findViewById(R.id.edtDest);
        edtDateTime = findViewById(R.id.edtDateTime);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShow.setText("Button works!");
            }
        });
    }
}
