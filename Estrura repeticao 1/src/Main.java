import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n ;
       int s = 0 ;
       String resp;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("digite um numero:");
            n = teclado.nextInt();
            s = s + n;
            System.out.print("quer continuar? S/N:");
            resp = teclado.next();
        }while (resp.equals("s"));
        System.out.println("a soma dos valores é " + s);

    }
}