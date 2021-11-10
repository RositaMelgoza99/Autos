package com.example.autos

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.autos.databinding.ActivityMainBinding
import com.example.autos.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.animationView.addAnimatorListener(object : AnimatorListenerAdapter(){
            override fun onAnimationEnd(animation: Animator?) {
               val intentToMainActivity = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }
        })
    }
}