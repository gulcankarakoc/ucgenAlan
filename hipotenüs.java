import java.util.Scanner;
public class hipotenüs {
    public static void main(String[] args){
        double a,b;
        double c;
        Scanner kenar= new Scanner(System.in);

        System.out.print("A Kenarını Giriniz:");
        a=kenar.nextInt();

        System.out.print("B Kenarını Giriniz:");
        b=kenar.nextInt();

        System.out.print("C Kenarını Giriniz:");
        c=kenar.nextInt();

        double u,cevre,alan;
        u=(a+b+c)/2;
        cevre=u*2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Çevresi:"+cevre);
        System.out.println("Üçgenin Alanı:" + alan);






    }
}
