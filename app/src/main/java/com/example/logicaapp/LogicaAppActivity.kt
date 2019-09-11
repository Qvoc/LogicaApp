package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica_app.*

class LogicaAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica_app)
        initViews()
    }

    private fun initViews() {
        btnSubmit.setOnClickListener() { onSubmitClick() }
    }

    //Checks if the answers are right and picks a message to display
    private fun onSubmitClick() {
        var answer1 = case1.text.toString()
        var answer2 = case2.text.toString()
        var answer3 = case3.text.toString()
        var answer4 = case4.text.toString()

        if (answer1 == "T" && answer2 == "F" && answer3 == "F" && answer4 == "F") {
            onAnswerCorrect()
        } else {
            onAnswerIncorrect()
        }
    }

    //Displays a correct Toast message
    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
    }

    //Displays an incorrect Toast message
    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
    }
}
