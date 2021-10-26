import java.util.Scanner;

public class question1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] dizi1 = new int[5];
        int[] dizi2 = new int[5];
        System.out.println("İlk dizi elemanlarını giriniz.");
        for (int i = 0; i < 5; i++) {
            dizi1[i] = sc.nextInt();
        }

        System.out.println("İkinci dizi elemanlarını giriniz.");
        for (int i = 0; i < 5; i++) {
            dizi2[i] = sc.nextInt();
        }

        boolean isEqual = true;
        // for (int i = 0; i < 5; i++) {
        // if (dizi1[i] == dizi2[i]) {
        // isEqual = true;
        // } else {
        // isEqual = false;
        // }

        // }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (dizi1[i] == dizi2[j]) {
                    isEqual = true;
                    break;
                } else {
                    isEqual = false;
                    break;
                }

            }
            if (isEqual) {
                break;
            }
        }

        if (isEqual) {
            System.out.println("Diziler eşit!");
        } else {
            System.out.println("Diziler birbirine eşit değil!");
        }

        sc.close();
    }
}
