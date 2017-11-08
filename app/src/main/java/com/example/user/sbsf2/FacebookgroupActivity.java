package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookgroupActivity extends AppCompatActivity {

    private WebView mywebViewfacebookgroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebookgroup);

        mywebViewfacebookgroup = (WebView) findViewById(R.id.webViewfacebookgroup);
        WebSettings webSettingsfacebookgroup = mywebViewfacebookgroup.getSettings();
        webSettingsfacebookgroup.setJavaScriptEnabled(true);
        mywebViewfacebookgroup.loadUrl("https://www.facebook.com/groups/452899881534859/");
        mywebViewfacebookgroup.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewfacebookgroup.canGoBack()){
            mywebViewfacebookgroup.goBack();
        } else {
            super.onBackPressed();

        }
    }
}

