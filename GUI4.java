import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class GUI4 
{
    public static void main(String args[])
    {
        new Frame4("Using CheckButtons");
    }
}

class Frame4 implements ItemListener
{
    JFrame GUI4;
    JLabel label1,label2;
    JCheckBox cb1, cb2, cb3;
    Frame4(String s)
    {
        GUI4 = new JFrame(s);
        cb1 = new JCheckBox("Apple");
        cb1.addItemListener(this);
        cb2 = new JCheckBox("Banana");
        cb2.addItemListener(this);
        cb3 = new JCheckBox("Orange");
        cb3.addItemListener(this);
        label1 = new JLabel("Select your favourite fruit");
        label2 = new JLabel("");
        GUI4.add(label1);
        GUI4.add(cb1);
        GUI4.add(cb2);
        GUI4.add(cb3);
        GUI4.add(label2);
        GUI4.setLayout(new FlowLayout(FlowLayout.CENTER));
        GUI4.setSize(300,300);
        GUI4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI4.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie)
    {   
        String selected = "";
        if(cb1.isSelected())
            selected += "Apple";
        if(cb2.isSelected())
            selected += "Banana";
        if(cb3.isSelected())
            selected += "Orange";
        label2.setText("You selected: " +selected);
    }
}