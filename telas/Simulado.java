package Telas;

import javax.swing.JPanel;
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

public class Simulado extends JPanel {
	private JTextField textField;
	public ButtonGroup bg;
	private static int linhaAtual = 1;
	public int acertos = 0;
	public int erros = 0;
	public String anoSP;
	public String anoSC;
	public String tempoSimu;
	private static int anoS;
	public int tipoSimu;
	public int tempoInicialSegundos = 300 * 60; // Tempo em segundos

	// Faz um metódo para puxar a proxima linha de acordo com o id
	public String[] nextRow(int id, int ano) {
		String[] linha = new String[7];

		// Chama a classe de Conexão com Mysql e estabelece a conexão -- Lembrar de
		// configurar o JDBC no computador para funcionar
		ConexãoMysql con = new ConexãoMysql("localhost", "3306", "quiz", "root", "root2606!");

		// Da o comando para o banco de dados -- o id recebe um '?' quando você vai
		// definir ele fora do comando
		String query = "select id,question,answerA,answerB,answerC,answerD,rightanswer from questions where id=? and ano=?";

		// Este comando retorna os valores solicitados, e primeiro vem o comando e
		// depois o valor do '?'
		ResultSet rs = con.executeQuery(query, id, ano);

		// Este comando armazena os valores recebidos em uma variavel
		try {
			if (rs.next()) {

				// Armazenando em uma array posso livremente puxalos posteriormente no código e
				// atualizalos conforme o id avança
				linha[0] = rs.getString("question");
				linha[1] = rs.getString("answerA");
				linha[2] = rs.getString("answerB");
				linha[3] = rs.getString("answerC");
				linha[4] = rs.getString("answerD");
				linha[5] = rs.getString("rightanswer");
				linha[6] = rs.getString("id");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// sempre fechar a conexão após o uso necessário
		con.closeConnection();
		return linha;
	}

	/**
	 * Create the panel.
	 */
	public Simulado() {

		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1280, 720);
		setLayout(null);

		JPanel painelLateral = new JPanel();
		painelLateral.setBackground(new Color(36, 44, 136));
		painelLateral.setBounds(0, 0, 50, 720);
		add(painelLateral);

		// Quando apertar o botão finalizar ira aparecer uma mensagem de confirmação
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
					Gabarito test = new Gabarito();
					removeAll();
					add(test);
					revalidate();
					repaint();

				}
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

		JLabel lblQuestao = new JLabel("Questão");
		lblQuestao.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		lblQuestao.setBounds(70, 80, 103, 49);
		add(lblQuestao);

		JLabel lblNumQuestao = new JLabel("01");
		lblNumQuestao.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		lblNumQuestao.setBounds(181, 80, 70, 49);
		add(lblNumQuestao);

		JTextPane textPane = new JTextPane();
		textPane.setBorder(null);
		textPane.setEditable(false);
		textPane.setBounds(70, 129, 585, 538);
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

		JRadioButton rdbA = new JRadioButton("A)");
		rdbA.setFocusPainted(false);
		rdbA.setOpaque(false);
		rdbA.setForeground(new Color(255, 255, 255));
		rdbA.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbA.setBounds(6, 26, 39, 23);
		painelRespostas.add(rdbA);

		JRadioButton rdbB = new JRadioButton("B)");
		rdbB.setOpaque(false);
		rdbB.setForeground(Color.WHITE);
		rdbB.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbB.setFocusPainted(false);
		rdbB.setBounds(6, 120, 39, 23);
		painelRespostas.add(rdbB);

		JRadioButton rdbC = new JRadioButton("C)");
		rdbC.setOpaque(false);
		rdbC.setForeground(Color.WHITE);
		rdbC.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbC.setFocusPainted(false);
		rdbC.setBounds(6, 214, 39, 23);
		painelRespostas.add(rdbC);

		JRadioButton rdbD = new JRadioButton("D)");
		rdbD.setOpaque(false);
		rdbD.setForeground(Color.WHITE);
		rdbD.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbD.setFocusPainted(false);
		rdbD.setBounds(6, 308, 39, 23);
		painelRespostas.add(rdbD);

		JRadioButton rdbE = new JRadioButton("E)");
		rdbE.setOpaque(false);
		rdbE.setForeground(Color.WHITE);
		rdbE.setFont(new Font("Poppins Light", Font.PLAIN, 12));
		rdbE.setFocusPainted(false);
		rdbE.setBounds(6, 402, 39, 23);
		painelRespostas.add(rdbE);

		JLabel imgTempo = new JLabel("");
		imgTempo.setIcon(new ImageIcon("C:\\Users\\vitor\\Downloads\\clock.png"));
		imgTempo.setFont(new Font("Poppins Medium", Font.PLAIN, 24));
		imgTempo.setBounds(1184, 11, 44, 49);
		add(imgTempo);

		JLabel tempo = new JLabel("");
		tempo.setHorizontalAlignment(SwingConstants.CENTER);
		tempo.setFont(new Font("Poppins Light", Font.PLAIN, 15));
		tempo.setBounds(1168, 59, 70, 22);
		add(tempo);

		// Junta os RadioButtons em um grupo para quando apertar um o outro para de ser
		// selecionado
		bg = new ButtonGroup();
		bg.add(rdbA);
		bg.add(rdbB);
		bg.add(rdbC);
		bg.add(rdbD);

		JButton btnPrx = new JButton("Próximo");
		btnPrx.setBorderPainted(false);
		btnPrx.setForeground(new Color(255, 255, 255));
		btnPrx.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		btnPrx.setFocusPainted(false);
		btnPrx.setBackground(new Color(64, 74, 204));
		btnPrx.setBounds(1066, 677, 138, 32);
		add(btnPrx);

		JTextArea txtA = new JTextArea();
		txtA.setEditable(false);
		txtA.setWrapStyleWord(true);
		txtA.setOpaque(false);
		txtA.setLineWrap(true);
		txtA.setBounds(63, 25, 268, 82);
		painelRespostas.add(txtA);

		JTextArea txtB = new JTextArea();
		txtB.setEditable(false);
		txtB.setWrapStyleWord(true);
		txtB.setOpaque(false);
		txtB.setLineWrap(true);
		txtB.setBounds(63, 119, 268, 82);
		painelRespostas.add(txtB);

		JTextArea txtC = new JTextArea();
		txtC.setEditable(false);
		txtC.setWrapStyleWord(true);
		txtC.setOpaque(false);
		txtC.setLineWrap(true);
		txtC.setBounds(63, 213, 268, 82);
		painelRespostas.add(txtC);

		JTextArea txtD = new JTextArea();
		txtD.setEditable(false);
		txtD.setWrapStyleWord(true);
		txtD.setOpaque(false);
		txtD.setLineWrap(true);
		txtD.setBounds(63, 307, 268, 82);
		painelRespostas.add(txtD);

		JTextArea txtE = new JTextArea();
		txtE.setEditable(false);
		txtE.setWrapStyleWord(true);
		txtE.setOpaque(false);
		txtE.setLineWrap(true);
		txtE.setBounds(63, 401, 268, 82);
		painelRespostas.add(txtE);

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
				tempo.setText(horas + ": " + minutos + ": " + segundos);

				// Chegando a zero aparece uma mensagem de tempo esgotado
			} else {
				((Timer) e.getSource()).stop();
				tempo.setText("Tempo esgotado!");
			}
		});

		// Iniciar o temporizador
		timer.start();

		// define o valor da variavel anoS que sera usada para substituir o valor de
		// pesquisa do ano no banco de dados
		if (tipoSimu == 1) {
			anoS = Integer.parseInt(anoSC);
		} else if (tipoSimu == 2) {
			anoS = Integer.parseInt(anoSP);
		}

		// Aqui eu defino o primeiro texto das caixas de texto e defino o id com o valor
		// da variavel linha atual
		String[] primeiraLinha = nextRow(linhaAtual, anoS);
		textPane.setText(primeiraLinha[0]);
		txtA.setText(primeiraLinha[1]);
		txtB.setText(primeiraLinha[2]);
		txtC.setText(primeiraLinha[3]);
		txtD.setText(primeiraLinha[4]);
		lblNumQuestao.setText(primeiraLinha[6]);

		btnPrx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// condição para quando um dos radio buttons estiverem selecionados
				if (rdbA.isSelected() || rdbB.isSelected() || rdbC.isSelected() || rdbD.isSelected()) {

					if (linhaAtual > 0) {
						String[] novaLinha = nextRow(linhaAtual, anoS);

						// Verifica se a opção está correta;

						if ((rdbA.isSelected() && novaLinha[5].equals("a"))
								|| (rdbB.isSelected() && novaLinha[5].equals("b"))
								|| (rdbC.isSelected() && novaLinha[5].equals("c"))
								|| (rdbD.isSelected() && novaLinha[5].equals("d"))) {
							// Soma os pontos certos
							acertos++;
							JOptionPane.showMessageDialog(null, "Você acertou!");
						} else {
							JOptionPane.showMessageDialog(null, "Você errou!");
							// Soma os pontos errados
							erros++;
						}
						// Atualiza o valor de linha atual, para ir para os próximos textos
						linhaAtual++;

						// Guarda os novos dados num array e bota nos componentes;

						String[] proxLinha = nextRow(linhaAtual, anoS);

						textPane.setText(proxLinha[0]);
						txtA.setText(proxLinha[1]);
						txtB.setText(proxLinha[2]);
						txtC.setText(proxLinha[3]);
						txtD.setText(proxLinha[4]);
						lblNumQuestao.setText(proxLinha[6]);

						// Zera a seleção dos Radio Buttons
						bg.clearSelection();

					}

					if (tipoSimu == 1) {

						// Fecha o Quiz; Depois mudamos esta parte para passar pra tela de resultado
						if (linhaAtual > 90) {
							JOptionPane.showMessageDialog(null,
									"Fim do Quiz! Você acertou" + acertos + "pontos! E errou " + erros);
							System.exit(0);
						}

					} else if (tipoSimu == 2) {
						if (tempoSimu == "Curto") {
							if (linhaAtual > 30) {
								JOptionPane.showMessageDialog(null,
										"Fim do Quiz! Você acertou" + acertos + "pontos! E errou " + erros);
								System.exit(0);
							}
						} else if (tempoSimu == "Médio") {
							if (linhaAtual > 60) {
								JOptionPane.showMessageDialog(null,
										"Fim do Quiz! Você acertou" + acertos + "pontos! E errou " + erros);
								System.exit(0);
							}
						}

					}

				}
			}
		});

	}
}
