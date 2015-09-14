package com.example.ayla.handin1mobi1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.TintImageView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button about_button;
    private ImageView image_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Instantiate views
        about_button = (Button) findViewById(R.id.t3);
        image_view = (ImageView) findViewById(R.id.t6);

        //Attatch listener
        about_button.setOnClickListener(clickonbutton3);
        image_view.setOnClickListener(clickonimagelogo);

    }

    View.OnClickListener clickonbutton3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //create explicit intent
            Intent aboutintent = new Intent(MainActivity.this, Aboutactivity.class);
            startActivity(aboutintent);

        }
    };

    public static final String CONSTANT_COLOR = "CONSTANT_COLOR";
    View.OnClickListener clickonimagelogo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //create explicit intent with data
            Intent colorchangeintent = new Intent(MainActivity.this, ColorActivity.class);

            //data to be delivered with intent to activity
            int colordata = 42;

            //Add data to intent
            colorchangeintent.putExtra(CONSTANT_COLOR, colordata);

            //Launch activity
            startActivity(colorchangeintent);
        }
    };
/*
    View.OnClickListener clickonimagelogo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //create explicit intent
            Intent colorchangeintent = new Intent(MainActivity.this, ColorActivity.class);

            //Launch acitivity with forresult
            colorchangeintent.putExtra(CONSTANT_COLOR, colordata);

            //You will be noticed in onActivityResult when activity returns
            StartActivityForResult(colorchangeintent, CONSTANT_COLORREQUESTCODE);
        }
    };
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //shared entry points for activity returning

        if (requestCode == Constant_ColorRequestCode) { //check if colorchange is returning
            if (resultCode == RESULT_OK) {    //Check all went well in colorchange

                //get result lige other example, and show with toast
                String returnvalue = data.getExtras().getString(CONSTANT_COLOR_RETURN);
                Toast.makeText(this, "were back" + returnvalue, Toast.LENGTH_LONG).show();

            }
        }
*/
    }