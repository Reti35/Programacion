//import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

public class VentanaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldContraseña;
	private JButton btnLogin;
	private Conectar conexion;
	private JButton btnDesconectarDeLa;
	private ConexionCorrecta cc;
	private ConexionCerrada ce;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { VentanaLogin frame = new
	 * VentanaLogin(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public VentanaLogin() {

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {

				int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres cerrar?", "Confirmar cierre",
						JOptionPane.YES_NO_OPTION);

				if (opcion == JOptionPane.YES_OPTION) {

					System.exit(0);

				}

			}
		});
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 760, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(10, 67, 57, 24);
		contentPane.add(lblUsuario);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(103, 71, 139, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContrasea.setBounds(10, 102, 85, 14);
		contentPane.add(lblContrasea);

		textFieldContraseña = new JTextField();
		textFieldContraseña.setBounds(103, 102, 139, 20);
		contentPane.add(textFieldContraseña);
		textFieldContraseña.setColumns(10);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String user = textFieldUsuario.getText();
				String password = textFieldContraseña.getText();

				try {
					String sql = "select username, password from usuarios where username= '" + user
							+ "' AND password= '" + password + "'";

					conexion.rs = conexion.s.executeQuery(sql);

					if (conexion.rs.next()) {

						JOptionPane.showMessageDialog(rootPane, "Login correcto");

					} else {
						JOptionPane.showMessageDialog(rootPane, "Login incorrecto");
					}

				} catch (SQLException e) {

					JOptionPane.showMessageDialog(rootPane, "Error");

				}

			}
		});
		btnLogin.setBounds(10, 227, 89, 23);
		contentPane.add(btnLogin);

		JButton btnConectarALa = new JButton("Conectar a la base de datos");
		btnConectarALa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					if (conexion == null) {

						conexion = new Conectar();

						cc = new ConexionCorrecta();
						cc.setVisible(true);

					}

				} catch (Exception e2) {

					e2.printStackTrace();

				}

			}
		});
		btnConectarALa.setBounds(103, 227, 315, 23);
		contentPane.add(btnConectarALa);

		btnDesconectarDeLa = new JButton("Desconectar de la base de datos");
		btnDesconectarDeLa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					if (conexion != null) {

						conexion.desconectar();

						ce = new ConexionCerrada();
						ce.setVisible(true);

					}

				} catch (Exception e2) {

					e2.printStackTrace();

				}

			}
		});
		btnDesconectarDeLa.setBounds(428, 227, 306, 23);
		contentPane.add(btnDesconectarDeLa);
	}
}
