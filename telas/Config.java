package telas;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Config extends JPanel {

	//VARIAVEIS PARA O TIPO DE SIMULADO (PARA SER USADO COM OS BOTOES)
	int simuladoEscolha;

	//VARIAVEL PARA O ANO DO SIMULADO COMPLETO
	String anoSC;

	//VARIAVEL PARA O TEMPO DO SIMULADO PERSONALIZADO
	String anoSP;

	//VARIAVEL PARA O TEMPO DO SIMULADO PERSONALIZADO
	String tempoSP;

	private String id_user;
	private JPasswordField passwordField;
	private JPasswordField passwordField_2;


	/**
	 * Create the panel.
	 */
	public Config(String id_user) {
		this.id_user=id_user;
		setLayout(null);
		setBounds(100,100,1280,720);

		JPanel Sidebar = new JPanel();
		Sidebar.setForeground(new Color(0, 0, 0));
		Sidebar.setBackground(new Color(240, 240, 240));
		Sidebar.setBounds(0, 0, 260, 720);
		add(Sidebar);
		Sidebar.setLayout(null);

		JPanel Perfil = new JPanel();
		Perfil.setBorder(null);
		Perfil.setBackground(new Color(36, 44, 134));
		Perfil.setBounds(0, 0, 260, 100);
		Sidebar.add(Perfil);
		Perfil.setLayout(null);

		JLabel badge_id = new JLabel("");
		badge_id.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id1.png"));
		badge_id.setBounds(71, 55, 28, 28);
		Perfil.add(badge_id);

		JLabel icon_user = new JLabel("");
		icon_user.setInheritsPopupMenu(false);
		icon_user.setRequestFocusEnabled(false);
		icon_user.setIconTextGap(0);
		icon_user.setBorder(null);
		icon_user.setHorizontalAlignment(SwingConstants.CENTER);
		icon_user.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id2.png"));
		icon_user.setBounds(24, 15, 68, 68);
		Perfil.add(icon_user);

		JLabel nome_id = new JLabel("Henrique Silveira");
		nome_id.setForeground(new Color(255, 255, 255));
		nome_id.setFont(new Font("Poppins", Font.PLAIN, 12));
		nome_id.setBounds(100, 20, 150, 25);
		Perfil.add(nome_id);

		JLabel badge_subtitle_id = new JLabel("Primeiro Simulado");
		badge_subtitle_id.setForeground(new Color(188, 188, 188));
		badge_subtitle_id.setFont(new Font("Poppins", Font.PLAIN, 12));
		badge_subtitle_id.setBounds(100, 35, 166, 25);
		Perfil.add(badge_subtitle_id);

		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(36, 44, 134));
		panel_3_2.setBounds(0, 0, 320, 10);
		Perfil.add(panel_3_2);

		JButton btnPerfil = new JButton("Meu Perfil");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeuPerfil mp = new MeuPerfil(id_user);
				removeAll();
				add(mp);
				revalidate();
				repaint();
			}
		});
		btnPerfil.setOpaque(false);
		btnPerfil.setBackground(new Color(98, 106, 204));
		btnPerfil.setMargin(new Insets(2, 22, 2, 14));
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setHorizontalAlignment(SwingConstants.LEFT);
		btnPerfil.setFocusPainted(false);
		btnPerfil.setBorderPainted(false);
		btnPerfil.setForeground(new Color(0, 0, 0));
		btnPerfil.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnPerfil.setBounds(0, 140, 260, 19);
		Sidebar.add(btnPerfil);

		JButton btnConfig = new JButton("Configurações");
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnConfig.setBackground(new Color(98, 106, 204));
		btnConfig.setMargin(new Insets(2, 22, 2, 14));
		btnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfig.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfig.setForeground(new Color(255, 255, 255));
		btnConfig.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnConfig.setFocusPainted(false);
		btnConfig.setBorderPainted(false);
		btnConfig.setBounds(0, 165, 260, 19);
		Sidebar.add(btnConfig);

		JButton btnSair = new JButton("Sair");
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.setOpaque(false);
		btnSair.setHorizontalAlignment(SwingConstants.LEFT);
		btnSair.setForeground(Color.BLACK);
		btnSair.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnSair.setFocusPainted(false);
		btnSair.setContentAreaFilled(false);
		btnSair.setBorderPainted(false);
		btnSair.setBounds(10, 690, 132, 19);
		Sidebar.add(btnSair);

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login a = new Login();
				removeAll();
				add(a);
				revalidate();
				repaint();
			}
		});

		JButton btnMenu = new JButton("Menu Principal");
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.setMargin(new Insets(2, 22, 2, 14));
		btnMenu.setBackground(new Color(240, 240, 240));
		btnMenu.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu.setForeground(new Color(0, 0, 0));
		btnMenu.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnMenu.setFocusPainted(false);
		btnMenu.setBorderPainted(false);
		btnMenu.setBounds(0, 115, 260, 19);
		Sidebar.add(btnMenu);

		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial a = new TelaInicial(id_user);
				removeAll();
				add(a);
				revalidate();
				repaint();
			}
		});


		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 720);
		panel.setBackground(new Color(128, 128, 128));
		add(panel);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(260, 0, 1020, 720);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(36, 44, 136));
		panel_3_1.setBounds(0, 0, 1020, 100);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);

		JLabel lblConfiguracoes = new JLabel("Configurações");
		lblConfiguracoes.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfiguracoes.setForeground(new Color(255, 255, 255));
		lblConfiguracoes.setFont(new Font("Poppins", Font.PLAIN, 35));
		lblConfiguracoes.setBounds(350, 20, 299, 53);
		panel_3_1.add(lblConfiguracoes);

		JLabel bg_header = new JLabel("");
		bg_header.setIcon(new ImageIcon("..\\..\\img\\img_telas\\escolha_simulado\\bg_header.png"));
		bg_header.setBounds(0, 0, 1020, 100);
		panel_3_1.add(bg_header);

		JLabel lblAtualizarDados = new JLabel("Atualizar Dados Cadastrados");
		lblAtualizarDados.setForeground(Color.BLACK);
		lblAtualizarDados.setFont(new Font("Poppins", Font.PLAIN, 24));
		lblAtualizarDados.setBounds(527, 150, 373, 25);
		panel_2.add(lblAtualizarDados);

		JLabel lblPassword = new JLabel("Nova Senha:");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblPassword.setBounds(560, 235, 105, 14);
		panel_2.add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Poppins", Font.PLAIN, 14));
		passwordField.setForeground(Color.BLACK);
		passwordField.setBounds(560, 255, 300, 36);
		panel_2.add(passwordField);

		JLabel lblPassword_2 = new JLabel("Repita a Senha:");
		lblPassword_2.setForeground(Color.BLACK);
		lblPassword_2.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblPassword_2.setBounds(560, 302, 129, 14);
		panel_2.add(lblPassword_2);

		passwordField_2 = new JPasswordField();
		passwordField_2.setFont(new Font("Poppins", Font.PLAIN, 14));
		passwordField_2.setForeground(Color.BLACK);
		passwordField_2.setBounds(560, 321, 300, 36);
		panel_2.add(passwordField_2);
		setBounds(0, 0, 1280, 720);	

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] passChar = passwordField.getPassword();
				char[] passChar2 = passwordField_2.getPassword();
				String senha = new String(passChar);
				String senha2 = new String(passChar2);

				if (senha.isEmpty() || senha2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Digite uma senha válida!");
				}
				else {
					if ((senha.equals(senha2))) {
						ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1","3306","estudamais","root","root"); //Cria uma referência à Classe conexão
						String query = "update user_dados set senha_user =? where id_user =?;"; //SQL de substituição (registro);
						try {
							PreparedStatement pstmt = conn1.conn.prepareStatement(query);
							pstmt.setString(1,senha);
							pstmt.setString(2,id_user);
							pstmt.executeUpdate();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						conn1.closeConnection();

						JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
					}

					else{
						JOptionPane.showMessageDialog(null, "As Senhas não são iguais. Digite novamente");
					}
				}
			}
		});
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Poppins", Font.PLAIN, 13));
		btnSalvar.setFocusPainted(false);
		btnSalvar.setBorderPainted(false);
		btnSalvar.setBackground(new Color(64, 74, 204));
		btnSalvar.setBounds(655, 389, 105, 25);
		panel_2.add(btnSalvar);

		JLabel lblAviso = new JLabel("Para atualizar outros dados, entre em contato com a equipe de Suporte.");
		lblAviso.setForeground(Color.DARK_GRAY);
		lblAviso.setFont(new Font("Poppins", Font.PLAIN, 10));
		lblAviso.setBounds(527, 436, 373, 25);
		panel_2.add(lblAviso);

		JLabel lblDadosAtuais = new JLabel("Dados Atuais");
		lblDadosAtuais.setForeground(Color.BLACK);
		lblDadosAtuais.setFont(new Font("Poppins", Font.PLAIN, 24));
		lblDadosAtuais.setBounds(149, 150, 183, 25);
		panel_2.add(lblDadosAtuais);

		String [] infouser = DB(id_user);

		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setForeground(Color.BLACK);
		lblNome_1.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblNome_1.setBounds(123, 235, 78, 14);
		panel_2.add(lblNome_1);

		JLabel lblNomeAtual = new JLabel(infouser[0]);
		lblNomeAtual.setForeground(Color.DARK_GRAY);
		lblNomeAtual.setFont(new Font("Poppins", Font.PLAIN, 13));
		lblNomeAtual.setBounds(123, 248, 300, 36);
		lblNomeAtual.setBackground(Color.WHITE);
		panel_2.add(lblNomeAtual);

		JLabel lblSobrenome_1 = new JLabel("Sobrenome:");
		lblSobrenome_1.setForeground(Color.BLACK);
		lblSobrenome_1.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblSobrenome_1.setBounds(123, 302, 105, 14);
		panel_2.add(lblSobrenome_1);

		JLabel lblSobrenomeAtual = new JLabel(infouser[1]);
		lblSobrenomeAtual.setForeground(Color.DARK_GRAY);
		lblSobrenomeAtual.setFont(new Font("Poppins", Font.PLAIN, 13));
		lblSobrenomeAtual.setBackground(Color.WHITE);
		lblSobrenomeAtual.setBounds(123, 321, 300, 36);
		panel_2.add(lblSobrenomeAtual);

		JLabel lblEmail_1 = new JLabel("E-mail:");
		lblEmail_1.setForeground(Color.BLACK);
		lblEmail_1.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblEmail_1.setBounds(123, 368, 78, 14);
		panel_2.add(lblEmail_1);

		JLabel lblEmailAtual = new JLabel(infouser[2]);
		lblEmailAtual.setForeground(Color.DARK_GRAY);
		lblEmailAtual.setFont(new Font("Poppins", Font.PLAIN, 13));
		lblEmailAtual.setBackground(Color.WHITE);
		lblEmailAtual.setBounds(123, 389, 300, 36);
		panel_2.add(lblEmailAtual);

		JLabel lblUsuario_1 = new JLabel("Usuário:");
		lblUsuario_1.setForeground(Color.BLACK);
		lblUsuario_1.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblUsuario_1.setBounds(123, 436, 78, 14);
		panel_2.add(lblUsuario_1);

		JLabel lblUsuarioAtual = new JLabel(infouser[3]);
		lblUsuarioAtual.setForeground(Color.DARK_GRAY);
		lblUsuarioAtual.setFont(new Font("Poppins", Font.PLAIN, 13));
		lblUsuarioAtual.setBackground(Color.WHITE);
		lblUsuarioAtual.setBounds(123, 456, 300, 36);
		panel_2.add(lblUsuarioAtual);


	}

	public static String[] DB(String id_user) {
		String[] infouser = new String [4]; //Armazena os dados de login se um usuário em Array.

		try {
			ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1","3306","estudamais","root","root"); //Cria uma referência à Classe conexão

			//Envia comandos para o DB.
			String query = "select nome_user, sobrenome_user, email_user, usuario_user from user_dados where id_user =?;"; //SQL que busca o usuário e senha, utilizando o usuário como ponto de busca;
			ResultSet rs = conn1.executeQuery(query,id_user); //Retornar os resultados da SQL

			/*
			 *Comando para guardar os dados dentro de uma variável;/
			 */
			if(rs.next()) {
				infouser[0] = rs.getString("nome_user"); 
				infouser[1] = rs.getString("sobrenome_user");
				infouser[2] = rs.getString("email_user");
				infouser[3] = rs.getString("usuario_user");}

			rs.close();
			conn1.closeConnection();
		}
		catch (SQLException e){e.printStackTrace();}
		return infouser;
	}	
}
