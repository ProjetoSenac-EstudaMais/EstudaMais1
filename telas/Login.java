package telas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import telas.EsqueciSenha;

public class Login extends JFrame {
	private JTextField login_emailField;
	private JPasswordField login_passwordField;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//Frame login
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		

		//Definições de plano de fundo da alpicação
		setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		// Criação do Panel
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(36, 44, 136));
		panel.setBounds(654, 0, 550, 720);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Título tela de Login - Faça seu Login
		JLabel lblTituloConta = new JLabel("Faça seu Login");
		lblTituloConta.setForeground(SystemColor.inactiveCaptionBorder);
		lblTituloConta.setFont(new Font("Poppins", Font.PLAIN, 32));
		lblTituloConta.setBounds(153, 179, 247, 51);
		panel.add(lblTituloConta);
				
		//Título do E-mail para ser inserido
		JLabel lblEmailInput = new JLabel("Email:");
		lblEmailInput.setForeground(SystemColor.text);
		lblEmailInput.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblEmailInput.setBounds(125, 300, 78, 14);
		panel.add(lblEmailInput);
		
		//Caixa de texto para inserir o login
		login_emailField = new JTextField();
		login_emailField.setFont(new Font("Poppins", Font.PLAIN, 12));
		login_emailField.setCaretColor(new Color(255, 255, 255)); //Cor do cursos de texto branco
		login_emailField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		login_emailField.setForeground(new Color(255, 255, 255));
		login_emailField.setBackground(new Color(36, 44, 136));
		login_emailField.setBounds(125, 320, 300, 25);
		panel.add(login_emailField);
		login_emailField.setColumns(10);
		
		//Campos relacionados à Senha
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(SystemColor.text);
		lblSenha.setFont(new Font("Poppins", Font.PLAIN, 12));
		lblSenha.setBounds(125, 355, 78, 14);
		panel.add(lblSenha);
		
		login_passwordField = new JPasswordField();
		login_passwordField.setCaretColor(new Color(255, 255, 255));
		login_passwordField.setFont(new Font("Poppins", Font.PLAIN, 12));
		login_passwordField.setForeground(new Color(255, 255, 255));
		login_passwordField.setBackground(new Color(36, 44, 136));
		login_passwordField.setBounds(125, 375, 300, 25);
		panel.add(login_passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnLogin.setFocusPainted(false);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnLogin.setBorderPainted(false);
		btnLogin.setBackground(new Color(64, 74, 204));
		btnLogin.setBounds(230, 428, 89, 23);
		panel.add(btnLogin);
				
		JLabel lblSemConta = new JLabel("Não tem uma conta?");
		lblSemConta.setForeground(SystemColor.text);
		lblSemConta.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblSemConta.setBounds(185, 475, 116, 14);
		panel.add(lblSemConta);
		
		JButton btnRegistrar = new JButton("Registrar-se.");
		btnRegistrar.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistrar.setForeground(new Color(130, 209, 236));
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBounds(290, 471, 110, 23);
		panel.add(btnRegistrar);
		
		//Botão esqueceu a Senha
		JButton btnEsqueceuASenha = new JButton("Esqueceu a senha?");
		btnEsqueceuASenha.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnEsqueceuASenha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEsqueceuASenha.setHorizontalAlignment(SwingConstants.LEFT);
		btnEsqueceuASenha.setForeground(new Color(130, 209, 236));
		btnEsqueceuASenha.setContentAreaFilled(false);
		btnEsqueceuASenha.setBorderPainted(false);
		btnEsqueceuASenha.setBounds(207, 500, 160, 23);
		panel.add(btnEsqueceuASenha);
		
		// Interação do botão "Esqueci a senha" com a tela de "EsqueciSenha"		
		btnEsqueceuASenha.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				EsqueciSenha a = new EsqueciSenha();
				contentPane.removeAll();
				contentPane.add(a);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		
		

	}

}
