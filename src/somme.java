import java.util.Scanner;
public class somme {
    public static void main(String []args) {
        Scanner clavier=new Scanner(System.in);
        float nb=0f; float somme = 0; // initialisation
        System.out.println("entre le nombre nb");
        nb=clavier.nextFloat();
        for(int i =0;i<=nb ;i++){ // condition
            somme=somme+i;
            System.out.println("la somme est "+somme+""); // resultat final
        }

    }
}

