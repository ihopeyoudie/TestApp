package net.dzirt.mainframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Андрей on 24.05.2016.
 */
public class MainFrame extends JFrame{

    private JButton btn1 = new JButton("Button 1");

    //private JPanel grid = new JPanel();
    //private GridLayout gl = new GridLayout(4, 4, 2, 2);
    private FPanel grid = new FPanel();
    private String title;
    private Dimension d;

    public MainFrame(String title, Dimension d) {
        this.title = title;
        this.d = d;
    }

    public void init(){
        setTitle(title);
        setSize(d);
        //setLayout(new GridBagLayout());
        //grid.setLayout(gl);
        grid.init(4);
        add(grid);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //btn1.addActionListener(new Btn1ActionListener());
        //add(text1);

        setVisible(true);
        pack();
    }


    public class BtnActionListener implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent event){
            System.out.println("Clickckckck");
        }
    }
}
