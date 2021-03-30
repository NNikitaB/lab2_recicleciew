package com.example.lab2_recicleciew;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

public class Tho_activiteies  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.two_activities)
        if (supportFragmentManager.findFragmentByTag("frg2") == null) {
            val frag = Other_fragment()
            val ft = supportFragmentManager
            val f = ft.beginTransaction()
            f.add(R.id.mnt, frag, "frg2")
            f.commit()
        }
    }
    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
            fragment.arguments = intent.extras

    }
}
