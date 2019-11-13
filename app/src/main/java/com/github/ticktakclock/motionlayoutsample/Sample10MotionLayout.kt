package com.github.ticktakclock.motionlayoutsample

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.AppBarLayout

/**
 * Sample10MotionLayout
 *
 * Custom MotionLayout for Sample 10.
 */
class Sample10MotionLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : MotionLayout(context, attrs, defStyleAttr), AppBarLayout.OnOffsetChangedListener {

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, offset: Int) {
        val scrolled = appBarLayout?.totalScrollRange?.toFloat()
        Log.d("Sample10MotionLayout", "${scrolled}, ${offset}")
        progress = -offset / (appBarLayout?.totalScrollRange?.toFloat() ?: 0f)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        (parent as? AppBarLayout)?.addOnOffsetChangedListener(this)
    }
}
