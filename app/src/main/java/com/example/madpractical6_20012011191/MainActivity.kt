package com.example.madpractical6_20012011191

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.example.madpractical6_20012011191.R
import com.example.madpractical6_20012011191.YouTubeActivity
//import com.example.madpractical6_20012011191.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.net.URI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myvideoview=findViewById<VideoView>(R.id.videoview)
        val myplaybtn=findViewById<FloatingActionButton>(R.id.playbutton)
        val mediaController= MediaController(this)
        val uri: Uri= Uri.parse("android.resource://"+ packageName + "/" + R.raw.thestoryoflight )
        myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()

        myplaybtn.setOnClickListener {
            Intent(this,YouTubeActivity::class.java).apply{
                startActivity(this)
            }
        }
    }
}