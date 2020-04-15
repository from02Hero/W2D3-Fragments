package com.example.w2d3_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), GreenFragment.OnMessageListener {

    lateinit var blueFragment: BlueFragment
    lateinit var greenFragment: GreenFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            greenFragment = GreenFragment.newInstance()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.blue_fragment_container, greenFragment, "green")
                .commit()

            blueFragment = BlueFragment.newInstance()
                supportFragmentManager
                .beginTransaction()
                .add(R.id.green_fragment_container, blueFragment, "blue")
                .commit()
        }
    }

    override fun onMessageSend(message: String) {
        blueFragment.updateText(message)
    }
}