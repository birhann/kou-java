public class App {
    public static void main(String[] args) throws Exception {
        int sayac = 0;
        int sayac1 = 0;
        String metin = "Bugün hava çok güzel Yürüyüş yoluna gidelim";
        String sesliler = "a";
        // String buyuk = "ABCDEFGHIİJKLMNOÖPRSŞTUÜVYZ";

        for (int i = 0; i <= metin.length() - 1; i++) {
            for (int j = 0; j <= 0; j++) {
                if (metin.charAt(i) == sesliler.charAt(j)) {
                    sayac++;
                }

            }

        }
        for (int k = 0; k <= metin.length() - 1; k++) {
            for (int m = 0; k <= 27; k++) {
                if (metin.charAt(k) == sesliler.charAt(m)) {
                    sayac1++;
                }
            }
        }

        System.out.println("a harfi:" + sayac);
        System.out.println("Büyük harf:" + sayac1);
    }
}
