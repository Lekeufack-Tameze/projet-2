import java.util.Scanner;
public class age {
    public static void main (String[]args){
        Scanner clavier=new Scanner(System.in);
        float age=0; // initialisation des ages
        System.out.println("entrer l'age ");
        age=clavier.nextFloat();
        if(age>6 && age <=7){
            System.out.println(" poussin");
        } else if (age>8 && age <=9) {
            System.out.println("pupille");
        }else if (age>10 && age <=11) {
            System.out.println("Minime");
        } else if (age>12) {
            System.out.println("cadet");
        }


    }
}
