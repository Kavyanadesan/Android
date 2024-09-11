package com.example.registrationpage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Register(View view) {
        EditText value = findViewById(R.id.et_fname);
        String fname = value.getText().toString();

        value = findViewById(R.id.et_lname);
        String lname = value.getText().toString();

        value = findViewById(R.id.et_email);
        String email = value.getText().toString();

        value = findViewById(R.id.et_pswd);
        String pswd = value.getText().toString();

        value = findViewById(R.id.et_phone);
        String phone = value.getText().toString();

        value = findViewById(R.id.et_dob);
        String dob = value.getText().toString();

        RadioGroup rg = findViewById(R.id.rg_gender);
        int opt = rg.getCheckedRadioButtonId();
        RadioButton rb = findViewById(opt);
        String gender = rb.getText().toString();


        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("name", fname+" "+lname);
        editor.putString("email", email);
        editor.putString("ph", phone);
        editor.putString("dt", dob);
        editor.putString("gen", gender);
        editor.apply();

        Intent pass = new Intent(this, reg.class);
        startActivity(pass);
    }
}
