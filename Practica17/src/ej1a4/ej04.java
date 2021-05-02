package ej1a4;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ej04 {

	public static void main(String[] args) {


		// ------------------------------------------------------------
		// Pruebas del m�todo showMessageDialog (muestra un mensaje al usuario)
		// ------------------------------------------------------------
		JOptionPane.showMessageDialog(null, "Hola que tal");
		JOptionPane.showMessageDialog(null, "Hola",
		 "T�tulo mensaje", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null,
		 "Hola, que tal est�is",
		 "T�tulo mensaje",
		 JOptionPane.PLAIN_MESSAGE,
		 new ImageIcon("Duke.png"));
		// ------------------------------------------------------------
		// Pruebas del m�todo showConfirmDialog
		// ------------------------------------------------------------
		JOptionPane.showConfirmDialog(null, "�Estamos en primavera?");
		int resp = JOptionPane.showConfirmDialog(null,
		 "�Estamos en primavera?",
		 "Titulo de la ventana",
		 JOptionPane.YES_NO_OPTION);
		System.out.println(resp);
		if (resp == JOptionPane.YES_OPTION)
		JOptionPane.showMessageDialog(null,"Que bien, ya lleg� la alergia");
		else
		JOptionPane.showMessageDialog(null,"Ohhhhhhhh");
		// ------------------------------------------------------------
		// Pruebas del m�todo showOptionDialog
		// ------------------------------------------------------------
		Object [] opciones = {"OK", "Bien", "HOLA"};
		JOptionPane.showOptionDialog(null,
		 "Selecciona una respuesta",
		 "Titulo de la ventana",
		 JOptionPane.OK_OPTION,
		 JOptionPane.INFORMATION_MESSAGE,
		 null,
		 opciones,
		 opciones[2]);
		// ------------------------------------------------------------
		// Pruebas del m�todo showInputDialog
		// ------------------------------------------------------------
		String nombre = JOptionPane.showInputDialog("�C�mo te llamas?");
		JOptionPane.showMessageDialog(null,
		 "Hola, " + nombre.toUpperCase(),
		 "Bienvenido",
		 JOptionPane.PLAIN_MESSAGE,
		 new ImageIcon("Duke.png"));
		/////////////////////////////////////////////////////////
		Object [] diasSemana = {"Lunes","Martes","Mi�rcoles","Jueves","Viernes"};
		Object respDia = JOptionPane.showInputDialog(null,
		 "Elije tu d�a favorito: ",
		 "Titulo de la ventana",
		 JOptionPane.QUESTION_MESSAGE,
		 null,
		 diasSemana,
		 diasSemana[3]);
		System.out.println(respDia);

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
