package com.example.ayla.handin1mobi1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.TintImageView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Button about_button;
    private ImageView image_view;
    private Button login_button;
    private Button sendemail_button;
    private LinearLayout mainlayout;
    private TableLayout mainlayoutland;

    private static final int CONSTANT_COLORREQUESTCODE = 1;
    private static final String MY_PREFERENCES = "MY_PREFERENCES";
    private static final String MY_COLORPREFERENCES = "MY_COLORPREFERENCES";

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            Log.d(TAG, "OnCreate() Restoring previous state");
            /* restore state */
        } else {
            Log.d(TAG, "OnCreate() No saved state available");
            /* initialize app */
        }

        setContentView(R.layout.activity_main);

        //Instantiate views
        about_button = (Button) findViewById(R.id.t3);
        image_view = (ImageView) findViewById(R.id.t6);
        login_button = (Button) findViewById(R.id.t1);
        sendemail_button = (Button) findViewById(R.id.t2);
        mainlayout = (LinearLayout) findViewById(R.id.mainlayout);
        mainlayoutland = (TableLayout) findViewById(R.id.mainlayoutland);

        //Attatch listener
        about_button.setOnClickListener(clickonbutton3);
        image_view.setOnClickListener(clickonimagelogo);
        login_button.setOnClickListener(clickonbutton1);
        sendemail_button.setOnClickListener(clickonbutton2);

    }

    View.OnClickListener clickonbutton3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //create explicit intent
            Intent aboutintent = new Intent(MainActivity.this, Aboutactivity.class);
            startActivity(aboutintent);
        }
    };

    View.OnClickListener clickonbutton1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //create explicit intent
            Intent webviewintent = new Intent(MainActivity.this, WebviewActivity.class);
            startActivity(webviewintent);
        }

    };
    View.OnClickListener clickonbutton2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //create explicit intent
            Intent webviewintent = new Intent(MainActivity.this, SendEmailActivity.class);
            startActivity(webviewintent);
        }

    };

    public static final String CONSTANT_COLOR = "CONSTANT_COLOR";


    View.OnClickListener clickonimagelogo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //create explicit intent
            Intent colorchangeintent = new Intent(MainActivity.this, ColorActivity.class);

            //Launch acitivity with forresult

            //You will be noticed in onActivityResult when activity returns
            startActivityForResult(colorchangeintent, CONSTANT_COLORREQUESTCODE);
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //shared entry points for activity returning

        if (requestCode == CONSTANT_COLORREQUESTCODE) { //check if colorchange is returning
            if (resultCode == RESULT_OK) {    //Check all went well in colorchange

                //get result lige other example, and show with toast
                String returnvalue = data.getExtras().getString("returnvalue");
                if (returnvalue.equals("white")) {
                    if (mainlayoutland != null) {
                        mainlayoutland.setBackgroundColor(Color.WHITE);
                    } else {
                        mainlayout.setBackgroundColor(Color.WHITE);
                    }
                } else if (returnvalue.equals("gray")) {
                    if (mainlayoutland != null) {
                        mainlayoutland.setBackgroundColor(Color.GRAY);
                    } else {
                        mainlayout.setBackgroundColor(Color.GRAY);
                    }
                } else if (returnvalue.equals("black")) {
                    if (mainlayoutland != null) {
                        mainlayoutland.setBackgroundColor(Color.BLACK);
                    } else {
                        mainlayout.setBackgroundColor(Color.BLACK);
                    }
                } else if (returnvalue.equals("picture")) {
                    if (mainlayoutland != null) {
                        mainlayoutland.setBackgroundResource(R.drawable.landscape_background_bm);
                    } else {
                        mainlayout.setBackgroundResource(R.drawable.landscape_background_bm_cropped);
                    }
                }

                //  Toast.makeText(this, "were back", Toast.LENGTH_LONG).show();

            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        // save the instance variables
        SharedPreferences prefs = getSharedPreferences(MY_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor edit = prefs.edit();
        edit.putString(MY_COLORPREFERENCES, "returnvalue");
        edit.apply();
    }

/*
    @Override
    public void onResume() {
        super.onResume();
        //get shared preferences
        SharedPreferences prefs = getSharedPreferences(MY_PREFERENCES, MODE_PRIVATE);
        //Retrieve values
        String
        //get the instance variables
                white_color = savedColor.getInt("white", white_color);
        gray_color = savedColor.getInt("gray", gray_color);
        black_color = savedColor.getInt("blue", black_color);
    }
    */

}
