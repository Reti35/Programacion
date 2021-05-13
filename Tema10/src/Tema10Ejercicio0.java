import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;

public class Tema10Ejercicio0 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema10Ejercicio0 frame = new Tema10Ejercicio0();
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
	public Tema10Ejercicio0() {
		setTitle("Ejercicio 0 Tema 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		TextField textField = new TextField();
		contentPane.add(textField, BorderLayout.NORTH);
		
		Label label = new Label("Etiqueta");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		label.setAlignment(Label.CENTER);
		contentPane.add(label, BorderLayout.SOUTH);
	}

}
