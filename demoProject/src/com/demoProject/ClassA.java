package com.demoProject;

import javax.swing.*;

public class ClassA {
    String msg="";

    public ClassA()
    {this.msg=msg;}

    public void showMsg()
    {
        JFrame f=new JFrame();
        JOptionPane.showMessageDialog(f,"This is a message from ClassA");
    }
}
