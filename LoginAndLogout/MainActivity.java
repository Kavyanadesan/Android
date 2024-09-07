package com.example.loginandlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
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

    public void button(View view) {
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        if(ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("admin")){
            Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show();
           //Intent intent=new Intent(MainActivity.this, MainActivity3.class);
            Intent lg_wc = new Intent(MainActivity.this,MainActivity3.class);

            Bundle bun = new Bundle();
            bun.putString("uname", ed1.getText().toString());
            bun.putString("pswd", ed2.getText().toString());

            lg_wc.putExtras(bun);

            startActivity(lg_wc);
            finish();
        }else{
            Toast.makeText(this, "Login not successful", Toast.LENGTH_SHORT).show();
        }
    }
}