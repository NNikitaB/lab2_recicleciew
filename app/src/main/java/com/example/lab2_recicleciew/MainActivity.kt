package com.example.lab2_recicleciew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.fragment.app.Fragment as Fragment1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportFragmentManager.findFragmentByTag("frg1") == null) {
            val frag = List_fragment()
            val ft= supportFragmentManager
            val f= ft.beginTransaction()
            f.add(R.id.mn,frag,"frg1")
            f.commit()
        }
    }
    override fun onAttachFragment(fragment: Fragment1) {
        super.onAttachFragment(fragment)
        fragment.arguments = intent.extras
    }


}