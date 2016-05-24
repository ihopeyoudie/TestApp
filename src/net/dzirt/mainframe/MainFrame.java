package net.dzirt.mainframe;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Андрей on 24.05.2016.
 */
public class MainFrame extends JFrame{
    //private JFrame frame1 = new JFrame("Listener Test");
    private JButton btn1 = new JButton("Button 1");
    private String title;
    private Dimension d;

    public MainFrame(String title, Dimension d) {
        this.title = title;
        this.d = d;
    }

    public void init(){
        setTitle(title);
        setSize(d);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btn1.addActionListener(new Btn1ActionListener());
        add(btn1);

        setVisible(true);
        pack();
    }

    public class Btn1ActionListener implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent event){
            System.out.println("Clickckckck");
        }
    }
}
