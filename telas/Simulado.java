package telas;

import javax.swing.JPanel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import java.awt.Choice;

public class Simulado extends JPanel {
	private JTextField textField;
	public ButtonGroup bg;
	private int linhaAtual = 1;
	private int anoS;
	private long inicio;
	private long fim;
	private  long tempoTotal;
	private int tempoInicialSegundos = 300 * 60; // Tempo em segundos
	private int acertos=0;
	private int erros=0;
	private long horas;
	private long minutos;
	private long segundos;
	private int questaoRespondida=0;
	private boolean[] foiRespondida = new boolean[9];
	private JLabel tempo;
	private Choice choice;
	private String anoSC;
	private String anoSP;
	private int tipoSimu;
	private String tempoSimu;
	private JTextArea txtA;
	private JTextArea txtB;
	private JTextArea txtC;
	private JTextArea txtD;
	private JTextArea txtE;
	private JTextPane textPane;
	private JLabel lblNumQuestao;
	private JRadioButton rdbA;
	private JRadioButton rdbB;
	private JRadioButton rdbC ;
	private JRadioButton rdbD;
	private JRadioButton rdbE;
	private String areaConhecimento;
	private int simu;
	private String id_simu;
	private String id_user;
	private String dataFormatada;
	private String tempoFormatado;
	JLabel lblareaConhecimento;

	/**
	 * Create the panel.
	 */
	public Simulado(String anoSC, String anoSP, int tipoSimu, String tempoSimu,String id_user) {
		this.anoSC=anoSC;
		this.anoSP=anoSP;
		this.tipoSimu=tipoSimu;
		this.tempoSimu=tempoSimu;
		this.id_user=id_user;
		// Início do período da prova
		inicio = System.currentTimeMillis();



		Date dataAtual = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dataFormatada = dateFormat.format(dataAtual);

		//Condição para o valor do anoS
		condicaoAnoS();
		//Metodo para dar identificar o numero do simulado
		idSimu();

		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1280, 720);
		setLayout(null);

		JPanel painelLateral = new JPanel();
		painelLateral.setBackground(new Color(36, 44, 136));
		painelLateral.setBounds(0, 0, 50, 720);
		add(painelLateral);

		JLabel lblQuestao = new JLabel("Questão");
		lblQuestao.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		lblQuestao.setBounds(70, 80, 103, 49);
		add(lblQuestao);

		lblNumQuestao = new JLabel("01");
		lblNumQuestao.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		lblNumQuestao.setBounds(181, 80, 37, 49);
		add(lblNumQuestao);

		textPane = new JTextPane();
		textPane.setFont(new Font("Poppins", Font.PLAIN, 16));
		textPane.setBorder(null);
		textPane.setEditable(false);
		textPane.setBounds(0, 0, 474, 520);
		add(textPane);

		JScrollPane scrollPane = new JScrollPane(textPane);
		scrollPane.setBorder(null);
		scrollPane.setBounds(67, 140, 474, 532);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(scrollPane);

		JLabel lblSimulado = new JLabel("Simulado");
		lblSimulado.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimulado.setVerticalAlignment(SwingConstants.TOP);
		lblSimulado.setFont(new Font("Poppins Medium", Font.PLAIN, 28));
		lblSimulado.setBounds(559, 30, 154, 37);
		add(lblSimulado);

		textField = new JTextField();
		textField.setOpaque(false);
		textField.setEditable(false);
		textField.setBorder(null);
		textField.setBounds(827, 109, 374, 57);
		add(textField);
		textField.setColumns(10);

		JPanel painelRespostas = new JPanel();
		painelRespostas.setBackground(new Color(64, 74, 204));
		painelRespostas.setBounds(828, 166, 374, 506);
		add(painelRespostas);
		painelRespostas.setLayout(null);


