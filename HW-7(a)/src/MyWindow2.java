import com.sun.deploy.panel.JSmartTextArea;

import javax.swing.*;
import java.awt.*;

public class MyWindow2<publik> extends JFrame {

    int b;
    public MyWindow2() {
        setBounds(200, 200, 900, 700 );
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Мое первое приложение");

        JPanel panel = new JPanel(new GridLayout(4, 10));

        Font font = new Font("arial", Font.PLAIN, 100);
        Font font2 = new Font("arial", Font.PLAIN, 50);

        JSmartTextArea area = new JSmartTextArea();


        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("0");
        JButton button00 = new JButton("00");
        JButton buttonRavno = new JButton("=");

        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonDelete = new JButton("/");
        JButton buttonUmnoj = new JButton("*");

//        button1.setBounds(200, 200, 100, 100 );
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);
        button5.setFont(font);
        button6.setFont(font);
        button7.setFont(font);
        button8.setFont(font);
        button9.setFont(font);
        button10.setFont(font);
        button00.setFont(font);
        buttonRavno.setFont(font);

        buttonPlus.setFont(font);
        buttonMinus.setFont(font);
        buttonDelete.setFont(font);
        buttonUmnoj.setFont(font);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button00);
        panel.add(buttonRavno);

        panel.add(buttonPlus);
        panel.add(buttonMinus);
        panel.add(buttonDelete);
        panel.add(buttonUmnoj);

        button1.addActionListener(e -> area.append("1") );
        button2.addActionListener(e -> area.append("2") );
        button3.addActionListener(e -> area.append("3") );
        button4.addActionListener(e -> area.append("4") );
        button5.addActionListener(e -> area.append("5") );
        button6.addActionListener(e -> area.append("6") );
        button7.addActionListener(e -> area.append("7") );
        button8.addActionListener(e -> area.append("8") );
        button9.addActionListener(e -> area.append("9") );
        button10.addActionListener(e -> area.append("0") );
        button00.addActionListener(e -> area.append("00") );



        buttonPlus.addActionListener(e -> { String a = area.getText();
            int aa = Integer.parseInt(a);
            area.setText("");

            buttonRavno.addActionListener(event -> { String b = area.getText();
                int bb = Integer.parseInt(b);
                int ab = aa+bb;
                String abb = Integer.toString(ab);
                area.setText(abb); });});


        buttonMinus.addActionListener(e -> { String a = area.getText();
            int aa = Integer.parseInt(a);
            area.setText("");

            buttonRavno.addActionListener(event -> { String b = area.getText();
                int bb = Integer.parseInt(b);
                int ab = aa-aa;
                String abb = Integer.toString(ab);
                area.setText(abb); });});


        buttonDelete.addActionListener(e -> { String a = area.getText();
            Double aa = Double.valueOf(a);
            area.setText("");

            buttonRavno.addActionListener(event -> { String b = area.getText();
                Double bb = Double.valueOf(b);
                Double ab = aa/bb;
                String abb = String.valueOf(ab);
                area.setText(abb); });});

        buttonUmnoj.addActionListener(e -> { String a = area.getText();
            Double aa = Double.valueOf(a);
            area.setText("");

            buttonRavno.addActionListener(event -> { String b = area.getText();
                Double bb = Double.valueOf(b);
                Double ab = aa*bb;
                String abb = String.valueOf(ab);
                area.setText(abb); });});
        area.setText("");


        buttonPlus.setFont(font);
        buttonMinus.setFont(font);
        buttonDelete.setFont(font);
        buttonUmnoj.setFont(font);

        add(panel, BorderLayout.SOUTH);
        add(area, BorderLayout.CENTER);

        area.setFont(font2);

        setVisible(true);
    }
}
