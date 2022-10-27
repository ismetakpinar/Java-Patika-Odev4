import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        double gidilenyol;
        double kmbasiucret= 2.20;
        double tutar ;
        int acilisucreti = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen yolu KM cinsinden giriniz :");
        gidilenyol = input.nextDouble();

        tutar = gidilenyol*kmbasiucret + acilisucreti;

        tutar = tutar <20 ? 20 : tutar;
        System.out.println("Ödenecek ücret : " + tutar);
    }


}
