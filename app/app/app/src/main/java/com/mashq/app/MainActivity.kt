package com.mashq.app

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(48, 48, 48, 48)
        }
        val title = TextView(this).apply {
            text = "Mashq ilovasi"
            textSize = 28f
            gravity = Gravity.CENTER
        }
        val counter = TextView(this).apply {
            text = "Bajarilgan: 0"
            textSize = 20f
            gravity = Gravity.CENTER
        }
        val button = Button(this).apply {
            text = "Mashq qildim"
            setOnClickListener {
                count++
                counter.text = "Bajarilgan: $count"
            }
        }
        layout.addView(title)
        layout.addView(counter)
        layout.addView(button)
        setContentView(layout)
    }
}
