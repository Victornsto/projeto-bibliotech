/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.controller;

import br.com.livro.model.Livro;
import br.com.login.dao.Conexao;
import br.com.login.dao.LivroDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Dev74
 */
public class LivroController {
    public List<Livro> listarLivros() throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LivroDAO livro = new LivroDAO();
        return livro.listarLivros();
    }
    
    public void cadastarLivros(String titulo, String autor, String userId) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LivroDAO livro = new LivroDAO();
        livro.cadastrarLivro(titulo, autor,userId);
    }
    public void editarLivros(Livro livroEdt) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LivroDAO livro = new LivroDAO();
        livro.editarLivro(livroEdt);
        
    }
    public void excluirLivro(String livroID) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LivroDAO livro = new LivroDAO();
        livro.excluirLivro(livroID);
    }
}
