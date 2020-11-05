package com.rleon.fragmentsapp.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.rleon.fragmentsapp.Fragments.DataFragment
import com.rleon.fragmentsapp.Fragments.DetailsFragment
import com.rleon.fragmentsapp.R

class MainActivity : FragmentActivity(), DataFragment.DataListener {
    override fun enviarDatos(text: String) {
        val dataFragment = supportFragmentManager.findFragmentById(R.id.f_details) as DetailsFragment
        dataFragment.renderizar(text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
