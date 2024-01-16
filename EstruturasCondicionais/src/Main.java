import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner teclado = new Scanner(System.in); //  sempre q usar new esta criando um objeto scaner metodo para ler dados.... System.in para entrada
        System.out.print("Digite a primera Nota:");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a Segunda Nota:");
        float n2 = teclado.nextFloat();
        float m = (int) ((n1 + n2)/2);
        System.out.println("Sua Média é " + m);
        if (n1 >=7){
            System.out.println("Parabens");
        }else System.out.println("nota abaixo da Média ");
        System.out.println();


        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a cidade: ");
        String cidade = entrada.nextLine();
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        entrada.close();
    }
}
















