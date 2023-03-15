package com.example.demo2_kotlin_t4tek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo2_kotlin_t4tek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Communicator {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmenta =Fragment1()
        supportFragmentManager.beginTransaction().replace(R.id.frg1,fragmenta).commit()

    }//câu hỏi :tại sao sử dụng  supportFragmentManager.beginTransaction().replace(binding.frg1,fragment1).commit() lại báo lỗi

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message",editTextInput)

        val transaction= this.supportFragmentManager.beginTransaction()
        val fragment2=Fragment2()
        fragment2.arguments=bundle

        transaction.replace(R.id.frg2,fragment2)
        transaction.commit()
    }

}