import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("em que ano você nasceu:");
        int ano = t.nextInt();
        int idade = 2024 - ano - 1;
        System.out.println("sua idade é " +idade);
        if (idade>=18){
            System.out.println("voce é maior de idade");
        }else {
            System.out.println("voce é menor de idade");
        }

    }
}