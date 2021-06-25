package com.example.hilt_app

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.hilt_app.viewmodel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var mainActivityComponent: MainActivityComponent

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val component = DaggerApplicationComponent.create()
        mainActivityComponent = component.mainActivityComponent().create()
        mainActivityComponent.inject(this)
        setContentView(R.layout.activity_main)
        Log.d("tag",mainViewModel.item)
    }
}