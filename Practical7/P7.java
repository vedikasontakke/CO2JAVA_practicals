//Write a Program to demonstrate the various Mouse events using MouseListener and MouseMotionListener Interface.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class P7 extends Frame implements MouseListener {

static JLabel label1, label2, label3;

public static void main(String[] args)
{
 JFrame f = new JFrame("MouseListener");
 f.setSize(600, 300);

JPanel p = new JPanel(); p.setLayout(new GridLayout(3,1)); 
label1 = new JLabel("no event ");

label2 = new JLabel("no event ");
 label3 = new JLabel("no event ");

P7 m = new P7();
f.addMouseListener(m);

p.add(label1); p.add(label2); p.add(label3);

f.add(p);

f.show();
}

public void mousePressed(MouseEvent e)
{

label1.setText("mouse pressed at point:"+ e.getX() + " " + e.getY());
}

public void mouseReleased(MouseEvent e)
{

label1.setText("mouse released at point:"+ e.getX() + " " + e.getY());
}

public void mouseExited(MouseEvent e)
{

label2.setText("mouse exited through point:"+ e.getX() + " " + e.getY());
}

public void mouseEntered(MouseEvent e)
{

label2.setText("mouse entered at point:"+ e.getX() + " " + e.getY());
}

public void mouseClicked(MouseEvent e)
{

label3.setText("mouse clicked at point:"+ e.getX() + " "+ e.getY() + " mouse clicked :" + e.getClickCount());
}

}
