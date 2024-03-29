package com.portalmafia.androidcardgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class EncyclopediaActivity extends AppCompatActivity {
    private WebView encyclopediaWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encyclopedia);

        encyclopediaWebView = findViewById(R.id.EncyclopediaWebView);
        encyclopediaWebView.setWebViewClient(new WebViewClient());
        encyclopediaWebView.loadUrl("http://necromancy.portalmafia.com/data/?cat=3");
    }
}
