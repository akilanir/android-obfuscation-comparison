package com.example.initializer

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private val url = "https://aws.amazon.com/free/"
    private val password = "Aws@cc0untU$3r"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        //Create AWS Bucket
        ScreenUtils.invokeAWSBucket(password)

        rollButton.setOnClickListener{
            val rand = Random().nextInt(seekBar.progress) + 1
            if(rand == 1){
                resultsTextView.text = url
            }
            else{
                resultsTextView.text = rand.toString()
            }


        }

    }
}