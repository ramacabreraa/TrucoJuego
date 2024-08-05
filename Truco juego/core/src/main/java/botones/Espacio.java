package botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Espacio implements ActionListener{

	private JTextField txfNombre;
	private JFrame frame;
	public String nombreDelJugador;
	
	public Espacio(JTextField txfNombre, JFrame frame) {
		this.txfNombre = txfNombre;
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		nombreDelJugador = txfNombre.getText();
		frame.dispose();
	}
	
}