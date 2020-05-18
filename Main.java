package project;
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements
MouseListener, MouseMotionListener {
TextField tf;
public Main (String title){
super(title);
tf = new TextField(60);
addMouseListener(this);
}
public void launchFrame() {
/* Menambah komponen ke frame */
add(tf, BorderLayout.SOUTH);
setSize(300,300);
setVisible(true);
}
public void mouseClicked(MouseEvent me) {
String msg = "Mouse clicked.";
tf.setText(msg);
}
public void mouseEntered(MouseEvent me) {
String msg = "Mouse entered component.";
tf.setText(msg);
}
public void mouseExited(MouseEvent me) {
String msg = "Mouse exited component.";
tf.setText(msg);
}
public void mousePressed(MouseEvent me) {
String msg = "Mouse pressed.";
tf.setText(msg);
}
public void mouseReleased(MouseEvent me) {
String msg = "Mouse released.";
tf.setText(msg);
}
public void mouseDragged(MouseEvent me) {
String msg = "Mouse dragged at " + me.getX() + "," +
me.getY();
tf.setText(msg);
}
public void mouseMoved(MouseEvent me) {
String msg = "Mouse moved at " + me.getX() + "," +
me.getY();
tf.setText(msg);
}
public static void main(String args[]) {
Main med = new Main ("Mouse EventsDemo");
med.launchFrame();
}
}
package program;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame {
    private JButton tombol, btnExit;
    public Main() {
        super ("Event Handling");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        ClickListener cl = new ClickListener();
        tombol = new JButton ("Click Me!");
        tombol.addActionListener(cl);
        container.add(tombol);
        btnExit = new JButton("Exit");
        btnExit.addActionListener(cl);
        container.add(btnExit);
        setSize (200,100);
        setVisible (true);
    }
    public static void main (String arg[]){
        Main test = new Main();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private class ClickListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            if (e.getSource() == tombol) {
                JOptionPane.showMessageDialog(null, "You click me, guys!!!");
            }
            else if (e.getSource() == btnExit) {
                JOptionPane.showMessageDialog(null, "see you, guys!!!");
                System.exit(0);
            }
        }
    }
}
