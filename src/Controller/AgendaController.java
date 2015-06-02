package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Model.Agenda;
/**
 *
 * @author info206 
 */
public class AgendaController {
        
    public void inserirAgenda(Agenda A) throws SQLException {
        try {
            Base Base = new Base();
            Connection conexao = Base.conecta();
            String sql = "INSERT INTO Agenda (Horario) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
            statement.setInt(1, A.getHorario());
            
             
            int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
            if (rowsInserted > 0) {
                System.out.println("Novo agenda inserido com sucesso");
            }
        statement.close();
        conexao.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

            public void selectAnimal()throws SQLException {
                try {
            
            String sql = "SELECT * FROM agenda";
            Base Base = new Base();
            Connection conexao = Base.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                int Horario = result.getInt("13:30 horas");
                
                
                String output = "Agenda #%d: %s - %s - %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, Horario));
                                
                                statement.close();
                                conexao.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
}