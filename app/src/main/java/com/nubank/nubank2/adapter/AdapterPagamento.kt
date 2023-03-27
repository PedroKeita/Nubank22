package com.nubank.nubank2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nubank.nubank2.databinding.PagamentoItemBinding
import com.nubank.nubank2.model.Pagamento

class AdapterPagamento(private val context: Context, private val listaPagamento: MutableList<Pagamento>):
    RecyclerView.Adapter<AdapterPagamento.PagamentoViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagamentoViewHolder {
        val inflater = LayoutInflater.from(context)
        val itemLista = PagamentoItemBinding.inflate(inflater, parent, false)
        return PagamentoViewHolder(itemLista)
    }


    override fun onBindViewHolder(holder: PagamentoViewHolder, position: Int) {
        holder.iconePagamento.setBackgroundResource(listaPagamento[position].icone!!)
        holder.txtTituloPagamento.text = listaPagamento[position].titulo

    }
    override fun getItemCount() = listaPagamento.size


    inner class PagamentoViewHolder(binding: PagamentoItemBinding): RecyclerView.ViewHolder(binding.root) {
        val iconePagamento = binding.icPagamento
        val txtTituloPagamento = binding.txtTituloPagamento

    }

}