import java.util.Scanner;

public class question1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Bir Paragraf Giriniz:\n");
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine();
        int whitespaceCount = 0;
        int lowerLetterCount = 0;

        for (int i = 0; i <= paragraph.length() - 1; i++) {
            if (paragraph.charAt(i) == ' ') {
                whitespaceCount++;
            }
            if (Character.isLowerCase(paragraph.charAt(i))) {
                lowerLetterCount++;
            }

        }

        System.out.println("White Space Count: " + whitespaceCount);
        System.out.println("Lowercase Count: " + lowerLetterCount);
        sc.close();
    }
}
