package projetoI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PagamentosIncriçoes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagamentosIncriçoes frame = new PagamentosIncriçoes();
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
	public PagamentosIncriçoes() {
		setTitle("Pagamentos e Incri\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPagamentosEIncries = new JLabel("Pagamentos e incri\u00E7\u00F5es");
		lblPagamentosEIncries.setBounds(55, 65, 171, 22);
		contentPane.add(lblPagamentosEIncries);
		
		JLabel lblEvento = new JLabel("Evento");
		lblEvento.setBounds(35, 134, 56, 16);
		contentPane.add(lblEvento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(95, 131, 127, 22);
		contentPane.add(comboBox);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(35, 186, 56, 16);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(95, 183, 127, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(35, 238, 56, 16);
		contentPane.add(lblCurso);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(95, 235, 130, 22);
		contentPane.add(comboBox_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pagamento no ato");
		rdbtnNewRadioButton.setBounds(79, 293, 171, 25);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPagamentoPorMultibanco = new JRadioButton("Pagamento por multibanco");
		rdbtnPagamentoPorMultibanco.setBounds(81, 334, 201, 25);
		contentPane.add(rdbtnPagamentoPorMultibanco);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu frame = new Menu(null);
				frame.setVisible(true);
				dispose();
				
				
			}
		});
		btnVoltar.setBounds(495, 334, 97, 25);
		contentPane.add(btnVoltar);
	}
}
