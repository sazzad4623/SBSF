package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ContactActivity extends AppCompatActivity {

    private WebView mywebViewcontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        mywebViewcontact = (WebView) findViewById(R.id.webViewcontact);
        WebSettings webSettingscontact = mywebViewcontact.getSettings();
        webSettingscontact.setJavaScriptEnabled(true);
        mywebViewcontact.loadUrl("http://www.sbsfbd.com/#contact");
        mywebViewcontact.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewcontact.canGoBack()){
            mywebViewcontact.goBack();
        } else {
            super.onBackPressed();

        }
    }
}

