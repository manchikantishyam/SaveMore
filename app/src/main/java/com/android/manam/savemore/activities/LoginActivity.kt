package com.android.manam.savemore.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.android.manam.savemore.R
import com.android.manam.savemore.extras.SharedPrefs

class LoginActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        val nameField: EditText = findViewById(R.id.user_name)
        val goButton: Button = findViewById(R.id.go_button)

        goButton.setOnClickListener{
           val prefs = SharedPrefs(this)
            prefs.userFullName = nameField.text.toString()
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}