package com.example.madpractical6_20012011191

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.VideoView
import com.example.madpractical6_20012011191.R
//import com.example.madpractical6_20012011191.MainActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YouTubeActivity : AppCompatActivity() {
    private val youtubeId="enWy-sSrPKM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val mywebview=findViewById<WebView>(R.id.webview)
        val myplaybutton=findViewById<FloatingActionButton>(R.id.playbtn)
        myplaybutton.setOnClickListener {
            Intent(this, MainActivity::class.java).apply{
                startActivity(this)
            }
        }

        val webSettings:WebSettings=mywebview.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }

}