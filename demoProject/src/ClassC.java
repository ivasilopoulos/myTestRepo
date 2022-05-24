package com.demoProject;

import javax.swing.*;

public class ClassC extends ClassA{

    public void showMsg()
    {
        JFrame f=new JFrame();
        JOptionPane.showMessageDialog(f,"This is a message from ClassC!!!!!!");
        f.dispose();
    }
    /// new function ()
}
