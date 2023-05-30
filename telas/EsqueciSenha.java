package telas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class EsqueciSenha extends JPanel {
	private JTextField textField;

	public static String[] DB(String email) {
		String[] infouser = new String [1]; //Armazena os dados de login se um usuário em Array.

		try {
			ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1","3306","estudamais","root","root"); //Cria uma referência à Classe conexão

			//Envia comandos para o DB.
			String query = "alter table dados modify column senha where e-mail=?;"; //SQL que busca o usuário e senha, utilizando o usuário como ponto de busca;
			ResultSet rs = conn1.executeQuery(query,email); //Retornar os resultados da SQL

			/*
			 *Comando para guardar os dados dentro de uma variável;/
			 */
			if(rs.next()) {
				infouser[0] = rs.getString("email");} //Busca o vetor 0 das infos, equivalente ao E-mail

			rs.close();
			conn1.closeConnection();
		}
		catch (SQLException e){e.printStackTrace();}
		return infouser;
	}


	/**
	 * Create the panel.
	 */
	public EsqueciSenha() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds (0, 0, 1280, 720);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 44, 136));
		panel.setBounds(658, 0, 550, 720);
		add(panel);
		panel.setLayout(null);
		
		//Label da tela de fundo
		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\OneDrive - SENAC-SC\\Programas\\ProjetoSenac-main\\EstudaMais1-main\\img\\img_telas\\bg_login.png"));
		lblFundo.setBounds(0, 0, 1235, 720);
		add(lblFundo);

		JLabel lblEsqueciASenha = new JLabel("Esqueci a senha");
		lblEsqueciASenha.setForeground(SystemColor.inactiveCaptionBorder);
		lblEsqueciASenha.setFont(new Font("Poppins", Font.PLAIN, 30));
		lblEsqueciASenha.setBounds(154, 285, 248, 51);
		panel.add(lblEsqueciASenha);

		JLabel lblEmailInputEsq = new JLabel("Email:");
		lblEmailInputEsq.setForeground(SystemColor.text);
		lblEmailInputEsq.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblEmailInputEsq.setBounds(120, 347, 78, 14);
		panel.add(lblEmailInputEsq);

		textField = new JTextField();
		textField.setFont(new Font("Poppins", Font.PLAIN, 12)); //Definição da Fonte
		textField.setCaretColor(new Color(255, 255, 255)); // Cor do cursor de texto para branco
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBackground(new Color(36, 44, 136));
		textField.setBounds(120, 367, 300, 25);
		panel.add(textField);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFocusPainted(false);
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setBorderPainted(false);
		btnEnviar.setBackground(new Color(64, 74, 204));
		btnEnviar.setBounds(230, 403, 89, 23);
		panel.add(btnEnviar);

		JLabel lblSemConta = new JLabel("Já possui uma conta?");
		lblSemConta.setForeground(SystemColor.text);
		lblSemConta.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblSemConta.setBounds(190, 441, 121, 14);
		panel.add(lblSemConta);

		JButton btnRegistrar = new JButton("Faça Login.");
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistrar.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnRegistrar.setForeground(new Color(130, 209, 236));
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBounds(300, 437, 110, 23);
		panel.add(btnRegistrar);

		// Interação do botão "Faça Login" para voltar à "tela de Login"
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login a = new Login();
				removeAll();
				add(a);
				revalidate();
				repaint();

			}});

	}

}
