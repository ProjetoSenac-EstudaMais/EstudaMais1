package telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JFormattedTextField;
import javax.swing.border.MatteBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registrar extends JPanel {
	private JTextField emailField;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private String[] infos = new String[6];
	private String usuario;
	private String email;
	private JTextField sobrenomeField;
	private JTextField nameField;
	private JTextField verificationField;
	private int result;	
	private JFormattedTextField birthField;
	private String mysqlDate;
	private MaskFormatter formatter = null;
	private JPanel panel;
	/**
	 * Create the panel.
	 */
	public Registrar() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 1280, 720);
		setLayout(null);


		panel = new JPanel();
		panel.setBackground(new Color(36, 44, 136));
		panel.setBounds(654, 0, 550, 720);
		add(panel);
		panel.setLayout(null);

		JLabel lblTituloConta = new JLabel("Crie sua Conta");
		lblTituloConta.setForeground(SystemColor.inactiveCaptionBorder);
		lblTituloConta.setFont(new Font("Poppins", Font.PLAIN, 30));
		lblTituloConta.setBounds(154, 53, 239, 51);
		panel.add(lblTituloConta);

		JLabel lblInformeSeusDados = new JLabel("Informe seus dados");
		lblInformeSeusDados.setForeground(Color.WHITE);
		lblInformeSeusDados.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblInformeSeusDados.setBounds(208, 96, 121, 14);
		panel.add(lblInformeSeusDados);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblNome.setBounds(121, 168, 121, 14);
		panel.add(lblNome);

		nameField = new JTextField();
		nameField.setForeground(Color.WHITE);
		nameField.setFont(new Font("Poppins", Font.PLAIN, 12));
		nameField.setColumns(10);
		nameField.setCaretColor(Color.WHITE);
		nameField.setBackground(new Color(36, 44, 136));
		nameField.setBounds(121, 188, 300, 25);
		panel.add(nameField);

		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setForeground(Color.WHITE);
		lblSobrenome.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblSobrenome.setBounds(121, 224, 121, 14);
		panel.add(lblSobrenome);

		sobrenomeField = new JTextField();
		sobrenomeField.setForeground(Color.WHITE);
		sobrenomeField.setFont(new Font("Poppins", Font.PLAIN, 12));
		sobrenomeField.setColumns(10);
		sobrenomeField.setCaretColor(Color.WHITE);
		sobrenomeField.setBackground(new Color(36, 44, 136));
		sobrenomeField.setBounds(121, 244, 300, 25);
		panel.add(sobrenomeField);

		//Nome de usuário
		JLabel lblUsuario = new JLabel("Nome de usuário:");
		lblUsuario.setForeground(SystemColor.text);
		lblUsuario.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblUsuario.setBounds(121, 280, 121, 14);
		panel.add(lblUsuario);

		usernameField = new JTextField();
		usernameField.setFont(new Font("Poppins", Font.PLAIN, 12));
		usernameField.setCaretColor(new Color(255, 255, 255));
		usernameField.setForeground(Color.WHITE);
		usernameField.setBackground(new Color(36, 44, 136));
		usernameField.setColumns(10);
		usernameField.setBounds(121, 300, 300, 25);
		panel.add(usernameField);

		//E-mail
		JLabel lblEmailInput = new JLabel("Email:");
		lblEmailInput.setForeground(SystemColor.text);
		lblEmailInput.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblEmailInput.setBounds(121, 336, 78, 14);
		panel.add(lblEmailInput);

		emailField = new JTextField();
		emailField.setFont(new Font("Poppins", Font.PLAIN, 12));
		emailField.setCaretColor(new Color(255, 255, 255));
		emailField.setForeground(Color.WHITE);
		emailField.setBackground(new Color(36, 44, 136));
		emailField.setColumns(10);
		emailField.setBounds(121, 356, 300, 25);
		panel.add(emailField);

		//Senha
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(SystemColor.text);
		lblSenha.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblSenha.setBounds(121, 392, 78, 14);
		panel.add(lblSenha);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Poppins", Font.PLAIN, 12));
		passwordField.setCaretColor(new Color(255, 255, 255));
		passwordField.setForeground(Color.WHITE);
		passwordField.setBackground(new Color(36, 44, 136));
		passwordField.setBounds(121, 412, 300, 25);
		panel.add(passwordField);



		JLabel lblDataNascimento = new JLabel("Data de Nascimento:");
		lblDataNascimento.setForeground(Color.WHITE);
		lblDataNascimento.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblDataNascimento.setBounds(121, 452, 121, 14);
		panel.add(lblDataNascimento);



		JLabel lblVerificacao = new JLabel("Resolva a equação:");
		lblVerificacao.setForeground(Color.WHITE);
		lblVerificacao.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblVerificacao.setBounds(121, 508, 121, 14);
		panel.add(lblVerificacao);

		Random random = new Random();		
		int numero = random.nextInt(20);
		int numero1 = random.nextInt(20);
		result = numero + numero1;

		JLabel lblRandom = new JLabel(numero + " + " + numero1); //Label para aparecer o número random de equação
		lblRandom.setForeground(Color.WHITE);
		lblRandom.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblRandom.setBounds(236, 507, 78, 14);
		panel.add(lblRandom);	

		verificationField = new JTextField();
		verificationField.setForeground(Color.WHITE);
		verificationField.setFont(new Font("Poppins", Font.PLAIN, 12));
		verificationField.setColumns(10);
		verificationField.setCaretColor(Color.WHITE);
		verificationField.setBackground(new Color(36, 44, 136));
		verificationField.setBounds(121, 528, 300, 25);
		panel.add(verificationField);

		//Conta - Fazer login
		JLabel lblSemConta = new JLabel("Já possui uma conta?");
		lblSemConta.setForeground(SystemColor.text);
		lblSemConta.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblSemConta.setBounds(181, 627, 121, 14);
		panel.add(lblSemConta);

		//Botão Login na tela de Registro, caso a pessoa já tenha uma conta.
		JButton btnLogin = new JButton("Faça Login.");
		btnLogin.setFocusPainted(false);
		btnLogin.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setHorizontalAlignment(SwingConstants.LEFT);
		btnLogin.setForeground(new Color(130, 209, 236));
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorderPainted(false);
		btnLogin.setBounds(290, 623, 103, 23);
		panel.add(btnLogin);

		// Botão Registrar uma conta
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBackground(new Color(64, 74, 204));
		btnRegistrar.setBounds(226, 589, 89, 23);
		panel.add(btnRegistrar);

		formatoData();
		textFieldMudancaCor(nameField);
		textFieldMudancaCor(emailField);
		textFieldMudancaCor(sobrenomeField);
		passwordFieldMudancaCor();
		textFieldMudancaCor(usernameField);
		
				//Label da tela de fundo
				JLabel lblFundo = new JLabel("");
				lblFundo.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\bg_login.png"));
				lblFundo.setBounds(0, 0, 1235, 720);
				add(lblFundo);


		birthMudancaCor();

		// Interação do botão "Faça Login" para voltar à "tela de Login"
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				telaLogin();

			}});

		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				condicaoRegistro();

			}
		});
	}

	public static String[] DB(String usuario, String email) {
		String[] infouser = new String [2]; //Armazena os dados de login se um usuário em Array.

		try {
			ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1","3306","estudamais","root","root"); //Cria uma referência à Classe conexão

			//Envia comandos para o DB.

			String query = "select email_user,usuario_user from user_dados where email_user =? or usuario_user =?";
			ResultSet rs = conn1.executeQuery(query,email,usuario);

			/*
			 *Comando para guardar os dados dentro de uma variável;/
			 */
			if(rs.next()) {
				infouser[0] = rs.getString("usuario_user"); //Busca o vetor 0 das infos, equivalente ao Usuário
				infouser[1] = rs.getString("email_user");} //Busca o vetor 1 das infos, equivalente ao E-mail

			rs.close();
			conn1.closeConnection();
		}
		catch (SQLException e){e.printStackTrace();}
		return infouser;
	}

	public void condicaoRegistro() {
		/* verificar usuario e email ja existem;
		 * se existir, avisar que já tem e precisa mudar;
		 * se não existir, registrar e aparecer um POP-UP falando que registro feito e envia pra tela de login
		 */
		usuario = usernameField.getText();
		email = emailField.getText();

		infos = DB(usuario, email);

		String ver = verificationField.getText();
		char[] passChar = passwordField.getPassword();
		String senha = new String(passChar);
		String resultstr = String.valueOf(result);

		if (nameField.getText().isEmpty()) {
			System.out.println("Entrou no if");
			nameField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED)); //Altera a cor da borda para Vermelho
		} 
		if (sobrenomeField.getText().isEmpty()) {
			sobrenomeField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		}
		if (usernameField.getText().isEmpty()) {
			usernameField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		}
		if (emailField.getText().isEmpty()) {
			emailField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		}
		if (senha.isEmpty()) {
			passwordField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		}
		if (birthField.getText().isEmpty()) {
			birthField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));}

		else {



			if (passChar.length < 8 || passChar.length > 20) {
				JOptionPane.showMessageDialog(null, "A senha deve conter entre 8 a 20 caracteres!");
			} else if(!emailField.getText().contains("@")) {
				JOptionPane.showMessageDialog(null, "Deve ser um e-mail real!");
			} else if(!emailField.getText().contains("gmail.") 
					&& !emailField.getText().contains("hotmail.")
					&& !emailField.getText().contains("outlook.")
					&& !emailField.getText().contains("yahoo.")) {
				JOptionPane.showMessageDialog(null, "Deve ser um e-mail real!");
			} else {
				if(!resultstr.equals(ver)) {
					JOptionPane.showMessageDialog(null, "Respota incorreta para a soma"); //Pop-up de resposta incorreta.
				}
				else {if ((infos[0] == null) || (infos[0].isEmpty()) && (infos[1] == null) || (infos[1].isEmpty())){

					dataNascimento();

					ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1","3306","estudamais","root","root"); //Cria uma referência à Classe conexão
					String query = "insert into user_dados (nome_user, sobrenome_user,usuario_user,email_user,senha_user,birthdate_user, badge_id,id_icon,meta_id) values (?,?,?,?,?,?,?,?,?);"; //SQL de inserção de dados (registro);
					try {
						PreparedStatement pstmt = conn1.conn.prepareStatement(query);
						pstmt.setString(1,nameField.getText());
						pstmt.setString(2,sobrenomeField.getText());
						pstmt.setString(3,usernameField.getText());
						pstmt.setString(4,emailField.getText());
						pstmt.setString(5,senha);
						pstmt.setString(6,mysqlDate);
						pstmt.setString(7,"1");
						pstmt.setString(8,"1");
						pstmt.setString(9,"1");

						pstmt.executeUpdate();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					conn1.closeConnection();
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso! Faça seu login.");

					telaLogin();

				}else{
					if((infos[0] !=null )&&(infos[0].equals(usernameField.getText()) )){
						System.out.println(infos[0]);
						JOptionPane.showMessageDialog(null, "Usuário já existente.");}
					else if((infos[1] !=null )&&(infos[1].equals(emailField.getText()))){
						JOptionPane.showMessageDialog(null, "E-mail já cadastrado.");}
				}}
			}}
	}

	/*
	 * Métodos 
	 */
	public void formatoData() {

		try {
			formatter = new MaskFormatter("##/##/####");
			formatter.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// Cria o campo de texto formatado
		birthField = new JFormattedTextField(formatter);
		birthField.setForeground(new Color(255, 255, 255));
		birthField.setOpaque(false);
		birthField.setCaretColor(new Color(255, 255, 255));
		birthField.setBounds(121, 472, 300, 25);
		panel.add(birthField);
	}

	public void dataNascimento() {
		try {
			// Obtém a data digitada no campo de texto
			String text = birthField.getText();

			// Converte a data para o formato do MySQL
			SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = inputFormat.parse(text);
			mysqlDate = outputFormat.format(date);


		} catch (ParseException ex) {
			ex.printStackTrace();

		}
	}

	public void telaLogin() {
		Login a = new Login();
		removeAll();
		add(a);
		revalidate();
		repaint();
	}

	public void textFieldMudancaCor(JTextField textField) {
		textField.getDocument().addDocumentListener(new DocumentListener() {
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
				if (textField.getText().isEmpty()) {
					textField.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
				} else {
					textField.setBorder(UIManager.getBorder("TextField.border"));
				}
			}
		});
	}

	public void passwordFieldMudancaCor() {
		passwordField.getDocument().addDocumentListener(new DocumentListener() {
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
				if (passwordField.getPassword().length == 0) {
					passwordField.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
				} else {
					passwordField.setBorder(UIManager.getBorder("TextField.border"));
				}
			}
		});
	}


	public void birthMudancaCor() {
	}
}
