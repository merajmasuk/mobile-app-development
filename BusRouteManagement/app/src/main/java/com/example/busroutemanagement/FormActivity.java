package com.example.busroutemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {
    Button btnSubmit;
    TextView tvStart, tvDest, tvDateTime;
    EditText edtStart, edtDest, edtDateTime;

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        btnSubmit = findViewById(R.id.btnSubmit);
        tvStart = findViewById(R.id.tvStart);
        tvDest = findViewById(R.id.tvDest);
        edtStart = findViewById(R.id.edtStart);
        edtDest = findViewById(R.id.edtDest);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormActivity.this, MainActivity.class);
                intent.putExtra("txtStart", edtStart.getText().toString());
                intent.putExtra("txtDest", edtDest.getText().toString());
                startActivity(intent);
            }
        });
    }
}
