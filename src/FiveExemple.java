import java.util.Random;

public class FiveExemple {
    public static void main(String[] args) {
        int [] array1 = new int [5];
        int [] array2 = new int [5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(15);

            System.out.print(array1[i] + " ");


        }System.out.println();
        for (int i = 0; i < 5; i++) {

            array2[i] = random.nextInt(15);


            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int t = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            t += array1[i];
            y += array2[i];

            t = array1[i] / 5;
            y = array2[i] / 5;
        }
        if (t > y) {
            System.out.println("Первый массив больше второго");
        } else if (t == y) {
            System.out.println("массивы равны");
        } else {
            System.out.println("Второй массив больше первого");
        }
    }
}
