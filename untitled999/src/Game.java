import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

import java.awt.event.*;
import java.io.*;

public class Game extends JFrame {
    private ImageIcon icon = new ImageIcon("backgroung.jpg");
    private ImageIcon icon1 = new ImageIcon("left.png");
    private ImageIcon icon2 = new ImageIcon("右.png");
    private ImageIcon icon3 = new ImageIcon("up.png");
    private ImageIcon icon4 = new ImageIcon("down.png");
    private ImageIcon icon5 = new ImageIcon("左2.png");
    private ImageIcon icon6 = new ImageIcon("右2.png");
    private ImageIcon icon7 = new ImageIcon("上2.png");
    private ImageIcon icon8 = new ImageIcon("下2.png");
    private ImageIcon icon9 = new ImageIcon("球.png");
    private  JLabel jlb = new JLabel();
    private JLabel jlb2 = new JLabel();
    private JLabel jlb3 = new JLabel();
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int screenw = screenSize.width;
    private int screenh = screenSize.height;
    private int frw =800 , frh =500 ;
    private int dirFlag = 1;
    private int  weight = 800 , hight = 460;
    Login li;
    public Game(Login lg){
        li = lg;
        ex1();
    }
    public void ex1() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(screenw/2-frw/2,screenh/2-frh/2,frw,frh);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Login fr = new Login();
                fr.setVisible(true);
            }
        });
        this.setLayout(null);
//        jlb.setOpaque(true);

        this.add(jlb);
        jlb.setBounds(0, 0, 800, 500);


        jlb.setIcon(icon);
        jlb.add(jlb2);


        jlb2.setIcon(icon1);
        jlb2.setBounds(0, 0, 80, 80);

        jlb3.setBounds(700,0,80,80);

        jlb.add(jlb3);
        jlb3.setIcon(icon8);
        this.setResizable(false);



        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()){
                    case KeyEvent.VK_RIGHT :
                        jlb2.setIcon(icon2);
                        if (jlb2.getX() + 80 < weight){
                            jlb2.setLocation(jlb2.getX()+10,jlb2.getY());
                        }else {
                            dirFlag = 2;
                        }
                        break;

                    case KeyEvent.VK_LEFT :
                        jlb2.setIcon(icon1);
                        if (jlb2.getX() > 0){
                            jlb2.setLocation(jlb2.getX()-10,jlb2.getY());
                        }else {
                            dirFlag = 1;
                        }
                        break;

                    case KeyEvent.VK_UP :
                        jlb2.setIcon(icon3);
                        if (jlb2.getY() > 0){
                            jlb2.setLocation(jlb2.getX(),jlb2.getY()-10);
                        }else {
                            dirFlag = 4;
                        }
                        break;

                    case KeyEvent.VK_DOWN :
                        jlb2.setIcon(icon4);
                        if ((jlb2.getY()+80 ) < hight){
                            jlb2.setLocation(jlb2.getX(),jlb2.getY()+10);
                        } else {
                            dirFlag = 3;
                        }
                        break;

                    case KeyEvent.VK_A :
                        jlb3.setIcon(icon5);
                        if (jlb3.getX() > 0){
                            jlb3.setLocation(jlb3.getX()-10,jlb3.getY());
                        }else {
                            dirFlag = 5;
                        }
                        break;

                    case KeyEvent.VK_S :
                        jlb3.setIcon(icon8);
                        if ((jlb3.getY()+80 ) < hight){
                            jlb3.setLocation(jlb3.getX(),jlb3.getY()+10);
                        } else {
                            dirFlag = 8;
                        }
                        break;

                    case KeyEvent.VK_D :
                        jlb3.setIcon(icon6);
                        if ((jlb3.getX() + 80) < weight){
                            jlb3.setLocation(jlb3.getX()+10,jlb3.getY());
                        }else {
                            dirFlag = 6;
                        }
                        break;

                    case KeyEvent.VK_W :
                        jlb3.setIcon(icon7);
                        if (jlb3.getY() > 0){
                            jlb3.setLocation(jlb3.getX(),jlb3.getY()-10);
                        }else {
                            dirFlag = 7;
                        }
                        break;
                    case KeyEvent.VK_SPACE:
                        jlb2.setIcon(icon9);
                        
                }
            }
        });


    }
}