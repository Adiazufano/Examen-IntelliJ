import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero mayor o igual a 10:");
        int num = Integer.valueOf(sc.nextLine());
        int num1=num;
        int resto=num1%10;
        int inverso=0;
         inverso=(inverso*10)+resto;
        if(inverso==num)
        {
            System.out.println("Es capicua");
        }


    }

    }

