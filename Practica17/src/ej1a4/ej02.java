package ej1a4;


import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ej02 {

	public static void main(String[] args) {
		
		
				//Panel con los botones
				JFrame f =new JFrame("Perro");
				
			
				//Panel de Jframe
				Container c = f.getContentPane();
				c.setLayout(new FlowLayout());
		
				JButton b1 = new JButton("Boton 1");
				JButton b2 = new JButton("Boton 2");
		
				c.add(b1);
				c.add(b2);
		
		////////////////////////////////////////////////////////////
		
				// ------------------------------------------------
				// Crear un diálogo asociado a esta ventana (Frame)
				// ------------------------------------------------
				JDialog d = new JDialog(f, "Título de diálogo",false);
				 // this es el JFrame, he heredado de JFrame
				d.setLayout(new FlowLayout());
				d.add(new JLabel("Esto es una ventana de diálogo"));
				d.add(new JButton("OK"));
				d.pack();
				d.setSize(200, 90);
				d.setResizable(false);
				d.setVisible(true);
				d.setLocationRelativeTo(d);
				//d.setLocation(200,200);
				// Controlar el cierre del diálogo, OJO, se oculta, no se sale de la aplicación
				d.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		
		
		
		
	
				f.setSize(200,400);
				f.pack();
				f.setVisible(true);
				// Añado el control alcierredelaventana
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}

}
