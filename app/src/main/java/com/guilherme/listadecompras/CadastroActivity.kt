package com.guilherme.listadecompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)


         var btn_inserir = findViewById<Button>(R.id.btn_inserir)
         var txt_produto = findViewById<EditText>(R.id.txt_produto)

        btn_inserir.setOnClickListener{
           val produto = txt_produto.text.toString()
            if(produto.isNotEmpty()) {

                txt_produto.text.clear()
                }else{
                    //mensagem de erro
                txt_produto.error = "Preencha um valor"
            }
        }
    }
}