package com.example.actionbar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        EditText t1=(EditText) findViewById(R.id.edituser);
        EditText t2=(EditText) findViewById(R.id.editpass);
        EditText t3=(EditText) findViewById(R.id.editemail);
        Button b1=(Button) findViewById(R.id.sub);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),MainActivity3.class);
                String s=t1.getText().toString();
                String s11=t2.getText().toString();
                String s12=t3.getText().toString();
                if(!s12.isEmpty() && !s11.isEmpty() && !s.isEmpty())
                {
                    i1.putExtra("USERNAME IS:", s);
                    i1.putExtra("PASSWORD IS:", s11);
                    i1.putExtra("EMAIL IS:", s12);
                    Toast.makeText(MainActivity4.this, "DATA IS SUBMITTED", Toast.LENGTH_SHORT).show();
                    startActivity(i1);
                }
                else
                {
                    Toast.makeText(MainActivity4.this, "DATA CANNOT BE SUBMITTED", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

