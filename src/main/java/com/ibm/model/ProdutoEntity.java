package com.ibm.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Produto")
public class ProdutoEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private double preco;


    //Get e Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Construtor
    public ProdutoEntity(){
    }

    //MER
    @OneToMany
    private List<Produto_VendaEntity> produto_vendas;
}
