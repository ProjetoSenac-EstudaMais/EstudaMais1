package telas;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Resultados extends JPanel {
	public long minutos;
	public long segundos;
	public long horas;
	public int acertos;
	public int erros;
	public String usuario;
	public String[] infoUser = new String[2];

	/**
	 * Create the panel.
	 */

	public Resultados() {

		// Conexão com o banco de dados para puxar as informações do usuario
		ConexãoMysql con = new ConexãoMysql("localhost", "3306", "quiz", "root", "root2606!");

		// Comando para o banco de dados puxar as informações
		String query = "select nomeUsuario,tituloUsuario from usuarios where usuario=?";
		ResultSet rs = con.executeQuery(query, usuario);

		// Comando para armazenar as informações no array
		try {
			if (rs.next()) {
				infoUser[0] = rs.getString("nomeUsuario");
				infoUser[1] = rs.getString("tituloUsuario");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setBackground(new Color(64, 74, 204));
		setBounds(0, 0, 1280, 720);
		setLayout(null);
		
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
		badge_id.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\badge\\badge_id1.png"));
		badge_id.setBounds(71, 55, 28, 28);
		Perfil.add(badge_id);
		
		JLabel icon_user = new JLabel("");
		icon_user.setInheritsPopupMenu(false);
		icon_user.setRequestFocusEnabled(false);
		icon_user.setIconTextGap(0);
		icon_user.setBorder(null);
		icon_user.setHorizontalAlignment(SwingConstants.CENTER);
		icon_user.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\icons\\icon_id2.png"));
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
				MeuPerfil mp = new MeuPerfil();
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
		btnConfig.setOpaque(false);
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Config cf = new Config();
				removeAll();
				add(cf);
				revalidate();
				repaint();
			}
		});
		btnConfig.setBackground(new Color(98, 106, 204));
		btnConfig.setMargin(new Insets(2, 22, 2, 14));
		btnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfig.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfig.setForeground(new Color(0, 0, 0));
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
				TelaInicial a = new TelaInicial();
				removeAll();
				add(a);
				revalidate();
				repaint();
			}
		});

		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(33, 44, 136));
		painelTitulo.setBounds(260, 0, 1020, 100);
		add(painelTitulo);
		painelTitulo.setLayout(null);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(420, 5, 200, 104);
		lblResultado.setFont(new Font("Poppins Light", Font.PLAIN, 38));
		painelTitulo.add(lblResultado);

		JLabel lblAcertos = new JLabel("ACERTOS");
		lblAcertos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcertos.setForeground(new Color(64, 204, 90));
		lblAcertos.setFont(new Font("Poppins Medium", Font.PLAIN, 38));
		lblAcertos.setBounds(379, 193, 200, 58);
		add(lblAcertos);

		JLabel qntdAcertos = new JLabel("" + acertos);
		qntdAcertos.setHorizontalAlignment(SwingConstants.CENTER);
		qntdAcertos.setForeground(new Color(64, 204, 90));
		qntdAcertos.setFont(new Font("Poppins Medium", Font.PLAIN, 38));
		qntdAcertos.setBounds(379, 253, 200, 58);
		add(qntdAcertos);

		// Configura o tempo total de prova
		JLabel tempoTotal = new JLabel("" + horas + ":" + minutos + ":" + segundos);
		tempoTotal.setForeground(new Color(255, 255, 255));
		tempoTotal.setFont(new Font("Poppins Light", Font.PLAIN, 24));
		tempoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		tempoTotal.setBounds(722, 206, 134, 28);
		add(tempoTotal);

		JLabel lblErros = new JLabel("ERROS");
		lblErros.setHorizontalAlignment(SwingConstants.CENTER);
		lblErros.setForeground(new Color(255, 0, 0));
		lblErros.setFont(new Font("Poppins Medium", Font.PLAIN, 38));
		lblErros.setBounds(1000, 193, 200, 58);
		add(lblErros);

		JLabel qntdErros = new JLabel("" + erros);
		qntdErros.setHorizontalAlignment(SwingConstants.CENTER);
		qntdErros.setForeground(new Color(255, 0, 0));
		qntdErros.setFont(new Font("Poppins Medium", Font.PLAIN, 38));
		qntdErros.setBounds(1000, 253, 200, 58);
		add(qntdErros);

		// Enviar o usuario para a tela gabarito
		JButton btnGabarito = new JButton("Gabarito");
		btnGabarito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gabarito gab = new Gabarito();
				removeAll();
				add(gab);
				revalidate();
				repaint();
			}
		});
		btnGabarito.setFocusPainted(false);
		btnGabarito.setBorderPainted(false);
		btnGabarito.setBackground(new Color(36, 44, 136));
		btnGabarito.setForeground(new Color(255, 255, 255));
		btnGabarito.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		btnGabarito.setBounds(705, 287, 165, 45);
		add(btnGabarito);

		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(null);
		panel_2_1_1.setBackground(new Color(98, 106, 204));
		panel_2_1_1.setBounds(260, 525, 1020, 10);
		add(panel_2_1_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(260, 535, 1020, 185);
		add(panel_5);
		panel_5.setLayout(null);

		// Enviar o usuario para a tela escolhaa de simulado
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscolhaSimulado escSimu = new EscolhaSimulado();
				removeAll();
				add(escSimu);
				revalidate();
				repaint();
			}
		});
		btnVoltar.setBounds(50, 70, 138, 45);
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		btnVoltar.setFocusPainted(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBackground(new Color(64, 74, 204));
		panel_5.add(btnVoltar);

		// Enviar o usuario para a tela inicial
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial inicio = new TelaInicial();
				removeAll();
				add(inicio);
				revalidate();
				repaint();
			}
		});
		btnFinalizar.setForeground(Color.WHITE);
		btnFinalizar.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		btnFinalizar.setFocusPainted(false);
		btnFinalizar.setBorderPainted(false);
		btnFinalizar.setBackground(new Color(64, 74, 204));
		btnFinalizar.setBounds(810, 70, 138, 45);
		panel_5.add(btnFinalizar);

		JLabel lblDesempenho = new JLabel("Desempenho:");
		lblDesempenho.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesempenho.setForeground(Color.WHITE);
		lblDesempenho.setFont(new Font("Poppins Light", Font.PLAIN, 26));
		lblDesempenho.setBounds(659, 343, 257, 58);
		add(lblDesempenho);

		JLabel outDesempenho = new JLabel("");
		outDesempenho.setHorizontalAlignment(SwingConstants.CENTER);
		outDesempenho.setForeground(Color.WHITE);
		outDesempenho.setFont(new Font("Poppins Light", Font.PLAIN, 26));
		outDesempenho.setBounds(694, 439, 257, 58);
		add(outDesempenho);

		// Altera o status de desempenho conforme a qntia de acertos
		if (acertos > 75) {
			outDesempenho.setText("Bom");
		} else if (acertos > 50) {
			outDesempenho.setText("Médio");
		} else {
			outDesempenho.setText("Ruim");
		}

		JLabel clock = new JLabel("");
		clock.setIcon(new ImageIcon("C:\\Users\\vitor\\Downloads\\clock.png"));
		clock.setBounds(803, 203, 39, 45);
		add(clock);

	}
}