		rdbA = new JRadioButton("A");
		rdbA.setFocusPainted(false);
		rdbA.setOpaque(false);
		rdbA.setForeground(new Color(255, 255, 255));
		rdbA.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbA.setBounds(6, 26, 39, 23);
		painelRespostas.add(rdbA);


		rdbB = new JRadioButton("B");
		rdbB.setOpaque(false);
		rdbB.setForeground(Color.WHITE);
		rdbB.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbB.setFocusPainted(false);
		rdbB.setBounds(6, 120, 39, 23);
		painelRespostas.add(rdbB);

		rdbC = new JRadioButton("C");
		rdbC.setOpaque(false);
		rdbC.setForeground(Color.WHITE);
		rdbC.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbC.setFocusPainted(false);
		rdbC.setBounds(6, 214, 39, 23);
		painelRespostas.add(rdbC);

		rdbD = new JRadioButton("D");
		rdbD.setOpaque(false);
		rdbD.setForeground(Color.WHITE);
		rdbD.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbD.setFocusPainted(false);
		rdbD.setBounds(6, 308, 39, 23);
		painelRespostas.add(rdbD);

		rdbE = new JRadioButton("E");
		rdbE.setOpaque(false);
		rdbE.setForeground(Color.WHITE);
		rdbE.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbE.setFocusPainted(false);
		rdbE.setBounds(6, 402, 39, 23);
		painelRespostas.add(rdbE);

		JLabel imgTempo = new JLabel("");
		imgTempo.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\escolha_simulado\\clock.png"));
		imgTempo.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		imgTempo.setBounds(1184, 11, 44, 49);
		add(imgTempo);

		tempo = new JLabel("");
		tempo.setHorizontalAlignment(SwingConstants.CENTER);
		tempo.setFont(new Font("Poppins Light", Font.PLAIN, 15));
		tempo.setBounds(1168, 59, 70, 22);
		add(tempo);

		JButton btnPrx = new JButton("Próximo");
		btnPrx.setBorderPainted(false);
		btnPrx.setForeground(new Color(255, 255, 255));
		btnPrx.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		btnPrx.setFocusPainted(false);
		btnPrx.setBackground(new Color(64, 74, 204));
		btnPrx.setBounds(1066, 677, 138, 32);
		add(btnPrx);

		txtA = new JTextArea();
		txtA.setForeground(new Color(255, 255, 255));
		txtA.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtA.setEditable(false);
		txtA.setWrapStyleWord(true);
		txtA.setOpaque(false);
		txtA.setLineWrap(true);
		txtA.setBounds(63, 25, 268, 82);
		painelRespostas.add(txtA);

		txtB = new JTextArea();
		txtB.setForeground(new Color(255, 255, 255));
		txtB.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtB.setEditable(false);
		txtB.setWrapStyleWord(true);
		txtB.setOpaque(false);
		txtB.setLineWrap(true);
		txtB.setBounds(63, 119, 268, 82);
		painelRespostas.add(txtB);

		txtC = new JTextArea();
		txtC.setForeground(new Color(255, 255, 255));
		txtC.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtC.setEditable(false);
		txtC.setWrapStyleWord(true);
		txtC.setOpaque(false);
		txtC.setLineWrap(true);
		txtC.setBounds(63, 213, 268, 82);
		painelRespostas.add(txtC);

		txtD = new JTextArea();
		txtD.setForeground(new Color(255, 255, 255));
		txtD.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtD.setEditable(false);
		txtD.setWrapStyleWord(true);
		txtD.setOpaque(false);
		txtD.setLineWrap(true);
		txtD.setBounds(63, 307, 268, 82);
		painelRespostas.add(txtD);

		txtE = new JTextArea();
		txtE.setForeground(new Color(255, 255, 255));
		txtE.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtE.setEditable(false);
		txtE.setWrapStyleWord(true);
		txtE.setOpaque(false);
		txtE.setLineWrap(true);
		txtE.setBounds(63, 401, 268, 82);
		painelRespostas.add(txtE);

