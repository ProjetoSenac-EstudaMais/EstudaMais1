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
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;
import javax.swing.JToggleButton;
import javax.swing.OverlayLayout;

public class BadgeTrade extends JPanel {

	int simuladoEscolha;
	String anoSC;
	String anoSP;
	String tempoSP;

	private JTextField textField;

	private JPanel SimuladosArrayPane;

	public BadgeTrade() {
		
			setLayout(null);
			setBounds(100,100,1280,720);			
			
			JPanel panel_3 = new JPanel();
			panel_3.setOpaque(false);
			panel_3.setVerifyInputWhenFocusTarget(false);
			panel_3.setBackground(new Color(0, 0, 0));
			panel_3.setBounds(0, 0, 1280, 720);
			add(panel_3);
			panel_3.setLayout(null);
			
			JPanel panel_6 = new JPanel();
			panel_6.setBorder(new LineBorder(new Color(36, 46, 134), 5));
			panel_6.setBackground(Color.WHITE);
			panel_6.setBounds(587, 137, 296, 322);
			panel_3.add(panel_6);
			panel_6.setLayout(null);
			
			JButton btnConfirmar = new JButton("CONFIRMAR");
			btnConfirmar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MeuPerfil mp = new MeuPerfil();
					removeAll();
					add(mp);
					revalidate();
					repaint();
				}
			});
			btnConfirmar.setBounds(152, 263, 119, 48);
			panel_6.add(btnConfirmar);
			
			JButton btnBadge_Id_1 = new JButton("btnBadge_Id_1");
			btnBadge_Id_1.setBounds(23, 11, 119, 106);
			panel_6.add(btnBadge_Id_1);
			
			JButton btnBadge_Id_2 = new JButton("btnBadge_Id_2");
			btnBadge_Id_2.setBounds(152, 11, 119, 106);
			panel_6.add(btnBadge_Id_2);
			
			JButton btnBadge_Id_3 = new JButton("btnBadge_Id_3");
			btnBadge_Id_3.setBounds(23, 128, 119, 106);
			panel_6.add(btnBadge_Id_3);
			
			JButton btnBadge_Id_4 = new JButton("btnBadge_Id_4");
			btnBadge_Id_4.setBounds(152, 128, 119, 106);
			panel_6.add(btnBadge_Id_4);
			
			JPanel Sidebar = new JPanel();
			Sidebar.setDoubleBuffered(false);
			Sidebar.setEnabled(false);
			Sidebar.setFocusable(false);
			Sidebar.setFocusTraversalKeysEnabled(false);
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
			badge_id.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id3.png"));
			badge_id.setBounds(71, 55, 28, 28);
			Perfil.add(badge_id);
			
			JLabel icon_user = new JLabel("");
			icon_user.setInheritsPopupMenu(false);
			icon_user.setRequestFocusEnabled(false);
			icon_user.setIconTextGap(0);
			icon_user.setBorder(null);
			icon_user.setHorizontalAlignment(SwingConstants.CENTER);
			icon_user.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\icons\\chuu.png"));
			icon_user.setBounds(24, 15, 68, 68);
			Perfil.add(icon_user);
			
			JLabel nome_id = new JLabel("nome_id");
			nome_id.setForeground(new Color(255, 255, 255));
			nome_id.setFont(new Font("Poppins", Font.PLAIN, 12));
			nome_id.setBounds(100, 20, 150, 25);
			Perfil.add(nome_id);
			
			JLabel badge_subtitle_id = new JLabel("badge_subtitle_id");
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
					
				}
			});
			

			JPanel panel = new JPanel();
			panel.setDoubleBuffered(false);
			panel.setEnabled(false);
			panel.setFocusable(false);
			panel.setFocusTraversalKeysEnabled(false);
			panel.setBounds(0, 0, 1280, 720);
			panel.setBackground(new Color(128, 128, 128));
			add(panel);
			panel.setLayout(null);
			
			
			JPanel panel_2 = new JPanel();
			panel_2.setFocusable(false);
			panel_2.setFocusTraversalKeysEnabled(false);
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
			lblNewLabel.setBounds(145, 115, 67, 27);
			panel_2.add(lblNewLabel);
			
			JLabel primeironome = new JLabel("nome_id");
			primeironome.setFont(new Font("Poppins", Font.PLAIN, 17));
			primeironome.setBounds(210, 115, 172, 27);
			panel_2.add(primeironome);
			
			JLabel lblSobrenome = new JLabel("Sobrenome:");
			lblSobrenome.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblSobrenome.setBounds(145, 139, 104, 27);
			panel_2.add(lblSobrenome);
			
			JLabel lblSobrenome_1 = new JLabel("sobrenome_id");
			lblSobrenome_1.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblSobrenome_1.setBounds(259, 139, 135, 27);
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
			btnAddIcon.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\assets\\add.png"));
			btnAddIcon.setBounds(97, 97, 28, 28);
			panel_1.add(btnAddIcon);
			
			JLabel IconUser = new JLabel("");
			IconUser.setBorder(new LineBorder(new Color(36, 46, 134), 4));
			IconUser.setIgnoreRepaint(true);
			IconUser.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\icons\\chuu125.png"));
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
			
			int SimuladosQuant = 8;
			
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
			lblDataDeNascimento.setBounds(145, 164, 56, 27);
			panel_2.add(lblDataDeNascimento);
			
			JLabel idade_id = new JLabel("idade_id");
			idade_id.setFont(new Font("Poppins", Font.PLAIN, 17));
			idade_id.setBounds(205, 164, 104, 27);
			panel_2.add(idade_id);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(new Color(36, 44, 134));
			panel_4.setBounds(10, 250, 568, 45);
			panel_2.add(panel_4);
			panel_4.setLayout(null);
			
			JButton btnAddBadge = new JButton("");
			btnAddBadge.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\assets\\add.png"));
			btnAddBadge.setOpaque(false);
			btnAddBadge.setHorizontalTextPosition(SwingConstants.CENTER);
			btnAddBadge.setContentAreaFilled(false);
			btnAddBadge.setBorderPainted(false);
			btnAddBadge.setBounds(530, 8, 28, 28);
			panel_4.add(btnAddBadge);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id3.png"));
			lblNewLabel_1.setBounds(5, 10, 28, 28);
			panel_4.add(lblNewLabel_1);
			
			JLabel lblGabaritouUmSimulado = new JLabel("badge_subtitle_id");
			lblGabaritouUmSimulado.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblGabaritouUmSimulado.setForeground(new Color(255, 255, 255));
			lblGabaritouUmSimulado.setBounds(40, 15, 460, 19);
			panel_4.add(lblGabaritouUmSimulado);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBackground(new Color(255, 255, 255));
			panel_5.setBorder(new LineBorder(new Color(36, 46, 134), 5));
			panel_5.setBounds(10, 306, 568, 404);
			panel_2.add(panel_5);
			panel_5.setLayout(null);
			
			JPanel GraficoPainel = new JPanel();
			GraficoPainel.setBackground(new Color(192, 192, 192));
			GraficoPainel.setBounds(12, 117, 545, 276);
			panel_5.add(GraficoPainel);
			GraficoPainel.setLayout(null);
			
			JLabel lblResumoDoDesempenho = new JLabel("Resumo do Desempenho");
			lblResumoDoDesempenho.setHorizontalAlignment(SwingConstants.CENTER);
			lblResumoDoDesempenho.setBounds(191, 15, 201, 14);
			panel_5.add(lblResumoDoDesempenho);
			
			JLabel lblSimuladosCompletos = new JLabel("Simulados Completos: ");
			lblSimuladosCompletos.setBounds(16, 25, 134, 14);
			panel_5.add(lblSimuladosCompletos);
			
			JLabel lblSimuladosPersonalizados = new JLabel("Simulados Personalizados: 0");
			lblSimuladosPersonalizados.setBounds(16, 38, 173, 14);
			panel_5.add(lblSimuladosPersonalizados);
			
			JLabel lblMelhorResultado = new JLabel("Melhor resultado:");
			lblMelhorResultado.setBounds(16, 63, 173, 14);
			panel_5.add(lblMelhorResultado);
			
			JLabel lblMediaAcertos = new JLabel("Média de acertos: ");
			lblMediaAcertos.setBounds(16, 50, 160, 14);
			panel_5.add(lblMediaAcertos);
			
			JLabel lblProgressoMeta = new JLabel("Progresso em Metas:");
			lblProgressoMeta.setBounds(16, 75, 529, 14);
			panel_5.add(lblProgressoMeta);
			
			JProgressBar progressBar = new JProgressBar();
			progressBar.setStringPainted(true);
			progressBar.setBounds(12, 92, 546, 14);
			panel_5.add(progressBar);
			progressBar.setForeground(new Color(36, 46, 134));
			progressBar.setValue(50);
			
			JLabel lblQntSimulados = new JLabel(String.valueOf(SimuladosQuant));
			lblQntSimulados.setBounds(160, 25, 64, 14);
			panel_5.add(lblQntSimulados);
			setBounds(0, 0, 1280, 720);
	
	}
}
