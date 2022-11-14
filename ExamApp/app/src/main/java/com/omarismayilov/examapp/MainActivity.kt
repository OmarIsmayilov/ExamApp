package com.omarismayilov.examapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.omarismayilov.examapp.Constrants.USER_NAME
import com.omarismayilov.examapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        window.decorView.apply {systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN}


        binding.btnStart.setOnClickListener {
            if (binding.etName.text.toString().isEmpty()) {

                Toast.makeText(this@MainActivity, "Zəhmət olmasa adınızı daxil edin", Toast.LENGTH_SHORT)
                    .show()
            } else {

                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                // TODO (STEP 2: Pass the name through intent using the constant variable which we have created.)
                intent.putExtra(Constrants.USER_NAME, binding.etName.text.toString())
                startActivity(intent)
                finish()
            }
        }


    }
}
