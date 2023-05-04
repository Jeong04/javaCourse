package ch09.lab_ActionListener;

import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

class MyClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Beep");
    }
}

public class CallbackTest {
    public static void main(String[] args) {
        ActionListener listener = new MyClass();
        Timer t = new Timer(1000, listener);
        t.start();

        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter to quit!");
        input.nextLine();
        input.close();
    }
}
