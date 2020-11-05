package com.rleon.fragmentsapp.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rleon.fragmentsapp.R
import kotlinx.android.synthetic.main.fragment_details.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DetailsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val miVista = inflater!!.inflate(R.layout.fragment_details, container, false)

        return miVista
    }


    fun renderizar(texto: String) {
        tv_Details.text = texto
    }


}
