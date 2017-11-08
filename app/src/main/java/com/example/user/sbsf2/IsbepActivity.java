package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IsbepActivity extends AppCompatActivity {

    private WebView mywebViewisbep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isbep);

        mywebViewisbep = (WebView) findViewById(R.id.webViewisbep);
        WebSettings webSettingsisbep = mywebViewisbep.getSettings();
        webSettingsisbep.setJavaScriptEnabled(true);
        mywebViewisbep.loadUrl("http://isbep.sbsfbd.com/");
        mywebViewisbep.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewisbep.canGoBack()){
            mywebViewisbep.goBack();
        } else {
            super.onBackPressed();

        }
    }
}


