package ej1a4;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class ej03 {

	public static void main(String[] args) {
		
		// Crear un JFrame
		JFrame f = new JFrame("Ventana con di�logo de Abrir/Guardar");
		// Crear un objeto de tipo JFileChooser (ventana de di�logo para
		// mostrar el explorador que permite abrir o guardar un documento)
		JFileChooser fc = new JFileChooser("C:/JRB"); 
		// Poner una ruta v�lida en vuestro equipo
		// Llamar al m�todo que establece el JFileChooser en modo "abrir"
		//fc.showOpenDialog(f);
		// Llamar al m�todo que establece el JFileChooser en modo "guardar"
		fc.showSaveDialog(f);
		// Poner visible el JFileChooser
		fc.setVisible(true);
		// Establecer tama�o y poner visible el JFrame
		f.setVisible(true);
		f.setSize(200,100);
		// Programar el cierre de la ventana
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
