package com.example.andriod_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Botton_Click.setOnClickListener()
        {
            var consonant = ""
            var vowel = ""
            var sky = Year.text.toString()
            for(i in sky)
            {
                when(i)
                {
                    'a','e','i','o','u','A','E','I','O','U'-> vowel+=i
                    else-> consonant+=i
                }
            }
            Consonant.text ="consonant: $consonant"
            Vowel.text = "vowel: $vowel"
        }

    }
}
