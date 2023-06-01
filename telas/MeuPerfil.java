package telas;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MeuPerfil extends JPanel {
	
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
			badge_id.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
			badge_id.setBounds(71, 55, 28, 28);
			Perfil.add(badge_id);
			
			JLabel icon_user = new JLabel("");
			icon_user.setInheritsPopupMenu(false);
			icon_user.setRequestFocusEnabled(false);
			icon_user.setIconTextGap(0);
			icon_user.setBorder(null);
			icon_user.setHorizontalAlignment(SwingConstants.CENTER);
			icon_user.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\icons\\icon_id2.png"));
			icon_user.setBounds(24, 15, 68, 68);
			Perfil.add(icon_user);
			
			JLabel nome_id = new JLabel("Henrique Silveira");
			nome_id.setForeground(new Color(255, 255, 255));
			nome_id.setFont(new Font("Poppins", Font.PLAIN, 12));
			nome_id.setBounds(100, 20, 150, 25);
			Perfil.add(nome_id);
			
			JLabel badge_subtitle_id = new JLabel("Primeiro Simulado");
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
			
			JButton btnMD = new JButton("Meu desempenho");
			btnMD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnMD.setHorizontalAlignment(SwingConstants.LEFT);
			btnMD.setOpaque(false);
			btnMD.setForeground(Color.BLACK);
			btnMD.setFont(new Font("Poppins", Font.PLAIN, 16));
			btnMD.setFocusPainted(false);
			btnMD.setContentAreaFilled(false);
			btnMD.setBorderPainted(false);
			btnMD.setBounds(10, 165, 184, 19);
			Sidebar.add(btnMD);
			
			JButton btnConfig = new JButton("Configurações");
			btnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnConfig.setHorizontalAlignment(SwingConstants.LEFT);
			btnConfig.setOpaque(false);
			btnConfig.setForeground(Color.BLACK);
			btnConfig.setFont(new Font("Poppins", Font.PLAIN, 16));
			btnConfig.setFocusPainted(false);
			btnConfig.setContentAreaFilled(false);
			btnConfig.setBorderPainted(false);
			btnConfig.setBounds(10, 190, 173, 19);
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
			btnMenu.setBackground(new Color(250, 250, 250));
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
			lblNewLabel.setBounds(180, 111, 67, 27);
			panel_2.add(lblNewLabel);
			
			JLabel primeironome = new JLabel("Henrique");
			primeironome.setFont(new Font("Poppins", Font.PLAIN, 17));
			primeironome.setBounds(244, 111, 135, 27);
			panel_2.add(primeironome);
			
			JLabel lblSobrenome = new JLabel("Sobrenome:");
			lblSobrenome.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblSobrenome.setBounds(180, 136, 116, 27);
			panel_2.add(lblSobrenome);
			
			JLabel lblSobrenome_1 = new JLabel("Silveira");
			lblSobrenome_1.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblSobrenome_1.setBounds(294, 136, 135, 27);
			panel_2.add(lblSobrenome_1);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(64, 74, 204));
			panel_1.setBounds(45, 115, 125, 125);
			panel_2.add(panel_1);
			panel_1.setLayout(null);
			
			JButton btnAddIcon = new JButton("");
			btnAddIcon.setHorizontalTextPosition(SwingConstants.CENTER);
			btnAddIcon.setContentAreaFilled(false);
			btnAddIcon.setBorderPainted(false);
			btnAddIcon.setOpaque(false);
			btnAddIcon.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\assets\\mais.png"));
			btnAddIcon.setBounds(97, 96, 28, 28);
			panel_1.add(btnAddIcon);
			
			JLabel IconUser = new JLabel("");
			IconUser.setIgnoreRepaint(true);
			IconUser.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\MeuPerfil\\icon_id2.png"));
			IconUser.setBounds(0, 0, 125, 125);
			panel_1.add(IconUser);
			
			JPanel panel_1_1_1 = new JPanel();
			panel_1_1_1.setBackground(new Color(36, 44, 134));
			panel_1_1_1.setBounds(588, 115, 422, 594);
			panel_2.add(panel_1_1_1);
			panel_1_1_1.setLayout(null);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(new Color(128, 128, 255));
			panel_3.setBounds(0, 0, 422, 40);
			panel_1_1_1.add(panel_3);
			panel_3.setLayout(null);
			
			JLabel lblNewLabel_3 = new JLabel("Simulados");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setFont(new Font("Poppins", Font.PLAIN, 18));
			lblNewLabel_3.setForeground(new Color(255, 255, 255));
			lblNewLabel_3.setBounds(0, 0, 422, 40);
			panel_3.add(lblNewLabel_3);
			
			JPanel panel_3_3 = new JPanel();
			panel_3_3.setBackground(new Color(128, 128, 255));
			panel_3_3.setBounds(0, 584, 422, 10);
			panel_1_1_1.add(panel_3_3);
			
			JLabel lblDataDeNascimento = new JLabel("Idade:");
			lblDataDeNascimento.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblDataDeNascimento.setBounds(180, 161, 67, 27);
			panel_2.add(lblDataDeNascimento);
			
			JLabel dataNasc = new JLabel("19 Anos");
			dataNasc.setFont(new Font("Poppins", Font.PLAIN, 17));
			dataNasc.setBounds(244, 161, 104, 27);
			panel_2.add(dataNasc);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(new Color(36, 44, 134));
			panel_4.setBounds(45, 251, 334, 45);
			panel_2.add(panel_4);
			panel_4.setLayout(null);
			
			JButton btnAddBadge = new JButton("");
			btnAddBadge.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\assets\\mais.png"));
			btnAddBadge.setOpaque(false);
			btnAddBadge.setHorizontalTextPosition(SwingConstants.CENTER);
			btnAddBadge.setContentAreaFilled(false);
			btnAddBadge.setBorderPainted(false);
			btnAddBadge.setBounds(302, 10, 28, 28);
			panel_4.add(btnAddBadge);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
			lblNewLabel_1.setBounds(5, 10, 28, 28);
			panel_4.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Primeiro Simulado");
			lblNewLabel_2.setFont(new Font("Poppins", Font.PLAIN, 17));
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setBounds(40, 15, 198, 19);
			panel_4.add(lblNewLabel_2);
			setBounds(0, 0, 1280, 720);
	
	

		
	}
}