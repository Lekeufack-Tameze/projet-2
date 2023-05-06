import java.util.Scanner;

public class factiriel {
    public static void main(String []args) {
        Scanner clavier=new Scanner(System.in);
        float nb=0f; float factoriel = 1; // initialisation
        System.out.println("entre le nombre nb");// entrée des variables
        nb=clavier.nextFloat();
        for(int i =1;i<=nb ;i++){  // condition
            factoriel=factoriel*i;
            System.out.println("le factoriel est "+factoriel+"");
        }

    }
}
