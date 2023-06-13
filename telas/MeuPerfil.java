package estuda;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
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
			
			JPanel panel_1_1_1 = new JPanel();
			panel_1_1_1.setBackground(new Color(36, 44, 134));
			panel_1_1_1.setBounds(588, 115, 422, 594);
			panel_2.add(panel_1_1_1);
			panel_1_1_1.setLayout(null);
			
			// Simualdos Array Pane	
			
			// TODO: 1. Criar um painel para exibir os simulados
			// TODO: 2. Configurar o painel dos simulados
			// TODO: 3. Criar um campo de texto para entrada de dados
			// TODO: 4. Configurar o campo de texto
			// TODO: 5. Criar um botão de adicionar
			// TODO: 6. Configurar o botão de adicionar
			// TODO: 7. Criar arrays para as checkboxes e botões de delete
			// TODO: 8. Definir variáveis para posição Y inicial e distância entre checkboxes
			// TODO: 9. Criar um loop para criar as checkboxes e botões de delete
			// TODO: 10. Configurar as checkboxes e botões de delete
			// TODO: 11. Adicionar ações aos botões de delete
			// TODO: 12. Adicionar ação ao botão de adicionar

			// TODO: 1. Criar um painel para exibir os simulados
			JPanel SimuladosArrayPane_1 = new JPanel();
			
						// TODO: 2. Configurar o painel dos simulados
						SimuladosArrayPane_1.setBounds(0, 78, 422, 470);
						SimuladosArrayPane_1.setLayout(null);
						SimuladosArrayPane_1.setBackground(new Color(192, 192, 192));
						panel_1_1_1.add(SimuladosArrayPane_1);
			
			JLabel lblNewLabel_3 = new JLabel("Simulados");
			lblNewLabel_3.setBounds(0, 0, 422, 40);
			panel_1_1_1.add(lblNewLabel_3);
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setFont(new Font("Poppins", Font.PLAIN, 18));
			lblNewLabel_3.setForeground(new Color(255, 255, 255));

			// TODO: 3. Criar um campo de texto para entrada de dados
			JTextField txtTeste = new JTextField();
			txtTeste.setText("Teste");

			// TODO: 4. Configurar o campo de texto
			txtTeste.setBorder(new LineBorder(new Color(255, 255, 255)));
			txtTeste.setForeground(new Color(255, 255, 255));
			txtTeste.setOpaque(false);
			txtTeste.setBackground(Color.WHITE);
			txtTeste.setBounds(8, 34, 328, 33);
			panel_1_1_1.add(txtTeste);
			txtTeste.setColumns(10);

			// TODO: 5. Criar um botão de adicionar
			JButton btnAdd = new JButton("+");

			// TODO: 6. Configurar o botão de adicionar
			btnAdd.setFocusPainted(false);
			btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnAdd.setBorderPainted(false);
			btnAdd.setBackground(new Color(64, 74, 204));
			btnAdd.setForeground(new Color(255, 255, 255));
			btnAdd.setFont(new Font("Poppins", Font.BOLD, 12));
			btnAdd.setBounds(346, 34, 66, 33);
			panel_1_1_1.add(btnAdd);

			// TODO: 7. Criar arrays para as checkboxes e botões de delete
			JPanel[] SimPanel = new JPanel[5];
			JButton[] GabaritoBtn = new JButton[5];

			// TODO: 8. Definir variáveis para posição Y inicial e distância entre checkboxes
			int startY = 0;
			int yDistance = 25;

			// TODO: 9. Criar um loop para criar as checkboxes e botões de delete
			for (int i = 0; i < 5; i++) {
			    // TODO: 10. Configurar as checkboxes e botões de delete
			    SimPanel[i] = new JPanel();
			    SimPanel[i].setFocusable(false);
			    SimPanel[i].setOpaque(false);
			    SimPanel[i].setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			    SimPanel[i].setFont(new Font("Poppins", Font.PLAIN, 11));
			    SimPanel[i].setForeground(Color.WHITE);
			    SimPanel[i].setBackground(new Color(36, 44, 136));
			    SimPanel[i].setBounds(8, startY + i * yDistance, 399, 23);
			    SimPanel[i].setVisible(false);
			    panel_1_1_1.add(SimPanel[i]);

			    GabaritoBtn[i] = new JButton("x");
			    GabaritoBtn[i].setFocusPainted(false);
			    GabaritoBtn[i].setFont(new Font("Poppins", Font.PLAIN, 11));
			    GabaritoBtn[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			    GabaritoBtn[i].setContentAreaFilled(false);
			    GabaritoBtn[i].setBorderPainted(false);
			    GabaritoBtn[i].setForeground(Color.WHITE);
			    GabaritoBtn[i].setBounds(413, startY + i * yDistance, 47, 23);
			    GabaritoBtn[i].setVisible(false);
			    panel_1_1_1.add(GabaritoBtn[i]);
			
			    }

			// TODO: 12. Adicionar ação ao botão de adicionar
			btnAdd.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        String textFieldText = txtTeste.getText();
			        if (!textFieldText.isEmpty()) {
			            int index = -1;

			            for (int i = 0; i < 5; i++) {
			                if (!SimPanel[i].isVisible()) {
			                    index = i;
			                    break;
			                }
			            }

			            if (index == -1) {
			                index = 5 - 1;
			            }

			            if (index < 5 - 1 && SimPanel[index + 1].isVisible()) {
			                for (int j = 5 - 2; j >= index; j--) {
			                   // SimPanel[j + 1].setText(SimPanel[j].getText());
			                    SimPanel[j + 1].setVisible(SimPanel[j].isVisible());
			                    SimPanel[j].setVisible(false);
			                    GabaritoBtn[j + 1].setVisible(GabaritoBtn[j].isVisible());
			                    GabaritoBtn[j].setVisible(false);
			                }
			            }

			            //SimPanel[index].setText(textFieldText);
			            SimPanel[index].setVisible(true);
			            GabaritoBtn[index].setVisible(true);

			            txtTeste.setText("");
			        }
			    }
			});

			
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
