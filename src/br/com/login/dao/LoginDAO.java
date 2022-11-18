package br.com.login.dao;
import br.com.login.model.Usuario;
import br.com.login.view.LivroView;
import br.com.login.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Dev74
 */
public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String email,String senha ) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        try {
            String qryCadastrar = "insert into usuarios (Nome, Email, Senha, Adm) values ('"+nome+"', '"+email+"', '"+senha+"',false)";
            PreparedStatement statment = conexao.prepareStatement(qryCadastrar);
            statment.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            conexao.close();
        }
    }
    
    public void mudarSenha(String email, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        try {
            String qryMudarSenha = "update usuarios set senha = '"+senha+"' where email = '"+email+"' ";
        PreparedStatement statment = conexao.prepareStatement(qryMudarSenha);
        statment.executeUpdate();
        JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            conexao.close();
        }
        
        conexao.close();
    }
    
    public Usuario login(String email, String senha) throws SQLException {
        int userID;
        Usuario user = new Usuario();
        Connection conexao = new Conexao().getConnection();
        try {
            String qryLogar = "select useId, nome from usuarios where senha = '"+senha+"' and email = '"+email+"' ";
        PreparedStatement statment = conexao.prepareStatement(qryLogar);
        ResultSet rs = statment.executeQuery();
        if (rs.next()) {
            user.setUserId(rs.getInt("useid"));
            user.setNome(rs.getString("nome"));
            
            conexao.close();
            return user;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não localizado");
            return null;
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar" + ex);
        } finally {
            conexao.close();
        }
        
        return null;
        
    }
    
    public void usuario(int useId) {
        
    }
    
}
