package com.willyramad.tugasch3to3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnlogin.setOnClickListener {
        val user = username.text.toString()
        val pass = password.text.toString()
            if (user.isEmpty()|| pass.isEmpty()){
                Toast.makeText(context, "Masukkan username dan password terlebih dahulu", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (user == "Willy@gmail.com" && pass == "111"){
                val bundle = Bundle()
                bundle.putString("ambilnamauser", user)
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment, bundle)
            }
        }
        register.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }
}