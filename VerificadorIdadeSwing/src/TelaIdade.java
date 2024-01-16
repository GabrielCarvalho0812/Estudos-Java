import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaIdade extends JFrame {
    private JTextField txtAno;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JLabel lblSituacao;
    private JPanel panel;

    public TelaIdade() {
        setTitle("Calcular Idade");
        setContentPane(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true);

        

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano = Integer.parseInt(txtAno.getText());
                int idade = 2024 - ano -1;
                lblIdade.setText(String.valueOf(idade));
                if (idade>=18){
                      lblSituacao.setText("voce é maior de Idade");
                }else lblSituacao.setText("vc é menor de idade");
            }
        });
    }

    public static void main(String[] args) {
        new TelaIdade();

    }
}



