import java.util.Scanner;

public class preg04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ganancia: ");
        float ganancia = sc.nextFloat();

        float donativo=0;

        if((ganancia >= 0)&&(ganancia <= 1000)){
            donativo = (float) (ganancia * 0.05);
            System.out.println("Donación: S/. "+donativo);
        }else if((ganancia > 1000)&&(ganancia <= 1500)){
            donativo = (float)(ganancia*0.07);
            System.out.println("Donación: S/. "+donativo);
        }else if((ganancia > 1500)&&(ganancia <= 2000)){
            donativo = (float)(ganancia*0.08);
            System.out.println("Donación: S/. "+donativo);
        }else if((ganancia > 2000)&&(ganancia <= 5000)){
            donativo = (float)(ganancia*0.1);
            System.out.println("Donación: S/. "+donativo);
        }else if((ganancia > 5000)){
            donativo = (float)(ganancia*0.15);
            System.out.println("Donación: S/. "+donativo);
        }else{
            System.out.println("Ingrese un valor positivo");
        }
    }
}
