package projetoI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;

public class CriarEventos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriarEventos frame = new CriarEventos();
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
	public CriarEventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCriarEventos = new JLabel("Criar Eventos");
		lblCriarEventos.setBounds(44, 29, 96, 16);
		contentPane.add(lblCriarEventos);
		
		JLabel lblNewLabel = new JLabel("Nome do administrador :");
		lblNewLabel.setBounds(64, 66, 162, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(222, 63, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNomeDoEvento = new JLabel("Nome do Evento :");
		lblNomeDoEvento.setBounds(64, 110, 110, 16);
		contentPane.add(lblNomeDoEvento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 107, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTipoDeEvento = new JLabel("Tipo de Evento :");
		lblTipoDeEvento.setBounds(64, 154, 96, 16);
		contentPane.add(lblTipoDeEvento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(186, 154, 116, 22);
		contentPane.add(comboBox);
		
		JLabel lblCurso = new JLabel("Curso :");
		lblCurso.setBounds(64, 199, 56, 16);
		contentPane.add(lblCurso);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(132, 196, 82, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblCusto = new JLabel("Custo :");
		lblCusto.setBounds(64, 245, 56, 16);
		contentPane.add(lblCusto);
		
		JRadioButton rdbtnGratuito = new JRadioButton("Gratuito");
		rdbtnGratuito.setBounds(114, 241, 127, 25);
		contentPane.add(rdbtnGratuito);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o :");
		lblPreo.setBounds(247, 245, 157, 16);
		contentPane.add(lblPreo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(299, 245, 82, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSala = new JLabel("Sala :");
		lblSala.setBounds(64, 297, 56, 16);
		contentPane.add(lblSala);
		
		JButton btnNewButton = new JButton("Criar Evento");
		btnNewButton.setBounds(489, 324, 110, 41);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(114, 294, 87, 22);
		contentPane.add(comboBox_2);
		
		JLabel lblData = new JLabel("Data :");
		lblData.setBounds(247, 297, 56, 16);
		contentPane.add(lblData);
		
		textField_3 = new JTextField();
		textField_3.setBounds(296, 294, 96, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblHora = new JLabel("Hora :");
		lblHora.setBounds(64, 349, 56, 16);
		contentPane.add(lblHora);
		
		textField_4 = new JTextField();
		textField_4.setBounds(114, 346, 87, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
