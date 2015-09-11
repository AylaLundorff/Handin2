package com.example.ayla.handin1mobi1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        //Get extras from Intent
        Bundle mybundle = getIntent().getExtras();

        //see if color is there
        if(mybundle!=null && mybundle.containsKey(MainActivity.CONSTANT_COLOR)) {

            //Get color
            int c = mybundle.getInt(MainActivity.CONSTANT_COLOR);

            //show in Toast

            Toast.makeText(this, "color:" + c, Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "nicolor:", Toast.LENGTH_LONG).show();

            //close activity, and hop off stack
            finish();

        }
    }
}
