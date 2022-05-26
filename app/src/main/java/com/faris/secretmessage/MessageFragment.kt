package com.faris.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)

        val navController = findNavController()

        val nextButton = view.findViewById<Button>(R.id.next)
        val messageView = view.findViewById<TextView>(R.id.message)

        nextButton.setOnClickListener {
            val message = messageView.text.toString()
            if (message == "") {
                Toast.makeText(context, "Please enter a message!", Toast.LENGTH_SHORT).show()
            } else {
                val action =
                    MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message)

                navController.navigate(action)
            }
        }

        return view
    }

}