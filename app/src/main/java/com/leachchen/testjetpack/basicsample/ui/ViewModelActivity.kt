package com.leachchen.testjetpack.basicsample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.leachchen.testjetpack.R
import com.leachchen.testjetpack.basicsample.data.ProfileLiveDataViewModel
import com.leachchen.testjetpack.basicsample.data.ProfileObservableViewModel
import com.leachchen.testjetpack.databinding.ActivityViewModelBinding

class ViewModelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProviders.of(this).get(ProfileLiveDataViewModel::class.java)
        //val viewModel = ViewModelProviders.of(this).get(ProfileObservableViewModel::class.java)
        val binding:ActivityViewModelBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_model)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this
    }
}