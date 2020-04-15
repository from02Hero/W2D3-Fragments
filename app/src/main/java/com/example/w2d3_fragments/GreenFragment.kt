package com.example.w2d3_fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_green.*

/**
 * A simple [Fragment] subclass.
 */
class GreenFragment : Fragment() {

    var listener: OnMessageListener? = null

    companion object {
        fun newInstance(): GreenFragment {
            return GreenFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_green, container, false)
    }

    override fun onResume() {
        super.onResume()
        button.setOnClickListener {
            listener?.onMessageSend("from green")
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? OnMessageListener
        if (listener == null) {
            throw ClassCastException("$context must implement OnArticleSelectedListener")
        }
    }

    override fun onDetach() {
        listener = null // => avoid leaking, thanks @Deepscorn
        super.onDetach()
    }

    interface OnMessageListener {
        fun onMessageSend(message: String)
    }

}