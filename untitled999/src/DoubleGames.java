import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

import java.awt.event.*;
import java.io.*;

public class DoubleGames extends JFrame {
    private ImageIcon icon = new ImageIcon("aa.png");
    private  JLabel jlb = new JLabel();
    private JLabel jlb2 = new JLabel();
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int screenw = screenSize.width;
    private int screenh = screenSize.height;
    private int frw =800 , frh =500 ;

    private int  weight = 800 , hight = 460;
    public DoubleGames(){
        ex1();
    }
    public void ex1() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(screenw/2-frw/2,screenh/2-frh/2,frw,frh);
        this.setLayout(null);
        jlb.setOpaque(true);
        this.add(jlb);
        jlb.setBounds(0, 0, 800, 500);
        jlb.setIcon(icon);
        jlb.add(jlb2);
        jlb2.setBounds(0, 0, 80, 80);
        this.setResizable(false);






    }
}