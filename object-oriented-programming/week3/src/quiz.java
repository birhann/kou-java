import java.util.Scanner;

public class quiz {
    public static void main(String[] args) throws Exception {
        int en_kucuk = 0;
        int z = 1;
        while (z != 0) {

            System.out.println("sayı giriniz:");
            Scanner keyboard = new Scanner(System.in);
            int sayi = keyboard.nextInt();
            if (sayi < en_kucuk) {
                en_kucuk = sayi;
            }
            if (sayi == 0) {
                z = 0;
                System.out.println("en kücük sayı:" + en_kucuk);
            }
            keyboard.close();
        }
    }
}
