/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author info206
 */
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mikaele
 */
//Classe para criar tabelas (subistituir nosso terminal)
public class Base {
    
     public static Connection conecta() throws SQLException{
                      Connection conexao = null;

        String url = "jdbc:mysql://192.200.63.121:3306/petshop";  //Nome da base de dados
        String user = "root"; //nome do usuário do MySQL
        String password = "123456"; //senha do MySQL
        try{
            conexao = DriverManager.getConnection(url, user, password);
}catch(SQLException sqlex){
System.out.println("Erro na conexão "+ sqlex);
}
        return conexao;
    }

    public void desconecta(Connection conexao){
    try{
    conexao.close();
    }catch(SQLException sqlex){
    System.out.println("Erro na conexão "+ sqlex);
    }
    }
    public static void criaTabela(String nomeTabela,String atributos) throws SQLException {
            Statement statement = null;
            Connection conexao = null;

        try {
            conexao = conecta();
            statement = conexao.createStatement();

            String createTableSQL = "CREATE TABLE "+nomeTabela+"("+atributos+");";

        	System.out.println(createTableSQL);
                        // executa o comando de criação
        	statement.execute(createTableSQL);

        	System.out.println("Tabela \"nomeTabela\" foi criada com sucesso!");

        } catch (SQLException e) {

        	System.out.println(e.getMessage());

        } finally {   // sempre feche o statement a conexão com banco

        	if (statement != null) {
        		statement.close();
        	}

        	if (conexao != null) {
        		conexao.close();
        	}

        }

    }
    
    public static void criaBanco(String banco) throws SQLException{
        
        String sql="CREATE DATABASE "+banco;
        Connection conxao= conecta();
        Statement stmt = conxao.createStatement();
        stmt.execute(sql);
    
    }
    
    public static void rodaScript(String sql) throws SQLException{
        Connection conxao= conecta();
        Statement stmt = conxao.createStatement();
        stmt.execute(sql);
    }
    

       
}

