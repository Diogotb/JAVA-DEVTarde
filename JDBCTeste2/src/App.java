import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            Statement s; // Cria uma instância de Statement para executar comandos SQL.
            String usuario = "postgres"; // Nome de usuário do banco de dados.
            String senha = "postgres"; // Senha do banco de dados.
            String url = "jdbc:postgresql://localhost:5432/postgres"; // URL de conexão com o banco de dados PostgreSQL.

            Connection c = DriverManager.getConnection(url, usuario, senha); // Estabelece a conexão com o banco de
                                                                             // dados.
            s = c.createStatement(); // Cria um objeto Statement a partir da conexão.

            // Executa uma consulta SQL de inserção na tabela "CONTATO".
    
            // ser substituídos pelos valores reais a serem inseridos.
            s.executeQuery("INSERT INTO CONTATO VALUES('3', 'DIOGO', 'digogo@gmail.com')");

            c.close(); // Fecha a conexão com o banco de dados após a conclusão da operação.

        } catch (Exception E) {
            System.out.println("\n" + E); // Captura e imprime qualquer exceção que ocorra durante a execução.
        }

    }
}
