package com.ibm.model;

import javax.persistence.*;

@Entity
@Table(name = "Item")
public class Produto_VendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int quantidade;
    private double valor;

    //Get e Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Construtor
    public Produto_VendaEntity() {
    }

    //MER
    @ManyToOne
    private VendaEntity venda;

    @ManyToOne
    private ProdutoEntity produtos;
}
