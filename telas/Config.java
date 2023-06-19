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

public class Config extends JPanel {
	
	//VARIAVEIS PARA O TIPO DE SIMULADO (PARA SER USADO COM OS BOTOES)
	 int simuladoEscolha;
	 
	//VARIAVEL PARA O ANO DO SIMULADO COMPLETO
	String anoSC;
	
	//VARIAVEL PARA O TEMPO DO SIMULADO PERSONALIZADO
	String anoSP;
	
	//VARIAVEL PARA O TEMPO DO SIMULADO PERSONALIZADO
	String tempoSP;
	
	private String id_user;


	/**
	 * Create the panel.
	 */
	public Config(String id_user) {
			this.id_user=id_user;
			setLayout(null);
			setBounds(100,100,1280,720);
			
			JPanel Sidebar = new JPanel();
			Sidebar.setForeground(new Color(0, 0, 0));
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
			badge_id.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\badge\\badge_id1.png"));
			badge_id.setBounds(71, 55, 28, 28);
			Perfil.add(badge_id);
			
			JLabel icon_user = new JLabel("");
			icon_user.setInheritsPopupMenu(false);
			icon_user.setRequestFocusEnabled(false);
			icon_user.setIconTextGap(0);
			icon_user.setBorder(null);
			icon_user.setHorizontalAlignment(SwingConstants.CENTER);
			icon_user.setIcon(new ImageIcon("C:\\Users\\henrique.silveira1\\Documents\\EstudaMais1-main\\img\\icons\\icon_id2.png"));
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
			btnPerfil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MeuPerfil mp = new MeuPerfil(id_user);
					removeAll();
					add(mp);
					revalidate();
					repaint();
				}
			});
			btnPerfil.setOpaque(false);
			btnPerfil.setBackground(new Color(98, 106, 204));
			btnPerfil.setMargin(new Insets(2, 22, 2, 14));
			btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnPerfil.setHorizontalAlignment(SwingConstants.LEFT);
			btnPerfil.setFocusPainted(false);
			btnPerfil.setBorderPainted(false);
			btnPerfil.setForeground(new Color(0, 0, 0));
			btnPerfil.setFont(new Font("Poppins", Font.PLAIN, 16));
			btnPerfil.setBounds(0, 140, 260, 19);
			Sidebar.add(btnPerfil);
			
			JButton btnConfig = new JButton("Configurações");
			btnConfig.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnConfig.setBackground(new Color(98, 106, 204));
			btnConfig.setMargin(new Insets(2, 22, 2, 14));
			btnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnConfig.setHorizontalAlignment(SwingConstants.LEFT);
			btnConfig.setForeground(new Color(255, 255, 255));
			btnConfig.setFont(new Font("Poppins", Font.PLAIN, 16));
			btnConfig.setFocusPainted(false);
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
					Login a = new Login(id_user);
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
					TelaInicial a = new TelaInicial(id_user);
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
			
			JLabel lblConfiguracoes = new JLabel("Configurações");
			lblConfiguracoes.setHorizontalAlignment(SwingConstants.CENTER);
			lblConfiguracoes.setForeground(new Color(255, 255, 255));
			lblConfiguracoes.setFont(new Font("Poppins", Font.PLAIN, 35));
			lblConfiguracoes.setBounds(350, 20, 299, 53);
			panel_3_1.add(lblConfiguracoes);
			
			JLabel bg_header = new JLabel("");
			bg_header.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\escolha_simulado\\bg_header.png"));
			bg_header.setBounds(0, 0, 1020, 100);
			panel_3_1.add(bg_header);
			setBounds(0, 0, 1280, 720);
	
	

		
	}
}
