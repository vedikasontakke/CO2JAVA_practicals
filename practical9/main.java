 //Write a Program to demonstrate the use of WindowAdapter class.

 import java.awt.*;
 import java.awt.event.*; 
 import javax.swing.*;

public class main extends Frame implements WindowListener{

    main()  {
super("WindowListener"); 
addWindowListener(this);

this.setSize(400,400); this.setLayout(null); this.setVisible(true);
}

public void windowActivated(WindowEvent arg0) {  System.out.println("activated"); }

public void windowClosed(WindowEvent arg0) { System.out.println("closed"); }

public void windowClosing(WindowEvent arg0) {
     System.out.println("closing");
     this.dispose();

}

public void windowDeactivated(WindowEvent arg0) { System.out.println("deactivated"); }

public void windowDeiconified(WindowEvent arg0) { System.out.println("deiconified"); }
 
public void windowIconified(WindowEvent arg0) { System.out.println("iconified");
}
public void windowOpened(WindowEvent arg0) { System.out.println("opened"); }


public static void main(String[] args) {    new main();   }
}
