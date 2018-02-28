
import java.util.Scanner;

class untitled5{
    public static void main(String[] args){


        int a;
        int b;
        Scanner czytaj = new Scanner(System.in);
        System.out.println("Podaj 1 liczbe:");
        a  = czytaj.nextInt();
        System.out.println(a);
        System.out.println("Podaj 2 liczbe:");
        b = czytaj.nextInt();
        System.out.println(a+"+"+b+"="+(float)(a+b)/100000);



    }
}