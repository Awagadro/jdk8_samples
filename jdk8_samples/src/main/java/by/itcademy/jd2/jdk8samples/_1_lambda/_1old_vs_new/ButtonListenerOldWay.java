package by.itcademy.jd2.jdk8samples._1_lambda._1old_vs_new;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerOldWay {
    public static void main(final String[] args) {
        final Frame frame = new Frame("ActionListener Before Java8");

        final Button b = new Button("Click Here");
        b.setBounds(50, 100, 80, 50);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                System.out.println("Hello World!");
            }
        });
        frame.add(b);

        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}