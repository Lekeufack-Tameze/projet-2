// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner clavier=new Scanner(System.in);
            int a=0,b=0;
            System.out.println("entrer la valeur de a");
            a=clavier.nextInt();
            System.out.println("entrer la valeur de b");
            b=clavier.nextInt();
            if(a<0 && b<0){
                System.out.println("le produit de "+a+" et "+b+" est positif");
            }
            else if(a>0 && b>0){
                System.out.println("le produit de "+a+"et "+b+" est positif");
            }
            else if (a>0 && b<0){
                System.out.println("le produit de "+a+" et "+b+" est negatif");
            }
            else if (a<0 && b>0) {
                System.out.println("le produit de "+a+" et "+b+" est negatif");
            }
        }

}