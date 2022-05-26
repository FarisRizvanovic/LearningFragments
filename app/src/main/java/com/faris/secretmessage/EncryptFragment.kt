package com.faris.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class EncryptFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_encrypt, container, false)

        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
        val encryptView = view.findViewById<TextView>(R.id.encrypted_message)
        encryptView.text = message.reversed()

        return view
    }

}