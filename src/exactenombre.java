import java.util.Scanner;
public class exactenombre {
    public static void main (String[]args){
        Scanner clavier=new Scanner(System.in);
        float nb=0;
        System.out.println("entrer le nb ");
        nb=clavier.nextFloat();
        if  (nb>10 &&  nb<=20){
            System.out.println("le nombre entré est exacte");
        } else if (nb>20){
            System.out.println("plus grand");

        }else if (nb<10){
            System.out.println("plus petit");

        }

    }
}
