package telas;

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
	public String[] infoUser = new String[4];
	int i;
	String [] respostas = new String[i];
	private int acertos;
	private int erros;
	private JLabel outDesempenho;
	private long segundos;
	private long horas;
	private long minutos;
	private int simu;
	private String id_user;
	JLabel subtitle_badge;
	JLabel nameUsuario;
	JLabel badge_id;
	JLabel icon_user;
	private int tipoSimu;
	private String tempoSimu;
	
	ImageIcon icon_1 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\chuu.png");
    ImageIcon icon_2 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id1.png");
    ImageIcon icon_3 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id2.png");	
    ImageIcon icon_4 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id3.png");   
    ImageIcon badge_1 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id1.png");
    ImageIcon badge_2 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id2.png");
    ImageIcon badge_3 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id3.png");		

	

	public Resultados(int acertos, int erros, long segundos, long minutos, long horas, int simu,String id_user, int tipoSimu,String tempoSimu) {

		this.acertos=acertos;
		this.erros=erros;
		this.segundos=segundos;
		this.minutos=minutos;
		this.horas=horas;
		this.simu=simu;
		this.id_user=id_user;
		this.tipoSimu=tipoSimu;
		this.tempoSimu=tempoSimu;
		
		infoUser = informacoesUsuario(id_user);

		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1280, 720);
		setLayout(null);

		JPanel painelLateral = new JPanel();
		painelLateral.setBackground(new Color(240, 240, 240));
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
		
		badge_id = new JLabel("");	
		badge_id.setBounds(73, 59, 28, 28);
		badge_id.setIcon(badge_3);
		painelIcone.add(badge_id);
		
				icon_user = new JLabel(""+infoUser[2]);
				icon_user.setBounds(22, 21, 68, 68);
				painelIcone.add(icon_user);

		nameUsuario = new JLabel("" + infoUser[0] + " " + infoUser[1]);
		nameUsuario.setFont(new Font("Poppins Medium", Font.PLAIN, 14));
		nameUsuario.setForeground(new Color(255, 255, 255));
		nameUsuario.setBounds(100, 34, 195, 14);
		painelIcone.add(nameUsuario);

		subtitle_badge = new JLabel("" + infoUser[1]);
		subtitle_badge.setForeground(Color.WHITE);
		subtitle_badge.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		subtitle_badge.setBounds(100, 50, 195, 14);
		painelIcone.add(subtitle_badge);
		
		

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(98, 106, 204));
		panel_2.setBounds(319, 0, 961, 10);
		add(panel_2);

		JPanel painelTitulo = new JPanel();
		painelTitulo.setBorder(null);
		painelTitulo.setBackground(new Color(33, 44, 136));
		painelTitulo.setBounds(319, 0, 961, 126);
		add(painelTitulo);
		painelTitulo.setLayout(null);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(377, 5, 200, 104);
		lblResultado.setFont(new Font("Poppins Light", Font.PLAIN, 38));
		painelTitulo.add(lblResultado);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(0, 115, 961, 10);
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
		panel_2_1_1.setBackground(new Color(36, 44, 136));
		panel_2_1_1.setBounds(319, 525, 961, 10);
		add(panel_2_1_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(319, 535, 961, 185);
		add(panel_5);
		panel_5.setLayout(null);

		JLabel lblDesempenho = new JLabel("Desempenho:");
		lblDesempenho.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesempenho.setForeground(Color.DARK_GRAY);
		lblDesempenho.setFont(new Font("Poppins Light", Font.PLAIN, 26));
		lblDesempenho.setBounds(694, 395, 257, 58);
		add(lblDesempenho);

		outDesempenho = new JLabel("");
		outDesempenho.setHorizontalAlignment(SwingConstants.CENTER);
		outDesempenho.setForeground(Color.DARK_GRAY);
		outDesempenho.setFont(new Font("Poppins Light", Font.PLAIN, 26));
		outDesempenho.setBounds(694, 439, 257, 58);
		add(outDesempenho);

		JLabel clock = new JLabel("");
		clock.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\escolha_simulado\\clock.png"));
		clock.setBounds(803, 203, 39, 45);
		add(clock);

		// Configura o tempo total de prova
		JLabel tempoTotal = new JLabel();
		tempoTotal.setBackground(Color.WHITE);
		tempoTotal.setForeground(Color.DARK_GRAY);
		tempoTotal.setFont(new Font("Poppins Light", Font.PLAIN, 24));
		tempoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		tempoTotal.setBounds(757, 258, 134, 28);
		add(tempoTotal);
		
		tempoTotal.setText(String.format("%02d:%02d:%02d", horas, minutos, segundos));

		condicaoInfoUsuario();
		
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
		btnSair.setForeground(new Color(0, 0, 0));
		btnSair.setFont(new Font("Poppins", Font.PLAIN, 16));
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
		configuracoes.setForeground(new Color(0, 0, 0));
		configuracoes.setFont(new Font("Poppins", Font.PLAIN, 16));
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
		meuPerfil.setForeground(new Color(0, 0, 0));
		meuPerfil.setFont(new Font("Poppins", Font.PLAIN, 16));
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
		menuPrincipal.setForeground(new Color(0, 0, 0));
		menuPrincipal.setFont(new Font("Poppins", Font.PLAIN, 16));
		menuPrincipal.setHorizontalAlignment(SwingConstants.LEADING);
		menuPrincipal.setBounds(10, 135, 186, 23);
		painelLateral.add(menuPrincipal);

		condicaoDesempenho();

	}
	
	public String[] informacoesUsuario(String usuario) {
		String[] infoUser = new String[4];

		// Conexão com o banco de dados para puxar as informações do usuario
		ConexãoMysql con = new ConexãoMysql("localhost", "3306", "estudamais", "root", "root");

		// Comando para o banco de dados puxar as informações
		String query = "select nome_user, sobrenome_user, badge_id, id_icon from user_dados where id_user =?;";
		ResultSet rs = con.executeQuery(query, usuario);

		// Comando para armazenar as informações no array
		try {
			if (rs.next()) {
				infoUser[0] = rs.getString("nome_user"); 
				infoUser[1] = rs.getString("sobrenome_user");
				infoUser[2] = rs.getString("badge_id");
			    infoUser[3] = rs.getString("id_icon");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return infoUser;
	}

	public void condicaoInfoUsuario() {
		if(this.infoUser[3].equals("1")) {
			icon_user.setIcon(icon_1);
		}else if(this.infoUser[3].equals("2")){
			icon_user.setIcon(icon_2);
		}else if(this.infoUser[3].equals("3")){
			icon_user.setIcon(icon_3);
		}else if(this.infoUser[3].equals("4")){
			icon_user.setIcon(icon_4);
		}
		
		if(this.infoUser[2].equals("1")){
			subtitle_badge.setText("Novato");
			badge_id.setIcon(badge_1);
		}else if(this.infoUser[2].equals("2")) {
			subtitle_badge.setText("Vagabundo");
			badge_id.setIcon(badge_2);
		}else if(this.infoUser[2].equals("3")) {
			subtitle_badge.setText("Sem Alma");
			badge_id.setIcon(badge_3);
		}
	}
	
	public void condicaoDesempenho() {
		// Altera o status de desempenho conforme a qntia de acertos
		System.out.println(tipoSimu + tempoSimu);
		// VALORES RAIS 75, 50, E ABAIXO
		if(tipoSimu==1) {
		if (acertos > 7) {
			outDesempenho.setText("Bom");
		} else if (acertos > 4) {
			outDesempenho.setText("Médio");
		} else {
			outDesempenho.setText("Ruim");
		}} else if(tipoSimu==2) {
			if(tempoSimu=="Curto") {
				if (acertos > 3) {
					outDesempenho.setText("Bom");
				} else if (acertos > 2) {
					outDesempenho.setText("Médio");
				} else {
					outDesempenho.setText("Ruim");
				}
			} else if(tempoSimu=="Medio") {
				if (acertos > 5) {
					outDesempenho.setText("Bom");
				} else if (acertos > 3) {
					outDesempenho.setText("Médio");
				} else {
					outDesempenho.setText("Ruim");
				}
			}
				
		}
	}

	public void telaInicio() {
		TelaInicial inicio = new TelaInicial(id_user);
		removeAll();
		add(inicio);
		revalidate();
		repaint();
	}

	public void telaEscolhaSimulado() {
		EscolhaSimulado escSimu = new EscolhaSimulado(id_user);
		removeAll();
		add(escSimu);
		revalidate();
		repaint();
	}

	public void telaGabarito() {
		Gabarito gab = new Gabarito(acertos, erros, segundos, minutos, horas, simu,id_user, tempoSimu, tipoSimu );
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
		Config config = new Config(id_user);
		removeAll();
		add(config);
		revalidate();
		repaint();
	}

	public void telaMeuPerfil() {
		MeuPerfil perfil = new MeuPerfil(id_user);
		removeAll();
		add(perfil);
		revalidate();
		repaint();
	}
}
