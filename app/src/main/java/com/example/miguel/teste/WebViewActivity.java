package com.example.miguel.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebviewMethod();
    }


    private void WebviewMethod () {
     webview = (WebView) findViewById(R.id.webview_id);

     webview.loadUrl("http://www.google.com");
     webview.getSettings().setJavaScriptEnabled(true);
     webview.setWebViewClient(new WebViewClient());
    }
}
