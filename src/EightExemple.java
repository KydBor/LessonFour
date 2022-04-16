import java.util.Random;

public class EightExemple {
    public static void main (String[] args) {
        int[] Masiv1 = new int[10];
        int[] Masiv2 = new int[10];
        double[] Masiv3 = new double[10];
        int a = 0;
        for (int i = 0, b = 1; b <= 4; i++) {
            if (b == 1) {
                Random random = new Random();
                Masiv1 [i] = random.nextInt (10);
                if(i == 0)
                    System.out.print(b + " массив: ");
                System.out.print(Masiv1[i] + " ");
                if (i == Masiv1.length - 1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }
            if (b == 2) {
                Random random = new Random();
                Masiv2 [i] = random.nextInt(10);
                if (i == 0)
                    System.out.print(b + " массив: ");
                System.out.print(Masiv2[i] + " ");
                if (i == Masiv2.length - 1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }
            if (b == 3) {
                Masiv3[i] = (double) Masiv1[i] / Masiv2[i];
                if (i == 0)
                    System.out.print(b + " массив: ");
                System.out.print(Masiv3[i] + "    ");
                if (i == Masiv3.length - 1) {
                    b++;
                    i = 0;
                    System.out.println(" ");
                }
            }

            if (b == 4) {
                if (Masiv3[i] % (int)Masiv3[i] == 0) {
                    if (a == 0)
                        System.out.print("Целые числа: ");
                    a++;
                    System.out.print(Masiv3[i] + "; ");
                }
                if (i == Masiv3.length - 1) {
                    if(a == 0)
                        System.out.println("Нет целых чисел");
                    break;
                }
            }
        }
    }
}
