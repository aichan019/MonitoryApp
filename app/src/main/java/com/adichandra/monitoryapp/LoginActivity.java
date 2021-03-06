package com.adichandra.monitoryapp;

/*
 * NIM   : 10118015
 * NAMA  : Adi Chandra Nugraha
 * KELAS : IF1
 * TGL   : 1/05/2021
 * Deskripsi : Membuat Tampilan LoginActivity dan membuat onClick menuju BiodataActivity
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn_masuk(View view) {
        Intent intent =  new Intent(this,BiodataActivity.class);
        startActivity(intent);
    }
}