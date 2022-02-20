import java.util.Random;

public class ThreeExemple {
    public static void main(String[] args) {
        int j = 0;
        int[] array = new int[16];
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");

            if (array[i] % 2 == 0) {
                j++;
            }
        }
        System.out.println();
        System.out.println("Всего Чётных чисел " + j);
    }
}
