package com.example.ayla.handin1mobi1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
    private Button picture_color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        //Instantiate views
        white_color = (Button) findViewById(R.id.t7);
        gray_color = (Button) findViewById(R.id.t8);
        black_color = (Button) findViewById(R.id.t9);
        picture_color = (Button) findViewById(R.id.t11);


        //Attatch listener
        white_color.setOnClickListener(clickonbutton7);
        gray_color.setOnClickListener(clickonbutton8);
        black_color.setOnClickListener(clickonbutton9);
        picture_color.setOnClickListener(clickonbutton11);

    }

    View.OnClickListener clickonbutton7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            boolean allwentwell = true;
            if (allwentwell) {
                Intent returnintent = new Intent();
                returnintent.putExtra("returnvalue", "white");
                setResult(RESULT_OK, returnintent);
            } else {
                Intent returnIntent = new Intent();
                setResult(RESULT_CANCELED, returnIntent);
            }
            finish();

        }
    };

    View.OnClickListener clickonbutton8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            boolean allwentwell = true;
            if (allwentwell) {
                Intent returnintent = new Intent();
                returnintent.putExtra("returnvalue", "gray");
                setResult(RESULT_OK, returnintent);
            } else {
                Intent returnIntent = new Intent();
                setResult(RESULT_CANCELED, returnIntent);
            }
            finish();
        }
    };

    private View.OnClickListener clickonbutton9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            boolean allwentwell = true;
            if (allwentwell) {
                Intent returnintent = new Intent();
                returnintent.putExtra("returnvalue", "black");
                setResult(RESULT_OK, returnintent);
            } else {
                Intent returnIntent = new Intent();
                setResult(RESULT_CANCELED, returnIntent);
            }
            finish();
        }
    };

    View.OnClickListener clickonbutton11 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            boolean allwentwell = true;
            if (allwentwell) {
                Intent returnintent = new Intent();
                returnintent.putExtra("returnvalue", "picture");
                setResult(RESULT_OK, returnintent);
            } else {
                Intent returnIntent = new Intent();
                setResult(RESULT_CANCELED, returnIntent);
            }
            finish();
        }

    };
}


