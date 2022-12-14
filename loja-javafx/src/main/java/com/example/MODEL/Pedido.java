package com.example.MODEL;

import java.math.BigDecimal;

public class Pedido {
    private String nome;
    private BigDecimal valor;
    private int qtdeDeItens;

    public int getQtdeDeItens() {
        return qtdeDeItens;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Pedido(String nome, BigDecimal valor, int qtdeDeItens) {
        this.nome = nome;
        this.valor = valor;
        this.qtdeDeItens = qtdeDeItens;
    }

    @Override
    public String toString() {
        return "Pedido [nome=" + nome + ", valor=" + valor + "]";
    }
    

}
