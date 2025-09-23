package com.example.a090925

class Box<T>(var boxValue: T){

    fun getValue(): T{
        return boxValue
    }

    fun <R> map(transform: (T) -> R): Box<R>{
        return Box(transform(boxValue))
    }
}


fun main(){
    val intBox = Box(5)
    val stringBox = intBox.map{it.toString()}
    val booleanBox = intBox.map{it != 0}
    println("Value of intBox and stringBox: ${intBox.boxValue} and ${stringBox.boxValue}")
    println("Type of stringBox: ${stringBox.boxValue::class.simpleName}")
    println("Value of intBox and booleanBox: ${intBox.boxValue} and ${booleanBox.boxValue}")
    println("Type of booleanBox: ${booleanBox.boxValue::class.simpleName}")
}