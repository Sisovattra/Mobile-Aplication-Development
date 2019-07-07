package com.example.andriod_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import java.util.*


class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button.setOnClickListener()
        {
            var date = dob.text.toString()
            var arr = date.split("/")
            var day = arr[0].toInt()
            var month = arr[1].toInt()
            var year = arr[2].toInt()

            var c_day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            var c_month = Calendar.getInstance().get(Calendar.MONTH) + 1
            var c_year = Calendar.getInstance().get(Calendar.YEAR)
            var urDay = c_day - day
            var urMonth = c_month - month
            var urYear = c_year - year


            if(urDay<0 || urMonth<0) {
                if (urDay < 0 && urMonth < 0) {
                    urYear = urYear - 1
                    urMonth = urMonth + 12
                    urMonth = urMonth - 1
                    urDay = urDay + 30
                } else if (urDay < 0) {
                    urMonth = urMonth - 1
                    urDay = urDay + 30
                } else if (urMonth < 0) {
                    urYear = urYear - 1
                    urMonth = urMonth + 12
                }
            }
            tv.text = "Days : $urDay, Months : $urMonth, Years: $urYear"








        }
    }

}
