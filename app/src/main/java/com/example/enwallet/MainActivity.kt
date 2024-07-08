package com.example.enwallet

import Wallet
import WalletAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerview.layoutManager=LinearLayoutManager(this)
        showWallets()
    }

    fun showWallets(){
        val item= Wallet("Salary","40000","1 July 2024")
        val item1= Wallet("Rent","16000","2 July 2024")
        val item2= Wallet("Shopping","14000","3 July 2024")
        val item3= Wallet("Dividends","2400","4 July 2024")
        val item4= Wallet("Electricity","600","5 July 2024")
        val item5= Wallet("Internet","2500","6 July 2024")
        val item6= Wallet("Shopping","3500","7 July 2024")
        val item7= Wallet("Bus Fare","500","8 July 2024")
        val item8= Wallet("Water bill","400","9 July 2024")
        val item9= Wallet("Token","300","10 July 2024")

        val wallet= listOf(item,item1,item2,item3,item4,item5,item6,item7,item8,item9)
        val walletAdapter=WalletAdapter(wallet)
        binding.recyclerview.adapter=walletAdapter

    }

}