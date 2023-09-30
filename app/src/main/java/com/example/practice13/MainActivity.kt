package com.example.practice13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun ButtonClick (view:View){
        val edt1 :EditText = findViewById(R.id.editTextNumber)
        val edt2 :EditText = findViewById(R.id.editTextNumber2)
        val tv4 : TextView = findViewById(R.id.textView4)

        if (edt1.getText().toString().equals(""))
        {
            val text = "Введите курс обмена!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
        if (edt2.getText().toString().equals(""))
        {
            val text = "Введите сумму для обмена!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

         var a : String = edt1.text.toString()
         var b : String = edt2.text.toString()

        var c : Int = a.toInt()
        var d : Int = b.toInt()

        var cd : Int = c*d

        var result : String = cd.toString()

        tv4.text = "$result"

    }

    fun SecondActivity(view: View){
        val intent : Intent = Intent (this@MainActivity,SecondActivity::class.java)
        when(view.id){
            R.id.button2 -> startActivity(intent)
        }
    }
    fun TherdActivity(view: View){
        val intent : Intent = Intent (this@MainActivity,TherdActivity::class.java)
        when(view.id){
            R.id.button3 -> startActivity(intent)
        }
    }
    fun ForeActivity(view: View){
        val intent : Intent = Intent (this@MainActivity,ForeActivity::class.java)
        when(view.id){
            R.id.button4 -> startActivity(intent)
        }
    }
}