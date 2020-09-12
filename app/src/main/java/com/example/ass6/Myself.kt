package com.example.ass6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_myself.view.*


class Myself : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_myself, container, false)
        view.setOnClickListener() {
            val toast: Toast = Toast.makeText(context, "Click on Fragment Two", Toast.LENGTH_SHORT)
            toast.show()
        }
        return view
    }


}