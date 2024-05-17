package com.gutierrez.eddy.laboratorio08

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gutierrez.eddy.laboratorio08.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            if (isEmptyInputs()) {
                Toast.makeText(this, "Hay algun campo vacio", Toast.LENGTH_SHORT).show()
            } else {
                goDetailActivity()
            }
        }
    }

    private fun goDetailActivity() {
        val fullName = binding.edtFullName.text.toString()
        val email = binding.edtEmail.text.toString()
        val phoneNumber = binding.edtPhoneNumber.text.toString()
        val office = binding.edtOffice.text.toString()

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(FULL_NAME_KEY, fullName)
        intent.putExtra(EMAIL_KEY, email)
        intent.putExtra(PHONE_NUMBER_KEY, phoneNumber)
        intent.putExtra(OFFICE_KEY, office)
        startActivity(intent)
    }

    private fun isEmptyInputs(): Boolean {
        return binding.edtFullName.text.isEmpty() ||
                binding.edtEmail.text.isEmpty() ||
                binding.edtPhoneNumber.text.isEmpty() ||
                binding.edtOffice.text.isEmpty()
    }
}
