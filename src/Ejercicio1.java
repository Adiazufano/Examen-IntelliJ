import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor para el primer numero : ");
       int num1 =Integer.valueOf(sc.nextLine());
        System.out.println("Introduzca un valor para el primer numero : ");
        int num2 =Integer.valueOf(sc.nextLine());
        if(num1%10 == num2%10)
        {
            System.out.println("Los dos numeros acaban con la misma cifra");
        }
        else
        {
            System.out.println("los numeros acaban con distintas cifras");
        }
    }
}


