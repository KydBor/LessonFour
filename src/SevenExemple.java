import java.util.Random;

public class SevenExemple {
    public static void main (String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            if (a <= array[i]) {
                a = array[i];
                b = i;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("Индекс максимального элемента: " + b);
    }
}
