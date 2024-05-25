package com.example.cookingapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import com.example.cookingapp.databinding.ActivityCategoryAddBinding.inflate
import com.example.cookingapp.databinding.ActivityDetailBinding
import com.example.cookingapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class DetailActivity : AppCompatActivity() {
    //view binding
    private lateinit var binding: ActivityDetailBinding

//    //firebase auth
    private lateinit var firebaseAuth: FirebaseAuth
//
//    //progress dialog
    private lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //handle click, backbtn
        binding.backBtn.setOnClickListener {
            onBackPressed()
        }
    }





}