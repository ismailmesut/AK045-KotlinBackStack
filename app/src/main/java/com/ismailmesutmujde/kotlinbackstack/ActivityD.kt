package com.ismailmesutmujde.kotlinbackstack

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinbackstack.databinding.ActivityDBinding


class ActivityD : AppCompatActivity() {

    private lateinit var bindingD : ActivityDBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingD = ActivityDBinding.inflate(layoutInflater)
        val view = bindingD.root
        setContentView(view)

    }


    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        val intent = Intent(this@ActivityD, ActivityB::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }
}