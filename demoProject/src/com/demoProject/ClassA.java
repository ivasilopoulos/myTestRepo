package com.demoProject;

import javax.swing.*;

public class ClassA {

    public void showMsg()
    {
        JFrame f=new JFrame();
        JOptionPane.showMessageDialog(f,"This is a message from ClassA");
        f.dispose();
    }
}
