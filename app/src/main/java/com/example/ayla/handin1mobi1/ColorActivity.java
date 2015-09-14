package com.example.ayla.handin1mobi1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ColorActivity extends AppCompatActivity {

    private Button white_color;
    private Button gray_color;
    private Button black_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        //Instantiate views
        white_color = (Button) findViewById(R.id.t7);
        gray_color = (Button) findViewById(R.id.t8);
        black_color = (Button) findViewById(R.id.t9);

        //Attatch listener
        white_color.setOnClickListener(clickonbutton7);
        gray_color.setOnClickListener(clickonbutton8);
        black_color.setOnClickListener(clickonbutton9);


        //Get extras from Intent
        Bundle mybundle = getIntent().getExtras();

        //see if color is there
        if(mybundle!=null && mybundle.containsKey(MainActivity.CONSTANT_COLOR)) {

            //Get color
            int c = mybundle.getInt(MainActivity.CONSTANT_COLOR);

            //show in Toast

            Toast.makeText(this, "This is Aylas color:" + c, Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "This is Chr. nicolor:", Toast.LENGTH_LONG).show();

            //close activity, and hop off stack
            finish();

        }
    }

    View.OnClickListener clickonbutton7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //data to be delivered with intent to activity
            int newColor = -1;
            setContentView(R.layout.activity_main);
            //Toast.makeText(this, "Choosen color is Gray:" + newColor, Toast.LENGTH_LONG).show();

        }
    };

    View.OnClickListener clickonbutton8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //data to be delivered with intent to activity
            int newColor = -7829368;
            //Toast.makeText(this, "Choosen color is Gray:" + newColor, Toast.LENGTH_LONG).show();
        }
    };

    View.OnClickListener clickonbutton9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //data to be delivered with intent to activity
            int newColor = -16777216;
            //Toast.makeText(this, "Choosen color is Black:" + newColor, Toast.LENGTH_LONG).show();
        }
    };
}
