package com.app.questiontest2

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_ok.setOnClickListener {

            startActivityForResult(Intent(this, MapsActivity::class.java),200)

           // checkNumber("1")

        }

    }

    fun checkNumber(num:String){

        if(num=="1"){
            Toast.makeText(this,"IF",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"Else",Toast.LENGTH_SHORT).show()
        }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d(">>>","=-=-=-=-")
        Toast.makeText(this,"COME"+requestCode+"--"+resultCode+"=="+data,Toast.LENGTH_SHORT).show()
            if(requestCode == 200){
                Log.d(">>>","=-=-=-=-"+MapsActivity.LANGUAGE_EN);
                Toast.makeText(this,"____"+data?.getStringExtra("iData"),Toast.LENGTH_SHORT).show()
            }

    }
}
