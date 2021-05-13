//import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class MiVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextPane textPaneDescripcion;
	private JButton btnAgregar;
	private JLabel lblNombre;
	private JScrollPane scrollPane;
	private JLabel lblMiAplicacion;

	/**
	 * Launch the application.
	 */

	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MiVentana frame = new MiVentana();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public MiVentana() {
		setTitle("Mi ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblMiAplicacion = new JLabel("Mi aplicacion");
		lblMiAplicacion.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
		lblMiAplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiAplicacion.setBounds(133, 11, 144, 55);
		contentPane.add(lblMiAplicacion);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 71, 46, 14);
		contentPane.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(66, 68, 198, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		btnAgregar = new JButton("Agregar");
		
		
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = textFieldNombre.getText();
				textPaneDescripcion.setText(textPaneDescripcion.getText() + texto);
			}
		});
		btnAgregar.setBounds(335, 227, 89, 23);
		contentPane.add(btnAgregar);
				
				scrollPane = new JScrollPane();
				scrollPane.setBounds(66, 151, 227, 78);
				contentPane.add(scrollPane);
				
				textPaneDescripcion = new JTextPane();
				scrollPane.setViewportView(textPaneDescripcion);
				
				JButton btnSiguiente = new JButton("Siguiente ");
				btnSiguiente.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						MiVentana2 miV2 = new MiVentana2();
						miV2.setVisible(true);
					}
				});
				btnSiguiente.setBounds(335, 201, 89, 23);
				contentPane.add(btnSiguiente);
				
				
	}
}
