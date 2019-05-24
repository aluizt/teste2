package com.alexandretavares.demo.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Cliente {

    @Id
    private Long id;
    private String nome;

    public Cliente() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
