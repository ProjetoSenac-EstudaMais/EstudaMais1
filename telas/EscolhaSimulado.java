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
	
	// Faz um metódo para puxar a proxima linha de acordo com o id
		public String[] nextRow(String email) {
			String[] linha = new String[2];

			// Chama a classe de Conexão com Mysql e estabelece a conexão -- Lembrar de
			// configurar o JDBC no computador para funcionar
			ConexãoMysql con = new ConexãoMysql("localhost", "3306", "estudamais", "root", "root");

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
	
	/**
	 * Create the panel.
	 */
	public EscolhaSimulado() {
		
		Simulado simu = new Simulado();
		
		String [] nomeInfo = nextRow(email2);
		
			setLayout(null);
			setBounds(100,100,1280,720);

			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1280, 720);
			panel.setBackground(new Color(128, 128, 128));
			add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(240, 240, 240));
			panel_1.setBounds(0, 0, 260, 720);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(new Color(34, 44, 134));
			panel_3.setBounds(0, 0, 260, 100);
			panel_1.add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNomeUsuario = new JLabel("" + nomeInfo[0]);
			lblNomeUsuario.setForeground(new Color(255, 255, 255));
			lblNomeUsuario.setFont(new Font("Dialog", Font.PLAIN, 12));
			lblNomeUsuario.setBackground(Color.WHITE);
			lblNomeUsuario.setBounds(100, 20, 115, 20);
			panel_3.add(lblNomeUsuario);
			
			JLabel lblTituloUsuario = new JLabel("" + nomeInfo[1]);
			lblTituloUsuario.setForeground(new Color(188, 188, 188));
			lblTituloUsuario.setFont(new Font("Poppins", Font.PLAIN, 12));
			lblTituloUsuario.setBackground(Color.WHITE);
			lblTituloUsuario.setBounds(100, 35, 149, 20);
			panel_3.add(lblTituloUsuario);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setRequestFocusEnabled(false);
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\icons\\icon_id2.png"));
			lblNewLabel_3.setBounds(24, 15, 68, 68);
			panel_3.add(lblNewLabel_3);
			
			//ACAO DE VOLTAR PARA A TELA INICIAL NO BOTAO VOLTAR
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TelaInicial a = new TelaInicial();
					removeAll();
					add(a);
					revalidate();
					repaint();
				}
			});
			btnVoltar.setBorder(null);
			btnVoltar.setForeground(new Color(0, 0, 0));
			btnVoltar.setFont(new Font("Dialog", Font.PLAIN, 15));
			btnVoltar.setContentAreaFilled(false);
			btnVoltar.setBackground(new Color(36, 44, 136));
			btnVoltar.setBounds(10, 690, 59, 24);
			panel_1.add(btnVoltar);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(64, 74, 204));
			panel_2.setBounds(260, 0, 1020, 720);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			JPanel panel_3_1 = new JPanel();
			panel_3_1.setBackground(new Color(36, 44, 136));
			panel_3_1.setBounds(0, 0, 1020, 100);
			panel_2.add(panel_3_1);
			panel_3_1.setLayout(null);
			
			JLabel lblSimulados = new JLabel("Simulados");
			lblSimulados.setForeground(new Color(255, 255, 255));
			lblSimulados.setFont(new Font("Poppins", Font.PLAIN, 35));
			lblSimulados.setBounds(415, 23, 169, 53);
			panel_3_1.add(lblSimulados);
			
			//PAINEL DE FUNDO DO SIMULADO COMPLETO
			JPanel panel_5 = new JPanel();
			panel_5.setBackground(new Color(255, 255, 255));
			panel_5.setBounds(94, 153, 383, 522);
			panel_2.add(panel_5);
			panel_5.setLayout(null);
			
			
			
			//BOTAO DE INICAR O SIMULADO COMPLETO
			JButton btnIniciarSC = new JButton("INICIAR");
			btnIniciarSC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
			btnIniciarSC.setBorderPainted(false);
			btnIniciarSC.setBorder(new LineBorder(new Color(64, 74, 204), 1, true));
			btnIniciarSC.setForeground(new Color(255, 255, 255));
			btnIniciarSC.setBackground(new Color(64, 74, 204));
			btnIniciarSC.setFont(new Font("Poppins", Font.PLAIN, 20));
			btnIniciarSC.setBounds(123, 458, 135, 40);
			panel_5.add(btnIniciarSC);
			
			
			
			JLabel lblSimuladoCompleto = new JLabel("Simulado Completo");
			lblSimuladoCompleto.setBackground(new Color(255, 255, 255));
			lblSimuladoCompleto.setForeground(new Color(0, 0, 0));
			lblSimuladoCompleto.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblSimuladoCompleto.setBounds(80, 10, 205, 40);
			panel_5.add(lblSimuladoCompleto);
			
			//LABEL PARA INSERIR ICONE DO RELOGIO NO SIMULADO COMPLETO
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\clock.png"));
			lblNewLabel.setBounds(74, 185, 50, 50);
			panel_5.add(lblNewLabel);
			
			//LABEL TEMPO
			JLabel lblTempoPadr = new JLabel("Tempo: Padrao");
			lblTempoPadr.setForeground(Color.BLACK);
			lblTempoPadr.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblTempoPadr.setBackground(Color.WHITE);
			lblTempoPadr.setBounds(135, 185, 175, 40);
			panel_5.add(lblTempoPadr);
			
			//LABEL PARA INSERIR ICONE DO PAPEL NO SIMULADO COMPLETO
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\paper.png"));
			lblNewLabel_1.setBounds(74, 242, 50, 50);
			panel_5.add(lblNewLabel_1);
			
			//LABEL QUESTOES NO SIMULADO COMPLETO
			JLabel lblQuestoes = new JLabel("180 Questoes");
			lblQuestoes.setForeground(Color.BLACK);
			lblQuestoes.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblQuestoes.setBackground(Color.WHITE);
			lblQuestoes.setBounds(135, 239, 158, 40);
			panel_5.add(lblQuestoes);
			
			//LABEL PARA INSERIR ICONE DO CALENDARIO NO SIMULADO COMPLETO
			JLabel lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\calendar.png"));
			lblNewLabel_1_1.setBounds(74, 302, 50, 50);
			panel_5.add(lblNewLabel_1_1);
			
			//LABEL ESCOLHA ANO NO SIMULADO COMPLETO
			JLabel lblEscolhaOAno = new JLabel("Escolha o ano:");
			lblEscolhaOAno.setForeground(Color.BLACK);
			lblEscolhaOAno.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblEscolhaOAno.setBackground(Color.WHITE);
			lblEscolhaOAno.setBounds(135, 302, 158, 40);
			panel_5.add(lblEscolhaOAno);
			
			//"BOTAO CHOICE" DE ESCOLHA DO ANO NO SIMULADO COMPLETO
			Choice choice = new Choice();
			choice.setBackground(Color.LIGHT_GRAY);
			choice.setForeground(new Color(255, 255, 255));
			choice.setBounds(145, 347, 150, 18);
			panel_5.add(choice);
			choice.add("---");
			choice.add("2021");
			choice.add("2022");
			choice.add("2023");
			
			//BOTAO INICIAR PARA PEGAR DADOS DO SC
			btnIniciarSC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					simu.tipoSimu = 1; //TIPO SC
					simu.anoSC = choice.getSelectedItem(); //TIPO ANO
					removeAll();
					add(simu);
					revalidate();
					repaint();
				}
			});			
		
				
			//PAINEL DE FUNDO DO SIMULADO PERSONALIZADO
			JPanel panel_5_1 = new JPanel();
			panel_5_1.setBackground(new Color(255, 255, 255));
			panel_5_1.setLayout(null);
			panel_5_1.setBounds(526, 153, 383, 522);
			panel_2.add(panel_5_1);
			
			//BOTAO DE INICAR O SIMULADO PERSONALIZADO
			JButton btnIniciarSP = new JButton("INICIAR");
			
			btnIniciarSP.setForeground(Color.WHITE);
			btnIniciarSP.setFont(new Font("Poppins", Font.PLAIN, 20));
			btnIniciarSP.setBorderPainted(false);
			btnIniciarSP.setBorder(new LineBorder(new Color(64, 74, 204), 1, true));
			btnIniciarSP.setBackground(new Color(64, 74, 204));
			btnIniciarSP.setBounds(116, 461, 135, 40);
			panel_5_1.add(btnIniciarSP);
			
			//LABEL SIMULADO PERSONALIZADO
			JLabel lblSimuladoPersonalizado = new JLabel("Simulado Personalizado");
			lblSimuladoPersonalizado.setForeground(Color.BLACK);
			lblSimuladoPersonalizado.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblSimuladoPersonalizado.setBackground(Color.WHITE);
			lblSimuladoPersonalizado.setBounds(60, 10, 248, 40);
			panel_5_1.add(lblSimuladoPersonalizado);
			
			//LABEL PARA O ICONE DE RELOGIO NO SIMULADO PERSONALIZADO
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\clock.png"));
			lblNewLabel_2.setBounds(60, 182, 50, 50);
			panel_5_1.add(lblNewLabel_2);
			
			//LABEL TEMPO NO SIMULADO PERSONALIZADO
			JLabel lblTempo = new JLabel("Tempo: ");
			lblTempo.setForeground(Color.BLACK);
			lblTempo.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblTempo.setBackground(Color.WHITE);
			lblTempo.setBounds(119, 178, 82, 40);
			panel_5_1.add(lblTempo);
			
			//"BOTAO CHOICE" DE ESCOLHA DO TEMPO NO SIMULADO PERSONALIZADO
			Choice choice_1 = new Choice();
			choice_1.setForeground(Color.WHITE);
			choice_1.setBackground(Color.LIGHT_GRAY);
			choice_1.setBounds(207, 191, 126, 18);
			panel_5_1.add(choice_1);
			choice_1.add("---");
			choice_1.add("Curto");
			choice_1.add("Médio");
				
						
			//LABEL PARA O ICONE DE PAPEL NO SIMULADO PERSONALIZADO
			JLabel lblNewLabel_1_2 = new JLabel("");
			lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\paper.png"));
			lblNewLabel_1_2.setBounds(60, 248, 50, 50);
			panel_5_1.add(lblNewLabel_1_2);
			
			//LABEL NUMERO DE QUESTOES NO SIMULADO PERSONALIZADO
			JLabel lblQuestoes_1 = new JLabel("Questoes:");
			lblQuestoes_1.setForeground(Color.BLACK);
			lblQuestoes_1.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblQuestoes_1.setBackground(Color.WHITE);
			lblQuestoes_1.setBounds(119, 232, 111, 40);
			panel_5_1.add(lblQuestoes_1);
			
			//LABEL PARA O ICONE DE CALENDARIO NO SIMULADO PERSONALIZADO
			JLabel lblNewLabel_1_1_1 = new JLabel("");
			lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\bruna.rescigno\\eclipse-workspace\\img\\img_telas\\escolha_simulado\\calendar.png"));
			lblNewLabel_1_1_1.setBounds(60, 307, 50, 50);
			panel_5_1.add(lblNewLabel_1_1_1);
			
			//LABEL ESCOLHA DE ANO NO SIMULADO PERSONALIZADO
			JLabel lblEscolhaOAno_1 = new JLabel("Escolha o ano:");
			lblEscolhaOAno_1.setForeground(Color.BLACK);
			lblEscolhaOAno_1.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblEscolhaOAno_1.setBackground(Color.WHITE);
			lblEscolhaOAno_1.setBounds(119, 295, 158, 30);
			panel_5_1.add(lblEscolhaOAno_1);
			
			//"BOTAO CHOICE" DE ESCOLHA DO ANO NO SIMULADO PERSONALIZADO
			Choice choice_2 = new Choice();
			choice_2.setForeground(Color.WHITE);
			choice_2.setBackground(Color.LIGHT_GRAY);
			choice_2.setBounds(126, 340, 150, 18);
			panel_5_1.add(choice_2);
			choice_2.add("---");
			choice_2.add("2021");
			choice_2.add("2022");
			choice_2.add("2023");
			
			btnIniciarSP.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					simu.tipoSimu = 2; // TIPO SP
					simu.anoSP = choice_2.getSelectedItem(); // TIPO ANO
					simu.tempoSimu = choice_1.getSelectedItem(); // TIPO TEMPO
					removeAll();
					add(simu);
					revalidate();
					repaint();
					}
			});
			setBounds(0, 0, 1280, 720);
	
	

		
	}
}
