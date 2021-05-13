package tema10Ejercicio2;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cumplea�osFelices extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_Nombre;
	private JTextField textField_Dia;
	private JTextField textField_Mes;
	private JTextField textField_A�o;
	private Cumplea�os c;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Cumplea�osFelices frame = new
	 * Cumplea�osFelices(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public Cumplea�osFelices() {
		setTitle("Cumplea\u00F1os felices");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(5, 236, 424, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(20, 125, 46, 14);
		contentPane.add(lblMes);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 66, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(20, 100, 46, 14);
		contentPane.add(lblDia);

		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(20, 153, 46, 14);
		contentPane.add(lblAo);

		textField_Nombre = new JTextField();
		textField_Nombre.setBounds(76, 63, 164, 20);
		contentPane.add(textField_Nombre);
		textField_Nombre.setColumns(10);

		textField_Dia = new JTextField();
		textField_Dia.setBounds(76, 97, 86, 20);
		contentPane.add(textField_Dia);
		textField_Dia.setColumns(10);

		textField_Mes = new JTextField();
		textField_Mes.setBounds(76, 122, 86, 20);
		contentPane.add(textField_Mes);
		textField_Mes.setColumns(10);

		textField_A�o = new JTextField();
		textField_A�o.setBounds(76, 150, 86, 20);
		contentPane.add(textField_A�o);
		textField_A�o.setColumns(10);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				c = new Cumplea�os();

				c.setNombre(textField_Nombre.getText());
				c.setDia(textField_Dia.getText());
				c.setMes(textField_Mes.getText());
				c.setA�o(textField_A�o.getText());

				textField.setText(c.toString());

			}
		});
		btnGuardar.setBounds(151, 181, 112, 44);
		contentPane.add(btnGuardar);
	}
}
