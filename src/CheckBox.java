/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox {
    public static void main(String[] args) {
        JPanel panel =new JPanel();
        panel.setBackground(Color.green);
        panel.setBounds(200,200,200,100);
        panel.setToolTipText("serkan");
        JFrame frame=new JFrame("CheckBox");
        JCheckBox ch1=new JCheckBox("Java ögrenmek istioyrum");
        ch1.setBackground(Color.blue);
        JLabel label=new JLabel("yazii");
        label.setBounds(100,70,250,40);

        ch1.setBounds(100,100,250,40);
        JCheckBox ch2=new JCheckBox("C ögrenmek istiyorum");
        ch2.setBackground(Color.yellow);
        ch2.setBounds(100,130,250,50);
        JButton button =new JButton("tikla");
        button.setBounds(100,170,100,50);
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java ile egitim"+(e.getStateChange()== 1 ? "secildi":"secilmedi"));

            }
        });
        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("C ile ögren"+(e.getStateChange()== 1 ? "secildi":"secilmedi"));

            }
        });
        frame.add(panel);
        frame.add(label);
        frame.add(button);
        frame.add(ch1);
        frame.add(ch2);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
*/