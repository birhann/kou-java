import java.util.Scanner;

public class question2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int rowsCount = 4;
        int columnsCount = 0;

        int array2d[][] = new int[rowsCount][];

        int count = 1;
        for (int i = 0; i < array2d.length; i++) {

            System.out.println(i + 1 + ". satırın sütun sayısını giriniz.");
            columnsCount = sc.nextInt();
            for (int j = 0; j < columnsCount; j++) {
                System.out.println(count + ". elemanı giriniz.");
                count += 1;
                int value = sc.nextInt();
                array2d[i][j] = value;
            }
        }

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++)
                System.out.print(array2d[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}