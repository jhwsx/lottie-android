package com.airbnb.lottie.issues

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.airbnb.lottie.issues.databinding.SplashActivity1Binding

/**
 * @author wangzhichao
 * @since 20-7-6
 */
class SplashActivity : AppCompatActivity() {
    private lateinit var binding: SplashActivity1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.splash_activity1)
        binding.lottieAnimationView.postDelayed({ binding.clLottie.visibility = View.GONE }, 2000L)
        binding.llAdContainer.postDelayed({
            MainActivity.start(this@SplashActivity)
            finish()
        }, 5000L)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.lottieAnimationView.cancelAnimation()
    }
}