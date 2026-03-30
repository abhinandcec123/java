import java.awt.*;
import java.awt.event.*;

class CalculatorAWT extends Frame implements ActionListener {
    TextField t1, t2;
    Label result;
    Button add, sub, mul, div;

    CalculatorAWT() {
        setLayout(new FlowLayout());

        t1 = new TextField(10);
        t2 = new TextField(10);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        result = new Label("Result: ");

        add(t1); add(t2);
        add(add); add(sub); add(mul); add(div);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double res = 0;

        if (e.getSource() == add) res = a + b;
        if (e.getSource() == sub) res = a - b;
        if (e.getSource() == mul) res = a * b;
        if (e.getSource() == div) res = a / b;

        result.setText("Result: " + res);
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}
