package Telas;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Resultados extends JPanel {
	public String usuario;
	public String[] infoUser = new String[2];
	int i;
	String [] respostas = new String[i];
	private int acertos;
	private int erros;
	private JLabel outDesempenho;
	private long segundos;
	private long horas;
	private long minutos;
	/**
	 * Create the panel.
	 * 
	 * 
	 */

	

	public Resultados(int acertos, int erros, long segundos, long minutos, long horas) {

		this.acertos=acertos;
		this.erros=erros;
		this.segundos=segundos;
		this.minutos=minutos;
		this.horas=horas;

		infoUser = informacoesUsuario(usuario);

		setBackground(new Color(64, 74, 204));
		setBounds(0, 0, 1280, 720);
		setLayout(null);

		JPanel painelLateral = new JPanel();
		painelLateral.setBackground(new Color(33, 44, 136));
		painelLateral.setBounds(0, 0, 320, 720);
		add(painelLateral);
		painelLateral.setLayout(null);

		JPanel painelIcone = new JPanel();
		painelIcone.setBackground(new Color(64, 74, 204));
		painelIcone.setBounds(0, 0, 320, 126);
		painelLateral.add(painelIcone);
		painelIcone.setLayout(null);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(null);
		panel_3_1.setBackground(new Color(98, 106, 204));
		panel_3_1.setBounds(0, 115, 320, 10);
		painelIcone.add(panel_3_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBackground(new Color(98, 106, 204));
		panel_3.setBounds(0, 0, 320, 10);
		painelIcone.add(panel_3);

		JLabel fotoUsuario = new JLabel(""+infoUser[2]);
		fotoUsuario.setBounds(22, 21, 68, 68);
		painelIcone.add(fotoUsuario);

		JLabel nameUsuario = new JLabel("" + infoUser[0]);
		nameUsuario.setFont(new Font("Poppins Medium", Font.PLAIN, 14));
		nameUsuario.setForeground(new Color(255, 255, 255));
		nameUsuario.setBounds(100, 34, 195, 14);
		painelIcone.add(nameUsuario);

		JLabel tituloUsuario = new JLabel("" + infoUser[1]);
		tituloUsuario.setForeground(Color.WHITE);
		tituloUsuario.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		tituloUsuario.setBounds(100, 50, 195, 14);
		painelIcone.add(tituloUsuario);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(98, 106, 204));
		panel_2.setBounds(319, 0, 961, 10);
		add(panel_2);

		JPanel painelTitulo = new JPanel();
		painelTitulo.setBackground(new Color(33, 44, 136));
		painelTitulo.setBounds(319, 11, 961, 115);
		add(painelTitulo);
		painelTitulo.setLayout(null);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(377, 5, 200, 104);
		lblResultado.setFont(new Font("Poppins Light", Font.PLAIN, 38));
		painelTitulo.add(lblResultado);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(0, 104, 961, 10);
		painelTitulo.add(panel_2_1);
		panel_2_1.setBorder(null);
		panel_2_1.setBackground(new Color(98, 106, 204));

		JLabel lblAcertos = new JLabel("ACERTOS");
		lblAcertos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcertos.setForeground(new Color(64, 204, 90));
		lblAcertos.setFont(new Font("Poppins Medium", Font.PLAIN, 38));
		lblAcertos.setBounds(460, 193, 200, 58);
		add(lblAcertos);

		JLabel qntdAcertos = new JLabel("" + acertos);
		qntdAcertos.setHorizontalAlignment(SwingConstants.CENTER);
		qntdAcertos.setForeground(new Color(64, 204, 90));
		qntdAcertos.setFont(new Font("Poppins Medium", Font.PLAIN, 38));
		qntdAcertos.setBounds(460, 253, 200, 58);
		add(qntdAcertos);

		JLabel lblErros = new JLabel("ERROS");
		lblErros.setHorizontalAlignment(SwingConstants.CENTER);
		lblErros.setForeground(new Color(255, 0, 0));
		lblErros.setFont(new Font("Poppins Medium", Font.PLAIN, 38));
		lblErros.setBounds(948, 193, 200, 58);
		add(lblErros);

		JLabel qntdErros = new JLabel("" + erros);
		qntdErros.setHorizontalAlignment(SwingConstants.CENTER);
		qntdErros.setForeground(new Color(255, 0, 0));
		qntdErros.setFont(new Font("Poppins Medium", Font.PLAIN, 38));
		qntdErros.setBounds(948, 253, 200, 58);
		add(qntdErros);

		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(null);
		panel_2_1_1.setBackground(new Color(98, 106, 204));
		panel_2_1_1.setBounds(319, 525, 961, 10);
		add(panel_2_1_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(319, 535, 961, 185);
		add(panel_5);
		panel_5.setLayout(null);

		JLabel lblDesempenho = new JLabel("Desempenho:");
		lblDesempenho.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesempenho.setForeground(Color.WHITE);
		lblDesempenho.setFont(new Font("Poppins Light", Font.PLAIN, 26));
		lblDesempenho.setBounds(694, 395, 257, 58);
		add(lblDesempenho);

		outDesempenho = new JLabel("");
		outDesempenho.setHorizontalAlignment(SwingConstants.CENTER);
		outDesempenho.setForeground(Color.WHITE);
		outDesempenho.setFont(new Font("Poppins Light", Font.PLAIN, 26));
		outDesempenho.setBounds(694, 439, 257, 58);
		add(outDesempenho);

		JLabel clock = new JLabel("");
		clock.setIcon(new ImageIcon("C:\\Users\\vitor\\Downloads\\clock.png"));
		clock.setBounds(803, 203, 39, 45);
		add(clock);

		// Configura o tempo total de prova
		JLabel tempoTotal = new JLabel("" + horas + ":" + minutos + ":" + segundos);
		tempoTotal.setForeground(new Color(255, 255, 255));
		tempoTotal.setFont(new Font("Poppins Light", Font.PLAIN, 24));
		tempoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		tempoTotal.setBounds(757, 258, 134, 28);
		add(tempoTotal);

		// Enviar o usuario para a tela inicial
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaInicio();
			}
		});
		btnFinalizar.setForeground(Color.WHITE);
		btnFinalizar.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		btnFinalizar.setFocusPainted(false);
		btnFinalizar.setBorderPainted(false);
		btnFinalizar.setBackground(new Color(64, 74, 204));
		btnFinalizar.setBounds(708, 70, 138, 45);
		panel_5.add(btnFinalizar);

		// Enviar o usuario para a tela escolhaa de simulado
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaEscolhaSimulado();
			}
		});
		btnVoltar.setBounds(124, 70, 138, 45);
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		btnVoltar.setFocusPainted(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBackground(new Color(64, 74, 204));
		panel_5.add(btnVoltar);

		// Enviar o usuario para a tela gabarito
		JButton btnGabarito = new JButton("Gabarito");
		btnGabarito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaGabarito();
			}
		});
		btnGabarito.setFocusPainted(false);
		btnGabarito.setBorderPainted(false);
		btnGabarito.setBackground(new Color(36, 44, 136));
		btnGabarito.setForeground(new Color(255, 255, 255));
		btnGabarito.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		btnGabarito.setBounds(740, 339, 165, 45);
		add(btnGabarito);

		// Enviar o usuario para a tela de login
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaLogin();
			}
		});
		btnSair.setHorizontalAlignment(SwingConstants.LEADING);
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Poppins Medium", Font.PLAIN, 13));
		btnSair.setFocusPainted(false);
		btnSair.setContentAreaFilled(false);
		btnSair.setBorderPainted(false);
		btnSair.setBounds(10, 686, 70, 23);
		painelLateral.add(btnSair);

		// Enviar o usuario para a tela configurações
		JButton configuracoes = new JButton("Configurações");
		configuracoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaConfiguracao();
			}
		});
		configuracoes.setFocusPainted(false);
		configuracoes.setBorderPainted(false);
		configuracoes.setContentAreaFilled(false);
		configuracoes.setForeground(new Color(255, 255, 255));
		configuracoes.setFont(new Font("Poppins Medium", Font.PLAIN, 13));
		configuracoes.setHorizontalAlignment(SwingConstants.LEADING);
		configuracoes.setBounds(10, 185, 186, 23);
		painelLateral.add(configuracoes);

		// Enviar o usuario para a tela de meu perfil
		JButton meuPerfil = new JButton("Meu Perfil");
		meuPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaMeuPerfil();
			}
		});
		meuPerfil.setFocusPainted(false);
		meuPerfil.setBorderPainted(false);
		meuPerfil.setContentAreaFilled(false);
		meuPerfil.setForeground(new Color(255, 255, 255));
		meuPerfil.setFont(new Font("Poppins Medium", Font.PLAIN, 13));
		meuPerfil.setHorizontalAlignment(SwingConstants.LEADING);
		meuPerfil.setBounds(10, 160, 186, 23);
		painelLateral.add(meuPerfil);

		// Enviar o usuario para a tela inicial
		JButton menuPrincipal = new JButton("Menu Principal");
		menuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaInicio();
			}
		});
		menuPrincipal.setFocusPainted(false);
		menuPrincipal.setBorderPainted(false);
		menuPrincipal.setContentAreaFilled(false);
		menuPrincipal.setForeground(new Color(255, 255, 255));
		menuPrincipal.setFont(new Font("Poppins Medium", Font.PLAIN, 13));
		menuPrincipal.setHorizontalAlignment(SwingConstants.LEADING);
		menuPrincipal.setBounds(10, 135, 186, 23);
		painelLateral.add(menuPrincipal);

		condicaoDesempenho();

	}
	
	public String[] informacoesUsuario(String usuario) {
		String[] infoUser = new String[3];

		// Conexão com o banco de dados para puxar as informações do usuario
		ConexãoMysql con = new ConexãoMysql("localhost", "3306", "estudamais", "root", "root2606!");

		// Comando para o banco de dados puxar as informações
		String query = "SELECT p.titulo_perfil, p.foto_perfil, d.usuario_user FROM dados_user d JOIN perfil_user p ON d.id_user = p.id_dados WHERE d.usuario_user = ?;";
		ResultSet rs = con.executeQuery(query, usuario);

		// Comando para armazenar as informações no array
		try {
			if (rs.next()) {
				infoUser[0] = rs.getString("usuarip_user");
				infoUser[1] = rs.getString("titulo_perfil");
				infoUser[2] = rs.getString("foto_perfil");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infoUser;
	}

	public void condicaoDesempenho() {
		// Altera o status de desempenho conforme a qntia de acertos

		// VALORES RAIS 75, 50, E ABAIXO
		if (acertos > 3) {
			outDesempenho.setText("Bom");
		} else if (acertos > 2) {
			outDesempenho.setText("Médio");
		} else {
			outDesempenho.setText("Ruim");
		}
	}

	public void telaInicio() {
		TelaInicial inicio = new TelaInicial();
		removeAll();
		add(inicio);
		revalidate();
		repaint();
	}

	public void telaEscolhaSimulado() {
		EscolhaSimulado escSimu = new EscolhaSimulado();
		removeAll();
		add(escSimu);
		revalidate();
		repaint();
	}

	public void telaGabarito() {
		Gabarito gab = new Gabarito(acertos, erros, segundos, minutos, horas );
		removeAll();
		add(gab);
		revalidate();
		repaint();
	}

	public void telaLogin() {
		Login login = new Login();
		removeAll();
		add(login);
		revalidate();
		repaint();
	}

	public void telaConfiguracao() {
		Config config = new Config();
		removeAll();
		add(config);
		revalidate();
		repaint();
	}

	public void telaMeuPerfil() {
		MeuPerfil perfil = new MeuPerfil();
		removeAll();
		add(perfil);
		revalidate();
		repaint();
	}
}
