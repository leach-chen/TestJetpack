package com.leachchen.testjetpack.basicsample.ui

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.leachchen.testjetpack.R
import com.leachchen.testjetpack.basicsample.data.ObservableFieldProfile
import com.leachchen.testjetpack.databinding.ActivityObservableFieldBinding

class ObservableFieldActivity : AppCompatActivity() {

    private val observableFieldProfile = ObservableFieldProfile("Ada", "Lovelace", ObservableInt(0))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityObservableFieldBinding = DataBindingUtil.setContentView(this,R.layout.activity_observable_field)
        binding.user = observableFieldProfile
    }

    fun onLike(view: View)
    {
        observableFieldProfile.likes.set(observableFieldProfile.likes.get()+1)
    }
}