package com.gutierrez.eddy.laboratorio08

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gutierrez.eddy.laboratorio08.databinding.ActivityDetailBinding
import com.gutierrez.eddy.laboratorio08.databinding.ActivityRegisterBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root) // Aquí cambiamos a binding.root
        listenerComponentUi()
        intent.extras?.let{
            showData(it)
        }
    }


    private fun showData(paramExtras: Bundle){

        val fullName = paramExtras.getString((FULL_NAME_KEY))
        val phone = paramExtras.getString((PHONE_NUMBER_KEY))
        val email = paramExtras.getString((EMAIL_KEY))
        val office = paramExtras.getString((OFFICE_KEY))

        binding.tvFullName.text = fullName
        binding.tvPhoneNumber.text = phone
        binding.tvEmail.text = email
        binding.tvOffice.text = office
    }

    private fun listenerComponentUi(){
        binding.btnPhone.setOnClickListener {

        }
        binding.btnSms.setOnClickListener {

        }
        binding.btnUser.setOnClickListener {

        }
        binding.btnWts.setOnClickListener {

        }
    }
}