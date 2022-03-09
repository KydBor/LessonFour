import java.util.Random;

public class SixExemple {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}