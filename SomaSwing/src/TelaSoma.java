import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma extends JFrame {
    private JPanel panel1;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnSoma;
    private JLabel lblSoma;

    public TelaSoma() {
        setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText()); //método getText serve para pegar o texto
                int n2 = Integer.parseInt(txtN2.getText());
                int s = n1 + n2;
                lblSoma.setText(String.valueOf(s));  //método setText serve para mundar o q esta no campo de texto o texto

            }
        });

    }


    public static void main(String[] args) {
        new TelaSoma();
    }



}
