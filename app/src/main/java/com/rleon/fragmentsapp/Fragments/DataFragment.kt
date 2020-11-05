package com.rleon.fragmentsapp.Fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rleon.fragmentsapp.R
import kotlinx.android.synthetic.main.fragment_data.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DataFragment : Fragment() {

    var llamada: DataListener? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        try {
            llamada = context as DataListener
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val miVista = inflater!!.inflate(R.layout.fragment_data, container, false)
        val editTxt = miVista.et_data
        val btnEnviar = miVista.btnEnviar

        btnEnviar.setOnClickListener {
            val texto = editTxt.text.toString()
            llamada!!.enviarDatos(texto)
        }

        return miVista
    }

    interface DataListener {
        fun enviarDatos(text: String)
    }


}
