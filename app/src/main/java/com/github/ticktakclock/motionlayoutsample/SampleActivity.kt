package com.github.ticktakclock.motionlayoutsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout

class SampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val resId: Int = intent.getIntExtra("layout_res_id", R.layout.motion_01)
        setContentView(resId)
        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
        val debugMode = if (intent.getBooleanExtra("isShowPath", false)) {
            MotionLayout.DEBUG_SHOW_PATH
        } else {
            MotionLayout.DEBUG_SHOW_NONE
        }
        motionLayout.setDebugMode(debugMode)
    }

}
