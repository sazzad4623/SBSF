package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SpotlightActivity extends AppCompatActivity {

    private WebView mywebViewspotlight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotlight);

        mywebViewspotlight = (WebView) findViewById(R.id.webViewspotlight);
        WebSettings webSettingsspotlight = mywebViewspotlight.getSettings();
        webSettingsspotlight.setJavaScriptEnabled(true);
        mywebViewspotlight.loadUrl("http://www.sbep.sbsfbd.com/#spotlight");
        mywebViewspotlight.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewspotlight.canGoBack()){
            mywebViewspotlight.goBack();
        } else {
            super.onBackPressed();

        }
    }
}


