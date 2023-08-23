package com.syntax.hemmerich.batch010_user_input

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvGreeting = findViewById<TextView>(R.id.tv_greeting)
        var btnClickMe = findViewById<Button>(R.id.btn_clickMe)
        var etName = findViewById<EditText>(R.id.et_name)
        var cbDog = findViewById<CheckBox>(R.id.cb_dog)
        var swDog = findViewById<Switch>(R.id.sw_dog)
        var clRoot = findViewById<ConstraintLayout>(R.id.cl_root)

        clRoot.setOnClickListener {
            println("Wooop Wooop")
        }
        btnClickMe.setOnClickListener {
            var name = etName.text

            if(cbDog.isChecked||swDog.isChecked){
                tvGreeting.text = getString(R.string.greeting_with_dog,name)
            }else{
                tvGreeting.text = getString(R.string.greeting_no_dog,name)
            }





        }



    }
}