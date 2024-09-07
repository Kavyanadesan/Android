package com.example.loginandlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    TextView tv_un,tv_pa,t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            Bundle bdle = getIntent().getExtras();
            String un = bdle.getString("uname");
            String pa = bdle.getString("pswd");

            tv_un = (TextView) findViewById(R.id.t1);
            tv_pa = (TextView) findViewById(R.id.t2);

            tv_un.setText(un);
            tv_pa.setText(pa);

            return insets;
        });
    }

    public void logout(View view) {
        //Intent it = getIntent();
        //it.FLAG_ACTIVITY_CLEAR_TASK;
        Intent lgout = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(lgout);
        finish();
    }
}