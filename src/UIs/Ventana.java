package UIs;

import java.awt.Container;
import javax.swing.*;

import Funciones.Interfaz;


public class Ventana extends JFrame implements Interfaz{

	private static final long serialVersionUID = -207441735480942911L;
	
	private Container panelActual;
	private int contenidoActual;
	private Programa1 programa;
	public Ventana() {
		programa= new Programa1(this);
		getContentPane().add(programa);
		setBounds(0,0,750,600);
		setTitle("Laboratorio 1 AED JoseMZ ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	@Override
	public void cambiarPrograma(int programa) {
		panelActual=getContentPane();
		panelActual.removeAll();
		
		switch(programa) {
			case 1:
				panelActual.add(new Programa1(this));
				break;
				
			case 2:
				panelActual.add(new Programa2(this));
				break;
			
		}
		invalidate();
		repaint();
		
	}
	@Override
	
	public int getContenido() {
		
		return contenidoActual;
	}
	@Override
	public void setContenido(int contenido) {
		
		this.contenidoActual=contenido;
	}
}
