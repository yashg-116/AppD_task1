package com.example.yashguptaappd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn_submit)
        val name:EditText=findViewById(R.id.name)
        val age:EditText=findViewById(R.id.age)
        btn.setOnClickListener(View.OnClickListener{
          val username=name.text.toString()
          val userage=age.text.toString()
            if(username!="") {
                Toast.makeText(this, "Hello! I am $username \n How are you !", Toast.LENGTH_LONG).show()
                name.setTag("")
                age.setText("")
            }
            else{
                Toast.makeText(this, "Enter your name first !!", Toast.LENGTH_SHORT).show()
            }

        })

    }
}