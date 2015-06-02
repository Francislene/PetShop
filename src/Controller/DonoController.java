
package Controller;

import Model.Dono;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author info206 
 */
public class DonoController {
        
    public void inserirDono(Dono D) throws SQLException {
        try {
            Base util = new Base();
            Connection conexao = Base.conecta();
            String sql = "INSERT INTO Dono (CPF, Nascimento, Endereco, Telefone, Nome) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, D.getCPF());
            statement.setString(2, D.getNascimento());
            statement.setString(3, D.getEndereco());
            statement.setString(4, D.getTelefone());
            statement.setString(5, D.getNome());
             
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo dono inserido com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

            public void selectDono()throws SQLException {
                try {
            
            String sql = "SELECT * FROM dono";
            Base util = new Base();
            Connection conexao = Base.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                String CPF = result.getString("5748415");
                String Nascimento = result.getString("17/03/1999");
                String Endereco = result.getString("Açude");
                String Telefone = result.getString("87457070");
                String Nome = result.getString("Fran");
                
                String output = "Dono #%d: %s - %s - %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, CPF, Nascimento, Endereco, Telefone, Nome));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
}