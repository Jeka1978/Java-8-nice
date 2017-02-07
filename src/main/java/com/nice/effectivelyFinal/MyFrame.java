package com.nice.effectivelyFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 07/02/2017.
 */
public class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        JButton button = new JButton("click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("already clicked");
//                button = new JButton();
            }
        });
    }
}
