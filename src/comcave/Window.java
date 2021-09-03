package comcave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame{

	// 1. Deklaration Formular-Elemente
	JTextField textFeld;
	JButton button;
	
	
	public Window() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setTitle("GUI - Graphical User Interface");
		this.setLayout(null);
		
		// 2. Formular-Elemente initialisieren
		textFeld = new JTextField();
		button = new JButton("Klick");
		
		// 3. Formular-Elemente dem Fenster/Window hinzufügen 
		this.add(textFeld);
		this.add(button);
		
		// 4. Formular-Elemente positionieren und Größeangaben
		textFeld.setBounds(20, 40, 100, 25);
		button.setBounds(20, 100, 100, 25);
		
		button.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//textFeld.setText("test");
				String text = textFeld.getText();
				System.out.println(text);
				// Eingabe eines Alters in Jahren
				// Ausgabe Alter in Tage 
			}
		} );
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Window(); 
	}

}
