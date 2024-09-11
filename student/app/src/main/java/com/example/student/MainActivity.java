package com.example.student;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final Object MODE_PRIVATE = ;
    EditText name;
        EditText phone;
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
        name =findViewById(R.id.et1);
        phone= findViewById(R.id.phn);
    }

    public void btn1(View view) {
        String name_str =name.getText().toString();
        String phone_str=phone.getText().toString();
        SharedPreferences share= getSharedPreference(this,MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();
        editor.name=getString("name",name_str);
    }

    }
