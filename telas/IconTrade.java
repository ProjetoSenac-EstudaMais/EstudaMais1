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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.time.Period;

public class IconTrade extends JPanel {

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

	private String[] nome_id;
	private String[] sobrenome_id;
	private String[] id_icon;
	private String icon;
	private String[] badge_id;
	private String subtitle_badge;
	private String[] meta_id;
	private String m_title;
	private String m_subtitle;
	private String[] birthdate_user;
	private String id_user;
	static String ii;
	

	private int anoSimu;

	private String dataNormal;

	private String[] id_simu;
	private static int Simu;
	private Date data;


	ImageIcon icon_1 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\chuu.png");
	ImageIcon icon_2 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id1.png");
	ImageIcon icon_3 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id2.png");	
	ImageIcon icon_4 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\icon_id3.png");   
	ImageIcon badge_1 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id1.png");
	ImageIcon badge_2 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id2.png");
	ImageIcon badge_3 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id3.png");		  
	ImageIcon iconperfil_1 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\chuu125.png");
	ImageIcon iconperfil_2 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\id1_125.png");
	ImageIcon iconperfil_3 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\id2_125.png");
	ImageIcon iconperfil_4 = new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\icons\\id3_125.png");

	public IconTrade(String id_user) {
		this.id_user=id_user;

		this.id_simu = DBSimu2(id_user);

		Simu = Integer.parseInt(id_simu[0]);

		setLayout(null);
		setBounds(100,100,1280,720);


		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 720);
		panel.setBackground(new Color(128, 128, 128));
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(36, 46, 134), 5));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(404, 106, 296, 322);
		panel.add(panel_6);
		panel_6.setLayout(null);

		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeuPerfil mp = new MeuPerfil(id_user);
				removeAll();
				add(mp);
				revalidate();
				repaint();
			}
		});
		btnConfirmar.setBounds(152, 263, 119, 48);
		panel_6.add(btnConfirmar);

		JButton btnIcon_Id_1 = new JButton("btnIcon_Id_1");
		btnIcon_Id_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				ConexãoMysql con = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root");
						
				
				String query1 = "UPDATE user_dados SET  id_icon =? WHERE id_user =? ;";
				
				try {
					PreparedStatement pstmt = con.conn.prepareStatement(query1);
					pstmt.setString(1,"1");	
					pstmt.setString(2,id_user);
											
					pstmt.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			con.closeConnection();
				
			}
		});
		btnIcon_Id_1.setBounds(23, 11, 119, 106);
		btnIcon_Id_1.setIcon(icon_1);
		panel_6.add(btnIcon_Id_1);

		JButton btnIcon_Id_2 = new JButton("btnIcon_Id_2");
		btnIcon_Id_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConexãoMysql con = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root");
						
				
				String query1 = "UPDATE user_dados SET  id_icon=? WHERE id_user =? ;";
				
				try {
					PreparedStatement pstmt = con.conn.prepareStatement(query1);
					pstmt.setString(1,"2");	
					pstmt.setString(2,id_user);
											
					pstmt.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			con.closeConnection();
			}
		});
		btnIcon_Id_2.setBounds(152, 11, 119, 106);
		btnIcon_Id_2.setIcon(icon_2);
		panel_6.add(btnIcon_Id_2);

		JButton btnIcon_Id_3 = new JButton("btnIcon_Id_3");
		btnIcon_Id_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConexãoMysql con = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root");
						
				
				String query1 = "UPDATE user_dados SET  id_icon =? WHERE id_user =? ;";
				
				try {
					PreparedStatement pstmt = con.conn.prepareStatement(query1);
					pstmt.setString(1,"3");	
					pstmt.setString(2,id_user);
											
					pstmt.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			con.closeConnection();
			}
		});
		btnIcon_Id_3.setBounds(23, 128, 119, 106);
		btnIcon_Id_3.setIcon(icon_3);
		panel_6.add(btnIcon_Id_3);

		JButton btnIcon_Id_4 = new JButton("btnIcon_Id_4");
		btnIcon_Id_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConexãoMysql con = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root");
						
				
				String query1 = "UPDATE user_dados SET id_icon =? WHERE id_user =? ;";
				
				try {
					PreparedStatement pstmt = con.conn.prepareStatement(query1);
					pstmt.setString(1,"4");	
					pstmt.setString(2,id_user);
											
					pstmt.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			con.closeConnection();
			}
		});
		btnIcon_Id_4.setBounds(152, 128, 119, 106);
		btnIcon_Id_4.setIcon(icon_4);
		panel_6.add(btnIcon_Id_4);


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
		bg_header.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\img_telas\\escolha_simulado\\bg_header.png"));
		bg_header.setBounds(0, 0, 1020, 100);
		panel_3_1.add(bg_header);

		this.nome_id = DB(id_user);
		this.sobrenome_id = DB(id_user);
		this.badge_id = DB(id_user);
		this.birthdate_user = DB(id_user);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Poppins", Font.PLAIN, 17));
		lblNewLabel.setBounds(145, 115, 67, 27);
		panel_2.add(lblNewLabel);

		JLabel primeironome = new JLabel("" + this.nome_id[0]);
		primeironome.setFont(new Font("Poppins", Font.PLAIN, 17));
		primeironome.setBounds(210, 115, 172, 27);
		panel_2.add(primeironome);

		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Poppins", Font.PLAIN, 17));
		lblSobrenome.setBounds(145, 139, 104, 27);
		panel_2.add(lblSobrenome);

		JLabel lblSobrenome_1 = new JLabel("" + this.sobrenome_id[1]);
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
				IconTrade a = new IconTrade(id_user);
				removeAll();
				add(a);
				revalidate();
				repaint();			        
			}
		});

		btnAddIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAddIcon.setContentAreaFilled(false);
		btnAddIcon.setBorderPainted(false);
		btnAddIcon.setOpaque(false);
		btnAddIcon.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\assets\\add.png"));
		btnAddIcon.setBounds(97, 97, 28, 28);
		panel_1.add(btnAddIcon);

		this.id_icon = DB(id_user);

		JLabel IconUser = new JLabel("");
		IconUser.setBorder(new LineBorder(new Color(36, 46, 134), 4));
		IconUser.setIgnoreRepaint(true);
		IconUser.setBounds(0, 0, 125, 125);
		panel_1.add(IconUser);

		if(this.id_icon[5].equals("1")) {
			IconUser.setIcon(iconperfil_1);
		}else if(this.id_icon[5].equals("2")){
			IconUser.setIcon(iconperfil_2);
		}else if(this.id_icon[5].equals("3")){
			IconUser.setIcon(iconperfil_3);
		}else if(this.id_icon[5].equals("4")){
			IconUser.setIcon(iconperfil_4);
		}


		// Painel Simulados

		JPanel PainelSimulados = new JPanel();
		PainelSimulados.setFont(new Font("Poppins", Font.PLAIN, 11));
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

		ArrayList<String[][]> idSimu = DBSimu(this.id_user);


		for (int i = 0; i < Integer.parseInt(ii); i++) {
			System.out.println( idSimu.get(i)[i][0] ); 

			String dataDoBanco = idSimu.get(i)[i][0]; // Data obtida do banco de dados
			SimpleDateFormat formatoBanco = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat formatoNormal = new SimpleDateFormat("dd/MM/yyyy");


			JPanel SimuladoTemplate = new JPanel();
			SimuladoTemplate.setBorder(new LineBorder(new Color(255, 255, 255)));
			SimuladoTemplate.setBackground(new Color(36, 46, 134));
			SimuladoTemplate.setBounds(8, startY + i * (panelHeight + verticalSpacing), 404, panelHeight);
			PainelSimulados.add(SimuladoTemplate);
			SimuladoTemplate.setLayout(null);

			JLabel Nome_Simulado = new JLabel();
			Nome_Simulado.setForeground(new Color(255, 255, 255));
			Nome_Simulado.setFont(new Font("Poppins", Font.PLAIN, 14));
			Nome_Simulado.setBounds(10, 15, 163, 14);
			SimuladoTemplate.add(Nome_Simulado);

			JLabel Data_Simulado = new JLabel();
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

			JLabel Questoes_Gabarito = new JLabel();
			Questoes_Gabarito.setHorizontalAlignment(SwingConstants.CENTER);
			Questoes_Gabarito.setForeground(Color.WHITE);
			Questoes_Gabarito.setFont(new Font("Poppins", Font.PLAIN, 14));
			Questoes_Gabarito.setBounds(281, 20, 73, 14);
			SimuladoTemplate.add(Questoes_Gabarito);

			JLabel icon_Acertos = new JLabel("");
			icon_Acertos.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\assets\\check.png"));
			icon_Acertos.setBounds(364, 14, 28, 28);
			SimuladoTemplate.add(icon_Acertos);

			System.out.println("aqui");

			if (idSimu.get(i)[i][3].equals("1")) {
				anoSimu = 2021;
			} else if (idSimu.get(i)[i][3].equals("2")) {
				anoSimu = 2022;
			}



			try {
				data = formatoBanco.parse(dataDoBanco);
				dataNormal = formatoNormal.format(data);


			} catch (Exception e) {
				e.printStackTrace();
			}

			Nome_Simulado.setText("Simulado: "+anoSimu);
			Data_Simulado.setText(dataNormal);
			Questoes_Gabarito.setText(idSimu.get(i)[i][2] + "/8");

			startY += panelHeight + verticalSpacing;


		}
		int panelHeightTotal = SimuladosQuant * (panelHeight + verticalSpacing) - verticalSpacing;
		PainelSimulados.setPreferredSize(new Dimension(422, panelHeightTotal));
		PainelSimulados.revalidate();


		JLabel lblDataDeNascimento = new JLabel("Idade:");
		lblDataDeNascimento.setFont(new Font("Poppins", Font.PLAIN, 17));
		lblDataDeNascimento.setBounds(145, 164, 56, 27);
		panel_2.add(lblDataDeNascimento);

		// Obtém a data de nascimento fornecida pelo usuário (supondo que esteja no formato "yyyy-MM-dd")
		String dataNascimentoStr = this.birthdate_user[4];

		// Converte a data de nascimento em um objeto LocalDate
		LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

		// Obtém a data atual
		LocalDate dataAtual = LocalDate.now();

		// Calcula a diferença entre a data atual e a data de nascimento
		Period periodo = Period.between(dataNascimento, dataAtual);

		// Obtém a idade em anos
		int idade = periodo.getYears();					

		JLabel idade_id = new JLabel(""+ idade + " anos.");
		idade_id.setFont(new Font("Poppins", Font.PLAIN, 17));
		idade_id.setBounds(205, 164, 104, 27);
		panel_2.add(idade_id);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(36, 44, 134));
		panel_4.setBounds(10, 250, 568, 45);
		panel_2.add(panel_4);
		panel_4.setLayout(null);

		JButton btnAddBadge = new JButton("");
		btnAddBadge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BadgeTrade b = new BadgeTrade(id_user);
				removeAll();
				add(b);
				revalidate();
				repaint();
			}
		});
		btnAddBadge.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\assets\\add.png"));
		btnAddBadge.setOpaque(false);
		btnAddBadge.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAddBadge.setContentAreaFilled(false);
		btnAddBadge.setBorderPainted(false);
		btnAddBadge.setBounds(530, 8, 28, 28);
		panel_4.add(btnAddBadge);

		JLabel badge_trade_icon = new JLabel("");
		badge_trade_icon.setIcon(badge_1);
		badge_trade_icon.setBounds(5, 10, 28, 28);
		panel_4.add(badge_trade_icon);		

		if(this.badge_id[2].equals("1")){
			subtitle_badge = "Novato";
			badge_trade_icon.setIcon(badge_1);
		}else if(this.badge_id[2].equals("2")) {
			subtitle_badge = "Vagabundo";
			badge_trade_icon.setIcon(badge_2);
		}else if(this.badge_id[2].equals("3")) {
			subtitle_badge = "Sem Alma";
			badge_trade_icon.setIcon(badge_3);
		}		

		JLabel lblGabaritouUmSimulado = new JLabel(subtitle_badge);
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

		JLabel lblResumoDoDesempenho = new JLabel("Resumo do Desempenho");
		lblResumoDoDesempenho.setFont(new Font("Poppins", Font.PLAIN, 16));
		lblResumoDoDesempenho.setHorizontalAlignment(SwingConstants.CENTER);
		lblResumoDoDesempenho.setBounds(191, 15, 201, 14);
		panel_5.add(lblResumoDoDesempenho);

		JLabel lblSimuladosFinalizados = new JLabel("Simulados Finalizados");
		lblSimuladosFinalizados.setFont(new Font("Poppins", Font.PLAIN, 16));
		lblSimuladosFinalizados.setBounds(206, 144, 186, 20);
		panel_5.add(lblSimuladosFinalizados);
		
		String infosimu = DBSimuCompleto(id_user);
		
		JLabel id_QntSimuFin = new JLabel(infosimu);
		id_QntSimuFin.setHorizontalAlignment(SwingConstants.CENTER);
		id_QntSimuFin.setFont(new Font("Poppins", Font.PLAIN, 20));
		id_QntSimuFin.setBounds(261, 188, 64, 25);
		panel_5.add(id_QntSimuFin);

		JLabel lblErros = new JLabel("Erros");
		lblErros.setFont(new Font("Poppins", Font.PLAIN, 16));
		lblErros.setBounds(412, 287, 87, 25);
		panel_5.add(lblErros);

		String[] inforesult = DB(id_user);
		
		JLabel id_TempoMedio = new JLabel(inforesult[7]);
		id_TempoMedio.setHorizontalAlignment(SwingConstants.CENTER);
		id_TempoMedio.setFont(new Font("Poppins", Font.PLAIN, 20));
		id_TempoMedio.setBounds(402, 332, 64, 26);
		panel_5.add(id_TempoMedio);
		
		JLabel lblAcertos = new JLabel("Acertos");
		lblAcertos.setFont(new Font("Poppins", Font.PLAIN, 16));
		lblAcertos.setBounds(111, 287, 106, 24);
		panel_5.add(lblAcertos);
				
		JLabel id_MediaAcertos = new JLabel(inforesult[6]);
		id_MediaAcertos.setHorizontalAlignment(SwingConstants.CENTER);
		id_MediaAcertos.setFont(new Font("Poppins", Font.PLAIN, 20));
		id_MediaAcertos.setBounds(110, 322, 64, 25);
		panel_5.add(id_MediaAcertos);

		JLabel lblProgressoMeta = new JLabel("Progresso em Metas:");
		lblProgressoMeta.setFont(new Font("Poppins", Font.PLAIN, 14));
		lblProgressoMeta.setBounds(12, 67, 529, 14);
		panel_5.add(lblProgressoMeta);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setFont(new Font("Poppins", Font.PLAIN, 12));
		progressBar.setStringPainted(true);
		progressBar.setBounds(12, 92, 546, 20);
		panel_5.add(progressBar);
		progressBar.setForeground(new Color(36, 46, 134));
		progressBar.setValue(0);

		this.meta_id = DB(id_user);

		if(meta_id[3].equals("1")) {
			progressBar.setValue(0);
		}else if(meta_id[3].equals("2")) {
			progressBar.setValue(50);
		}else if(meta_id[3].equals("3")) {
			progressBar.setValue(100);
		}

		JPanel Sidebar = new JPanel();
		Sidebar.setBounds(0, 0, 260, 720);
		panel.add(Sidebar);
		Sidebar.setBackground(new Color(240, 240, 240));
		Sidebar.setLayout(null);

		JPanel Perfil = new JPanel();
		Perfil.setBorder(null);
		Perfil.setBackground(new Color(36, 44, 134));
		Perfil.setBounds(0, 0, 260, 100);
		Sidebar.add(Perfil);
		Perfil.setLayout(null);

		JLabel badge_id = new JLabel("");
		badge_id.setIcon(new ImageIcon("C:\\Users\\giovana.lummertz\\eclipse-workspace\\EstudaMais\\img\\badge\\badge_id3.png"));
		badge_id.setBounds(71, 55, 28, 28);
		Perfil.add(badge_id);			

		JLabel icon_user = new JLabel("");
		icon_user.setInheritsPopupMenu(false);
		icon_user.setRequestFocusEnabled(false);
		icon_user.setIconTextGap(0);
		icon_user.setBorder(null);
		icon_user.setHorizontalAlignment(SwingConstants.CENTER);
		icon_user.setBounds(24, 15, 68, 68);
		Perfil.add(icon_user);				

		if(this.id_icon[5].equals("1")) {
			icon_user.setIcon(icon_1);
		}else if(this.id_icon[5].equals("2")){
			icon_user.setIcon(icon_2);
		}else if(this.id_icon[5].equals("3")){
			icon_user.setIcon(icon_3);
		}else if(this.id_icon[5].equals("4")){
			icon_user.setIcon(icon_4);
		}


		if(this.badge_id[2].equals("1")){
			subtitle_badge = "Novato";
			badge_id.setIcon(badge_1);
		}else if(this.badge_id[2].equals("2")) {
			subtitle_badge = "Vagabundo";
			badge_id.setIcon(badge_2);
		}else if(this.badge_id[2].equals("3")) {
			subtitle_badge = "Sem Alma";
			badge_id.setIcon(badge_3);
		}


		JLabel nome_id = new JLabel("" + this.nome_id[0] + " " + this.sobrenome_id[1]);
		nome_id.setForeground(new Color(255, 255, 255));
		nome_id.setFont(new Font("Poppins", Font.PLAIN, 12));
		nome_id.setBounds(100, 20, 150, 25);
		Perfil.add(nome_id);

		JLabel badge_subtitle_id = new JLabel(subtitle_badge);
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
				Config cf = new Config(id_user);
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
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		setBounds(0, 0, 1280, 720);

	}

	public static String[] DB(String id_user) {
		String[] infouser = new String [8]; //Armazena os dados de login se um usuário em Array.

		try {
			ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1","3306","estudamais","root","root"); //Cria uma referência à Classe conexão

			//Envia comandos para o DB.
			String query = "select nome_user, sobrenome_user, badge_id, meta_id, birthdate_user, id_icon, sum(sr.quest_certas) as Certas, sum(sr.quest_erradas) as Erradas from user_dados as ud join simu_resolvido as sr on sr.id_user = ud.id_user where ud.id_user =?;"; //SQL que busca o usuário e senha, utilizando o usuário como ponto de busca;
			ResultSet rs = conn1.executeQuery(query,id_user); //Retornar os resultados da SQL

			/*
			 *Comando para guardar os dados dentro de uma variável;/
			 */
			if(rs.next()) {
				infouser[0] = rs.getString("nome_user"); 
				infouser[1] = rs.getString("sobrenome_user");
				infouser[2] = rs.getString("badge_id");
				infouser[3] = rs.getString("meta_id");
				infouser[4] = rs.getString("birthdate_user");
				infouser[5] = rs.getString("id_icon");
				infouser[6] = rs.getString("Certas");
				infouser[7] = rs.getString("Erradas");}


			rs.close();
			conn1.closeConnection();
		}
		catch (SQLException e){e.printStackTrace();}
		return infouser;
	}

	public static ArrayList DBSimu(String id_user) {

		ArrayList<String[][]> infousimu = null;
		try {
			ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root"); // Cria uma
			
			String query1 = "select count(*) as qntd from simu_resolvido where id_user=?";
			
			ResultSet rs1 = conn1.executeQuery(query1, id_user);
			
			

			if(rs1.next()) {
				ii = rs1.getString("qntd");
			}
			
			if(Integer.parseInt(ii) >=8) {
				ii="8";
			}
			
			// Envia comandos para o DB.
			String query2 = "select data_resolv, tempo_resolv,quest_certas,num_simu from simu_resolvido where id_user = ?  order by id_simu desc limit ?;"; // SQL

			ResultSet rs = conn1.executeQuery(query2, id_user,Integer.parseInt(ii) ); // Retornar os resultados da SQL

			
			System.out.println("aqui");


			infousimu = new ArrayList();

			String[][] dados = new String[Integer.parseInt(ii)][4]; // Armazena os dados de login se um usuário em Array.
			int i=0;
			
			while (rs.next()) {
				System.out.println(ii);
				dados[i][0] = rs.getString("data_resolv");
				dados[i][1] = rs.getString("tempo_resolv");
				dados[i][2] = rs.getString("quest_certas");
				dados[i][3] = rs.getString("num_simu");

				infousimu.add(dados);
				if(i < Integer.parseInt(ii)) {
					i++;
				} else {
					break;
				}
				
			}

			

			rs.close();
			conn1.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infousimu;
	}

	public static String[] DBSimu2(String id_user) {
		String[] infosimu2 = new String[1]; // Armazena os dados de login se um usuário em Array.

		try {
			ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root"); // Cria uma

			// Envia comandos para o DB.
			String query = "select max(id_simu) as id_simu from simu_resolvido where id_user =? ;"; // SQL que busca o

			ResultSet rs = conn1.executeQuery(query, id_user); // Retornar os resultados da SQL

			/*
			 * Comando para guardar os dados dentro de uma variável;/
			 */
			if (rs.next()) {
				infosimu2[0] = rs.getString("id_simu");
			}
			rs.close();
			conn1.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infosimu2;
	}
	
	public static String DBSimuCompleto(String id_user) {
		String infosimu = new String();
		try {
			ConexãoMysql conn1 = new ConexãoMysql("127.0.0.1", "3306", "estudamais", "root", "root"); // Cria uma

			// Envia comandos para o DB.
			String query = "select count(*) from simu_resolvido where id_user =?;"; // SQL que busca o

			ResultSet rs = conn1.executeQuery(query, id_user); // Retornar os resultados da SQL

			/*
			 * Comando para guardar os dados dentro de uma variável;/
			 */
			if (rs.next()) {
				infosimu = rs.getString("count(*)");
			}
			rs.close();
			conn1.closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infosimu;
	}
	
	
	
}