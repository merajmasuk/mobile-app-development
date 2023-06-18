package com.example.class2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnShow;
    TextView tvShow;
    EditText edtName, edtPhone, edtEmail, edtAddress;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = findViewById(R.id.btnShow);
        tvShow = findViewById(R.id.tvShow);
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPhone = findViewById(R.id.edtPhone);
        edtAddress = findViewById(R.id.edtAddress);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sh="Name: "+(edtName.getText().toString().trim())
                        + "\nPhone: "+(edtPhone.getText().toString().trim())
                        + "\nEmail: "+(edtEmail.getText().toString().trim());
                sh += "\nAddress: "+(edtAddress.getText().toString().trim());

                tvShow.setText(sh);
            }
        });
    }
}