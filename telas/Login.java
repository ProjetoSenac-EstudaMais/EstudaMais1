package telas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import telas.EsqueciSenha;
import java.awt.Dimension;
import java.awt.Insets;


public class Login extends JPanel {
	private JTextField login_emailField;
	private JPasswordField login_passwordField;
	private String userInfo;

	/*
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		setBounds(0,0,1280,720);
		// Criação do Panel

		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(36, 44, 136));
		panel.setBounds(654, 0, 550, 720);
		add(panel);
		panel.setLayout(null);

		//Label da tela de fundo
		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\OneDrive - SENAC-SC\\Programas\\ProjetoSenac-main\\EstudaMais1-main\\img\\img_telas\\bg_login.png"));
		lblFundo.setBounds(0, 0, 1235, 720);
		add(lblFundo);

		// Título tela de Login - Faça seu Login
		JLabel lblTituloConta = new JLabel("Faça seu Login");
		lblTituloConta.setForeground(SystemColor.inactiveCaptionBorder);
		lblTituloConta.setFont(new Font("Poppins", Font.PLAIN, 32));
		lblTituloConta.setBounds(153, 179, 247, 51);
		panel.add(lblTituloConta);

		// Título do E-mail para ser inserido
		JLabel lblEmailInput = new JLabel("Email:");
		lblEmailInput.setForeground(SystemColor.text);
		lblEmailInput.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblEmailInput.setBounds(125, 300, 78, 14);
		panel.add(lblEmailInput);

		// Caixa de texto para inserir o login
		login_emailField = new JTextField();
		login_emailField.setFont(new Font("Poppins", Font.PLAIN, 12)); //Definição da Fonte
		login_emailField.setCaretColor(new Color(255, 255, 255)); // Cor do cursor de texto para branco
		login_emailField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		login_emailField.setForeground(new Color(255, 255, 255));
		login_emailField.setBackground(new Color(36, 44, 136));
		login_emailField.setBounds(125, 320, 300, 25);
		panel.add(login_emailField);
		login_emailField.setColumns(10);

		// Campos relacionados à Senha
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(SystemColor.text);
		lblSenha.setFont(new Font("Poppins", Font.PLAIN, 12));
		lblSenha.setBounds(125, 355, 78, 14);
		panel.add(lblSenha);

		login_passwordField = new JPasswordField();
		login_passwordField.setCaretColor(new Color(255, 255, 255));
		login_passwordField.setFont(new Font("Poppins", Font.PLAIN, 12));
		login_passwordField.setForeground(new Color(255, 255, 255));
		login_passwordField.setBackground(new Color(36, 44, 136));
		login_passwordField.setBounds(125, 375, 300, 25);
		panel.add(login_passwordField);

		// Botão esqueceu a Senha
		JButton btnEsqueceuASenha = new JButton("Esqueceu a senha? Clique aqui.");
		btnEsqueceuASenha.setFocusPainted(false);
		btnEsqueceuASenha.setMargin(new Insets(0, 0, 0, 0));
		btnEsqueceuASenha.setPreferredSize(new Dimension(98, 14));
		btnEsqueceuASenha.setMinimumSize(new Dimension(98, 14));
		btnEsqueceuASenha.setMaximumSize(new Dimension(98, 14));
		btnEsqueceuASenha.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnEsqueceuASenha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEsqueceuASenha.setHorizontalAlignment(SwingConstants.LEFT);
		btnEsqueceuASenha.setForeground(new Color(130, 209, 236));
		btnEsqueceuASenha.setContentAreaFilled(false);
		btnEsqueceuASenha.setBorderPainted(false);
		btnEsqueceuASenha.setBounds(195, 500, 188, 23);
		panel.add(btnEsqueceuASenha);

		//Campo LOGIN
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnLogin.setFocusPainted(false);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBorderPainted(false);
		btnLogin.setBackground(new Color(64, 74, 204));
		btnLogin.setBounds(230, 428, 89, 23);
		panel.add(btnLogin);

		//Texto "Não tem uma conta?"
		JLabel lblSemConta = new JLabel("Não tem uma conta?");
		lblSemConta.setForeground(SystemColor.text);
		lblSemConta.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblSemConta.setBounds(185, 475, 116, 14);
		panel.add(lblSemConta);

		JButton btnRegistrar = new JButton("Registrar-se.");
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistrar.setForeground(new Color(130, 209, 236));
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBounds(290, 471, 110, 23);
		panel.add(btnRegistrar);

		emailFieldMudancaCor();
		passwordFieldMudancaCor();
		// Interação do botão "Esqueci a senha" com a tela de "EsqueciSenha"
		btnEsqueceuASenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				telaEsqueciSenha();
			}});

		// Interação do botão "Login" com a "Tela Inicial" - ao clicar vai para a tela Principal do app
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				condicaoLogin();

			}});

		// Interação do botão "Registrar" com a tela "Registrar" - quando o usuário não possui um registro
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				telaRegistrar();

			}});
	}

	public static String[] DB(String email) {
		String[] infouser = new String [3]; //Armazena os dados de login se um usuário em Array.

		try {
			ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1","3306","estudamais","root","root"); //Cria uma referência à Classe conexão

			//Envia comandos para o DB.
			String query = "select senha_user, email_user, id_user from user_dados where email_user =?;"; //SQL que busca o usuário e senha, utilizando o usuário como ponto de busca;
			ResultSet rs = conn1.executeQuery(query,email); //Retornar os resultados da SQL

			/*
			 *Comando para guardar os dados dentro de uma variável;/
			 */
			if(rs.next()) {
				infouser[0] = rs.getString("senha_user"); //Busca o vetor 1 das infos, equivalente à Senha
				infouser[1] = rs.getString("email_user"); //Busca o vetor 1 das infos, equivalente ao Email
				infouser[2] = rs.getString("id_user");}

