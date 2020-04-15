package com.example.w2d3_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
//1
class DogDetailsFragment : Fragment() {

    //2
    companion object {

        fun newInstance(): DogDetailsFragment {
            return DogDetailsFragment()
        }
    }

    //3
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dog_details, container, false)
    }

}