package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Facebookpage1Activity extends AppCompatActivity {

    private WebView mywebViewfacebookpage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebookpage1);

        mywebViewfacebookpage1 = (WebView) findViewById(R.id.webViewfacebookpage1);
        WebSettings webSettingsfacebookpage1 = mywebViewfacebookpage1.getSettings();
        webSettingsfacebookpage1.setJavaScriptEnabled(true);
        mywebViewfacebookpage1.loadUrl("https://www.facebook.com/mvSBSF/");
        mywebViewfacebookpage1.setWebViewClient(new WebViewClient());
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewfacebookpage1.canGoBack()){
            mywebViewfacebookpage1.goBack();
        } else {
            super.onBackPressed();

        }
    }
}
