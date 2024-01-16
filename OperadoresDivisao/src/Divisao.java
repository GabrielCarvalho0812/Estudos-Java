import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Divisao extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton bntDividir;
    private JLabel lbldivisao;
    private JPanel main;

    public Divisao() {
        setTitle("faça sua divisao");
        setContentPane(main);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,200);
        setLocationRelativeTo(null);
        setVisible(true);

        bntDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1 = Integer.parseInt(textField1.getText());
                int n2 = Integer.parseInt(textField2.getText());
                float d = n1 / n2;
                lbldivisao.setText(String.valueOf(d));

                if (d %2 ==0){  //%2 para ver se ele é par
                    JOptionPane.showMessageDialog(null,"o numero" +d +" é par");
                    return;
                }else {
                    JOptionPane.showMessageDialog(null,"o numero" + d + "é impar");
                }
            }
        });
    }


    public static void main(String[] args) {

        new Divisao ();
    }
}



