package telas;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gabarito extends JPanel {
	private int lines=1;
	public String[] respostas = new String[90];
	private JLabel questoes;
	private JPanel pnlQuestoes;
	private int page=0;
	private int acertos; 
	private int erros; 
	private long segundos; 
	private long minutos; 
	private long horas;
	private JLabel gabarito;
	private int simu;
	private String id_user;

	/**
	 * Create the panel.
	 */



	public Gabarito(int acertos, int erros, long segundos, long minutos, long horas, int simu,String id_user) {
		this.acertos=acertos;
		this.erros=erros;
		this.segundos=segundos;
		this.minutos=minutos;
		this.horas=horas;
		this.simu=simu;
		this.id_user=id_user;

		setBackground(new Color(64, 74, 204));
		setLayout(null);
		setBounds(0,0,1280,720);

		JPanel pnlHeader = new JPanel();
		pnlHeader.setBorder(null);
		pnlHeader.setBackground(new Color(36, 44, 136,178));
		pnlHeader.setBounds(0, 0, 1280, 85);
		add(pnlHeader);
		pnlHeader.setLayout(null);

		JLabel lblQuestao = new JLabel("Questão");
		lblQuestao.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestao.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		lblQuestao.setForeground(new Color(255, 255, 255));
		lblQuestao.setBounds(82, 38, 126, 32);
		pnlHeader.add(lblQuestao);

		JLabel lblGabarito = new JLabel("Gabarito");
		lblGabarito.setHorizontalAlignment(SwingConstants.CENTER);
		lblGabarito.setForeground(Color.WHITE);
		lblGabarito.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		lblGabarito.setBounds(412, 38, 126, 32);
		pnlHeader.add(lblGabarito);

		JLabel lblSuaResposta = new JLabel("Sua Resposta");
		lblSuaResposta.setForeground(Color.WHITE);
		lblSuaResposta.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		lblSuaResposta.setBounds(869, 38, 178, 32);
		pnlHeader.add(lblSuaResposta);

		JPanel pnlBottom = new JPanel();
		pnlBottom.setBorder(null);
		pnlBottom.setBackground(new Color(255, 255, 255));
		pnlBottom.setBounds(0, 648, 1280, 72);
		add(pnlBottom);
		pnlBottom.setLayout(null);

		//Botão para voltar a tela de resultados
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setFocusPainted(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setBackground(new Color(64, 74, 204));
		btnVoltar.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
		btnVoltar.setBounds(27, 18, 158, 36);
		pnlBottom.add(btnVoltar);

		//Botão que atualiza os valores das questoes, gabaritos e resposta de acordo com o id do banco de dados
		JButton setaProximo = new JButton("");
		setaProximo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setaProximo.setFocusPainted(false);
		setaProximo.setContentAreaFilled(false);
		setaProximo.setBorderPainted(false);
		setaProximo.setIcon(new ImageIcon("C:\\Users\\vitor\\Downloads\\arrowb_rotated_resized.png"));
		setaProximo.setBounds(714, 25, 31, 29);
		pnlBottom.add(setaProximo);

		//Mesma função da setaProximo, porem quando acionado retorna os valores da pagina anterior
		JButton setaAnterior = new JButton("");
		setaAnterior.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setaAnterior.setIcon(new ImageIcon("C:\\Users\\vitor\\Downloads\\arrowb_resized.png"));
		setaAnterior.setFocusPainted(false);
		setaAnterior.setContentAreaFilled(false);
		setaAnterior.setBorderPainted(false);
		setaAnterior.setBounds(534, 25, 31, 29);
		pnlBottom.add(setaAnterior);

		JLabel lblHeader = new JLabel("");
		lblHeader.setIcon(new ImageIcon("C:\\Users\\vitor\\Downloads\\header.png"));
		lblHeader.setBounds(0, 0, 1280, 72);
		add(lblHeader);

		JPanel pnlLinha = new JPanel();
		pnlLinha.setBorder(null);
		pnlLinha.setBackground(new Color(36, 44, 136));
		pnlLinha.setBounds(0, 632, 1280, 17);
		add(pnlLinha);
		pnlLinha.setLayout(null);

		pnlQuestoes = new JPanel();
		pnlQuestoes.setBackground(new Color(64, 74, 204));
		pnlQuestoes.setBounds(0, 0, 1280, 720);
		pnlQuestoes.setLayout(null);
		add(pnlQuestoes);

		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				telaResultados();
				
				gabarito.setText("");

			}
		});

		setaProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setaProximo();

			}
		});

		setaAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setaAnterior();

			}
		});

		//Imprime os componentes na tela quando inicia o painel com o valor do id 1
		posicaoInicial(1,0);
	}
	//Metodo para conectar com o banco de dados e armazenar os dados em uma array
	public String[] nextLine(int id, int simu) {
		String[] line = new String[3];

		//estabelece conexão
		ConexãoMysql con = new ConexãoMysql("localhost", "3306", "estudamais", "root", "root");

		//manda o comando para o banco de dados
		String query = "SELECT qr.numero_quest, qs.gabarito, qr.gabarito_user FROM simu_questoes_resolv qr JOIN simu_questoes qs join user_dados us ON qr.id_quest = qs.id_quest WHERE qr.id_quest =? and qr.id_simu = ? and us.id_user = ?;";
		ResultSet rs = con.executeQuery(query, id, simu, id_user);

		//recebe os dados solicitados
		try {
			if(rs.next()) {
				line[0] = rs.getString("numero_quest");
				line[1] = rs.getString("gabarito");
				line[2] = rs.getString("gabarito_user");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con.closeConnection();
		return line;
	}
	//Metodo para gerar os componentes na tela
	public void posicaoInicial(int id, int i) {
		int aumPosicao = 54;
		int pos = 96;
		lines=id;

		for(i=0;i<=10;i++) {
			//Variavel que contém os dados do banco de dados
			String[] infoQuestao = nextLine(lines,simu);

			questoes = new JLabel("");
			questoes.setHorizontalAlignment(SwingConstants.CENTER);
			questoes.setForeground(Color.WHITE);
			questoes.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
			questoes.setBounds(83, pos, 126, 32);
			pnlQuestoes.add(questoes);

			gabarito = new JLabel("");
			gabarito.setHorizontalAlignment(SwingConstants.CENTER);
			gabarito.setForeground(Color.WHITE);
			gabarito.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
			gabarito.setBounds(412, pos, 126, 32);
			pnlQuestoes.add(gabarito);

			JLabel seta1 = new JLabel("");
			seta1.setIcon(new ImageIcon("C:\\Users\\vitor\\Downloads\\arrow_rotated_resized.png"));
			seta1.setHorizontalAlignment(SwingConstants.CENTER);
			seta1.setForeground(Color.WHITE);
			seta1.setFont(new Font("Poppins Light", Font.PLAIN, 24));
			seta1.setBounds(643, pos, 28, 32);
			pnlQuestoes.add(seta1);

			JPanel painelResposta1 = new JPanel();
			painelResposta1.setBounds(812, pos, 275, 32);
			pnlQuestoes.add(painelResposta1);
			painelResposta1.setLayout(null);

			JLabel resposta = new JLabel("a");
			resposta.setFont(new Font("Poppins Medium", Font.PLAIN, 20));
			resposta.setForeground(new Color(64, 74, 204));
			resposta.setHorizontalAlignment(SwingConstants.CENTER);
			resposta.setBounds(104, 0, 53, 32);
			painelResposta1.add(resposta);

			//Coloca os textos nos componentes
			gabarito.setText(infoQuestao[1]);
			questoes.setText(infoQuestao[0]);
			resposta.setText(infoQuestao[2]);


			pos=pos+aumPosicao;			

			//Atualiza o id
			lines++;
		}

	}

	public void setaProximo() {
		if(page<3) {
			page++;
			if(page==1) {
				//O painel que contem os componentes remove todos os componentes para zerar os textos
				pnlQuestoes.removeAll();
				//Revalida os  componentes
				revalidate();
				//Reimprime eles na tela
				repaint();

				//Valor atualizado do id por pagina
				posicaoInicial(11,10);
			} else if(page==2) {
				pnlQuestoes.removeAll();
				revalidate();
				repaint();

				posicaoInicial(21,30);
			}else if(page==3) {
				pnlQuestoes.removeAll();
				revalidate();
				repaint();

				posicaoInicial(31,30);
			}
		}
	}

	public void setaAnterior() {
		if(page>0) {
			page--;
			if(page==1) {
				pnlQuestoes.removeAll();
				revalidate();
				repaint();

				posicaoInicial(11,10);
			} else if(page==2) {
				pnlQuestoes.removeAll();
				revalidate();
				repaint();

				posicaoInicial(21,20);
			}else if(page==3) {
				pnlQuestoes.removeAll();
				revalidate();
				repaint();

				posicaoInicial(31,30);
			} else if(page==0) {
				pnlQuestoes.removeAll();
				revalidate();
				repaint();

				posicaoInicial(1,0);
			}
		}
	}

	public void telaResultados() {
		Resultados res = new Resultados(acertos, erros, segundos, minutos, horas, simu,id_user);
		removeAll();
		add(res);
		revalidate();
		repaint();
	}

}
