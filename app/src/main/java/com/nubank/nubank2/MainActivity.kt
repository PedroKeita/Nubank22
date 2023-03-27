package com.nubank.nubank2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nubank.nubank2.adapter.AdapterPagamento
import com.nubank.nubank2.adapter.AdapterProduto
import com.nubank.nubank2.databinding.ActivityMainBinding
import com.nubank.nubank2.model.Pagamento
import com.nubank.nubank2.model.Produto

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    private lateinit var  adapterPagamento: AdapterPagamento
    private lateinit var adapterProduto: AdapterProduto
    private val listaPagamento: MutableList<Pagamento> = mutableListOf()
    private val listaProduto: MutableList<Produto> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val recyclerIconesPagamento = binding.recyclerIconesPagamento
        recyclerIconesPagamento.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerIconesPagamento.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this,listaPagamento)
        recyclerIconesPagamento.adapter =  adapterPagamento
        listaIconesPagamento()

        val recyclerProdutos = binding.recyclerProdutos
        recyclerProdutos.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerProdutos.setHasFixedSize(true)
        adapterProduto = AdapterProduto(this,listaProduto)
        recyclerProdutos.adapter = adapterProduto
        listaTextoInformativo()
    }
    private fun listaIconesPagamento(){
        val icone1 = Pagamento(R.drawable.ic_pix,"Area pix")
        listaPagamento.add(icone1)

        val icone2 = Pagamento(R.drawable.barcode,"Pagar")
        listaPagamento.add(icone2)

        val icone3 = Pagamento(R.drawable.emprestimo,"Pegar \n Emprestado")
        listaPagamento.add(icone3)

        val icone4 = Pagamento(R.drawable.transferencia,"Transferir")
        listaPagamento.add(icone4)

        val icone5 = Pagamento(R.drawable.depositar,"Depositar")
        listaPagamento.add(icone5)

        val icone6 = Pagamento(R.drawable.ic_recarga_celular,"Recarga de celular")
        listaPagamento.add(icone6)

        val icone7 = Pagamento(R.drawable.ic_cobrar,"Cobrar")
        listaPagamento.add(icone7)

        val icone8 = Pagamento(R.drawable.doacao,"Doação")
        listaPagamento.add(icone8)
    }

    private fun listaTextoInformativo(){
        val TextoInformativo1 = Produto("Participe da Promoção Tudo no Roxinho e concorra a...")
        listaProduto.add(TextoInformativo1)

        val TextoInformativo2 = Produto("Chegou o débito automático da fatura do cartão")
        listaProduto.add(TextoInformativo2)

        val TextoInformativo3 = Produto("Conheça a conta PJ: prática e livre de burocracia para se...")
        listaProduto.add(TextoInformativo3)

        val TextoInformativo4 = Produto("salve seus amigos da burocracia: Faça um convite")
        listaProduto.add(TextoInformativo4)
    }
}