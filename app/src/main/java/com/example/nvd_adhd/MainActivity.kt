package com.example.nvd_adhd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public void submitAssessment(View view) {
       int score = calculateScore();
        displayResult(score);
        }
    }

   private int calculateScore()


}