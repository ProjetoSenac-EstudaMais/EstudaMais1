package telas;

import javax.swing.JPanel;


import java.awt.AlphaComposite;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Cursor;

import java.awt.EventQueue;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.Insets;

public class TelaInicial extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public TelaInicial() {
		setBackground(new Color(250, 250, 250));
		setLayout(null);
		setBounds(0, 0, 1280, 720);
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    panel_4.setBackground(new Color(36,44,134));
	    panel_4.setBounds(320, 15, 460, 278);
	    add(panel_4);
	    panel_4.setLayout(null);
	    

	    
//------------------------------------------- LEMBRETES	   
	    	 
	    JLabel lblNewLabel_1 = new JLabel("Lembretes");
	    lblNewLabel_1.setForeground(new Color(255, 255, 255));
	    lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 16));
	    lblNewLabel_1.setBounds(8, 8, 110, 17);
	    panel_4.add(lblNewLabel_1);
	    
	    textField = new JTextField();
	    textField.setBorder(new LineBorder(new Color(255, 255, 255)));
	    textField.setForeground(new Color(255, 255, 255));
	    textField.setOpaque(false);
	    textField.setBackground(Color.WHITE);
	    textField.setBounds(8, 34, 328, 33);
	    panel_4.add(textField);
	    textField.setColumns(10);
	    
	    JButton btnAdd = new JButton("Adicionar");
	    btnAdd.setFocusPainted(false);
	    btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    btnAdd.setBorderPainted(false);
	    btnAdd.setBackground(new Color(64, 74, 204));
	    btnAdd.setForeground(new Color(255, 255, 255));
	    btnAdd.setFont(new Font("Poppins", Font.BOLD, 12));
	    btnAdd.setBounds(346, 34, 106, 33);
	    panel_4.add(btnAdd);
	    
	    JCheckBox check1 = new JCheckBox("New check box");
	    check1.setFocusPainted(false);
	    check1.setActionCommand("New check box");
	    check1.setOpaque(false);
	    check1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    check1.setContentAreaFilled(false);
	    check1.setFont(new Font("Poppins", Font.PLAIN, 11));
	    check1.setForeground(Color.WHITE);
	    check1.setBackground(new Color(36, 44, 136));
	    check1.setBounds(8, 75, 399, 23);
	    panel_4.add(check1);
	    check1.setVisible(false);
	    
	    JCheckBox check2 = new JCheckBox("New check box");
	    check2.setFocusPainted(false);
	    check2.setOpaque(false);
	    check2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    check2.setContentAreaFilled(false);
	    check2.setFont(new Font("Poppins", Font.PLAIN, 11));
	    check2.setForeground(Color.WHITE);
	    check2.setBackground(new Color(36, 44, 136));
	    check2.setBounds(8, 100, 399, 23);
	    panel_4.add(check2);
	    check2.setVisible(false);
	    
	    JCheckBox check3 = new JCheckBox("New check box");
	    check3.setFocusPainted(false);
	    check3.setOpaque(false);
	    check3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    check3.setContentAreaFilled(false);
	    check3.setFont(new Font("Poppins", Font.PLAIN, 11));
	    check3.setForeground(Color.WHITE);
	    check3.setBackground(new Color(36, 44, 136));
	    check3.setBounds(8, 125, 399, 23);
	    panel_4.add(check3);
	    check3.setVisible(false);
	    
	    JCheckBox check4 = new JCheckBox("New check box");
	    check4.setFocusPainted(false);
	    check4.setFont(new Font("Poppins", Font.PLAIN, 11));
	    check4.setOpaque(false);
	    check4.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    check4.setContentAreaFilled(false);
	    check4.setBackground(new Color(36, 44, 136));
	    check4.setForeground(Color.WHITE);
	    check4.setBounds(8, 150, 399, 23);
	    panel_4.add(check4);
	    check4.setVisible(false);
	    
	    JCheckBox check5 = new JCheckBox("New check box");
	    check5.setFocusPainted(false);
	    check5.setFont(new Font("Poppins", Font.PLAIN, 11));
	    check5.setOpaque(false);
	    check5.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    check5.setContentAreaFilled(false);
	    check5.setForeground(new Color(255, 255, 255));
	    check5.setBackground(new Color(36, 44, 136));
	    check5.setBounds(8, 175, 399, 23);
	    panel_4.add(check5);
	    check5.setVisible(false);
	    
	    JCheckBox check6 = new JCheckBox("New check box");
	    check6.setFocusPainted(false);
	    check6.setFont(new Font("Poppins", Font.PLAIN, 11));
	    check6.setOpaque(false);
	    check6.setContentAreaFilled(false);
	    check6.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    check6.setForeground(new Color(255, 255, 255));
	    check6.setBackground(new Color(36, 44, 136));
	    check6.setBounds(8, 200, 399, 23);
	    panel_4.add(check6);
	    check6.setVisible(false);
	    
	    JCheckBox check7 = new JCheckBox("New check box");
	    check7.setFocusPainted(false);
	    check7.setFont(new Font("Poppins", Font.PLAIN, 11));
	    check7.setOpaque(false);
	    check7.setContentAreaFilled(false);
	    check7.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    check7.setForeground(new Color(255, 255, 255));
	    check7.setBackground(new Color(36, 44, 136));
	    check7.setBounds(8, 225, 399, 23);
	    panel_4.add(check7);
	    check7.setVisible(false);
	    
	    JCheckBox check8 = new JCheckBox("New check box");
	    check8.setFocusPainted(false);
	    check8.setFont(new Font("Poppins", Font.PLAIN, 11));
	    check8.setOpaque(false);
	    check8.setContentAreaFilled(false);
	    check8.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    check8.setForeground(Color.WHITE);
	    check8.setBackground(new Color(36, 44, 136));
	    check8.setBounds(8, 250, 399, 23);
	    panel_4.add(check8);
	    check8.setVisible(false);
	    
	    JButton x1 = new JButton("x");
	    x1.setFocusPainted(false);
	    x1.setFont(new Font("Poppins", Font.PLAIN, 11));
	    x1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    x1.setContentAreaFilled(false);
	    x1.setBorderPainted(false);
	    x1.setForeground(Color.WHITE);
	    x1.setBounds(413, 75, 47, 23);
	    panel_4.add(x1);
	    x1.setVisible(false);
	    
	    JButton x2 = new JButton("x");
	    x2.setFocusPainted(false);
	    x2.setFont(new Font("Poppins", Font.PLAIN, 11));
	    x2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    x2.setContentAreaFilled(false);
	    x2.setBorderPainted(false);
	    x2.setForeground(Color.WHITE);
	    x2.setBounds(413, 100, 47, 23);
	    panel_4.add(x2);
	    x2.setVisible(false);
	    
	    JButton x3 = new JButton("x");
	    x3.setFocusPainted(false);
	    x3.setFont(new Font("Poppins", Font.PLAIN, 11));
	    x3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    x3.setContentAreaFilled(false);
	    x3.setBorderPainted(false);
	    x3.setForeground(Color.WHITE);
	    x3.setBounds(413, 125, 47, 23);
	    panel_4.add(x3);
	    x3.setVisible(false);
	    
	    JButton x4 = new JButton("x");
	    x4.setFocusPainted(false);
	    x4.setFont(new Font("Poppins", Font.PLAIN, 11));
	    x4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    x4.setContentAreaFilled(false);
	    x4.setBorderPainted(false);
	    x4.setForeground(new Color(255, 255, 255));
	    x4.setBounds(413, 150, 47, 23);
	    panel_4.add(x4);
	    x4.setVisible(false);
	    
	    
	    JButton x5 = new JButton("x");
	    x5.setFocusPainted(false);
	    x5.setFont(new Font("Poppins", Font.PLAIN, 11));
	    x5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    x5.setForeground(Color.WHITE);
	    x5.setContentAreaFilled(false);
	    x5.setBorderPainted(false);
	    x5.setBounds(413, 175, 47, 23);
	    panel_4.add(x5);
	    x5.setVisible(false);
	    
	    JButton x6 = new JButton("x");
	    x6.setFocusPainted(false);
	    x6.setFont(new Font("Poppins", Font.PLAIN, 11));
	    x6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    x6.setForeground(Color.WHITE);
	    x6.setContentAreaFilled(false);
	    x6.setBorderPainted(false);
	    x6.setBounds(413, 200, 47, 23);
	    panel_4.add(x6);
	    x6.setVisible(false);
	    
	    JButton x7 = new JButton("x");
	    x7.setFocusPainted(false);
	    x7.setFont(new Font("Poppins", Font.PLAIN, 11));
	    x7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    x7.setForeground(Color.WHITE);
	    x7.setContentAreaFilled(false);
	    x7.setBorderPainted(false);
	    x7.setBounds(413, 225, 47, 23);
	    panel_4.add(x7);
	    x7.setVisible(false);
	    
	    JButton x8 = new JButton("x");
	    x8.setFocusPainted(false);
	    x8.setFont(new Font("Poppins", Font.PLAIN, 11));
	    x8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    x8.setForeground(Color.WHITE);
	    x8.setContentAreaFilled(false);
	    x8.setBorderPainted(false);
	    x8.setBounds(413, 250, 47, 23);
	    panel_4.add(x8);
	    check3.setVisible(false);
	    x8.setVisible(false);
	    
	    check1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check1.isSelected()==true) {
					//muda a cor da fonte para verde
					check1.setForeground(new Color(0, 255, 0));
				} else {
					//volta a cor padrão
					check1.setForeground(new Color(255, 255, 255));
				}
			}
		});
	    
	    btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().isEmpty()) {				
					    JOptionPane.showMessageDialog(null, "Você precisa escrever");
				}else {
					
					if(check1.isVisible()==false) {				
					//aqui envia o texto do text field para checklist
					check1.setText(textField.getText());
					//zera o texto do textfield
					textField.setText("");
					//torna o checklist visivel
					check1.setVisible(true);
					//torna o botao de apagar a checklist visivel
					x1.setVisible(true);
				}else if(check2.isVisible()==false) {
					check2.setText(textField.getText());
					textField.setText("");
					check2.setVisible(true);
					x2.setVisible(true);
				}else if(check3.isVisible()==false) {
					check3.setText(textField.getText());
					textField.setText("");
					check3.setVisible(true);
					x3.setVisible(true);
				}else if(check4.isVisible()==false) {
					check4.setText(textField.getText());
					textField.setText("");
					check4.setVisible(true);
					x4.setVisible(true);
				}else if(check5.isVisible()==false) {
					check5.setText(textField.getText());
					textField.setText("");
					check5.setVisible(true);
					x5.setVisible(true);
				}else if(check6.isVisible()==false) {
					check6.setText(textField.getText());
					textField.setText("");
					check6.setVisible(true);
					x6.setVisible(true);
				}else if(check7.isVisible()==false) {
					check7.setText(textField.getText());
					textField.setText("");
					check7.setVisible(true);
					x7.setVisible(true);
				}else if(check8.isVisible()==false) {
					check8.setText(textField.getText());
					textField.setText("");
					check8.setVisible(true);
					x8.setVisible(true);
				}
				
				else {
					
				}
				
			  }
		   }
		});
	    
	    x1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(check1.isVisible()==true) {
				check1.setText("");
				check1.setVisible(false);
				x1.setVisible(false);
				check1.setSelected(false);
			} else {
			}
			}
		});
	    
	    x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(check2.isVisible()==true) {
				check2.setText("");
				check2.setVisible(false);
				x2.setVisible(false);
				check2.setSelected(false);
			} else {
			}
			}
		});
	    
	    x3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(check3.isVisible()==true) {
				check3.setText("");
				check3.setVisible(false);
				x3.setVisible(false);
				check3.setSelected(false);
			} else {
			}
			}
		});
	   
	    x4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(check4.isVisible()==true) {
				check4.setText("");
				check4.setVisible(false);
				x4.setVisible(false);
				check4.setSelected(false);
			} else {
			}
			}
		});
	    
	    x5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(check5.isVisible()==true) {
				check5.setText("");
				check5.setVisible(false);
				x5.setVisible(false);
				check5.setSelected(false);
			} else {
			}
			}
		});
	    
	    x6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(check6.isVisible()==true) {
				check6.setText("");
				check6.setVisible(false);
				x6.setVisible(false);
				check6.setSelected(false);
			} else {
			}
			}
		});
	    
	    x7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(check7.isVisible()==true) {
				check7.setText("");
				check7.setVisible(false);
				x7.setVisible(false);
				check7.setSelected(false);
			} else {
			}
			}
		});
	    
	    x8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(check8.isVisible()==true) {
				check8.setText("");
				check8.setVisible(false);
				x8.setVisible(false);
				check8.setSelected(false);
			} else {
			}
			}
		});
	  //-------------------------------------------			
	    JPanel painel_banner = new JPanel();
	    painel_banner.setLayout(null);
	    painel_banner.setBounds(920, 15, 276, 275);
	    painel_banner.setBackground(new Color(36,44,134, 128)); // alpha
		add(painel_banner);
		
		JLabel badge_id_1 = new JLabel("");
		badge_id_1.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
		badge_id_1.setBounds(10, 40, 28, 28);
		painel_banner.add(badge_id_1);
		
		JLabel lbl_simulados_resolvidos_1_1 = new JLabel("Metas");
		lbl_simulados_resolvidos_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_simulados_resolvidos_1_1.setForeground(Color.WHITE);
		lbl_simulados_resolvidos_1_1.setFont(new Font("Poppins", Font.BOLD, 16));
		lbl_simulados_resolvidos_1_1.setBounds(8, 0, 80, 36);
		painel_banner.add(lbl_simulados_resolvidos_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Conclua um Simulado   ");
		lblNewLabel_5.setBackground(new Color(64, 74, 204));
		lblNewLabel_5.setForeground(new Color(192, 192, 192));
		lblNewLabel_5.setBounds(47, 40, 150, 27);
		painel_banner.add(lblNewLabel_5);
		
		JLabel badge_id_1_1 = new JLabel("");
		badge_id_1_1.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
		badge_id_1_1.setBounds(10, 80, 28, 28);
		painel_banner.add(badge_id_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Exemplo de meta 2");
		lblNewLabel_5_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1.setBackground(new Color(64, 74, 204));
		lblNewLabel_5_1.setBounds(47, 80, 150, 27);
		painel_banner.add(lblNewLabel_5_1);
		
		JLabel badge_id_1_1_1 = new JLabel("");
		badge_id_1_1_1.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
		badge_id_1_1_1.setBounds(10, 120, 28, 28);
		painel_banner.add(badge_id_1_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Exemplo de meta 3");
		lblNewLabel_5_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1_1.setBackground(new Color(64, 74, 204));
		lblNewLabel_5_1_1.setBounds(47, 120, 150, 27);
		painel_banner.add(lblNewLabel_5_1_1);
		
		JLabel badge_id_1_1_1_1 = new JLabel("");
		badge_id_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
		badge_id_1_1_1_1.setBounds(10, 160, 28, 28);
		painel_banner.add(badge_id_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Exemplo de meta 4");
		lblNewLabel_5_1_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1_1_1.setBackground(new Color(64, 74, 204));
		lblNewLabel_5_1_1_1.setBounds(47, 160, 150, 27);
		painel_banner.add(lblNewLabel_5_1_1_1);
		
		JLabel badge_id_1_1_1_1_1 = new JLabel("");
		badge_id_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
		badge_id_1_1_1_1_1.setBounds(10, 200, 28, 28);
		painel_banner.add(badge_id_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("Exemplo de meta 5");
		lblNewLabel_5_1_1_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1_1_1_1.setBackground(new Color(64, 74, 204));
		lblNewLabel_5_1_1_1_1.setBounds(47, 200, 150, 27);
		painel_banner.add(lblNewLabel_5_1_1_1_1);
		
		JLabel badge_id_1_1_1_1_1_1 = new JLabel("");
		badge_id_1_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
		badge_id_1_1_1_1_1_1.setBounds(10, 240, 28, 28);
		painel_banner.add(badge_id_1_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1 = new JLabel("Exemplo de meta 6");
		lblNewLabel_5_1_1_1_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1_1_1_1_1.setBackground(new Color(64, 74, 204));
		lblNewLabel_5_1_1_1_1_1.setBounds(47, 240, 150, 27);
		painel_banner.add(lblNewLabel_5_1_1_1_1_1);
		
		
		// SIDEBAR - INICIO
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
		btnPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil.setHorizontalAlignment(SwingConstants.LEFT);
		btnPerfil.setFocusPainted(false);
		btnPerfil.setOpaque(false);
		btnPerfil.setContentAreaFilled(false);
		btnPerfil.setBorderPainted(false);
		btnPerfil.setForeground(Color.BLACK);
		btnPerfil.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnPerfil.setBounds(10, 140, 110, 19);
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
		
		JButton btnQR = new JButton("Questões Resolvidas");
		btnQR.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQR.setHorizontalAlignment(SwingConstants.LEFT);
		btnQR.setOpaque(false);
		btnQR.setForeground(Color.BLACK);
		btnQR.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnQR.setFocusPainted(false);
		btnQR.setContentAreaFilled(false);
		btnQR.setBorderPainted(false);
		btnQR.setBounds(10, 190, 210, 19);
		Sidebar.add(btnQR);
		
		JButton btnSR = new JButton("Simulados Resolvidos");
		btnSR.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSR.setOpaque(false);
		btnSR.setHorizontalAlignment(SwingConstants.LEFT);
		btnSR.setForeground(Color.BLACK);
		btnSR.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnSR.setFocusPainted(false);
		btnSR.setContentAreaFilled(false);
		btnSR.setBorderPainted(false);
		btnSR.setBounds(10, 215, 210, 19);
		Sidebar.add(btnSR);
		
		JButton btnConfig = new JButton("Configurações");
		btnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfig.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfig.setOpaque(false);
		btnConfig.setForeground(Color.BLACK);
		btnConfig.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnConfig.setFocusPainted(false);
		btnConfig.setContentAreaFilled(false);
		btnConfig.setBorderPainted(false);
		btnConfig.setBounds(10, 240, 173, 19);
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
		btnMenu.setBackground(new Color(98, 106, 204));
		btnMenu.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu.setForeground(Color.WHITE);
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
		

		
		
		// SIDEBAR - FIM
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(36, 44, 134));
		panel_1.setBounds(320, 361, 276, 320);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnIniciarResolvidos = new JButton("INICIAR");
		btnIniciarResolvidos.setBorderPainted(false);
		btnIniciarResolvidos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarResolvidos.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnIniciarResolvidos.setForeground(Color.WHITE);
		btnIniciarResolvidos.setBackground(new Color(64, 74, 204));
		btnIniciarResolvidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIniciarResolvidos.setBounds(84, 250, 116, 36);
		panel_1.add(btnIniciarResolvidos);
		
		JLabel lbl_simulados_resolvidos = new JLabel("GABARITOS");
		lbl_simulados_resolvidos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lbl_simulados_resolvidos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_simulados_resolvidos.setFont(new Font("Poppins", Font.PLAIN, 16));
		lbl_simulados_resolvidos.setForeground(new Color(255, 255, 255));
		lbl_simulados_resolvidos.setBounds(10, 165, 260, 36);
		panel_1.add(lbl_simulados_resolvidos);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\tela_inicial\\gabaritos.png"));
		lblNewLabel.setBounds(0, 0, 277, 125);
		panel_1.add(lblNewLabel);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(new Color(98, 106, 204));
		panel_3_3.setBounds(0, 125, 277, 10);
		panel_1.add(panel_3_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(36, 44, 134));
		panel_1_1.setBounds(620, 361, 276, 320);
		add(panel_1_1);
		
		JButton btnIniciarSimulados = new JButton("INICIAR");
		btnIniciarSimulados.setForeground(Color.WHITE);
		btnIniciarSimulados.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnIniciarSimulados.setBorderPainted(false);
		btnIniciarSimulados.setBackground(new Color(64, 74, 204));
		btnIniciarSimulados.setBounds(84, 250, 116, 36);
		panel_1_1.add(btnIniciarSimulados);
		
//		btnIniciarSimulados.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				EscolhaSimulado a = new EscolhaSimulado();
//				removeAll();
//				add(a);
//				revalidate();
//				repaint();
//			}
//		});
		
		JLabel lbl_simulados = new JLabel("SIMULADOS");
		lbl_simulados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_simulados.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_simulados.setForeground(new Color(255, 255, 255));
		lbl_simulados.setFont(new Font("Poppins", Font.PLAIN, 16));
		lbl_simulados.setBounds(10, 165, 260, 36);
		panel_1_1.add(lbl_simulados);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\tela_inicial\\simulados.png"));
		lblNewLabel_3.setBounds(0, 0, 276, 126);
		panel_1_1.add(lblNewLabel_3);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setBackground(new Color(98, 106, 204));
		panel_3_3_1.setBounds(0, 125, 277, 10);
		panel_1_1.add(panel_3_3_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(36, 44, 134));
		panel_1_1_1.setBounds(920, 361, 276, 320);
		add(panel_1_1_1);
		
		JButton btnIniciarExercicios = new JButton("INICIAR");
		btnIniciarExercicios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarExercicios.setForeground(Color.WHITE);
		btnIniciarExercicios.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnIniciarExercicios.setBorderPainted(false);
		btnIniciarExercicios.setBackground(new Color(64, 74, 204));
		btnIniciarExercicios.setBounds(84, 250, 116, 36);
		panel_1_1_1.add(btnIniciarExercicios);
		
		JLabel lbl_exercicios = new JLabel("EXERCÍCIOS");
		lbl_exercicios.setBackground(new Color(36, 44, 134));
		lbl_exercicios.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_exercicios.setForeground(new Color(255, 255, 255));
		lbl_exercicios.setFont(new Font("Poppins", Font.PLAIN, 16));
		lbl_exercicios.setBounds(10, 165, 260, 36);
		panel_1_1_1.add(lbl_exercicios);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\tela_inicial\\exercicios.png"));
		lblNewLabel_4.setBounds(0, 0, 277, 125);
		panel_1_1_1.add(lblNewLabel_4);
		
		JPanel panel_3_3_2 = new JPanel();
		panel_3_3_2.setBackground(new Color(98, 106, 204));
		panel_3_3_2.setBounds(0, 125, 277, 10);
		panel_1_1_1.add(panel_3_3_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\tela_inicial\\slider_banner.png"));
		lblNewLabel_2.setBounds(260, 0, 1020, 319);
		add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(98, 106, 204));
		panel.setBounds(260, 317, 1020, 10);
		add(panel);

	}
}
