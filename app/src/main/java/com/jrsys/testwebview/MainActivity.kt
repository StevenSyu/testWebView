package com.jrsys.testwebview

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.jrsys.testwebview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        activityMainBinding.webView.apply {
            clearCache(true)
            settings.cacheMode = WebSettings.LOAD_NO_CACHE
            settings.javaScriptEnabled = true
            loadUrl("https://tpwvdev.gov.taipei/subscribe?token=eyJhbGciOiJSUzI1NiJ9.eyJqdGkiOiJkNWU5MjAxYy03MDE0LTQxYmYtYjIwYS02ZTk0MTNiNjczNTEiLCJzdWIiOiJ1c2VyX2dyYW50X3Rva2VuIiwiaXNzIjoiMmVhMGVmYmNhNjc5ZWNiMTJkNDE1NmM2NzIwOTdhYTVmZjI3IiwiaWF0IjoxNjEyNDMyMzk5LCJleHAiOjE2MTI1MTg3OTksIm5iZiI6MTYxMjQzMjM5OSwidWlkIjoiNTk1MmFkMDQtNTBiYy00NGFlLWJlYmItMGE2ZTBkN2ExODJlIn0.jGIOpVHluKl1TclbEcerBD4xFDq9DbzOR3iekTn2L-4vUxIkGinXyO_RFdUmBsEl6pGW8oDKj46dSD_qV6JlEPSjTh_ZT0GF-Af-8krSsrd1fYo6jh6vpbjZ_7PL-Vn1qbGBqQMX764evKzl_ByR4lwo8u6SHAf8-zMA-oqIGKvX2_UTkMGwknPRGxahD2xyH8KnEbtUa-lfW-KoiLayRznZGcWzBAHh_nh92eK5Isyr_thMAGFzdfk1NIuqhLq5AJo_waVcz5H7GnY0LuWug8e4Ynzo6XeOppqnjEtQwiL7B1GhfjDoZ0K59gEZdxOY-oSyQRcLQc_YPJH7BBdBng")
            webViewClient = object : WebViewClient() {}
        }
    }
}