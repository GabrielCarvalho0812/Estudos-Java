import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n[] = {3, 2, 8, 7, 5, 4};

        for (int c = 0; c < n.length - 1; c++) {//length significa comprimento
            System.out.println("na posição " + c + " temos o valor" + n[c]); //colocar n na posiçao c
        }
        System.out.println();
        System.out.println();
        System.out.println();

        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int a = 0; a < mes.length; a++) {
            System.out.println("no mes de " + mes[a] + " tem " + tot[a] + "dias ao todo");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        int num [] = {5,6,3,7};
        Arrays.sort(num); // para colocar em ordem  
        for (int valor:num){
            System.out.println(valor);
        }


    }
}