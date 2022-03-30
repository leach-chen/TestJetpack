package com.leachchen.testjetpack.basicsample.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.leachchen.testjetpack.R
import com.leachchen.testjetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.observableFieldsActivityButton.setOnClickListener {
            val intent = Intent(this, ObservableFieldActivity::class.java)
           /* intent.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)
            intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)*/
            startActivity(Intent(intent))
        }

        binding.viewmodelActivityButton.setOnClickListener {
            Toast.makeText(this,"2222",Toast.LENGTH_LONG).show()
        }
    }
}