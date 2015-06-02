
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.Animal;
/**
 *
 * @author info206 
 */
public class AnimalController {
        
    public void inserirAnimal(Animal A) throws SQLException {
        try {
            Base util = new Base();
            Connection conexao = util.conecta();
            String sql = "INSERT INTO Animal (Raca, Cor, Tamanho, Nascimento, Nome, Obs) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setString(1, A.getRaca());
            statement.setString(2, A.getCor());
            statement.setString(3, A.getTamanho());
            statement.setString(4, A.getNascimento());
            statement.setString(5, A.getNome());
            statement.setString(6, A.getObs());
             
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo animal inserido com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

            public void selectAnimal()throws SQLException {
                try {
            
            String sql = "SELECT * FROM animal";
            Base util = new Base();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                String Raca = result.getString("poodle");
                String Cor = result.getString("branco");
                String Tamanho = result.getString("Porte pequeno");
                String Nascimento = result.getString("17/02/2014");
                String Nome = result.getString("Mel");
                String Obs = result.getString("fnfgh");
                
                String output = "Animal #%d: %s - %s - %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, Raca, Cor, Tamanho, Nascimento, Nome, Obs));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
}