package com.ibnugaury.listview.Main.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ibnugaury.listview.R
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.splash_in))

        Handler().postDelayed({
            logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.splash_out))
            Handler().postDelayed({
                logo.visibility = View.GONE
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            },500)
        },2500)
    }
}
