package com.example.a090925

// import androidx.collection.intListOf

fun printEvNumbs(arr: List<Int>){
    for (number in arr){
        if(number%2==0){
            print(number); print(' ')
        }
    }
}

fun exercise1(){
    val arr: List<Int> = listOf(1, 3, 7, 15, 67, 102)
    println(arr)
    print("Even numbers: "); printEvNumbs(arr)
    println()
}

fun exercise2(){
    val factorial = 9
    var answer = 1

    for (numb in 1 .. factorial){
        answer*=numb
    }

    println("The factorial of $factorial is $answer")
}



fun exercise3(){
    class Exercise3(var weight: Int = 0, var height: Int = 0){
        fun area(): Int{
            return weight*height
        }
    }

    val myObject = Exercise3(2,3)
    println("Area: ${myObject.area()}")

}

fun exercise4(){
    val myString: String = "kotlin"
    val lMyString: Int = myString.length;
    for (i in 1 .. lMyString){
        print(myString[lMyString - i])
    }
}

//fun main(){
//    exercise1()
//    exercise2()
//    exercise3()
//    exercise4()
//}