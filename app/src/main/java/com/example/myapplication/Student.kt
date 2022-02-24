package com.example.myapplication

data class Student(val name: String, val group: String ){
    public override fun toString(): String {
        return "Привет, меня зовут $name. Я из $group группы."
    }
}
