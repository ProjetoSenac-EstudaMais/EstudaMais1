package telas;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class MeuPerfil extends JPanel {
	
	//VARIAVEIS PARA O TIPO DE SIMULADO (PARA SER USADO COM OS BOTOES)
	 int simuladoEscolha;
	 
	//VARIAVEL PARA O ANO DO SIMULADO COMPLETO
	String anoSC;
	
	//VARIAVEL PARA O TEMPO DO SIMULADO PERSONALIZADO
	String anoSP;
	
	//VARIAVEL PARA O TEMPO DO SIMULADO PERSONALIZADO
	String tempoSP;

	private JTextField textField;

	private JPanel SimuladosArrayPane;
	
	
	
	


	/**
	 * Create the panel.
	 */
	public MeuPerfil() {
		
			setLayout(null);
			setBounds(100,100,1280,720);
			
			JPanel Sidebar = new JPanel();
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
			badge_id.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\badge\\badge_id3.png"));
			badge_id.setBounds(71, 55, 28, 28);
			Perfil.add(badge_id);
			
			JLabel icon_user = new JLabel("");
			icon_user.setInheritsPopupMenu(false);
			icon_user.setRequestFocusEnabled(false);
			icon_user.setIconTextGap(0);
			icon_user.setBorder(null);
			icon_user.setHorizontalAlignment(SwingConstants.CENTER);
			icon_user.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\icons\\chuu.png"));
			icon_user.setBounds(24, 15, 68, 68);
			Perfil.add(icon_user);
			
			JLabel nome_id = new JLabel("Henrique Silveira");
			nome_id.setForeground(new Color(255, 255, 255));
			nome_id.setFont(new Font("Poppins", Font.PLAIN, 12));
			nome_id.setBounds(100, 20, 150, 25);
			Perfil.add(nome_id);
			
			JLabel badge_subtitle_id = new JLabel("Gabaritou um Simulado!");
			badge_subtitle_id.setForeground(new Color(188, 188, 188));
			badge_subtitle_id.setFont(new Font("Poppins", Font.PLAIN, 12));
			badge_subtitle_id.setBounds(100, 35, 166, 25);
			Perfil.add(badge_subtitle_id);
			
			JPanel panel_3_2 = new JPanel();
			panel_3_2.setBackground(new Color(36, 44, 134));
			panel_3_2.setBounds(0, 0, 320, 10);
			Perfil.add(panel_3_2);
			
			JButton btnPerfil = new JButton("Meu Perfil");
			btnPerfil.setBackground(new Color(98, 106, 204));
			btnPerfil.setMargin(new Insets(2, 22, 2, 14));
			btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnPerfil.setHorizontalAlignment(SwingConstants.LEFT);
			btnPerfil.setFocusPainted(false);
			btnPerfil.setBorderPainted(false);
			btnPerfil.setForeground(new Color(255, 255, 255));
			btnPerfil.setFont(new Font("Poppins", Font.PLAIN, 16));
			btnPerfil.setBounds(0, 140, 260, 19);
			Sidebar.add(btnPerfil);
			
			JButton btnConfig = new JButton("Configurações");
			btnConfig.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Config cf = new Config();
					removeAll();
					add(cf);
					revalidate();
					repaint();
				}
			});
			btnConfig.setMargin(new Insets(2, 22, 2, 14));
			btnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnConfig.setHorizontalAlignment(SwingConstants.LEFT);
			btnConfig.setOpaque(false);
			btnConfig.setForeground(Color.BLACK);
			btnConfig.setFont(new Font("Poppins", Font.PLAIN, 16));
			btnConfig.setFocusPainted(false);
			btnConfig.setContentAreaFilled(false);
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
			
			JLabel lblSimulados = new JLabel("Meu Perfil");
			lblSimulados.setForeground(new Color(255, 255, 255));
			lblSimulados.setFont(new Font("Poppins", Font.PLAIN, 35));
			lblSimulados.setBounds(410, 20, 185, 53);
			panel_3_1.add(lblSimulados);
			
			JLabel bg_header = new JLabel("");
			bg_header.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\escolha_simulado\\bg_header.png"));
			bg_header.setBounds(0, 0, 1020, 100);
			panel_3_1.add(bg_header);
			
			JLabel lblNewLabel = new JLabel("Nome:");
			lblNewLabel.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblNewLabel.setBounds(145, 111, 67, 27);
			panel_2.add(lblNewLabel);
			
			JLabel primeironome = new JLabel("Henrique");
			primeironome.setFont(new Font("Poppins", Font.PLAIN, 17));
			primeironome.setBounds(210, 111, 172, 27);
			panel_2.add(primeironome);
			
			JLabel lblSobrenome = new JLabel("Sobrenome:");
			lblSobrenome.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblSobrenome.setBounds(145, 135, 104, 27);
			panel_2.add(lblSobrenome);
			
			JLabel lblSobrenome_1 = new JLabel("Silveira");
			lblSobrenome_1.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblSobrenome_1.setBounds(259, 135, 135, 27);
			panel_2.add(lblSobrenome_1);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(64, 74, 204));
			panel_1.setBounds(10, 115, 125, 125);
			panel_2.add(panel_1);
			panel_1.setLayout(null);
			
			JButton btnAddIcon = new JButton("");
			btnAddIcon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAddIcon.setHorizontalTextPosition(SwingConstants.CENTER);
			btnAddIcon.setContentAreaFilled(false);
			btnAddIcon.setBorderPainted(false);
			btnAddIcon.setOpaque(false);
			btnAddIcon.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\assets\\add.png"));
			btnAddIcon.setBounds(97, 96, 28, 28);
			panel_1.add(btnAddIcon);
			
			JLabel IconUser = new JLabel("");
			IconUser.setIgnoreRepaint(true);
			IconUser.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\icons\\chuu125.png"));
			IconUser.setBounds(0, 0, 125, 125);
			panel_1.add(IconUser);
			
			// Painel Simulados
			
			JPanel PainelSimulados = new JPanel();
			PainelSimulados.setBackground(new Color(36, 44, 134));
			PainelSimulados.setBounds(588, 115, 422, 594);
			panel_2.add(PainelSimulados);
			PainelSimulados.setLayout(null);
			
			JLabel lblPainelSimulados = new JLabel("Simulados");
			lblPainelSimulados.setBounds(0, 0, 422, 40);
			PainelSimulados.add(lblPainelSimulados);
			lblPainelSimulados.setHorizontalAlignment(SwingConstants.CENTER);
			lblPainelSimulados.setFont(new Font("Poppins", Font.PLAIN, 18));
			lblPainelSimulados.setForeground(new Color(255, 255, 255));
			
			//SIMULADO TEMPLATE PANEL
			
			int SimuladosQuant = 4;
			
			int startY = 50;
			int panelHeight = 56;
			int verticalSpacing = -25;
			
			
			for (int i = 0; i < SimuladosQuant; i++) {
				
		    JPanel SimuladoTemplate = new JPanel();
			SimuladoTemplate.setBorder(new LineBorder(new Color(255, 255, 255)));
			SimuladoTemplate.setBackground(new Color(36, 46, 134));
			SimuladoTemplate.setBounds(8, startY + i * (panelHeight + verticalSpacing), 404, panelHeight);
			PainelSimulados.add(SimuladoTemplate);
			SimuladoTemplate.setLayout(null);

			JLabel Nome_Simulado = new JLabel("Nome_Simulado");
		    Nome_Simulado.setForeground(new Color(255, 255, 255));
			Nome_Simulado.setFont(new Font("Poppins", Font.PLAIN, 14));
			Nome_Simulado.setBounds(10, 15, 163, 14);
			SimuladoTemplate.add(Nome_Simulado);
			
			JLabel Data_Simulado = new JLabel("13/06/2023");
			Data_Simulado.setHorizontalAlignment(SwingConstants.CENTER);
			Data_Simulado.setForeground(Color.WHITE);
			Data_Simulado.setFont(new Font("Poppins", Font.PLAIN, 14));
			Data_Simulado.setBounds(10, 30, 123, 14);
			SimuladoTemplate.add(Data_Simulado);
			
			JButton btnNewButton = new JButton("Ver Gabarito");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBackground(new Color(98, 106, 204));
			btnNewButton.setBounds(154, 15, 110, 23);
			SimuladoTemplate.add(btnNewButton);
			
			JLabel Questoes_Gabarito = new JLabel("25/40");
			Questoes_Gabarito.setHorizontalAlignment(SwingConstants.CENTER);
			Questoes_Gabarito.setForeground(Color.WHITE);
			Questoes_Gabarito.setFont(new Font("Poppins", Font.PLAIN, 14));
			Questoes_Gabarito.setBounds(281, 20, 73, 14);
			SimuladoTemplate.add(Questoes_Gabarito);
			
			JLabel icon_Acertos = new JLabel("");
			icon_Acertos.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\assets\\check.png"));
			icon_Acertos.setBounds(364, 14, 28, 28);
			SimuladoTemplate.add(icon_Acertos);
			
			startY += panelHeight + verticalSpacing;
			}
			
			int panelHeightTotal = SimuladosQuant * (panelHeight + verticalSpacing) - verticalSpacing;
			PainelSimulados.setPreferredSize(new Dimension(422, panelHeightTotal));
			PainelSimulados.revalidate();

			
			JLabel lblDataDeNascimento = new JLabel("Idade:");
			lblDataDeNascimento.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblDataDeNascimento.setBounds(145, 160, 56, 27);
			panel_2.add(lblDataDeNascimento);
			
			JLabel dataNasc = new JLabel("19 Anos");
			dataNasc.setFont(new Font("Poppins", Font.PLAIN, 17));
			dataNasc.setBounds(205, 160, 104, 27);
			panel_2.add(dataNasc);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(new Color(36, 44, 134));
			panel_4.setBounds(10, 250, 568, 45);
			panel_2.add(panel_4);
			panel_4.setLayout(null);
			
			JButton btnAddBadge = new JButton("");
			btnAddBadge.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\assets\\add.png"));
			btnAddBadge.setOpaque(false);
			btnAddBadge.setHorizontalTextPosition(SwingConstants.CENTER);
			btnAddBadge.setContentAreaFilled(false);
			btnAddBadge.setBorderPainted(false);
			btnAddBadge.setBounds(530, 8, 28, 28);
			panel_4.add(btnAddBadge);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\badge\\badge_id1.png"));
			lblNewLabel_1.setBounds(5, 10, 28, 28);
			panel_4.add(lblNewLabel_1);
			
			JLabel Label_NameMeta = new JLabel("Primeiro Simulado");
			Label_NameMeta.setFont(new Font("Poppins", Font.PLAIN, 17));
			Label_NameMeta.setForeground(new Color(255, 255, 255));
			Label_NameMeta.setBounds(40, 15, 460, 19);
			panel_4.add(Label_NameMeta);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBounds(10, 306, 568, 404);
			panel_2.add(panel_5);
			panel_5.setLayout(null);
			
			JLabel lblNewLabel_4 = new JLabel("Resumo do Desempenho");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setBounds(191, 5, 201, 14);
			panel_5.add(lblNewLabel_4);
			
			JLabel lblNewLabel_2 = new JLabel("Simulados Completos: 0");
			lblNewLabel_2.setBounds(26, 52, 209, 14);
			panel_5.add(lblNewLabel_2);
			
			JLabel lblNewLabel_2_1 = new JLabel("Simulados Personalizados: 0");
			lblNewLabel_2_1.setBounds(26, 65, 173, 14);
			panel_5.add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("Melhor resultado:");
			lblNewLabel_2_1_1.setBounds(26, 90, 173, 14);
			panel_5.add(lblNewLabel_2_1_1);
			
			JLabel lblNewLabel_2_2 = new JLabel("Média de acertos: ");
			lblNewLabel_2_2.setBounds(26, 77, 160, 14);
			panel_5.add(lblNewLabel_2_2);
			
			JProgressBar progressBar = new JProgressBar();
			progressBar.setForeground(new Color(0, 0, 255));
			progressBar.setValue(50);
			progressBar.setStringPainted(true);
			progressBar.setBounds(10, 379, 548, 14);
			panel_5.add(progressBar);
			
			JLabel lblNewLabel_2_1_1_1 = new JLabel("Progresso em Metas:");
			lblNewLabel_2_1_1_1.setBounds(10, 361, 173, 14);
			panel_5.add(lblNewLabel_2_1_1_1);
			
			JLabel lblMembroDesde = new JLabel("Membro desde:");
			lblMembroDesde.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblMembroDesde.setBounds(145, 187, 145, 27);
			panel_2.add(lblMembroDesde);
			
			JLabel dataNasc_1 = new JLabel("01/06/2023");
			dataNasc_1.setFont(new Font("Poppins", Font.PLAIN, 17));
			dataNasc_1.setBounds(300, 187, 104, 27);
			panel_2.add(dataNasc_1);
			setBounds(0, 0, 1280, 720);
	
	

		
	}
}
