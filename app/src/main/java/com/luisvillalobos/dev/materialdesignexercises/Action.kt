package com.luisvillalobos.dev.materialdesignexercises

data class Action(
    val name: String,
    val next: Class<*>,
    val inAnim : Int = 0,
    val outAnim: Int = 0
)