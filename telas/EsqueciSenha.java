package telas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JPasswordField;
import java.awt.Cursor;

public class EsqueciSenha extends JPanel {
	private JTextField emailField;
	private JPasswordField newPasswordField;
	private JPasswordField newPasswordField_2;
	private String usuario;
	private String email;
	private String[] infos = new String[4];


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
		lblFundo.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\bg_login.png"));
		lblFundo.setBounds(0, 0, 1235, 720);
		add(lblFundo);

		JLabel lblEsqueciASenha = new JLabel("Esqueci a senha");
		lblEsqueciASenha.setForeground(SystemColor.inactiveCaptionBorder);
		lblEsqueciASenha.setFont(new Font("Poppins", Font.PLAIN, 30));
		lblEsqueciASenha.setBounds(152, 164, 248, 51);
		panel.add(lblEsqueciASenha);

		JLabel lblEmailInputEsq = new JLabel("Email:");
		lblEmailInputEsq.setForeground(SystemColor.text);
		lblEmailInputEsq.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblEmailInputEsq.setBounds(118, 275, 78, 14);
		panel.add(lblEmailInputEsq);

		emailField = new JTextField();
		emailField.setFont(new Font("Poppins", Font.PLAIN, 12)); //Definição da Fonte
		emailField.setCaretColor(new Color(255, 255, 255)); // Cor do cursor de texto para branco
		emailField.setForeground(Color.WHITE);
		emailField.setColumns(10);
		emailField.setBackground(new Color(36, 44, 136));
		emailField.setBounds(118, 295, 300, 25);
		panel.add(emailField);

		JLabel lblnewPassword = new JLabel("Nova Senha:");
		lblnewPassword.setForeground(Color.WHITE);
		lblnewPassword.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblnewPassword.setBounds(118, 331, 121, 14);
		panel.add(lblnewPassword);

		newPasswordField = new JPasswordField();
		newPasswordField.setForeground(Color.WHITE);
		newPasswordField.setFont(new Font("Dialog", Font.PLAIN, 12));
		newPasswordField.setCaretColor(Color.WHITE);
		newPasswordField.setBackground(new Color(36, 44, 136));
		newPasswordField.setBounds(118, 351, 300, 25);
		panel.add(newPasswordField);

		JLabel lblnewPassword_2 = new JLabel("Digite a Nova Senha novamente:");
		lblnewPassword_2.setForeground(Color.WHITE);
		lblnewPassword_2.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblnewPassword_2.setBounds(118, 387, 163, 14);
		panel.add(lblnewPassword_2);

		newPasswordField_2 = new JPasswordField();
		newPasswordField_2.setForeground(Color.WHITE);
		newPasswordField_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		newPasswordField_2.setCaretColor(Color.WHITE);
		newPasswordField_2.setBackground(new Color(36, 44, 136));
		newPasswordField_2.setBounds(118, 405, 300, 25);
		panel.add(newPasswordField_2);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.setFocusPainted(false);
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setBorderPainted(false);
		btnEnviar.setBackground(new Color(64, 74, 204));
		btnEnviar.setBounds(223, 484, 89, 23);
		panel.add(btnEnviar);

		emailFieldMudancaCor();
		newPasswordMudancaCor(newPasswordField);
		newPasswordMudancaCor(newPasswordField_2);

		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email = emailField.getText();
				infos = DB(email);
				char[] passChar = newPasswordField.getPassword();
				char[] passChar2 = newPasswordField_2.getPassword();
				String senha = new String(passChar);
				String senha2 = new String(passChar2);

				if (emailField.getText().isEmpty()) {
					emailField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED)); //Altera a cor da borda para Vermelho
				}
				if (senha.isEmpty()) {
					newPasswordField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
				}
				if (senha2.isEmpty()) {
					newPasswordField_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
				}
				else {
					if(infos[0] == null || infos[0].isEmpty()) {
						JOptionPane.showMessageDialog(null, "E-mail não existente.");
					}
					else {			
						if (emailField.getText().equals(email)) {

							if ((senha.equals(senha2))) {
								ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1","3306","estudamais","root","root"); //Cria uma referência à Classe conexão
								String query = "update user_dados set senha =? where email =?;"; //SQL de substituição (registro);
								try {System.out.println("Entrou no try");
								PreparedStatement pstmt = conn1.conn.prepareStatement(query);
								pstmt.setString(1,senha);
								pstmt.setString(2,email);
								pstmt.executeUpdate();
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								conn1.closeConnection();
								
								JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
								telaLogin();
							}
							else {
								JOptionPane.showMessageDialog(null, "As Senhas não são iguais. Digite novamente");
							}
						}
					}

				}
			}});

		JLabel lblPossuiConta = new JLabel("Já possui uma conta?");
		lblPossuiConta.setForeground(SystemColor.text);
		lblPossuiConta.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblPossuiConta.setBounds(183, 522, 121, 14);
		panel.add(lblPossuiConta);

		JButton btnLogin = new JButton("Faça Login.");
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setFocusPainted(false);
		btnLogin.setHorizontalAlignment(SwingConstants.LEFT);
		btnLogin.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnLogin.setForeground(new Color(130, 209, 236));
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorderPainted(false);
		btnLogin.setBounds(301, 518, 99, 23);
		panel.add(btnLogin);
		// Interação do botão "Faça Login" para voltar à "tela de Login"
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				telaLogin();

			}});

		}

		/*
		 * Métodos
		 */

		public static String[] DB(String email) {
			String[] infouser = new String [1]; //Armazena os dados de login se um usuário em Array.

			try {
				ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1","3306","estudamais","root","root"); //Cria uma referência à Classe conexão

				//Envia comandos para o DB.
				String query = "select * from dados where email = ?;"; //SQL que busca o usuário e senha, utilizando o usuário como ponto de busca;
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

		public void telaLogin() {
			Login a = new Login();
			removeAll();
			add(a);
			revalidate();
			repaint();
		}

		public void emailFieldMudancaCor() {
			emailField.getDocument().addDocumentListener(new DocumentListener() {
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
					if (emailField.getText().isEmpty()) {
						emailField.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
					} else {
						emailField.setBorder(UIManager.getBorder("TextField.border"));
					}
				}
			});}

		public void newPasswordMudancaCor(JPasswordField newPassword) {
			newPassword.getDocument().addDocumentListener(new DocumentListener() {
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
					if (newPassword.getPassword().length == 0) {
						newPassword.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
					} else {
						newPassword.setBorder(UIManager.getBorder("TextField.border"));
					}
				}
			});}




	}
