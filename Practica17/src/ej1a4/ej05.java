package ej1a4;

import javax.swing.JOptionPane;

public class ej05 {

	public static void main(String[] args) {
		
		
		// ------------------------------------------------------------
		// Pruebas del método showInputDialog
		// ------------------------------------------------------------
		String nombre = JOptionPane.showInputDialog("Escriba un número");
		/*
		char[] ar = nombre.toCharArray();	
		for(int i = 0;i<nombre.toCharArray().length;i++) {
			ar[i];
		}
			*/	
		float nombref = Integer.parseInt(nombre);
		System.out.println(nombref);
		
		JOptionPane.showMessageDialog(null,
				"El numero introducido es " + nombref,
				"Mensaje", 1);
		
		System.out.println(nombre);
		
		if(nombre.equalsIgnoreCase("100")== true) {
			//****************************************************
			JOptionPane.showMessageDialog(null,
					"Enhorabuena, has obtenido un premio",
					"Mensaje",1);
					
		}
		

	//	else if() {}
		
		
		
		
		
		
		
		
		

	}

}
