package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SbepActivity extends AppCompatActivity {

    private WebView mywebViewsbep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sbep);

        mywebViewsbep = (WebView) findViewById(R.id.webViewsbep);
        WebSettings webSettingssbep = mywebViewsbep.getSettings();
        webSettingssbep.setJavaScriptEnabled(true);
        mywebViewsbep.loadUrl("http://www.sbep.sbsfbd.com/");
        mywebViewsbep.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewsbep.canGoBack()){
            mywebViewsbep.goBack();
        } else {
            super.onBackPressed();

        }
    }
}


