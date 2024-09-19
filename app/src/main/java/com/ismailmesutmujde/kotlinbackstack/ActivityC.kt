package com.ismailmesutmujde.kotlinbackstack

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinbackstack.databinding.ActivityCBinding

class ActivityC : AppCompatActivity() {

    private lateinit var bindingC : ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingC = ActivityCBinding.inflate(layoutInflater)
        val view = bindingC.root
        setContentView(view)

        bindingC.buttonGoToD.setOnClickListener {
            startActivity(Intent(this@ActivityC, ActivityD::class.java))
        }
    }
}