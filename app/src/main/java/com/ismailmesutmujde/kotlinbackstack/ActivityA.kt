package com.ismailmesutmujde.kotlinbackstack

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinbackstack.databinding.ActivityABinding


class ActivityA : AppCompatActivity() {

    private lateinit var bindingA : ActivityABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingA = ActivityABinding.inflate(layoutInflater)
        val view = bindingA.root
        setContentView(view)

        bindingA.buttonGoToB.setOnClickListener {
            val intentAToB = Intent(this@ActivityA, ActivityB::class.java)
            startActivity(intentAToB)
        }
    }
}