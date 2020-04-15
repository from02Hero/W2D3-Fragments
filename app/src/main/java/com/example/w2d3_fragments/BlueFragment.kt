package com.example.w2d3_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_blue.*

/**
 * A simple [Fragment] subclass.
 */
class BlueFragment : Fragment() {

    companion object {
        fun newInstance(): BlueFragment {
            return BlueFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    fun updateText(text: String?) {
        msg.text = text
    }

}