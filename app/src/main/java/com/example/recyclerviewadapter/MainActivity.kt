package com.example.recyclerviewadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var listthecategories = ArrayList<phonedetailsClass>()

        listthecategories.add(phonedetailsClass("Anand Kumar Singh","9129757212"))
        listthecategories.add(phonedetailsClass("Shivam Kumar Singh","9429757212"))
        listthecategories.add(phonedetailsClass("Satyam Kumar Singh","9129747212"))
        listthecategories.add(phonedetailsClass("Ayush Kumar Singh","9129757242"))
        listthecategories.add(phonedetailsClass("Akash Kumar Singh","9129457212"))
        listthecategories.add(phonedetailsClass("Prabhat Kumar Singh","9129457212"))
        listthecategories.add(phonedetailsClass("Patel Kumar Singh","9129757212"))
        listthecategories.add(phonedetailsClass("Aman Kumar Singh","9155757212"))
        listthecategories.add(phonedetailsClass("Sonu Kumar Singh","9169757212"))
        listthecategories.add(phonedetailsClass("Sa Kumar Singh","9125757212"))
        listthecategories.add(phonedetailsClass("MD Kumar Singh","9125757212"))


        binding.rcv1.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL,false)

        binding.rcv1.adapter = rcvAdapter(this ,listthecategories)
    }

}
