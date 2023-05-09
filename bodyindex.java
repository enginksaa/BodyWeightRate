import java.util.Scanner;

public class bodyindex {

    public static void main(String[] args) {

        Scanner userEntry = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz (örnek:1.72):");
        double boy = userEntry.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        double kilo = userEntry.nextDouble();
        double endeks = (kilo) / (boy * boy);
        System.out.print("Vücut Kitle endeksiniz" + endeks);

    }

}
