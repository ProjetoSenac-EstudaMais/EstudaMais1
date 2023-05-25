package telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Cursor;

public class Registrar extends JPanel {
	private JTextField emailField;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Registrar() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 1280, 720);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 44, 136));
		panel.setBounds(654, 0, 550, 720);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblTituloConta = new JLabel("Crie uma Conta");
		lblTituloConta.setForeground(SystemColor.inactiveCaptionBorder);
		lblTituloConta.setFont(new Font("Poppins", Font.PLAIN, 30));
		lblTituloConta.setBounds(156, 238, 248, 51);
		panel.add(lblTituloConta);
		
		//Conta - Fazer login
		JLabel lblSemConta = new JLabel("Já possui uma conta?");
		lblSemConta.setForeground(SystemColor.text);
		lblSemConta.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblSemConta.setBounds(185, 518, 121, 14);
		panel.add(lblSemConta);
		
		JButton btnRegistrar = new JButton("Faça Login.");
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setFont(new Font("Poppins", Font.PLAIN, 11));
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistrar.setForeground(new Color(130, 209, 236));
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBounds(294, 514, 110, 23);
		panel.add(btnRegistrar);
		
		// Interação do botão "Faça Login" para voltar à "tela de Login"
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login a = new Login();
				removeAll();
				add(a);
				revalidate();
				repaint();

			}});
		
		JButton btnLogin = new JButton("Registrar");
		btnLogin.setFocusPainted(false);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBorderPainted(false);
		btnLogin.setBackground(new Color(64, 74, 204));
		btnLogin.setBounds(230, 480, 89, 23);
		panel.add(btnLogin);
		
		//Senha
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(SystemColor.text);
		lblSenha.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblSenha.setBounds(121, 412, 78, 14);
		panel.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Poppins", Font.PLAIN, 12));
		passwordField.setCaretColor(new Color(255, 255, 255));
		passwordField.setForeground(Color.WHITE);
		passwordField.setBackground(new Color(36, 44, 136));
		passwordField.setBounds(121, 432, 300, 25);
		panel.add(passwordField);
		
		//E-mail
		JLabel lblEmailInput = new JLabel("Email:");
		lblEmailInput.setForeground(SystemColor.text);
		lblEmailInput.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblEmailInput.setBounds(121, 356, 78, 14);
		panel.add(lblEmailInput);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Poppins", Font.PLAIN, 12));
		emailField.setCaretColor(new Color(255, 255, 255));
		emailField.setForeground(Color.WHITE);
		emailField.setBackground(new Color(36, 44, 136));
		emailField.setColumns(10);
		emailField.setBounds(121, 376, 300, 25);
		panel.add(emailField);
		
		//Nome de usuário
		JLabel lblUsuario = new JLabel("Nome de usuário:");
		lblUsuario.setForeground(SystemColor.text);
		lblUsuario.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblUsuario.setBounds(121, 300, 121, 14);
		panel.add(lblUsuario);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Poppins", Font.PLAIN, 12));
		usernameField.setCaretColor(new Color(255, 255, 255));
		usernameField.setForeground(Color.WHITE);
		usernameField.setBackground(new Color(36, 44, 136));
		usernameField.setColumns(10);
		usernameField.setBounds(121, 320, 300, 25);
		panel.add(usernameField);
		


	}
}
