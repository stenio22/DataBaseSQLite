package com.oliveira.stenio.bancostenio;

/**
 * Created by Stenio on 08/11/2016.
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private long id;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


}
