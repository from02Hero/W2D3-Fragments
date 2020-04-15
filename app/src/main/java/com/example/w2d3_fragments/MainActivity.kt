package com.example.w2d3_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private var btnFrag1WithBack: Button? = null
    private var btnFrag2WithBack: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFrag1WithBack = findViewById(R.id.btnfr1with)
        btnFrag2WithBack = findViewById(R.id.btnfr2with)

        btnFrag1WithBack!!.setOnClickListener { addFragment(BlueFragment(), true, "BlueFragment") }

        btnFrag2WithBack!!.setOnClickListener { addFragment(GreenFragment(), true, "GreenFragment") }
    }

    fun addFragment(fragment: Fragment, addToBackStack: Boolean, tag: String) {
        val manager = supportFragmentManager
        val ft = manager.beginTransaction()

        if (addToBackStack) {
            ft.addToBackStack(tag)
        }
        ft.replace(R.id.container_frame_back, fragment, tag)
        ft.commit()
    }

}