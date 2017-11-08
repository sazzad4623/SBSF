package com.example.user.sbsf2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GameActivity extends AppCompatActivity {

    private WebView mywebViewgame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mywebViewgame = (WebView) findViewById(R.id.webViewgame);
        WebSettings webSettingsgame = mywebViewgame.getSettings();
        webSettingsgame.setJavaScriptEnabled(true);
        mywebViewgame.loadUrl("http://socialbusinessgame.sbsfbd.com/");
        mywebViewgame.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(mywebViewgame.canGoBack()){
            mywebViewgame.goBack();
        } else {
            super.onBackPressed();

        }
    }
}


