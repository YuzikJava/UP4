package com.example.myapplication6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView0: TextView = findViewById(R.id.textView4)
        if (l > 999999) {
            var ll = l / 1000000
            textView0.text = ll.toString() + "М"
        } else if (l > 999) {
            var ll = l / 1000
            textView0.text = ll.toString() + "К"
        } else {
            textView0.text = l.toString()
        }
        val t2: TextView = findViewById(R.id.textView5)
        if (share > 999999) {
            var ll = share / 1000000
            t2.text = ll.toString() + "М"
        } else if (share > 999) {
            var ll = share / 1000
            t2.text = ll.toString() + "К"
        } else {
            t2.text = share.toString()
        }
        val t3: TextView = findViewById(R.id.textView6)
        if (views > 999999) {
            var ll = views / 1000000
            t3.text = ll.toString() + "М"
        } else if (views > 999) {
            var ll = views / 1000
            t3.text = ll.toString() + "К"
        } else {
            t3.text = views.toString()
        }
    }
 
    var l = 999999
    var bol = 0
    var share = 989
    var views = 2354685
    fun LikeClick(view: View) {
        bol++
        if (bol == 1) {
            l++
            findViewById<ImageButton>(R.id.imageButton).setImageResource(R.drawable.lk0000)
        } else if (bol == 2) {
            l--
            findViewById<ImageButton>(R.id.imageButton).setImageResource(R.drawable.lk1111)
                bol = 0
            }
            val textView: TextView = findViewById(R.id.textView4)
            textView.text = l.toString()
        val textView0: TextView = findViewById(R.id.textView4)
        if (l > 999999) {
            var ll = l / 1000000
            textView0.text = ll.toString() + "М"
        } else if (l > 999) {
            var ll = l / 1000
            textView0.text = ll.toString() + "К"
        } else {
            textView0.text = l.toString()
        }
    }

    fun ShareClick(view: View) {
        share++
        val t2: TextView = findViewById(R.id.textView5)
        if (share > 999999) {
            var ll = share / 1000000
            t2.text = ll.toString() + "М"
        } else if (share > 999) {
            var ll = share / 1000
            t2.text = ll.toString() + "К"
        } else {
            t2.text = share.toString()
        }
    }
}