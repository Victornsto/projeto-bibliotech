/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login.controller;
import br.com.livro.model.Livro;
import java.sql.Connection;
import br.com.login.dao.Conexao;
import br.com.login.dao.LivroDAO;
import br.com.login.dao.LoginDAO;
import br.com.login.model.Usuario;
import br.com.login.view.AlterSenhaView;
import br.com.login.view.CadastroView;
import br.com.login.view.LoginView;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;

public class LoginController {
    public void cadastroUsuario(CadastroView view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText());
        
    }
    public void mudarSenha(AlterSenhaView view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LoginDAO alterar = new LoginDAO();
        alterar.mudarSenha(view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText());
    }
    public Usuario login(LoginView view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LoginDAO login = new LoginDAO();
        return login.login(view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText());
    }
    
}
