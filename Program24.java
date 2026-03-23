import java.awt.*;
import java.awt.event.*;

public class MaxOfThreeNumbers extends Frame implements ActionListener {
    Label l1, l2, l3, l4;
    TextField t1, t2, t3;
    Button b;

    public MaxOfThreeNumbers() {
        setLayout(new FlowLayout());

        l1 = new Label("Enter first number:");
        t1 = new TextField(10);
        add(l1);
        add(t1);

        l2 = new Label("Enter second number:");
        t2 = new TextField(10);
        add(l2);
        add(t2);

        l3 = new Label("Enter third number:");
        t3 = new TextField(10);
        add(l3);
        add(t3);

        b = new Button("Find Max");
        b.addActionListener(this);
        add(b);

        l4 = new Label("Result:");
        add(l4);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());

        int max = Math.max(a, Math.max(b, c));
        l4.setText("Result: " + max);
    }

    public static void main(String[] args) {
        MaxOfThreeNumbers m = new MaxOfThreeNumbers();
        m.setSize(300, 200);
        m.setVisible(true);
    }
}
