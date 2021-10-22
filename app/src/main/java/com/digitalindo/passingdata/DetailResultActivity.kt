package com.digitalindo.passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_result)

        val txtview = findViewById<TextView>(R.id.textView)
        val nilai = intent.getDoubleExtra("data",9.1)
//        val nilaistring = intent.getStringExtra("data")

        txtview.text = "$nilai"
    }
}