/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.livro.model;

/**
 *
 * @author Dev74
 */
public class Livro {
    private String nome_livro, nome_autor, data_cad, nome_user, useId, livroId;
    public void Livro( String livroId, String nome_livro, String nome_autor, String data_cad, String useId, String nome_user){
        this.livroId = livroId;
        this.nome_livro = nome_livro;
        this.nome_autor = nome_autor;
        this.data_cad = data_cad;
        this.useId = useId;
        this.nome_user = nome_user;
    }

    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getData_cad() {
        return data_cad;
    }

    public void setData_cad(String data_cad) {
        this.data_cad = data_cad;
    }

    public String getLivroId() {
        return livroId;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }

    public void setLivroId(String livroId) {
        this.livroId = livroId;
    }
    
}
