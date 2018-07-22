package com.android.manam.savemore.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.android.manam.savemore.R
import com.android.manam.savemore.extras.SharedPrefs


class SplashActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activtiy)

        val prefs = SharedPrefs(this)
        val userName = prefs.userFullName

        Handler().postDelayed({
            var intent = Intent(this,LoginActivity::class.java)
            if(userName.isNotEmpty())
                intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 500)

    }
}