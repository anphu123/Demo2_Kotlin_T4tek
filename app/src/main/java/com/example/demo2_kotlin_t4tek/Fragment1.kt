package com.example.demo2_kotlin_t4tek

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.demo2_kotlin_t4tek.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private lateinit var binding: Fragment1Binding
    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
       binding= Fragment1Binding.inflate(inflater,container,false)

        communicator= activity as Communicator
        binding.sendbtn1.setOnClickListener{
            communicator.passDataCom(binding.edt1.text.toString())
        }

        return binding.root

    }


}