package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class WebsiteActivity extends AppCompatActivity {

    private WebView mywebViewwebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        mywebViewwebsite = (WebView) findViewById(R.id.webViewwebsite);
        WebSettings webSettingswebsite = mywebViewwebsite.getSettings();
        webSettingswebsite.setJavaScriptEnabled(true);
        mywebViewwebsite.loadUrl("http://www.sbsfbd.com/");
        mywebViewwebsite.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewwebsite.canGoBack()){
            mywebViewwebsite.goBack();
        } else {
            super.onBackPressed();

        }
    }
}


