package estuda;

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
	private JLabel titleLabel;
    private JButton btnAdd;
	private JPanel checkBoxPanel;
	
	private final int MAX_CHECKBOXES = 8;
	private JCheckBox[] checkboxes;
	private JButton[] deleteButtons;

	/**
	 * Create the panel.
	 */
	public TelaInicial() {
		setBackground(new Color(250, 250, 250));
		setLayout(null);
		setBounds(0, 0, 1280, 720);
	    
	    
	    JPanel IntroPainel = new JPanel();
	    IntroPainel.setLayout(null);
	    IntroPainel.setBackground(new Color(36, 44, 134, 128));
	    IntroPainel.setBounds(920, 166, 276, 127);
	    add(IntroPainel);
	    
	    JLabel badge_id_1_1 = new JLabel("");
	    badge_id_1_1.setBounds(15, 40, 28, 28);
	    IntroPainel.add(badge_id_1_1);
	    
	    JLabel lblIntrodução = new JLabel("Como funciona a plataforma?");
	    lblIntrodução.setHorizontalAlignment(SwingConstants.LEFT);
	    lblIntrodução.setForeground(Color.WHITE);
	    lblIntrodução.setFont(new Font("Poppins", Font.BOLD, 16));
	    lblIntrodução.setBounds(8, 0, 258, 36);
	    IntroPainel.add(lblIntrodução);
	    
	    JLabel Meta3_2 = new JLabel("Introdução de como usar a plataforma.");
	    Meta3_2.setHorizontalAlignment(SwingConstants.CENTER);
	    Meta3_2.setForeground(Color.LIGHT_GRAY);
	    Meta3_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
	    Meta3_2.setBackground(new Color(64, 74, 204));
	    Meta3_2.setBounds(10, 32, 256, 45);
	    IntroPainel.add(Meta3_2);
	    
	    JButton btnIniciarGabaritos_1_2 = new JButton("INICIAR META");
	    btnIniciarGabaritos_1_2.setForeground(Color.WHITE);
	    btnIniciarGabaritos_1_2.setFont(new Font("Poppins", Font.PLAIN, 16));
	    btnIniciarGabaritos_1_2.setBorderPainted(false);
	    btnIniciarGabaritos_1_2.setBackground(new Color(64, 74, 204));
	    btnIniciarGabaritos_1_2.setBounds(51, 74, 180, 36);
	    IntroPainel.add(btnIniciarGabaritos_1_2);
	
	    JPanel MetasPainel = new JPanel();
	    MetasPainel.setLayout(null);
	    MetasPainel.setBounds(920, 15, 276, 140);
	    MetasPainel.setBackground(new Color(36,44,134, 128)); // alpha
		add(MetasPainel);
		
		JLabel badge_id_1 = new JLabel("");
		badge_id_1.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
		badge_id_1.setBounds(18, 34, 28, 28);
		MetasPainel.add(badge_id_1);
		
		JLabel lbl_simulados_resolvidos_1_1 = new JLabel("Metas");
		lbl_simulados_resolvidos_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_simulados_resolvidos_1_1.setForeground(Color.WHITE);
		lbl_simulados_resolvidos_1_1.setFont(new Font("Poppins", Font.BOLD, 16));
		lbl_simulados_resolvidos_1_1.setBounds(8, 0, 80, 36);
		MetasPainel.add(lbl_simulados_resolvidos_1_1);
		
		JLabel Meta1 = new JLabel("Complete um Simulado                  0/1");
		Meta1.setBackground(new Color(64, 74, 204));
		Meta1.setForeground(new Color(192, 192, 192));
		Meta1.setBounds(55, 35, 219, 27);
		MetasPainel.add(Meta1);
		
		JLabel Meta3 = new JLabel("Faça seu primeiro simulado dentro da plataforma.");
		Meta3.setHorizontalAlignment(SwingConstants.CENTER);
		Meta3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Meta3.setForeground(Color.LIGHT_GRAY);
		Meta3.setBackground(new Color(64, 74, 204));
		Meta3.setBounds(14, 60, 256, 28);
		MetasPainel.add(Meta3);
		
		JButton btnIniciarGabaritos_1 = new JButton("INICIAR META");
		btnIniciarGabaritos_1.setForeground(Color.WHITE);
		btnIniciarGabaritos_1.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnIniciarGabaritos_1.setBorderPainted(false);
		btnIniciarGabaritos_1.setBackground(new Color(64, 74, 204));
		btnIniciarGabaritos_1.setBounds(50, 93, 180, 36);
		MetasPainel.add(btnIniciarGabaritos_1);
		
	    JButton btnHide = new JButton("");
	    btnHide.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {	    		
	    		  
	    		        if (IntroPainel.isVisible() || MetasPainel.isVisible()) {
	    		            IntroPainel.setVisible(false);
	    		            MetasPainel.setVisible(false);
	    		            btnHide.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\assets\\hide.png"));
	    		        } else {
	    		            IntroPainel.setVisible(true);
	    		            MetasPainel.setVisible(true);
	    		            btnHide.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\assets\\reveal.png"));
	    		        }
	    		    }
	    		});	    		

	    btnHide.setContentAreaFilled(false);
	    btnHide.setBorderPainted(false);
	    btnHide.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\assets\\reveal.png"));
	    btnHide.setBounds(1220, 15, 28, 28);
	    add(btnHide);
	 
		
		
		
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
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						MeuPerfil mp = new MeuPerfil();
						removeAll();
						add(mp);
						revalidate();
						repaint();							
			}
		});
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
		
		JButton btnConfig = new JButton("Configurações");
		btnConfig.setMargin(new Insets(2, 12, 2, 14));
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Config cf = new Config();
				removeAll();
				add(cf);
				revalidate();
				repaint();	
			}
		});
		btnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfig.setHorizontalAlignment(SwingConstants.LEFT);
		btnConfig.setOpaque(false);
		btnConfig.setForeground(Color.BLACK);
		btnConfig.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnConfig.setFocusPainted(false);
		btnConfig.setContentAreaFilled(false);
		btnConfig.setBorderPainted(false);
		btnConfig.setBounds(10, 165, 173, 19);
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
		
		JButton btnIniciarSimulados = new JButton("INICIAR");
		btnIniciarSimulados.setBorderPainted(false);
		btnIniciarSimulados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarSimulados.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnIniciarSimulados.setForeground(Color.WHITE);
		btnIniciarSimulados.setBackground(new Color(64, 74, 204));
		btnIniciarSimulados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscolhaSimulado es = new EscolhaSimulado();
				removeAll();
				add(es);
				revalidate();
				repaint();
			}
		});
		btnIniciarSimulados.setBounds(84, 250, 116, 36);
		panel_1.add(btnIniciarSimulados);
		
		JLabel lbl_simulados_resolvidos = new JLabel("SIMULADOS");
		lbl_simulados_resolvidos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lbl_simulados_resolvidos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_simulados_resolvidos.setFont(new Font("Poppins", Font.PLAIN, 16));
		lbl_simulados_resolvidos.setForeground(new Color(255, 255, 255));
		lbl_simulados_resolvidos.setBounds(10, 165, 260, 36);
		panel_1.add(lbl_simulados_resolvidos);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\tela_inicial\\simulados.png"));
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
		
		JButton btnIniciarDesempenho = new JButton("INICIAR");
		btnIniciarDesempenho.setForeground(Color.WHITE);
		btnIniciarDesempenho.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnIniciarDesempenho.setBorderPainted(false);
		btnIniciarDesempenho.setBackground(new Color(64, 74, 204));
		btnIniciarDesempenho.setBounds(84, 250, 116, 36);
		panel_1_1.add(btnIniciarDesempenho);
		
		btnIniciarDesempenho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeuPerfil mp = new MeuPerfil();
				removeAll();
				add(mp);
				revalidate();
				repaint();
			}
		});
		
		JLabel lbl_simulados = new JLabel("MEU PERFIL");
		lbl_simulados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_simulados.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_simulados.setForeground(new Color(255, 255, 255));
		lbl_simulados.setFont(new Font("Poppins", Font.PLAIN, 16));
		lbl_simulados.setBounds(10, 165, 260, 36);
		panel_1_1.add(lbl_simulados);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\tela_inicial\\gabaritos.png"));
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
		
		JButton btnIniciarAmigos = new JButton("INICIAR");
		btnIniciarAmigos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Config c = new Config();
				removeAll();
				add(c);
				revalidate();
				repaint();				
			}
		});
		btnIniciarAmigos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarAmigos.setForeground(Color.WHITE);
		btnIniciarAmigos.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnIniciarAmigos.setBorderPainted(false);
		btnIniciarAmigos.setBackground(new Color(64, 74, 204));
		btnIniciarAmigos.setBounds(84, 250, 116, 36);
		panel_1_1_1.add(btnIniciarAmigos);
		
		JLabel lbl_exercicios = new JLabel("CONFIGURAÇÕES");
		lbl_exercicios.setBackground(new Color(36, 44, 134));
		lbl_exercicios.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_exercicios.setForeground(new Color(255, 255, 255));
		lbl_exercicios.setFont(new Font("Poppins", Font.PLAIN, 16));
		lbl_exercicios.setBounds(0, 165, 277, 36);
		panel_1_1_1.add(lbl_exercicios);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\tela_inicial\\exercicios.png"));
		lblNewLabel_4.setBounds(0, 0, 277, 125);
		panel_1_1_1.add(lblNewLabel_4);
		
		JPanel panel_3_3_2 = new JPanel();
		panel_3_3_2.setBackground(new Color(98, 106, 204));
		panel_3_3_2.setBounds(0, 125, 277, 10);
		panel_1_1_1.add(panel_3_3_2);
		
		JPanel LembretesAdicionados = new JPanel();
		LembretesAdicionados.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		LembretesAdicionados.setBackground(new Color(36,44,134));
		LembretesAdicionados.setBounds(320, 15, 460, 278);
		add(LembretesAdicionados);
		LembretesAdicionados.setLayout(null);
		
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
		
		// Lembretes em Array	   
   	 
	    JLabel lblNewLabel_1 = new JLabel("Lembretes");
	    lblNewLabel_1.setForeground(new Color(255, 255, 255));
	    lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 16));
	    lblNewLabel_1.setBounds(8, 8, 110, 17);
	    LembretesAdicionados.add(lblNewLabel_1);
	    
	    textField = new JTextField();
	    textField.setBorder(new LineBorder(new Color(255, 255, 255)));
	    textField.setForeground(new Color(255, 255, 255));
	    textField.setOpaque(false);
	    textField.setBackground(Color.WHITE);
	    textField.setBounds(8, 34, 328, 33);
	    LembretesAdicionados.add(textField);
	    textField.setColumns(10);
	    
	    JButton btnAdd = new JButton("Adicionar");
	    btnAdd.setFocusPainted(false);
	    btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    btnAdd.setBorderPainted(false);
	    btnAdd.setBackground(new Color(64, 74, 204));
	    btnAdd.setForeground(new Color(255, 255, 255));
	    btnAdd.setFont(new Font("Poppins", Font.BOLD, 12));
	    btnAdd.setBounds(346, 34, 106, 33);
	    LembretesAdicionados.add(btnAdd);
	    
	    checkBoxPanel = new JPanel();
	    checkBoxPanel.setBounds(0, 78, 460, 200);
	    LembretesAdicionados.add(checkBoxPanel);
	    checkBoxPanel.setLayout(null);
	    checkBoxPanel.setBackground(new Color(36, 44, 136));
        
        // Variables Checkboxes e Delete Button com referencia ao MAX_CHECKBOXES = 8;

        checkboxes = new JCheckBox[MAX_CHECKBOXES];
        deleteButtons = new JButton[MAX_CHECKBOXES];
        
        
        int startY = 0;        
        int yDistance = 25;
            // int startY - Referente a posição Y da Checkboxes e do Delete.
            // int yDistance - Referente a distancia de uma checkbox da outra.
        
        for (int i = 0; i < MAX_CHECKBOXES; i++) {    // FOR i < que o numero maximo de checkboxes então adicionar +1 checkbox
            checkboxes[i] = new JCheckBox();
            checkboxes[i].setFocusPainted(false);
            checkboxes[i].setOpaque(false);
            checkboxes[i].setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            checkboxes[i].setContentAreaFilled(false);
            checkboxes[i].setFont(new Font("Poppins", Font.PLAIN, 11));
            checkboxes[i].setForeground(Color.WHITE);
            checkboxes[i].setBackground(new Color(36, 44, 136));
            checkboxes[i].setBounds(8, startY + i * yDistance, 399, 23); 
            // SetBounds = '8' referente ao X, Y depende da variable 'startY + i * 25', exemplo 0 + 1 * 25 = posição 25, 0 + 2*25 = posição 50.          
            // '399, 23' tamanho da checkbox.
            checkboxes[i].setVisible(false);
            checkBoxPanel.add(checkboxes[i]);

            deleteButtons[i] = new JButton("x");
            deleteButtons[i].setFocusPainted(false);
            deleteButtons[i].setFont(new Font("Poppins", Font.PLAIN, 11));
            deleteButtons[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            deleteButtons[i].setContentAreaFilled(false);
            deleteButtons[i].setBorderPainted(false);
            deleteButtons[i].setForeground(Color.WHITE);
            deleteButtons[i].setBounds(413, startY + i * yDistance, 47, 23);
            // SetBounds = '413' referente ao X, Y depende da variable 'startY + i * 25', exemplo 0 + 1 * 25 = posição 25, 0 + 2*25 = posição 50.        
            deleteButtons[i].setVisible(false);
            checkBoxPanel.add(deleteButtons[i]);

            final int index = i;
            deleteButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checkboxes[index].setVisible(false);
                    deleteButtons[index].setVisible(false);
                    // Quando clicado o botão delete = checkboxes e deleteButtons tem setVisible falso.

                    for (int j = index + 1; j < MAX_CHECKBOXES; j++) { // J = numero de checkboxes, se J for menor que 8, J++ 
                        checkboxes[j - 1].setText(checkboxes[j].getText()); 
                        checkboxes[j - 1].setVisible(checkboxes[j].isVisible());
                        checkboxes[j].setVisible(false);
                        deleteButtons[j - 1].setVisible(deleteButtons[j].isVisible());
                        deleteButtons[j].setVisible(false);
                    }
                }
            });       
            

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textFieldText = textField.getText();
                if (!textFieldText.isEmpty()) {
                    int index = -1;

                    for (int i = 0; i < MAX_CHECKBOXES; i++) {
                        if (!checkboxes[i].isVisible()) {
                            index = i;
                            break;
                        }
                    }

                    if (index == -1) {
                        index = MAX_CHECKBOXES - 1;
                    }

                    if (index < MAX_CHECKBOXES - 1 && checkboxes[index + 1].isVisible()) {
                        for (int j = MAX_CHECKBOXES - 2; j >= index; j--) {
                            checkboxes[j + 1].setText(checkboxes[j].getText());
                            checkboxes[j + 1].setVisible(checkboxes[j].isVisible());
                            checkboxes[j].setVisible(false);
                            deleteButtons[j + 1].setVisible(deleteButtons[j].isVisible());
                            deleteButtons[j].setVisible(false);
                        }
                    }

                    checkboxes[index].setText(textFieldText);
                    checkboxes[index].setVisible(true);
                    deleteButtons[index].setVisible(true);

                    textField.setText("");
                }
            }
        });
	  //-------------------------------------------				

	}
  }
}
