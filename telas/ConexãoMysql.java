package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexãoMysql {
	Connection conn;

	// Metódo para conectar com o banco de dados
	public ConexãoMysql(String host, String port, String database, String user, String password) {
		// ao extabelecer os valores das variaveis você esta dando o caminho ao seu
		// banco de dados
		String url = "jdbc:mysql://" + host + ":" + port + "/" + database;

		// Confirma se estão todas informações corretas e roda o código
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão estabelecida");
		} catch (SQLException e) {
			System.out.println("Conexão não estabelecida" + e.getMessage());
		}
	}

	// Metódo para criar o 'Statement' o comando que você vai dar ao banco de dados
	public ResultSet executeQuery(String query, Object... parameters) {
		ResultSet resultSet = null;

		// Com a variavel 'Object... parameters' você pode usar qualquer tipo de
		// parametro no outro codigo, String, int, float....
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			for (int i = 0; i < parameters.length; i++) {
				preparedStatement.setObject(i + 1, parameters[i]);
			}

			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			System.out.println("Erro ao executar consulta: " + e.getMessage());
		}
		return resultSet;
	}

	// fecha a conexão com o banco de dados
	public void closeConnection() {
		try {
			if (conn != null) {
				conn.close();
				System.out.println("Conexão com o banco de dados fechada.");
			}
		} catch (SQLException e) {
			System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
		}
	}
}