			rs.close();
			conn1.closeConnection();
		}
		catch (SQLException e){e.printStackTrace();}
		return infouser;
	}

	public void condicaoLogin() {

		userInfo = login_emailField.getText();

		String [] emailInfo = DB(userInfo);

		char [] passChar = login_passwordField.getPassword();
		String senha = new String(passChar);

		if (login_emailField.getText().isEmpty()) {
			login_emailField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		}
		if (senha.isEmpty()) {
			login_passwordField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));}
		if (login_emailField.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Senha ou email não foram digitados!");
		}
		else {
			if (emailInfo[1] == null || emailInfo[1].isEmpty()) {
				JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
			}
			else if(emailInfo[1].equals(login_emailField.getText())){
				if ( emailInfo[0].equals(senha)) {
					
					telaInicial(emailInfo[2]);
				}
				else {
					JOptionPane.showMessageDialog(null, "Senha inválida!");

				}
			}}
	}

	public void telaInicial(String id_user) {
		TelaInicial a = new TelaInicial(id_user);
		removeAll();
		add(a);
		revalidate();
		repaint();
	}

	public void telaEsqueciSenha() {
		EsqueciSenha esquecisenha = new EsqueciSenha();
		removeAll();
		add(esquecisenha);
		revalidate();
		repaint();
	}

	public void telaRegistrar() {
		Registrar a = new Registrar();
		removeAll();
		add(a);
		revalidate();
		repaint();
	}

	public void passwordFieldMudancaCor() {
		login_passwordField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				updateBorder();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				updateBorder();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				updateBorder();
			}

			private void updateBorder() {
				if (login_passwordField.getPassword().length == 0) {
					login_passwordField.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
				} else {
					login_passwordField.setBorder(UIManager.getBorder("TextField.border"));
				}
			}
		});
	}


	public void emailFieldMudancaCor() {
		login_emailField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				updateBorder();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				updateBorder();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				updateBorder();
			}

			private void updateBorder() {
				if (login_emailField.getText().isEmpty()) {
					login_emailField.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
				} else {
					login_emailField.setBorder(UIManager.getBorder("TextField.border"));
				}
			}
		});
	}

}
