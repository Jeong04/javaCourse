package ch07.finalClass;

import javax.swing.*;
import java.awt.*;

public class MyFinal extends JFrame {
    public MyFinal() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Frame...");
        setLayout(new FlowLayout());

        JButton button = new JButton("버튼");
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFinal f = new MyFinal();
    }
}
