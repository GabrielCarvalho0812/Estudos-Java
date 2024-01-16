import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaVerificador extends JFrame {
    private JTextField txtnumero;
    private JButton btnSoma;
    private JLabel lblresul;
    private JPanel panel;

    public TelaVerificador(){
        setContentPane(panel);
        setTitle("Verificador");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true);


        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num  = Integer.parseInt(txtnumero.getText());
                if (num %2==0){
                    lblresul.setText("o numero " +num + " é Par");
                }else {
                    lblresul.setText("o numero " + num + " é Impar");
                }
            }
        });
    }

    public static void main(String[] args) {
        new TelaVerificador();
    }
}


