package oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        JLabel yazi=new JLabel("yazimiz bu");
        yazi.setText("yazimiz bu");
        yazi.setBounds(40,40,240,40);
        JButton button=new JButton("butona  tikla");
        button.setBounds(200,200,140,40);
        button.addActionListener(new ActionListener() {
            int c=1;
            @Override
            public void actionPerformed(ActionEvent e) {
                yazi.setText("butona "+c++ +"kez tiklandi");
            }
        });




        frame.add(yazi);
        frame.add(button);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
