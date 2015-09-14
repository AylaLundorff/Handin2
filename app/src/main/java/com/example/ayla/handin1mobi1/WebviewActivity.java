package com.example.ayla.handin1mobi1;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        String url = "http://google.com/";
        WebView view = (WebView) this.findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

       /* //Instantiate view
        Button bv = (Button) findViewById(R.id.t4);

        //Attatch view
        bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              */  //close activity, and hop off stack
                finish();

            }
        };