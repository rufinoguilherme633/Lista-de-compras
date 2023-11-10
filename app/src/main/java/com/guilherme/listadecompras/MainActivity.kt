package com.guilherme.listadecompras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val produtosAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1)
        val list_view_produtos = findViewById<ListView>(R.id.list_view_produtos)
       // var btn_inserir = findViewById<Button>(R.id.btn_inserir)
       // var txt_produto = findViewById<EditText>(R.id.txt_produto)
        list_view_produtos.adapter = produtosAdapter
        val btn_adicionar = findViewById<Button>(R.id.btn_adicionar)
        //val item = "Feijão"
       // produtosAdapter.add(item)
//        btn_inserir.setOnClickListener{
//           val produto = txt_produto.text.toString()
//            if(produto.isNotEmpty()) {
//                //adicionando ao adapitador(lista)
//                produtosAdapter.add(produto)
//                //limpar a caixa e texto
//                txt_produto.text.clear()
//                }else{
//                    //mensagem de erro
//                txt_produto.error = "hello word"
//            }
//        }

        btn_adicionar.setOnClickListener{
            val intent = Intent(this,CadastroActivity::class.java)
            startActivity(intent)
        }
        list_view_produtos.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = produtosAdapter.getItem(position)
            // Aqui você pode manipular o item selecionado, se necessário
            produtosAdapter.remove(selectedItem)
            true
        }
    }
}

/*
* list_view_produtos.setOnItemClickListener é um método usado para definir o que acontecerá quando um item na ListView for clicado. Esse método configura um OnItemClickListener para a ListView que aguarda o usuário interagir com os itens da lista.

Vamos analisar os parâmetros dessa função:

parent: É uma referência para o componente AdapterView no qual o clique ocorreu, neste caso, a própria ListView.

view: É uma referência para a View clicada. Em uma ListView, isso representa a View correspondente ao item clicado.

position: Indica a posição do item clicado na lista.

id: É o identificador da linha que foi clicada. Em muitas implementações, esse parâmetro é o mesmo que a position.*/


/*
AdapterView:

AdapterView é uma classe abstrata no Android que é a base para componentes visuais que exibem uma lista de itens fornecidos por um adaptador.
É uma classe base para widgets como ListView, GridView, Spinner, entre outros. Eles compartilham métodos e propriedades em comum.
Sua principal função é exibir uma lista de itens por meio de um Adapter, permitindo a rolagem e a seleção de itens.
View:

View é a classe base para todos os elementos visuais (widgets) na hierarquia de uma interface do usuário no Android.
Em um contexto de AdapterView, uma View representa um item individual exibido na lista. Por exemplo, um item em um ListView ou um elemento em um Spinner.
Cada View individual corresponde a um item na lista. Esses itens podem conter layouts mais complexos, permitindo personalização e exibição de dados.
* */