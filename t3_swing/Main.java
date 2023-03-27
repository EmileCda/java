import java.io.*;
import javax.swing.*;
public class Main extends JFrame{
	public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JDialog
		        SimpleFenetre myWindow = new SimpleFenetre();
                myWindow.setVisible(true);
			}
		});
    }
		
        
 

    
   
        
	public static void testWindow(){
        SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JWindow
				JWindow window = new JWindow();
				window.setSize(300, 200);//On lui donne une taille pour qu'on puisse la voir
				window.setVisible(true);//On la rend visible
			}
		});
 
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
 
		System.exit(0);
	}


	public static void testDialog(){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				//On crée une nouvelle instance de notre JDialog
				JDialog dialog = new JDialog();
				dialog.setSize(300, 200);//On lui donne une taille
				dialog.setTitle("Première fenêtre"); //On lui donne un titre
				dialog.setVisible(true);//On la rend visible
				dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
			}
		});
	}
}

 class SimpleFenetre extends JFrame{
 
	public SimpleFenetre(){
		super();
 
		build();//On initialise notre fenêtre
	}
 
	private void build(){
		setTitle("Ma première fenêtre"); //On donne un titre à l'application
		setSize(320,240); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
	}
}