		lblareaConhecimento = new JLabel();
		lblareaConhecimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblareaConhecimento.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		lblareaConhecimento.setBounds(429, 59, 411, 49);
		add(lblareaConhecimento);

		choice = new Choice();
		choice.setBounds(893, 59, 103, 20);
		add(choice);

		// Junta os RadioButtons em um grupo para quando apertar um o outro para de ser
		// selecionado
		bg = new ButtonGroup();
		bg.add(rdbA);
		bg.add(rdbB);
		bg.add(rdbC);
		bg.add(rdbD);
		bg.add(rdbE);

		//Metodo para trocar o texto da lblareaConhecimento
		areaConhecimento();

		//Countdown
		temporizador();

		//Quantidade de opões na caixa choice
		qntChoice();



		//Define os primeiros dados puxados para os componentes
		primeiraLinha();

		// Quando apertar o botão finalizar ira aparecer uma mensagem de confirmação
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				finalizar();

			}

		});
		btnFinalizar.setHorizontalAlignment(SwingConstants.LEADING);
		btnFinalizar.setBackground(new Color(64, 74, 204));
		btnFinalizar.setBorderPainted(false);
		btnFinalizar.setContentAreaFilled(false);
		btnFinalizar.setFocusPainted(false);
		btnFinalizar.setForeground(new Color(34, 44, 204));
		btnFinalizar.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		btnFinalizar.setBounds(56, 37, 138, 32);
		add(btnFinalizar);

		//Ao apertar o botão pega a questao selecionada e troca para ela
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnOkay();
				areaConhecimento();

			}
		});
		btnOk.setForeground(Color.WHITE);
		btnOk.setFont(new Font("Poppins Medium", Font.PLAIN, 14));
		btnOk.setFocusPainted(false);
		btnOk.setBorderPainted(false);
		btnOk.setBackground(new Color(64, 74, 204));
		btnOk.setBounds(1002, 59, 57, 20);
		add(btnOk);

		btnPrx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				choice.select(linhaAtual);

				questaoRespondida();
				condicaoEncerrar();
				areaConhecimento();
			}});

	}

	// Faz um metódo para puxar a proxima linha de acordo com o id
	public String[] nextRow(int id, int ano) {
		String[] linha = new String[11];



		// Chama a classe de Conexão com Mysql e estabelece a conexão -- Lembrar de
		// configurar o JDBC no computador para funcionar
		ConexãoMysql con = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root");




		// Da o comando para o banco de dados -- o id recebe um '?' quando você vai
		// definir ele fora do comando
		String query = "SELECT q.questao, q.id_quest, a.alt_A, a.alt_B, a.alt_C, a.alt_D, a.alt_E, q.gabarito, s.id_simu, s.ano_simu, q.num_quest, q.id_area FROM simu_questoes q JOIN simu_alternativas a join simulados s ON q.id_quest = a.id_quest WHERE q.num_quest = ? AND s.ano_simu = ?;";

		// Este comando retorna os valores solicitados, e primeiro vem o comando e
		// depois o valor do '?'
		ResultSet rs = con.executeQuery(query, id,ano);

		// Este comando armazena os valores recebidos em uma variavel
		try {
			if (rs.next()) {

				// Armazenando em uma array posso livremente puxalos posteriormente no código e
				// atualizalos conforme o id avança
				linha[0] = rs.getString("questao");
				linha[1] = rs.getString("alt_A");
				linha[2] = rs.getString("alt_B");
				linha[3] = rs.getString("alt_C");
				linha[4] = rs.getString("alt_D");
				linha[5] = rs.getString("alt_E");
				linha[6] = rs.getString("num_quest");
				linha[7] = rs.getString("gabarito");
				linha[8] = rs.getString("id_simu");
				linha[9] = rs.getString("id_quest");
				linha[10] = rs.getString("id_area");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// sempre fechar a conexão após o uso necessário
		con.closeConnection();
		return linha;
	}

	public void idSimu() {
		String[] idSimu = nextRow(linhaAtual,anoS);


		ConexãoMysql con = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root");



		String query1 = "INSERT INTO simu_resolvido (num_simu, id_user,data_resolv) VALUES (?,?,?);";

		try {
			PreparedStatement pstmt = con.conn.prepareStatement(query1);
			pstmt.setString(1,idSimu[8]);	
			pstmt.setString(2,id_user);
			pstmt.setString(3,dataFormatada);


			pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		String query2 = "SELECT MAX(id_simu) as id_simu from simu_resolvido where id_user = ?";


		ResultSet rs2 = con.executeQuery(query2, id_user);


		try {
			if (rs2.next()) {
				simu = Integer.parseInt(rs2.getString("id_simu"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con.closeConnection();
	}

	public void inserirTempo() {
		ConexãoMysql con = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root");

		String query = "UPDATE simu_resolvido SET tempo_resolv =?,quest_certas=?,quest_erradas=? WHERE id_simu =?;";

		try {
			PreparedStatement pstmt = con.conn.prepareStatement(query);
			pstmt.setString(1,tempoFormatado);
			pstmt.setString(2,Integer.toString(acertos));
			pstmt.setString(3,Integer.toString(erros));
			pstmt.setString(4,Integer.toString(simu));	

			pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void areaConhecimento() {
		String[] idArea = nextRow(linhaAtual, anoS);
		
		System.out.println(idArea[10]);
		
		if(idArea[10].equals("1")) {
			areaConhecimento = "Ciências Humanas e suas Tecnologias";
		} else if(idArea[10].equals("2")) {
			areaConhecimento = "Ciências da Natureza e suas Tecnologias";
		}else if(idArea[10].equals("3")) {
			areaConhecimento = "Linguagens, Códigos e suas Tecnologias";
		}else if(idArea[10].equals("4")) {
			areaConhecimento = "Matemática e suas Tecnologias";
		}
		lblareaConhecimento.setText(areaConhecimento);
	}

	public void finalizar() {

		// Aqui cria um array para botar os textos sim e não no botao do painel de
		// escolha
		Object[] opcoes = { "Sim", "Não" };

		// Cria uma variavel q atribui o valor da escolha feita pelo usuario
		/*
		 * O JOptionPane é configurado da seguinte maneira (posição da mensage 'null' é
		 * no centro do painel, 'Deseja finalizar a prova?' é a mensagem que ira
		 * aparecer no centro do painel, 'Confirmação' é o titulo do painel
		 * YES_NO_OPTION é o tipo de botão inserido no painel 'QUESTION_MESSAGE' Define
		 * o icone no topo do painel 'null' é onde define caso queira usar um icone
		 * personalizado 'opcoes' é onde é definido os textos dos botões 'opcoes[0]'
		 * define o botão que ira iniciar selecionado, no caso o não
		 */
		int opcao = JOptionPane.showOptionDialog(null, "Deseja finalizar a prova?", "Confirmação",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);

		// Caso o Sim for pressionado, troca de tela
		if (opcao == JOptionPane.YES_OPTION) {

			linhaAtual=1;
			Resultados res = new Resultados(acertos, erros, segundos, minutos, horas,simu,id_user,tipoSimu,tempoSimu);
			removeAll();
			add(res);
			revalidate();
			repaint();
		}}

	public void temporizador() {
		// Cria um coutdown de 5 horas que conta cada 1000 milisegundos ou seja 1
		// segundo
		Timer timer = new Timer(1000, e -> {
			// É decretado que o tempo inicial é a variavel declarada tempoInicialSegundos
			// que esta definida para contar 5 horas
			tempoInicialSegundos--;

			// Aqui faz uma condição para caso o tempo não tiver chego a zero ele continua
			// aparecendo
			if (tempoInicialSegundos >= 0) {
				int horas = tempoInicialSegundos / 3600;
				int minutos = (tempoInicialSegundos % 3600) / 60;
				int segundos = tempoInicialSegundos % 60;


				tempo.setText(String.format("%02d:%02d:%02d", horas, minutos, segundos));

				// Chegando a zero aparece uma mensagem de tempo esgotado
			} else {
				((Timer) e.getSource()).stop();
				tempo.setText("Tempo esgotado!");
			}
		});
		// Iniciar o temporizador
		timer.start();
	}

	public void condicaoAnoS() {
		// define o valor da variavel anoS que sera usada para substituir o valor de
		// pesquisa do ano no banco de dados



		if (tipoSimu == 1) {
			anoS = Integer.parseInt(anoSC);

			System.out.println(anoS);
		} else if (tipoSimu == 2) {
			anoS = Integer.parseInt(anoSP);

			System.out.println(anoS);
		}
	}

	public void qntChoice() {
		//Cria 90 numeros de seleção

		//VALOR CERTO I<=90

		if(tipoSimu==1) {
			for(int i=1;i<10;i++) {
				if(i==9) {
					choice.add("-");
				}else {
					choice.add(""+i);}
			}} else if(tipoSimu==2) {
				if(tempoSimu == "Curto") {
					for(int i=1;i<6;i++) {
						if(i==5) {
							choice.add("-");
						}else {
							choice.add(""+i);}
					} 

				}else if(tempoSimu == "Medio") {
					for(int i=1;i<8;i++) {
						if(i==7) {
							choice.add("-");
						}else {
							choice.add(""+i);}
					} 
				}
			}
	}

	public void btnOkay() {
		linhaAtual = Integer.parseInt(choice.getSelectedItem());



		String[] linhaSelecionada = nextRow(linhaAtual,anoS);
		//ID pega pega o valor da caixa de texto selecionada


		//Bota os dados referentes ao valor da idnos componentes
		textPane.setText(linhaSelecionada[0]);
		txtA.setText(linhaSelecionada[1]);
		txtB.setText(linhaSelecionada[2]);
		txtC.setText(linhaSelecionada[3]);
		txtD.setText(linhaSelecionada[4]);
		txtE.setText(linhaSelecionada[5]);
		lblNumQuestao.setText(linhaSelecionada[6]);
	}

	public void questaoRespondida() {
		// condição para quando um dos radio buttons estiverem selecionados
		if (rdbA.isSelected() || rdbB.isSelected() || rdbC.isSelected() || rdbD.isSelected() || rdbE.isSelected()) {

			if (linhaAtual > 0) {
				String[] novaLinha = nextRow(linhaAtual,anoS);
				// Verifica se a opção está correta;

				if ((rdbA.isSelected() && novaLinha[7].equals("A"))
						|| (rdbB.isSelected() && novaLinha[7].equals("B"))
						|| (rdbC.isSelected() && novaLinha[7].equals("C"))
						|| (rdbD.isSelected() && novaLinha[7].equals("D"))
						|| (rdbE.isSelected() && novaLinha[7].equals("E"))) {
					// Soma os pontos certos
					if (!foiRespondida[linhaAtual]) {

						ConexãoMysql con = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root");


						String query = "INSERT INTO estudamais.simu_questoes_resolv (id_simu, id_quest, gabarito_user, id_user, numero_quest) VALUES (?, ?, ?,?,?);";

						try {
							PreparedStatement pstmt = con.conn.prepareStatement(query);
							pstmt.setString(1,Integer.toString(simu));
							pstmt.setString(2,novaLinha[9]);
							pstmt.setString(3,gabarito());
							pstmt.setString(4,id_user);
							pstmt.setString(5,novaLinha[6]);

							pstmt.executeUpdate();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						con.closeConnection();

						// Incrementar acertos ou erros
						acertos++;
						questaoRespondida++;
						// ...
						// Marcar a questão como respondida
						foiRespondida[linhaAtual] = true;

					}
				} else {
					if (!foiRespondida[linhaAtual]) {

						ConexãoMysql con = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root");


						String query = "INSERT INTO estudamais.simu_questoes_resolv (id_simu, id_quest, gabarito_user, id_user, numero_quest) VALUES (?, ?, ?,?,?);";

						try {
							PreparedStatement pstmt = con.conn.prepareStatement(query);
							pstmt.setString(1,Integer.toString(simu));
							pstmt.setString(2,novaLinha[9]);
							pstmt.setString(3,gabarito());
							pstmt.setString(4,id_user);
							pstmt.setString(5,novaLinha[6]);

							pstmt.executeUpdate();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						con.closeConnection();

						// Incrementar acertos ou erros
						erros++;
						questaoRespondida++;
						// ...
						// Marcar a questão como respondida
						foiRespondida[linhaAtual] = true;
					}
				}
				// Atualiza o valor de linha atual, para ir para os próximos textos
				linhaAtual++;

				String[] proxLinha = nextRow(linhaAtual,anoS);

				textPane.setText(proxLinha[0]);
				txtA.setText(proxLinha[1]);
				txtB.setText(proxLinha[2]);
				txtC.setText(proxLinha[3]);
				txtD.setText(proxLinha[4]);
				txtE.setText(proxLinha[5]);
				lblNumQuestao.setText(proxLinha[6]);

				System.out.println(simu);

				// Zera a seleção dos Radio Buttons
				bg.clearSelection();
			}}
	}

	public String gabarito() {

		String gab="";
		if(rdbA.isSelected()) {
			gab = rdbA.getText();
		} else if(rdbB.isSelected()) {
			gab = rdbB.getText();
		}else if(rdbC.isSelected()) {
			gab = rdbC.getText();
		} else if(rdbD.isSelected()) {
			gab = rdbD.getText();
		}else if(rdbE.isSelected()) {
			gab = rdbE.getText();
		}

		return gab;


	}

	public void condicaoEncerrar() {
		if (tipoSimu == 1) {

			System.out.println("Entrou no if");
			// Fecha o Quiz; Depois mudamos esta parte para passar pra tela de resultado

			//VALOR CORRETO LINHA ATUAL > 90
			if (linhaAtual > 8 && questaoRespondida==8 ) {
				JOptionPane.showMessageDialog(null,
						"Prova finalizada");

				questaoRespondida=0;
				linhaAtual=1;
				// Fim do período da prova
				fim = System.currentTimeMillis();
				// Cálculo do tempo em milissegundos
				tempoTotal = fim - inicio;
				// Conversão para minutos e segundos
				horas = tempoTotal / (60 * 60 * 1000);
				minutos = (tempoTotal % (60 * 60 * 1000)) / (60 * 1000);
				segundos = (tempoTotal % (60 * 1000)) / 1000;

				tempoFormatado = String.format("%02d:%02d:%02d", horas, minutos, segundos);

				inserirTempo();

				Resultados res = new Resultados(acertos, erros, segundos, minutos, horas,simu,id_user,tipoSimu,tempoSimu);

				removeAll();
				add(res);
				revalidate();
				repaint();
			}else if(linhaAtual >8 && questaoRespondida<8) {

				linhaAtual=8;

				String[] linhaContinuo = nextRow(linhaAtual,anoS);

				textPane.setText(linhaContinuo[0]);
				txtA.setText(linhaContinuo[1]);
				txtB.setText(linhaContinuo[2]);
				txtC.setText(linhaContinuo[3]);
				txtD.setText(linhaContinuo[4]);
				txtE.setText(linhaContinuo[5]);
				lblNumQuestao.setText(linhaContinuo[6]);

				JOptionPane.showMessageDialog(null, "Responda todas as questões.");
			}

		} else if (tipoSimu == 2) {
			if (tempoSimu == "Curto" ) {

				System.out.println("Entrou no m=if");

				//VALOR CERTO LINHA ATUAL > 30
				if (linhaAtual > 4 && questaoRespondida==4) {
					JOptionPane.showMessageDialog(null,
							"Prova finalizada");

					questaoRespondida=0;
					linhaAtual=1;

					// Fim do período da prova
					fim = System.currentTimeMillis();



					// Cálculo do tempo em milissegundos
					tempoTotal = fim - inicio;

					// Conversão para minutos e segundos
					horas = tempoTotal / (60 * 60 * 1000);
					minutos = (tempoTotal % (60 * 60 * 1000)) / (60 * 1000);
					segundos = (tempoTotal % (60 * 1000)) / 1000;

					tempoFormatado = String.format("%02d:%02d:%02d", horas, minutos, segundos);

					inserirTempo();

					Resultados res = new Resultados(acertos, erros, segundos, minutos, horas, simu,id_user,tipoSimu,tempoSimu);

					removeAll();
					add(res);
					revalidate();
					repaint();
				}else if(linhaAtual >4 && questaoRespondida!=4) {

					linhaAtual=4;

					String[] linhaContinuo = nextRow(linhaAtual,anoS);

					textPane.setText(linhaContinuo[0]);
					txtA.setText(linhaContinuo[1]);
					txtB.setText(linhaContinuo[2]);
					txtC.setText(linhaContinuo[3]);
					txtD.setText(linhaContinuo[4]);
					txtE.setText(linhaContinuo[5]);
					lblNumQuestao.setText(linhaContinuo[6]);

					JOptionPane.showMessageDialog(null, "Responda todas as questões.");
				}
			} else if (tempoSimu == "Medio" ) {

				System.out.println("Entrou no if do médio");

				//VALO0R CERTO LINHA ATUAL > 60
				if (linhaAtual > 6 && questaoRespondida==6) {
					JOptionPane.showMessageDialog(null,
							"Prova finalizada");

					questaoRespondida=0;
					linhaAtual=1;

					// Fim do período da prova
					fim = System.currentTimeMillis();

					// Cálculo do tempo em milissegundos
					tempoTotal = fim - inicio;

					// Conversão para minutos e segundos
					horas = tempoTotal / (60 * 60 * 1000);
					minutos = (tempoTotal % (60 * 60 * 1000)) / (60 * 1000);
					segundos = (tempoTotal % (60 * 1000)) / 1000;

					tempoFormatado = String.format("%02d:%02d:%02d", horas, minutos, segundos);

					inserirTempo();

					Resultados res = new Resultados(acertos, erros, segundos, minutos, horas,simu,id_user,tipoSimu,tempoSimu);

					removeAll();
					add(res);
					revalidate();
					repaint();

				} else if(linhaAtual >6 && questaoRespondida!=6) {

					linhaAtual=6;

					String[] linhaContinuo = nextRow(linhaAtual,anoS);

					textPane.setText(linhaContinuo[0]);
					txtA.setText(linhaContinuo[1]);
					txtB.setText(linhaContinuo[2]);
					txtC.setText(linhaContinuo[3]);
					txtD.setText(linhaContinuo[4]);
					txtE.setText(linhaContinuo[5]);
					lblNumQuestao.setText(linhaContinuo[6]);

					JOptionPane.showMessageDialog(null, "Responda todas as questões.");
				}
			}}	
	}

	public void primeiraLinha() {

		String[] primeiraLinha = nextRow(linhaAtual, anoS);
		textPane.setText(primeiraLinha[0]);
		txtA.setText(primeiraLinha[1]);
		txtB.setText(primeiraLinha[2]);
		txtC.setText(primeiraLinha[3]);
		txtD.setText(primeiraLinha[4]);
		txtE.setText(primeiraLinha[5]);
		lblNumQuestao.setText(primeiraLinha[6]);
	}
}
