// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String nome1  = "gabriel";
        String nome2 = "gabriel";
        String res;
        res = (nome1.equals(nome2))?"igual":"difernere";  //equals  serve para ver se o objeto é igual ao outro
        System.out.println(res);



        int n1 = 6;
        int n2 = 9;
        String resultado;
        resultado= ((n1 == n2) ? "igaul" : "diferente");  // ? recebebe ENTÃO igual ...  : OU  recebe diferente
        System.out.println(resultado);
        boolean teste = 11 > 10;
        System.out.println(teste);



        int  a,b,c;
        a = 1;
        b = 6;
        c = 12;
        boolean d;
        d  =(a>b && b<c)?true:false;    //boolean para ver se o valor é verdadeiro ou falso 
        System.out.println(d);

        }
    }
