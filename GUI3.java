import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class GUI3
{
    public static void main(String args[])
    {
        new Frame3("Using Text Field");
    }
}
class Frame3 implements ActionListener
{
    JFrame GUI3;
    JLabel label;
    JButton btn;
    JTextField txt;
    Frame3(String s)
    {
        GUI3 = new JFrame(s);
        label = new JLabel("Data");
        txt = new JTextField(20);
        btn = new JButton("Click");
        btn.addActionListener(this);
        GUI3.add(label);
        GUI3.add(txt);
        GUI3.add(btn);
        GUI3.setLayout(new FlowLayout(FlowLayout.LEFT));
        GUI3.setSize(300,300);
        GUI3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI3.setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("Click"))
        {
            label.setText("Data entered");
        }
    }
}