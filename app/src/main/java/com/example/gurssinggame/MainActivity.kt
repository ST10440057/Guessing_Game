package com.example.gurssinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var inputNum: EditText? = null
    private var txtView: TextView? = null
    private var random = (1..100).shuffled().first()
    val Button1: Button? = findViewById<Button>(R.id.StartButton)




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }






    private fun RandomNum() {

        var IntNumber = inputNum?.text.toString().toInt()

        if (IntNumber == random) {
            txtView?.text = "Correct Number"

        } else if (IntNumber > random) {

            txtView?.text = "Number is Bigger then random"

        } else if (IntNumber < random) {

            txtView?.text = "Number is Smaller then random"

        } else {
            txtView?.text = "Your Number is incorrect"
        }




}
}