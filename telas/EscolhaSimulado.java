package Telas;

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
	
	/**
	 * Create the panel.
	 */
	public EscolhaSimulado() {

		String [] nomeInfo = nextRow(email2);

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

		JLabel lblNomeUsuario = new JLabel("" + nomeInfo[0]);
		lblNomeUsuario.setForeground(new Color(255, 255, 255));
		lblNomeUsuario.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNomeUsuario.setBackground(Color.WHITE);
		lblNomeUsuario.setBounds(100, 20, 115, 20);
		panelUsuario.add(lblNomeUsuario);

		JLabel lblTituloUsuario = new JLabel("" + nomeInfo[1]);
		lblTituloUsuario.setForeground(new Color(188, 188, 188));
		lblTituloUsuario.setFont(new Font("Poppins", Font.PLAIN, 12));
		lblTituloUsuario.setBackground(Color.WHITE);
		lblTituloUsuario.setBounds(100, 35, 149, 20);
		panelUsuario.add(lblTituloUsuario);

		JLabel iconeUsuario = new JLabel("");
		iconeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		iconeUsuario.setRequestFocusEnabled(false);
		iconeUsuario.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\icons\\icon_id2.png"));
		iconeUsuario.setBounds(24, 15, 68, 68);
		panelUsuario.add(iconeUsuario);

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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\clock.png"));
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
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\paper.png"));
		lblNewLabel_1.setBounds(74, 242, 50, 50);
		panelSC.add(lblNewLabel_1);

		//LABEL QUESTOES NO SIMULADO COMPLETO
		JLabel lblQuestoesSC = new JLabel("180 Questoes");
		lblQuestoesSC.setForeground(Color.BLACK);
		lblQuestoesSC.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblQuestoesSC.setBackground(Color.WHITE);
		lblQuestoesSC.setBounds(135, 239, 158, 40);
		panelSC.add(lblQuestoesSC);

		//LABEL PARA INSERIR ICONE DO CALENDARIO NO SIMULADO COMPLETO
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\calendar.png"));
		lblNewLabel_1_1.setBounds(74, 302, 50, 50);
		panelSC.add(lblNewLabel_1_1);

		//LABEL ESCOLHA ANO NO SIMULADO COMPLETO
		JLabel lblEscolhaOAnoSC = new JLabel("Escolha o ano:");
		lblEscolhaOAnoSC.setForeground(Color.BLACK);
		lblEscolhaOAnoSC.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblEscolhaOAnoSC.setBackground(Color.WHITE);
		lblEscolhaOAnoSC.setBounds(135, 302, 158, 40);
		panelSC.add(lblEscolhaOAnoSC);

		//"BOTAO CHOICE" DE ESCOLHA DO ANO NO SIMULADO COMPLETO
		escolhaAnoSC = new Choice();
		escolhaAnoSC.setBackground(Color.LIGHT_GRAY);
		escolhaAnoSC.setForeground(new Color(255, 255, 255));
		escolhaAnoSC.setBounds(145, 347, 150, 18);
		panelSC.add(escolhaAnoSC);
		escolhaAnoSC.add("---");
		escolhaAnoSC.add("2011");
		escolhaAnoSC.add("2012");

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
		lblSimuladoPersonalizado.setBounds(60, 10, 248, 40);
		panelSP.add(lblSimuladoPersonalizado);

		//LABEL PARA O ICONE DE RELOGIO NO SIMULADO PERSONALIZADO
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\clock.png"));
		lblNewLabel_2.setBounds(60, 182, 50, 50);
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
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\paper.png"));
		lblNewLabel_1_2.setBounds(60, 248, 50, 50);
		panelSP.add(lblNewLabel_1_2);

		//LABEL NUMERO DE QUESTOES NO SIMULADO PERSONALIZADO
		JLabel lblQuestoesSP = new JLabel("Questoes:");
		lblQuestoesSP.setForeground(Color.BLACK);
		lblQuestoesSP.setFont(new Font("Poppins", Font.PLAIN, 23));
		lblQuestoesSP.setBackground(Color.WHITE);
		lblQuestoesSP.setBounds(119, 232, 144, 40);
		panelSP.add(lblQuestoesSP);

		//LABEL PARA O ICONE DE CALENDARIO NO SIMULADO PERSONALIZADO
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\calendar.png"));
		lblNewLabel_1_1_1.setBounds(60, 307, 50, 50);
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
		escolhaAnoSP.add("2011");
		escolhaAnoSP.add("2012");

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
	public String[] nextRow(String email) {
		String[] linha = new String[2];

		// Chama a classe de Conexão com Mysql e estabelece a conexão -- Lembrar de
		// configurar o JDBC no computador para funcionar
		ConexãoMysql con = new ConexãoMysql("localhost", "3306", "estudamais", "root", "root2606!");

		// Da o comando para o banco de dados -- o id recebe um '?' quando você vai
		// definir ele fora do comando
		String query = "select nome, titulo from usuario where email=? ";

		// Este comando retorna os valores solicitados, e primeiro vem o comando e
		// depois o valor do '?'
		ResultSet rs = con.executeQuery(query, email );

		// Este comando armazena os valores recebidos em uma variavel
		try {
			if (rs.next()) {

				// Armazenando em uma array posso livremente puxalos posteriormente no código e
				// atualizalos conforme o id avança
				linha[0] = rs.getString("nome");
				linha[1] = rs.getString("titulo");


			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// sempre fechar a conexão após o uso necessário
		con.closeConnection();
		return linha;
	}

	public void simuladoCompleto() {

		String anosc = escolhaAnoSC.getSelectedItem();
		int tiposim = 1;

		Simulado simu = new Simulado(anosc,"",tiposim,"");

		removeAll();
		add(simu);
		revalidate();
		repaint();
	}

	public void simuladoPersonalizado() {

		int tipoSimu = 2; // TIPO SP
		String anoSP = escolhaAnoSP.getSelectedItem(); // TIPO ANO
		String tempoSimu = escolhaTempoDuracao.getSelectedItem(); // TIPO TEMPO

		Simulado simu = new Simulado("",anoSP,tipoSimu, tempoSimu);

		removeAll();
		add(simu);
		revalidate();
		repaint();
	}

	public void telaInicial() {
		TelaInicial a = new TelaInicial();
		removeAll();
		add(a);
		revalidate();
		repaint();
	}
}
