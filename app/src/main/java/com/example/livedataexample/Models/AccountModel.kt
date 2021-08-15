package com.example.livedataexample.Models

import androidx.lifecycle.ViewModel

class AccountModel(accNo:String, owner:String, balance:Double) :ViewModel(){
    var accNo : String = ""
    var owner : String = ""
    var balance: Double = 0.0

    init {
        this.accNo = accNo
        this.owner = owner
        this.balance = balance
    }

    fun deposit(amout: Double) {
        balance += amout
    }

    fun witdraw(amount:Double){
        balance -= amount
    }

}