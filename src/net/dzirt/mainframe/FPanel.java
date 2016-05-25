package net.dzirt.mainframe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Dzirt on 25.05.2016.
 */
public class FPanel extends JPanel{
    private ArrayList<FButton> buttonList = new ArrayList<>();

    FPanel(){
    }

    public void init(int N) {
        this.setLayout(new GridBagLayout());
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
               //if (k!=5){
                    buttonList.add(new FButton(i, j, k));
                    add(buttonList.get(k), new GridBagConstraints(j, i, 1, 1, 1, 1,
                        GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0));
                //}
                k++;
            }
        }
    }

}//buttonList.get(i).addActionListener(new BtnActionListener());
