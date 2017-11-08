package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class JoinusActivity extends AppCompatActivity {

    private WebView mywebViewjoinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joinus);

        mywebViewjoinus = (WebView) findViewById(R.id.webViewjoinus);
        WebSettings webSettingsjoinus = mywebViewjoinus.getSettings();
        webSettingsjoinus.setJavaScriptEnabled(true);
        mywebViewjoinus.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfl2dxOAhEnmfIf1LZfOxrSKZcajFfzwFxG1RzD2ZtL6NPmhQ/viewform?c=0&w=1");
        mywebViewjoinus.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewjoinus.canGoBack()){
            mywebViewjoinus.goBack();
        } else {
            super.onBackPressed();

        }
    }
}

