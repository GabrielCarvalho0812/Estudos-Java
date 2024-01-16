import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador extends JFrame  {
    private JPanel panel;
    private JButton bntContar;
    private JLabel lblContagem;

    public TelaContador() {
        setContentPane(panel);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500,400);



        bntContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cc = 0;
                String contagem = "";
                while (cc <5){
                    contagem = contagem + cc + "   ";
                    cc++;
                    lblContagem.setText(contagem);
                }

            }
        });
    }

    public static void main(String[] args) {
        new TelaContador();
    }

}

