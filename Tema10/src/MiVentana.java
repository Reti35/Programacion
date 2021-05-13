import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentana extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JFrame miVentana = new JFrame();
	JButton miBoton = new JButton("UN BOTON");

	public MiVentana() {
		
		miVentana.setSize(400, 400);
		miVentana.setLocation(300, 300);
		miVentana.setTitle("Mi primera ventana een Java");
		//miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container ct = miVentana.getContentPane();
		ct.setLayout(new BorderLayout());
		ct.add(miBoton, BorderLayout.SOUTH);
		
	}

}
