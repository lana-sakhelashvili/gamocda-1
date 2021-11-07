package com.example.gamocda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private  lateinit var hint1:EditText
    private  lateinit var  hint2:EditText
    private lateinit var hint3:EditText
    private lateinit var  editTEXTlast:EditText
    private lateinit var button: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hint1 = findViewById(R.id.lastone)
        hint2 = findViewById(R.id.secondone)
        hint3 = findViewById(R.id.firstone)
        editTEXTlast = findViewById(R.id.thelastone)
        button = findViewById(R.id.button2)

        button.setOnClickListener {
            val xx = hint1.text.toString().trim()
            val something = hint2
            val yy = hint3.text.toString().trim()
            val number = editTEXTlast



            if (xx.isEmpty()){
                hint1.error = "გთხოვთ შეიყვანოთ მანქანის ნომერი"
                return@setOnClickListener
            }else if(something.isEmpty){
                hint2.error = "გთხოვთ შეიყვანოთ მანქანის ნომერი"
                return@setOnClickListener
            }else if (yy.isEmpty()){
                hint3.error = "გთხოვთ შეიყვანოთ მანქანის ნომერი"
                return@setOnClickListener
            }else if (number.isEmpty){
                editTEXTlast.error = "შეიყვანეთ ტექ-პასპორტის ნომერი"
                return@setOnClickListener
            }else{
                Toast.makeText(this, "ინფორმაცია მუშავდება",Toast.LENGTH_SHORT).show()
            }




        }







    }
}