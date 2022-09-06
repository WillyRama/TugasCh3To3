package com.willyramad.tugasch3to3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnregis.setOnClickListener {
            val namaregis = regisnama.text.toString()
            val userreg = regisusername.text.toString()
            val passreg = regpassword.text.toString()
            if (namaregis.isEmpty()|| userreg.isEmpty()|| passreg.isEmpty()){
                Toast.makeText(context, "Username, Nama dan password harap diisi!!!", Toast.LENGTH_SHORT).show()
            }else
            Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_loginFragment)
        }

    }
}