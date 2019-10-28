package com.github.ticktakclock.motionlayoutsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val dataset = arrayOf(
        Sample("Sample 1", "Moving right to left on swipe.", R.layout.motion_01),
        Sample("Sample 2", "Moving right to left on swipe, using ConstraintSet", R.layout.motion_02),
        Sample("Title3", "Description3", R.layout.motion_01),
        Sample("Title4", "Description4", R.layout.motion_01)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewManager= LinearLayoutManager(this)
        val mainSampleAdapter = MainSampleAdapter(dataset)
        this.main_motions_rclv.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = mainSampleAdapter
        }
    }

    fun start(activity: Class<*>, resId: Int) {
        val intent = Intent(this, activity).apply {
            putExtra("layout_res_id", resId)
        }
        startActivity(intent)

    }
}
