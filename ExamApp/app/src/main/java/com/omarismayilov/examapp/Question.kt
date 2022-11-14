package com.omarismayilov.examapp

data class Questions(
    val id :Int,
    val question : String,
    val optionOne: String,
    val optionTwo :String,
    val optionThree : String,
    val optionFour : String,
    val optionFive : String,
    val correctAnswer : Int,
)
