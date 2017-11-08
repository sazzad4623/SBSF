package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Facebookpage2Activity extends AppCompatActivity {

    private WebView mywebViewfacebookpage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebookpage2);

        mywebViewfacebookpage2 = (WebView) findViewById(R.id.webViewfacebookpage2);
        WebSettings webSettingsfacebookpage2 = mywebViewfacebookpage2.getSettings();
        webSettingsfacebookpage2.setJavaScriptEnabled(true);
        mywebViewfacebookpage2.loadUrl("https://www.facebook.com/SBSForum/");
        mywebViewfacebookpage2.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewfacebookpage2.canGoBack()){
            mywebViewfacebookpage2.goBack();
        } else {
            super.onBackPressed();

        }
    }
}
