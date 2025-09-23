package com.example.a090925

open class Payment(var amount: Double){
    open fun proccess(){
        println("Processing payment of $amount")
    }
}

class CreditCardPayment(amount: Double) : Payment(amount){
    override fun proccess(){
        println("Payd $amount with credit card")
    }
}

class PaypalPayment(amount: Double) : Payment(amount){
    override fun proccess(){
        println("Payd $amount via PayPal")
    }
}

class BankTransferPayment(amount: Double): Payment(amount){
    override fun proccess(){
        println("Payd $amount via bank transfer")
    }
}

fun makeTransaction(payment: Payment){
    payment.proccess()
}


fun main(){
    val varsPayment: MutableList<Payment> = mutableListOf()

    val creditCardPayment = CreditCardPayment(1.12)
    val paypalPayment = PaypalPayment(20.32)
    val bankTransferPayment = BankTransferPayment(300.23)

    varsPayment.add(creditCardPayment)
    varsPayment.add(paypalPayment)
    varsPayment.add(bankTransferPayment)

    for (i in varsPayment){
        i.proccess()
    }
}