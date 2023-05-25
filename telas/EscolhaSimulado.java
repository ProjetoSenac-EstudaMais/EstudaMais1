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
import java.awt.event.ActionEvent;

public class EscolhaSimulado extends JPanel {
	
	//VARIAVEIS PARA O TIPO DE SIMULADO (PARA SER USADO COM OS BOTOES)
	 int simuladoEscolha;
	 
	//VARIAVEL PARA O ANO DO SIMULADO COMPLETO
	String anoSC;
	
	//VARIAVEL PARA O TEMPO DO SIMULADO PERSONALIZADO
	String anoSP;
	
	//VARIAVEL PARA O TEMPO DO SIMULADO PERSONALIZADO
	String tempoSP;
	


	/**
	 * Create the panel.
	 */
	public EscolhaSimulado() {
		
			setLayout(null);
			setBounds(100,100,1280,720);

			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1280, 720);
			panel.setBackground(new Color(128, 128, 128));
			add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(36, 44, 136));
			panel_1.setBounds(0, 0, 260, 720);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(new Color(64, 74, 204));
			panel_3.setBounds(0, 0, 260, 100);
			panel_1.add(panel_3);
			panel_3.setLayout(null);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(new Color(98, 106, 204));
			panel_4.setBounds(0, 0, 260, 10);
			panel_3.add(panel_4);
			panel_4.setLayout(null);
			
			JPanel panel_4_1 = new JPanel();
			panel_4_1.setLayout(null);
			panel_4_1.setBackground(new Color(98, 106, 204));
			panel_4_1.setBounds(0, 90, 260, 10);
			panel_3.add(panel_4_1);
			
			JLabel lblHenriqueSilveira = new JLabel("Henrique Silveira");
			lblHenriqueSilveira.setForeground(new Color(255, 255, 255));
			lblHenriqueSilveira.setFont(new Font("Poppins", Font.PLAIN, 13));
			lblHenriqueSilveira.setBackground(Color.WHITE);
			lblHenriqueSilveira.setBounds(101, 20, 115, 20);
			panel_3.add(lblHenriqueSilveira);
			
			JLabel lblQuemCedoMadruga = new JLabel("Quem cedo madruga");
			lblQuemCedoMadruga.setForeground(new Color(188, 188, 188));
			lblQuemCedoMadruga.setFont(new Font("Poppins", Font.PLAIN, 12));
			lblQuemCedoMadruga.setBackground(Color.WHITE);
			lblQuemCedoMadruga.setBounds(101, 42, 149, 20);
			panel_3.add(lblQuemCedoMadruga);
			
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.setBorder(null);
			btnVoltar.setForeground(Color.WHITE);
			btnVoltar.setFont(new Font("Poppins", Font.PLAIN, 13));
			btnVoltar.setContentAreaFilled(false);
			btnVoltar.setBackground(new Color(36, 44, 136));
			btnVoltar.setBounds(43, 620, 40, 24);
			panel_1.add(btnVoltar);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(64, 74, 204));
			panel_2.setBounds(260, 0, 1010, 720);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			JPanel panel_3_1 = new JPanel();
			panel_3_1.setBackground(new Color(36, 44, 136));
			panel_3_1.setBounds(0, 0, 1010, 100);
			panel_2.add(panel_3_1);
			panel_3_1.setLayout(null);
			
			JPanel panel_4_1_1 = new JPanel();
			panel_4_1_1.setLayout(null);
			panel_4_1_1.setBackground(new Color(98, 106, 204));
			panel_4_1_1.setBounds(0, 0, 1010, 10);
			panel_3_1.add(panel_4_1_1);
			
			JPanel panel_4_1_1_1 = new JPanel();
			panel_4_1_1_1.setLayout(null);
			panel_4_1_1_1.setBackground(new Color(98, 106, 204));
			panel_4_1_1_1.setBounds(0, 90, 1010, 10);
			panel_3_1.add(panel_4_1_1_1);
			
			JLabel lblSimulados = new JLabel("Simulados");
			lblSimulados.setForeground(new Color(255, 255, 255));
			lblSimulados.setFont(new Font("Poppins", Font.PLAIN, 35));
			lblSimulados.setBounds(368, 20, 194, 53);
			panel_3_1.add(lblSimulados);
			
			//PAINEL DE FUNDO DO SIMULADO COMPLETO
			JPanel panel_5 = new JPanel();
			panel_5.setBackground(new Color(255, 255, 255));
			panel_5.setBounds(97, 127, 383, 522);
			panel_2.add(panel_5);
			panel_5.setLayout(null);
			
			
			
			//BOTAO DE INICAR O SIMULADO COMPLETO
			JButton btnIniciarSC = new JButton("INICIAR");
			btnIniciarSC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					simuladoEscolha = 1;
				}
			});
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
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\bruna\\OneDrive\\Desktop\\SENAC PROG\\PROJETO SI 1\\clock.png"));
			lblNewLabel.setBounds(70, 102, 50, 50);
			panel_5.add(lblNewLabel);
			
			//LABEL TEMPO
			JLabel lblTempoPadr = new JLabel("Tempo: Padrao");
			lblTempoPadr.setForeground(Color.BLACK);
			lblTempoPadr.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblTempoPadr.setBackground(Color.WHITE);
			lblTempoPadr.setBounds(131, 102, 175, 40);
			panel_5.add(lblTempoPadr);
			
			//LABEL PARA INSERIR ICONE DO PAPEL NO SIMULADO COMPLETO
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\bruna\\OneDrive\\Desktop\\SENAC PROG\\PROJETO SI 1\\paper.png"));
			lblNewLabel_1.setBounds(70, 159, 50, 50);
			panel_5.add(lblNewLabel_1);
			
			//LABEL QUESTOES NO SIMULADO COMPLETO
			JLabel lblQuestoes = new JLabel("180 Questoes");
			lblQuestoes.setForeground(Color.BLACK);
			lblQuestoes.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblQuestoes.setBackground(Color.WHITE);
			lblQuestoes.setBounds(131, 156, 158, 40);
			panel_5.add(lblQuestoes);
			
			//LABEL PARA INSERIR ICONE DO CALENDARIO NO SIMULADO COMPLETO
			JLabel lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\bruna\\OneDrive\\Desktop\\SENAC PROG\\PROJETO SI 1\\calendar.png"));
			lblNewLabel_1_1.setBounds(70, 219, 50, 50);
			panel_5.add(lblNewLabel_1_1);
			
			//LABEL ESCOLHA ANO NO SIMULADO COMPLETO
			JLabel lblEscolhaOAno = new JLabel("Escolha o ano:");
			lblEscolhaOAno.setForeground(Color.BLACK);
			lblEscolhaOAno.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblEscolhaOAno.setBackground(Color.WHITE);
			lblEscolhaOAno.setBounds(131, 219, 158, 40);
			panel_5.add(lblEscolhaOAno);
			
			//"BOTAO CHOICE" DE ESCOLHA DO ANO NO SIMULADO COMPLETO
			Choice choice = new Choice();
			choice.setBackground(Color.LIGHT_GRAY);
			choice.setForeground(new Color(255, 255, 255));
			choice.setBounds(141, 264, 150, 18);
			panel_5.add(choice);
			choice.add("---");
			choice.add("2021");
			choice.add("2022");
			choice.add("2023");
			
		
				
			//PAINEL DE FUNDO DO SIMULADO PERSONALIZADO
			JPanel panel_5_1 = new JPanel();
			panel_5_1.setBackground(new Color(255, 255, 255));
			panel_5_1.setLayout(null);
			panel_5_1.setBounds(529, 127, 383, 522);
			panel_2.add(panel_5_1);
			
			//BOTAO DE INICAR O SIMULADO PERSONALIZADO
			JButton btnIniciarSP = new JButton("INICIAR");
			btnIniciarSP.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					simuladoEscolha = 2;
				}
			});
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
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\bruna\\OneDrive\\Desktop\\SENAC PROG\\PROJETO SI 1\\clock.png"));
			lblNewLabel_2.setBounds(61, 106, 50, 50);
			panel_5_1.add(lblNewLabel_2);
			
			//LABEL TEMPO NO SIMULADO PERSONALIZADO
			JLabel lblTempo = new JLabel("Tempo: ");
			lblTempo.setForeground(Color.BLACK);
			lblTempo.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblTempo.setBackground(Color.WHITE);
			lblTempo.setBounds(120, 102, 82, 40);
			panel_5_1.add(lblTempo);
			
			//"BOTAO CHOICE" DE ESCOLHA DO TEMPO NO SIMULADO PERSONALIZADO
			Choice choice_1 = new Choice();
			choice_1.setForeground(Color.WHITE);
			choice_1.setBackground(Color.LIGHT_GRAY);
			choice_1.setBounds(208, 115, 126, 18);
			panel_5_1.add(choice_1);
			choice_1.add("---");
			choice_1.add("Curto");
			choice_1.add("Médio");
			choice_1.add("Longo");
			
			
			
			//LABEL PARA O ICONE DE PAPEL NO SIMULADO PERSONALIZADO
			JLabel lblNewLabel_1_2 = new JLabel("");
			lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\bruna\\OneDrive\\Desktop\\SENAC PROG\\PROJETO SI 1\\paper.png"));
			lblNewLabel_1_2.setBounds(61, 172, 50, 50);
			panel_5_1.add(lblNewLabel_1_2);
			
			//LABEL NUMERO DE QUESTOES NO SIMULADO PERSONALIZADO
			JLabel lblQuestoes_1 = new JLabel("Questoes:");
			lblQuestoes_1.setForeground(Color.BLACK);
			lblQuestoes_1.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblQuestoes_1.setBackground(Color.WHITE);
			lblQuestoes_1.setBounds(120, 156, 111, 40);
			panel_5_1.add(lblQuestoes_1);
			
			//LABEL PARA O ICONE DE CALENDARIO NO SIMULADO PERSONALIZADO
			JLabel lblNewLabel_1_1_1 = new JLabel("");
			lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\bruna\\OneDrive\\Desktop\\SENAC PROG\\PROJETO SI 1\\calendar.png"));
			lblNewLabel_1_1_1.setBounds(61, 231, 50, 50);
			panel_5_1.add(lblNewLabel_1_1_1);
			
			//LABEL ESCOLHA DE ANO NO SIMULADO PERSONALIZADO
			JLabel lblEscolhaOAno_1 = new JLabel("Escolha o ano:");
			lblEscolhaOAno_1.setForeground(Color.BLACK);
			lblEscolhaOAno_1.setFont(new Font("Poppins", Font.PLAIN, 23));
			lblEscolhaOAno_1.setBackground(Color.WHITE);
			lblEscolhaOAno_1.setBounds(120, 219, 158, 30);
			panel_5_1.add(lblEscolhaOAno_1);
			
			//"BOTAO CHOICE" DE ESCOLHA DO ANO NO SIMULADO PERSONALIZADO
			Choice choice_2 = new Choice();
			choice_2.setForeground(Color.WHITE);
			choice_2.setBackground(Color.LIGHT_GRAY);
			choice_2.setBounds(127, 264, 150, 18);
			panel_5_1.add(choice_2);
			choice_2.add("---");
			choice_2.add("2021");
			choice_2.add("2022");
			choice_2.add("2023");
			
				
			
			JPanel panel_4_1_1_1_1 = new JPanel();
			panel_4_1_1_1_1.setLayout(null);
			panel_4_1_1_1_1.setBackground(new Color(188, 188, 188));
			panel_4_1_1_1_1.setBounds(0, 675, 1010, 10);
			panel_2.add(panel_4_1_1_1_1);
			setBounds(0, 0, 1280, 720);
	
	

		
	}

}
