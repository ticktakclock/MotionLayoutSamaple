package com.github.ticktakclock.motionlayoutsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val resId: Int = intent?.extras?.getInt("layout_res_id") ?: R.layout.activity_sample
        setContentView(resId)
    }

}
