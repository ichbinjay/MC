package com.example.actionbar;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.google_keep_icon);
        getSupportActionBar().setTitle("SecureNote");
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.search:
                Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.refresh:
                Toast.makeText(this, "Share Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.details:
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
                break;
            case R.id.hello:
                Toast.makeText(this, "Exiting The App", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.register:
                Intent i1=new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(i1);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
