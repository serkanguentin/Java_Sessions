package Swing;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combobox {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        String arr [] ={"Pyhton","Php","Java"};
        JComboBox cb =new JComboBox(arr);

        cb.setBounds(50,100,90,20);
        JButton button=new JButton("Seciniz");
        button.setBounds(50,125,90,20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text ="I selected "+    cb.getItemAt(cb.getSelectedIndex())  ;
                System.out.println(text);

            }
        });

        frame.add(button);
        frame.add(cb);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
