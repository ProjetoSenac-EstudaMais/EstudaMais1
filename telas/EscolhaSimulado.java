package telas;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class EscolhaSimulado extends JPanel {
	private String email2;
	private Choice escolhaAnoSC;
	private Choice escolhaAnoSP;
	private Choice escolhaTempoDuracao;
	private String id_user;
	public String[] nomeInfo = new String[4];
	JLabel badge_id;
	JLabel icon_user;
	JLabel subtitle_badge;
	JLabel lblNomeUsuario;
	
	ImageIcon icon_1 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\chuu.png");
    ImageIcon icon_2 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id1.png");
    ImageIcon icon_3 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id2.png");	
    ImageIcon icon_4 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id3.png");   
    ImageIcon badge_1 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id1.png");
    ImageIcon badge_2 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id2.png");
    ImageIcon badge_3 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id3.png");		

	
	/**
	 * Create the panel.
	 */
	public EscolhaSimulado(String id_user) {
		
		this.id_user=id_user;
		
		nomeInfo = informacoesUsuario(id_user);
		
		System.out.println(id_user+" "+this.id_user+""+nomeInfo[0]);

		setBounds(0, 0, 1280, 720);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 720);
		panel.setBackground(new Color(128, 128, 128));
		add(panel);
		panel.setLayout(null);

		JPanel panelLateral = new JPanel();
		panelLateral.setBackground(new Color(240, 240, 240));
		panelLateral.setBounds(0, 0, 260, 720);
		panel.add(panelLateral);
		panelLateral.setLayout(null);

		JPanel panelUsuario = new JPanel();
		panelUsuario.setBackground(new Color(34, 44, 134));
		panelUsuario.setBounds(0, 0, 260, 100);
		panelLateral.add(panelUsuario);
		panelUsuario.setLayout(null);

		lblNomeUsuario = new JLabel("" + this.nomeInfo[0] + " " + this.nomeInfo[1]);
		lblNomeUsuario.setForeground(new Color(255, 255, 255));
		lblNomeUsuario.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomeUsuario.setBackground(Color.WHITE);
		lblNomeUsuario.setBounds(100, 20, 115, 20);
		panelUsuario.add(lblNomeUsuario);

		subtitle_badge = new JLabel("" + nomeInfo[1]);
		subtitle_badge.setForeground(new Color(188, 188, 188));
		subtitle_badge.setFont(new Font("Poppins", Font.PLAIN, 12));
		subtitle_badge.setBackground(Color.WHITE);
		subtitle_badge.setBounds(100, 35, 149, 20);
		panelUsuario.add(subtitle_badge);
		

		badge_id = new JLabel("");	
		badge_id.setBounds(64, 61, 28, 28);
		badge_id.setIcon(badge_3);
		panelUsuario.add(badge_id);
		
				icon_user = new JLabel(""+ nomeInfo[2]);
				icon_user.setHorizontalAlignment(SwingConstants.CENTER);
				icon_user.setRequestFocusEnabled(false);
				icon_user.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id2.png"));
				icon_user.setBounds(24, 15, 68, 68);
				panelUsuario.add(icon_user);
		
	

		//ACAO DE VOLTAR PARA A TELA INICIAL NO BOTAO VOLTAR
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBorder(null);
		btnVoltar.setForeground(new Color(0, 0, 0));
		btnVoltar.setFont(new Font("Dialog", Font.PLAIN, 15));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBackground(new Color(36, 44, 136));
		btnVoltar.setBounds(10, 690, 59, 24);
		panelLateral.add(btnVoltar);

		JPanel panelFundo = new JPanel();
		panelFundo.setBackground(new Color(64, 74, 204));
		panelFundo.setBounds(260, 0, 1020, 720);
		panel.add(panelFundo);
		panelFundo.setLayout(null);

		JPanel panelSimulados = new JPanel();
		panelSimulados.setBackground(new Color(36, 44, 136));
		panelSimulados.setBounds(0, 0, 1020, 100);
		panelFundo.add(panelSimulados);
		panelSimulados.setLayout(null);

		JLabel lblSimulados = new JLabel("Simulados");
		lblSimulados.setForeground(new Color(255, 255, 255));
		lblSimulados.setFont(new Font("Poppins", Font.PLAIN, 35));
		lblSimulados.setBounds(415, 23, 215, 53);
		panelSimulados.add(lblSimulados);

		//PAINEL DE FUNDO DO SIMULADO COMPLETO
		JPanel panelSC = new JPanel();
		panelSC.setBackground(new Color(255, 255, 255));
		panelSC.setBounds(94, 153, 383, 522);
		panelFundo.add(panelSC);
		panelSC.setLayout(null);

		//BOTAO DE INICAR O SIMULADO COMPLETO
		JButton btnIniciarSC = new JButton("INICIAR");
		btnIniciarSC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		btnIniciarSC.setBorderPainted(false);
		btnIniciarSC.setBorder(new LineBorder(new Color(64, 74, 204), 1, true));
		btnIniciarSC.setForeground(new Color(255, 255, 255));
		btnIniciarSC.setBackground(new Color(64, 74, 204));
		btnIniciarSC.setFont(new Font("Poppins", Font.PLAIN, 20));
		btnIniciarSC.setBounds(123, 458, 135, 40);
		panelSC.add(btnIniciarSC);

		JLabel lblSimuladoCompleto = new JLabel("Simulado Completo");
		lblSimuladoCompleto.setBackground(new Color(255, 255, 255));
		lblSimuladoCompleto.setForeground(new Color(0, 0, 0));
		lblSimuladoCompleto.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblSimuladoCompleto.setBounds(80, 10, 247, 40);
		panelSC.add(lblSimuladoCompleto);

		//LABEL PARA INSERIR ICONE DO RELOGIO NO SIMULADO COMPLETO
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\escolha_simulado\\clock.png"));
		lblNewLabel.setBounds(74, 185, 50, 50);
		panelSC.add(lblNewLabel);

		//LABEL TEMPO
		JLabel lblTempoSC = new JLabel("Tempo: Padrao");
		lblTempoSC.setForeground(Color.BLACK);
		lblTempoSC.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblTempoSC.setBackground(Color.WHITE);
		lblTempoSC.setBounds(135, 185, 238, 40);
		panelSC.add(lblTempoSC);

		//LABEL PARA INSERIR ICONE DO PAPEL NO SIMULADO COMPLETO
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\escolha_simulado\\paper.png"));
		lblNewLabel_1.setBounds(74, 239, 50, 50);
		panelSC.add(lblNewLabel_1);

		//LABEL QUESTOES NO SIMULADO COMPLETO
		JLabel lblQuestoesSC = new JLabel("8 Questões");
		lblQuestoesSC.setForeground(Color.BLACK);
		lblQuestoesSC.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblQuestoesSC.setBackground(Color.WHITE);
		lblQuestoesSC.setBounds(135, 239, 158, 40);
		panelSC.add(lblQuestoesSC);

		//LABEL PARA INSERIR ICONE DO CALENDARIO NO SIMULADO COMPLETO
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\escolha_simulado\\calendar.png"));
		lblNewLabel_1_1.setBounds(74, 302, 50, 50);
		panelSC.add(lblNewLabel_1_1);

		//LABEL ESCOLHA ANO NO SIMULADO COMPLETO
		JLabel lblEscolhaOAnoSC = new JLabel("Escolha o ano:");
		lblEscolhaOAnoSC.setForeground(Color.BLACK);
		lblEscolhaOAnoSC.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblEscolhaOAnoSC.setBackground(Color.WHITE);
		lblEscolhaOAnoSC.setBounds(135, 302, 192, 40);
		panelSC.add(lblEscolhaOAnoSC);

		//"BOTAO CHOICE" DE ESCOLHA DO ANO NO SIMULADO COMPLETO
		escolhaAnoSC = new Choice();
		escolhaAnoSC.setBackground(Color.LIGHT_GRAY);
		escolhaAnoSC.setForeground(new Color(255, 255, 255));
		escolhaAnoSC.setBounds(145, 347, 150, 18);
		panelSC.add(escolhaAnoSC);
		escolhaAnoSC.add("---");
		escolhaAnoSC.add("2021");
		escolhaAnoSC.add("2022");

		//PAINEL DE FUNDO DO SIMULADO PERSONALIZADO
		JPanel panelSP = new JPanel();
		panelSP.setBackground(new Color(255, 255, 255));
		panelSP.setLayout(null);
		panelSP.setBounds(526, 153, 383, 522);
		panelFundo.add(panelSP);

		//BOTAO DE INICAR O SIMULADO PERSONALIZADO
		JButton btnIniciarSP = new JButton("INICIAR");

		btnIniciarSP.setForeground(Color.WHITE);
		btnIniciarSP.setFont(new Font("Poppins", Font.PLAIN, 20));
		btnIniciarSP.setBorderPainted(false);
		btnIniciarSP.setBorder(new LineBorder(new Color(64, 74, 204), 1, true));
		btnIniciarSP.setBackground(new Color(64, 74, 204));
		btnIniciarSP.setBounds(116, 461, 135, 40);
		panelSP.add(btnIniciarSP);

		//LABEL SIMULADO PERSONALIZADO
		JLabel lblSimuladoPersonalizado = new JLabel("Simulado Personalizado");
		lblSimuladoPersonalizado.setForeground(Color.BLACK);
		lblSimuladoPersonalizado.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblSimuladoPersonalizado.setBackground(Color.WHITE);
		lblSimuladoPersonalizado.setBounds(60, 10, 281, 40);
		panelSP.add(lblSimuladoPersonalizado);

		//LABEL PARA O ICONE DE RELOGIO NO SIMULADO PERSONALIZADO
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\escolha_simulado\\clock.png"));
		lblNewLabel_2.setBounds(60, 168, 50, 50);
		panelSP.add(lblNewLabel_2);

		//LABEL TEMPO NO SIMULADO PERSONALIZADO
		JLabel lblTempoSP = new JLabel("Tempo: ");
		lblTempoSP.setForeground(Color.BLACK);
		lblTempoSP.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblTempoSP.setBackground(Color.WHITE);
		lblTempoSP.setBounds(119, 178, 92, 40);
		panelSP.add(lblTempoSP);

		//"BOTAO CHOICE" DE ESCOLHA DO TEMPO NO SIMULADO PERSONALIZADO
		escolhaTempoDuracao = new Choice();
		escolhaTempoDuracao.setForeground(Color.WHITE);
		escolhaTempoDuracao.setBackground(Color.LIGHT_GRAY);
		escolhaTempoDuracao.setBounds(215, 191, 126, 18);
		panelSP.add(escolhaTempoDuracao);
		escolhaTempoDuracao.add("---");
		escolhaTempoDuracao.add("Curto");
		escolhaTempoDuracao.add("Medio");

		//LABEL PARA O ICONE DE PAPEL NO SIMULADO PERSONALIZADO
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\escolha_simulado\\paper.png"));
		lblNewLabel_1_2.setBounds(60, 229, 50, 50);
		panelSP.add(lblNewLabel_1_2);

		//LABEL NUMERO DE QUESTOES NO SIMULADO PERSONALIZADO
		JLabel lblQuestoesSP = new JLabel("Questões:");
		lblQuestoesSP.setForeground(Color.BLACK);
		lblQuestoesSP.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblQuestoesSP.setBackground(Color.WHITE);
		lblQuestoesSP.setBounds(119, 232, 144, 40);
		panelSP.add(lblQuestoesSP);

		//LABEL PARA O ICONE DE CALENDARIO NO SIMULADO PERSONALIZADO
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\escolha_simulado\\calendar.png"));
		lblNewLabel_1_1_1.setBounds(60, 290, 50, 50);
		panelSP.add(lblNewLabel_1_1_1);

		//LABEL ESCOLHA DE ANO NO SIMULADO PERSONALIZADO
		JLabel lblEscolhaOAnoSP = new JLabel("Escolha o ano:");
		lblEscolhaOAnoSP.setForeground(Color.BLACK);
		lblEscolhaOAnoSP.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblEscolhaOAnoSP.setBackground(Color.WHITE);
		lblEscolhaOAnoSP.setBounds(119, 295, 181, 30);
		panelSP.add(lblEscolhaOAnoSP);

		//"BOTAO CHOICE" DE ESCOLHA DO ANO NO SIMULADO PERSONALIZADO
		escolhaAnoSP = new Choice();
		escolhaAnoSP.setForeground(Color.WHITE);
		escolhaAnoSP.setBackground(Color.LIGHT_GRAY);
		escolhaAnoSP.setBounds(126, 340, 150, 18);
		panelSP.add(escolhaAnoSP);
		escolhaAnoSP.add("---");
		escolhaAnoSP.add("2021");
		escolhaAnoSP.add("2022");
		
		condicaoInfoUsuario();

		btnIniciarSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				simuladoPersonalizado();
			}
		});

		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaInicial();
			}
		});

		//BOTAO INICIAR PARA PEGAR DADOS DO SC
		btnIniciarSC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				simuladoCompleto();

			}
		});			


	}

	// Faz um metódo para puxar a proxima linha de acordo com o id
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
		if(this.nomeInfo[3].equals("1")) {
			icon_user.setIcon(icon_1);
		}else if(this.nomeInfo[3].equals("2")){
			icon_user.setIcon(icon_2);
		}else if(this.nomeInfo[3].equals("3")){
			icon_user.setIcon(icon_3);
		}else if(this.nomeInfo[3].equals("4")){
			icon_user.setIcon(icon_4);
		}
		
		if(this.nomeInfo[2].equals("1")){
			subtitle_badge.setText("Novato");
			badge_id.setIcon(badge_1);
		}else if(this.nomeInfo[2].equals("2")) {
			subtitle_badge.setText("Vagabundo");
			badge_id.setIcon(badge_2);
		}else if(this.nomeInfo[2].equals("3")) {
			subtitle_badge.setText("Sem Alma");
			badge_id.setIcon(badge_3);
		}
	}

	public void simuladoCompleto() {

		String anosc = escolhaAnoSC.getSelectedItem();
		int tiposim = 1;

		Simulado simu = new Simulado(anosc,"",tiposim,"",id_user);

		removeAll();
		add(simu);
		revalidate();
		repaint();
	}

	public void simuladoPersonalizado() {

		int tipoSimu = 2; // TIPO SP
		String anoSP = escolhaAnoSP.getSelectedItem(); // TIPO ANO
		String tempoSimu = escolhaTempoDuracao.getSelectedItem(); // TIPO TEMPO

		Simulado simu = new Simulado("",anoSP,tipoSimu, tempoSimu,id_user);

		removeAll();
		add(simu);
		revalidate();
		repaint();
	}

	public void telaInicial() {
		TelaInicial a = new TelaInicial(id_user);
		removeAll();
		add(a);
		revalidate();
		repaint();
	}
}
