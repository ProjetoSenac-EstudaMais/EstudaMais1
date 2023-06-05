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
		
		JLabel Meta1 = new JLabel("Exemplo de meta 1");
		Meta1.setBackground(new Color(64, 74, 204));
		Meta1.setForeground(new Color(192, 192, 192));
		Meta1.setBounds(47, 40, 150, 27);
		painel_banner.add(Meta1);
		
		JLabel badge_id_2 = new JLabel("");
		badge_id_2.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id3.png"));
		badge_id_2.setBounds(10, 80, 28, 28);
		painel_banner.add(badge_id_2);
		
		JLabel Meta2 = new JLabel("Exemplo de meta 2");
		Meta2.setForeground(Color.LIGHT_GRAY);
		Meta2.setBackground(new Color(64, 74, 204));
		Meta2.setBounds(47, 80, 150, 27);
		painel_banner.add(Meta2);
		
		JLabel badge_id_3 = new JLabel("");
		badge_id_3.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
		badge_id_3.setBounds(10, 120, 28, 28);
		painel_banner.add(badge_id_3);
		
		JLabel Meta3 = new JLabel("Exemplo de meta 3");
		Meta3.setForeground(Color.LIGHT_GRAY);
		Meta3.setBackground(new Color(64, 74, 204));
		Meta3.setBounds(47, 120, 150, 27);
		painel_banner.add(Meta3);
		
		JLabel badge_id_4 = new JLabel("");
		badge_id_4.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id3.png"));
		badge_id_4.setBounds(10, 160, 28, 28);
		painel_banner.add(badge_id_4);
		
		JLabel Meta4 = new JLabel("Exemplo de meta 4");
		Meta4.setForeground(Color.LIGHT_GRAY);
		Meta4.setBackground(new Color(64, 74, 204));
		Meta4.setBounds(47, 160, 150, 27);
		painel_banner.add(Meta4);
		
		JLabel badge_id_5 = new JLabel("");
		badge_id_5.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id1.png"));
		badge_id_5.setBounds(10, 200, 28, 28);
		painel_banner.add(badge_id_5);
		
		JLabel Meta5 = new JLabel("Exemplo de meta 5");
		Meta5.setForeground(Color.LIGHT_GRAY);
		Meta5.setBackground(new Color(64, 74, 204));
		Meta5.setBounds(47, 200, 150, 27);
		painel_banner.add(Meta5);
		
		JLabel badge_id_6 = new JLabel("");
		badge_id_6.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\badge\\badge_id3.png"));
		badge_id_6.setBounds(10, 240, 28, 28);
		painel_banner.add(badge_id_6);
		
		JLabel Meta6 = new JLabel("Exemplo de meta 6");
		Meta6.setForeground(Color.LIGHT_GRAY);
		Meta6.setBackground(new Color(64, 74, 204));
		Meta6.setBounds(47, 240, 150, 27);
		painel_banner.add(Meta6);
		
		
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
		icon_user.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\icons\\chuu.png"));
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
		
		JLabel lbl_simulados_resolvidos = new JLabel("MEU DESEMPENHO");
		lbl_simulados_resolvidos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lbl_simulados_resolvidos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_simulados_resolvidos.setFont(new Font("Poppins", Font.PLAIN, 16));
		lbl_simulados_resolvidos.setForeground(new Color(255, 255, 255));
		lbl_simulados_resolvidos.setBounds(10, 165, 260, 36);
		panel_1.add(lbl_simulados_resolvidos);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\tela_inicial\\exercicios.png"));
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
		
		btnIniciarSimulados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscolhaSimulado a = new EscolhaSimulado();
				removeAll();
				add(a);
				revalidate();
				repaint();
			}
		});
		
		JLabel lbl_simulados = new JLabel("GABARITOS");
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
		
		JButton btnIniciarExercicios = new JButton("INICIAR");
		btnIniciarExercicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EscolhaSimulado es = new EscolhaSimulado();
				removeAll();
				add(es);
				revalidate();
				repaint();
			}
		});
		btnIniciarExercicios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarExercicios.setForeground(Color.WHITE);
		btnIniciarExercicios.setFont(new Font("Poppins", Font.PLAIN, 16));
		btnIniciarExercicios.setBorderPainted(false);
		btnIniciarExercicios.setBackground(new Color(64, 74, 204));
		btnIniciarExercicios.setBounds(84, 250, 116, 36);
		panel_1_1_1.add(btnIniciarExercicios);
		
		JLabel lbl_exercicios = new JLabel("SIMULADOS\r\n");
		lbl_exercicios.setBackground(new Color(36, 44, 134));
		lbl_exercicios.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_exercicios.setForeground(new Color(255, 255, 255));
		lbl_exercicios.setFont(new Font("Poppins", Font.PLAIN, 16));
		lbl_exercicios.setBounds(0, 165, 277, 36);
		panel_1_1_1.add(lbl_exercicios);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\henri\\OneDrive\\Área de Trabalho\\img\\img_telas\\tela_inicial\\simulados.png"));
		lblNewLabel_4.setBounds(0, 0, 277, 125);
		panel_1_1_1.add(lblNewLabel_4);
		
		JPanel panel_3_3_2 = new JPanel();
		panel_3_3_2.setBackground(new Color(98, 106, 204));
		panel_3_3_2.setBounds(0, 125, 277, 10);
		panel_1_1_1.add(panel_3_3_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel_4.setBackground(new Color(36,44,134));
		panel_4.setBounds(320, 15, 460, 278);
		add(panel_4);
		panel_4.setLayout(null);
		
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
	    
	    checkBoxPanel = new JPanel();
	    checkBoxPanel.setBounds(0, 78, 460, 200);
	    panel_4.add(checkBoxPanel);
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
