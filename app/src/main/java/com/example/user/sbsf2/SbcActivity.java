package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SbcActivity extends AppCompatActivity {

    private WebView mywebViewsbc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbc);

        mywebViewsbc = (WebView) findViewById(R.id.webViewsbc);
        WebSettings webSettingssbc = mywebViewsbc.getSettings();
        webSettingssbc.setJavaScriptEnabled(true);
        mywebViewsbc.loadUrl("http://socialbusinesscourse.sbsfbd.com/");
        mywebViewsbc.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewsbc.canGoBack()){
            mywebViewsbc.goBack();
        } else {
            super.onBackPressed();

        }
    }
}

