package com.example.actionbar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView r=(TextView) findViewById(R.id.text1);
        Intent i=getIntent();
        String s=i.getStringExtra("USERNAME IS:");
        r.setText(s);
        TextView r1=(TextView) findViewById(R.id.text2);
        Intent i1=getIntent();
        String s1=i1.getStringExtra("PASSWORD IS:");
        r1.setText(s1);
        TextView r2=(TextView) findViewById(R.id.text3);
        Intent i2=getIntent();
        String s2=i2.getStringExtra("EMAIL IS:");
        r2.setText(s2);
    }
}
