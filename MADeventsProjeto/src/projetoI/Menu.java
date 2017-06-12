package projetoI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel foto = new JLabel("");
		foto.setBackground(new Color(192, 192, 192));
		foto.setBounds(68, 38, 514, 394);
		
		ImageIcon imagem = new ImageIcon(Main.class.getResource("/logo/LOGO FINAL.png"));
		Image imag = imagem.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT);
		
		foto.setIcon(new ImageIcon(imag));
		
		
		
		contentPane.add(foto);
		
		JButton btnPagamentos = new JButton("Pagamentos e Inscri\u00E7\u00F5es\r\n");
		btnPagamentos.setBackground(new Color(128, 128, 128));
		btnPagamentos.setBounds(12, 34, 187, 54);
		contentPane.add(btnPagamentos);
		
		JButton btnConsultaDosEventos = new JButton("Consulta dos Eventos");
		btnConsultaDosEventos.setBackground(new Color(128, 128, 128));
		btnConsultaDosEventos.setBounds(217, 34, 170, 54);
		contentPane.add(btnConsultaDosEventos);
		
		JButton btnCriarEventos = new JButton("Criar Eventos");
		btnCriarEventos.setBackground(new Color(128, 128, 128));
		btnCriarEventos.setBounds(411, 34, 121, 54);
		contentPane.add(btnCriarEventos);
		
		JButton btnDivulgao = new JButton("Divulga\u00E7\u00E3o");
		btnDivulgao.setBackground(new Color(128, 128, 128));
		btnDivulgao.setBounds(544, 34, 112, 54);
		contentPane.add(btnDivulgao);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(500, 224, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(12, 224, 97, 25);
		contentPane.add(btnNewButton_1);
	}

}
