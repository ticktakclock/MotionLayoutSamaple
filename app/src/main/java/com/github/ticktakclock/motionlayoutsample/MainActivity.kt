package com.github.ticktakclock.motionlayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val dataset = arrayOf(
        Sample("Title1", "Description1"),
        Sample("Title2", "Description2"),
        Sample("Title3", "Description3"),
        Sample("Title4", "Description4")
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
}
