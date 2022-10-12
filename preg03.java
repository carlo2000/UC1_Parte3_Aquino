import java.util.Scanner;

public class preg03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de horas: ");
        int numero = sc.nextInt();

        int total=0, hadd=0, madd=0;

        if(numero <= 4){
            total = 6;
            System.out.println("Importe a pagar: S/. "+total);
        }
        else{
            hadd = numero - 4;
            madd = hadd*2;
            total = 6 + madd;
            System.out.println("Importe a pagar: S/. "+total);
        }


    }
}