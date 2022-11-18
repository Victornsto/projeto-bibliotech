/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.dao;

import br.com.livro.model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dev74
 */
public class LivroDAO {

    public void cadastrarLivro(String titulo, String autor, String userId) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String qryCadastrar = "insert into livros (nome_livro, nome_autor, useid) values ('" + titulo + "', '" + autor + "', '" + userId + "')";
        PreparedStatement statment = conexao.prepareStatement(qryCadastrar);
        statment.execute();
        conexao.close();
    }

    public List<Livro> listarLivros() throws SQLException {
        List<Livro> livros = new ArrayList<>();
        Connection conexao = new Conexao().getConnection();
        try {
            String qryListarLivros = "select livros.livroId, livros.nome_livro, livros.nome_autor, livros.data_cad, livros.useId, usuarios.nome from livros, usuarios where usuarios.useid = livros.useid order by livros.livroid";
            PreparedStatement statment = conexao.prepareStatement(qryListarLivros);
            ResultSet rs = statment.executeQuery();
            while (rs.next()) {
                Livro livro = new Livro();
                livro.setLivroId(rs.getString("livroId"));
                livro.setNome_livro(rs.getString("nome_livro"));
                livro.setNome_autor(rs.getString("nome_autor"));
                livro.setData_cad(rs.getString("data_cad"));
                livro.setUseId(rs.getString("useId"));
                livro.setNome_user(rs.getString("nome"));
                livros.add(livro);
            }

            return livros;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar livros" + e);
        } finally {
            conexao.close();
        }
        return null;

    }

    public void editarLivro(Livro livro) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        try {
            String qryEditarLivro = "update livros set nome_livro = '" + livro.getNome_livro() + "', nome_autor = '" + livro.getNome_autor() + "' where livroId = '" + livro.getLivroId() + "' ";
            System.out.println(qryEditarLivro);
            PreparedStatement statment = conexao.prepareStatement(qryEditarLivro);
            statment.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex);
        } finally {
            conexao.close();
        }

    }

    public void excluirLivro(String livroId) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        try {
            String qryEditarLivro = "delete from livros where livroId = '" + livroId + "'";
            PreparedStatement statment = conexao.prepareStatement(qryEditarLivro);
            statment.executeQuery();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } finally {
            conexao.close();
        }

        
    }
}
