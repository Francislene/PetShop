package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.Servico;
/**
 *
 * @author info206 
 */
public class ServicoController {
        
    public void inserirServico(Servico S) throws SQLException {
        try {
            Base Base = new Base();
            Connection conexao = Base.conecta();
            String sql = "INSERT INTO Servico (Nome, Descricao) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, S.getNome());
            statement.setString(2, S.getDescricao());
            
            
             
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo servico inserido com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

            public void selectServico()throws SQLException {
                try {
            
            String sql = "SELECT * FROM servico";
            Base Base = new Base();
            Connection conexao = Base.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                String Nome = result.getString("Banho");
                String Descricao = result.getString("2");
                
                
                String output = "Servico #%d: %s - %s - %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, Nome, Descricao));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
}