package com.example.ass6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_friend__two.view.*

class Friend_Two : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_friend__two, container, false)
        view.clickming.setOnClickListener() {
            var fragment: Fragment? = null
            fragment = Myself()
            replaceFragment(fragment)
        }
        return view
    }
    fun replaceFragment(someFragment: Myself){
        val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLaout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}