package telas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class EsqueciSenha extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public EsqueciSenha() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds (0, 0, 1280, 720);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 44, 136));
		panel.setBounds(658, 0, 550, 720);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblEsqueciASenha = new JLabel("Esqueci a senha");
		lblEsqueciASenha.setForeground(SystemColor.inactiveCaptionBorder);
		lblEsqueciASenha.setFont(new Font("Poppins", Font.PLAIN, 30));
		lblEsqueciASenha.setBounds(154, 285, 248, 51);
		panel.add(lblEsqueciASenha);
		
		JLabel lblEmailInputEsq = new JLabel("Email:");
		lblEmailInputEsq.setForeground(SystemColor.text);
		lblEmailInputEsq.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblEmailInputEsq.setBounds(120, 347, 78, 14);
		panel.add(lblEmailInputEsq);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBackground(new Color(36, 44, 136));
		textField.setBounds(120, 367, 300, 25);
		panel.add(textField);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setBorderPainted(false);
		btnEnviar.setBackground(new Color(64, 74, 204));
		btnEnviar.setBounds(230, 403, 89, 23);
		panel.add(btnEnviar);
		
		JLabel lblSemConta = new JLabel("Já possui uma conta?");
		lblSemConta.setForeground(SystemColor.text);
		lblSemConta.setFont(new Font("Poppins", Font.PLAIN, 11));
		lblSemConta.setBounds(190, 441, 121, 14);
		panel.add(lblSemConta);
		
		JButton btnRegistrar = new JButton("Faça Login.");
		btnRegistrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistrar.setForeground(new Color(130, 209, 236));
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBounds(300, 437, 110, 23);
		panel.add(btnRegistrar);

	}

}
