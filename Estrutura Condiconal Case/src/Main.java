import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("digite numero de pernas:");
        int animal = p.nextInt();
        String tipo;
        switch (animal){
            case 1:
                tipo = "sapo";
                break;

            case 2:
                tipo = "gamba";
                break;

            case 3:
                tipo = "macaco";
                break;

            case 4:
                tipo = "baleia";
                break;

            case 5:
                tipo = "gato";
                break;

            case 6:
                tipo = "leão";
                break;

            case 8:
                tipo = "foca";
                break;

            default:
                tipo = "et";
        }
        System.out.println(tipo);
    }

}