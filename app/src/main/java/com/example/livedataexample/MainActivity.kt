package com.example.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.BindingMethods
import androidx.databinding.DataBindingUtil
import com.example.livedataexample.Models.AccountModel
import com.example.livedataexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val myAccout = AccountModel("A1234566","John", 500.00)
    private lateinit var binding :  ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding =  DataBindingUtil.setContentView(this, R.layout.activity_main)

        display()


        binding.btnDeposit.setOnClickListener(){
            val amount:Double  = binding.tfAmount.text.toString().toDouble()

            myAccout.deposit(amount)

        }

        binding.btnWitdraw.setOnClickListener(){
            val amount:Double  = binding.tfAmount.text.toString().toDouble()
            myAccout.witdraw(amount)

        }
    }

    fun display(){

        binding.tvAccNo.text = myAccout.accNo
        binding.tvName.text = myAccout.owner
        binding.tvBalance.text = myAccout.balance.toString()

    }
}