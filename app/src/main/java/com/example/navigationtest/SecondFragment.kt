package com.example.navigationtest

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.button).setOnClickListener {
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment())
        }
    }
}
