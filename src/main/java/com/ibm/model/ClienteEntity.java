package com.ibm.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;

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

    //Construtor
    public ClienteEntity(){
    }

    //MER
    @OneToMany
    private List<VendaEntity> venda;
}
