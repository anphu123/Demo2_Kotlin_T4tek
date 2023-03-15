package com.example.demo2_kotlin_t4tek

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.demo2_kotlin_t4tek.databinding.Fragment2Binding


class Fragment2 : Fragment() {

    private lateinit var binding: Fragment2Binding
    var tv1 : String?=""


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding= Fragment2Binding.inflate(inflater,container,false)

        tv1=arguments?.getString("message")
        binding.tv1.text=tv1
        return binding.root
    }


}