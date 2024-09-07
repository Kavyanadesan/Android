package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    TextView tv;
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

        ed1=(EditText) findViewById(R.id.et1);
        ed2=(EditText) findViewById(R.id.et2);
        tv=(TextView) findViewById(R.id.textView);
    }

    public void add(View view) {
        double et1=Double.parseDouble(ed1.getText().toString());
        double et2=Double.parseDouble(ed2.getText().toString());
        double sum=et1+et2;
        tv.setText(Double.toString(sum));
    }
    public  void sub(View view){
        double et1=Double.parseDouble(ed1.getText().toString());
        double et2=Double.parseDouble(ed2.getText().toString());
        double diff=et1-et2;
        tv.setText(Double.toString(diff));
    }

    public void max(View view){
        double et1=Double.parseDouble(ed1.getText().toString());
        double et2=Double.parseDouble(ed2.getText().toString());
        double mul=et1*et2;
        tv.setText(Double.toString(mul));
    }

    public void div(View view){
        double et1=Double.parseDouble(ed1.getText().toString());
        double et2=Double.parseDouble(ed2.getText().toString());
        double div=et1/et2;
        tv.setText(Double.toString(div));
    }
}
