package com.example.myapplication3;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        // webview is the id of the WebView in the layout
        WebView webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        //webView.loadUrl("https://leafletjs.com");
        //webView.loadUrl("https://leafletjs.com/examples/mobile/example.html");
        //webView.loadUrl("https://www.yahoo.com");
        //webView.loadUrl("https://admin.treetracker.org");
        webView.loadUrl("https://map.treetracker.org/wallets/9e143717-b34b-4e53-b810-6668d371adda?bounds=36.460189819335945,-0.23878028414651437,36.51889801025391,-0.16230561483658262&tree_id=1400272");
        //Greeting("Android")
//WebPage(url = "https://map.treetracker.org/wallets/9e143717-b34b-4e53-b810-6668d371adda?bounds=36.460189819335945,-0.23878028414651437,36.51889801025391,-0.16230561483658262&tree_id=1400272   ")
        //WebPage(url = "https://map.treetracker.org")
        // WebPage(url = "https://www.baidu.com")
        // //WebPage(url = "https://dev.treetracker.org/top")
        //WebPage(url ="https://leafletjs.com/examples/mobile/example.html")
        //WebPage(url = "https://yahoo.com")
        // WebPage(url = "https://leafletjs.com")
        // Set the padding to the WebView
        ViewCompat.setOnApplyWindowInsetsListener(webView, (v, insets) -> {
            Insets insets1 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(insets1.left, insets1.top, insets1.right, insets1.bottom);
            return insets;
        });
    }
}
