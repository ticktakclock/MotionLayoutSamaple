package com.github.ticktakclock.motionlayoutsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isShowPath = false

    private val dataset = arrayOf(
        Sample("Sample 1", "Moving right to left on swipe.", R.layout.motion_01),
        Sample("Sample 2", "Moving right to left on swipe, using ConstraintSet", R.layout.motion_02),
        Sample("Sample 3", "Moving right to left on swipe, using CustomAttribute", R.layout.motion_03),
        Sample("Sample 4", "Using KeyFrameSet on Sample 3", R.layout.motion_04),
        Sample("Sample 5", "Using KeyFrameSet and KeyAttribute", R.layout.motion_05),
        Sample("Sample 6", "Using ImageFilterView, cross fade image", R.layout.motion_06),
        Sample("Sample 7", "Using KeyFrameSet and KeyCycle", R.layout.motion_07),
        Sample("Sample 8", "Multi ui animation", R.layout.motion_08),
        Sample("Sample 9", "Floating action button, speed dial", R.layout.motion_09),
        Sample("Sample 10", "Using in header of CoordinatorLayout", R.layout.motion_10),
        Sample("Sample 11", "Swipe right drawer sample. Using in menu and content of DrawerLayout", R.layout.motion_11)

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewManager = LinearLayoutManager(this)
        val mainSampleAdapter = MainSampleAdapter(dataset)
        this.main_motions_rclv.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = mainSampleAdapter
        }
        this.main_show_path_sw.setOnCheckedChangeListener { _, isChecked ->
            isShowPath = isChecked
        }
    }

    fun start(activity: Class<*>, resId: Int) {
        val intent = Intent(this, activity).apply {
            putExtra("layout_res_id", resId)
            putExtra("isShowPath", isShowPath)
        }
        startActivity(intent)

    }
}
