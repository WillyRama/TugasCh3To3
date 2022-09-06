package com.willyramad.tugasch3to3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_profil.*
import kotlinx.android.synthetic.main.fragment_umur.*

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ambilbundel = arguments?.getString("ambilnamauser")
        textHallo.text = "Hallo $ambilbundel"

        btnprofil.setOnClickListener {
            val bundle = Bundle()
            val namaakun = ambilbundel.toString()
            bundle.putString ("nama",namaakun)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_profilFragment,bundle)
        }
        btnhitung.setOnClickListener {
            val bun = Bundle()
            val umur = edtahunl.text.toString().toInt()
            val U = (2022-umur)

            bun.putString("umur", U.toString())
            bun.putString("nama", ambilbundel.toString())
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_umurFragment,bun)
        }
    }

}
