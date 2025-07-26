public class calcswing {
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("Simple Calculator");
        javax.swing.JTextField t1 = new javax.swing.JTextField(10);
        javax.swing.JTextField t2 = new javax.swing.JTextField(10);
        javax.swing.JButton add = new javax.swing.JButton("Add");
        javax.swing.JLabel result = new javax.swing.JLabel("Result:");

        add.addActionListener(e -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            result.setText("Result: " + (num1 + num2));
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(new javax.swing.JLabel("Num 1:"));
        frame.add(t1);
        frame.add(new javax.swing.JLabel("Num 2:"));
        frame.add(t2);
        frame.add(add);
        frame.add(result);

        frame.setSize(250, 200);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
