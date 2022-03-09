import java.util.Random;

public class SevenExemple {
    // не доделана
    public static void main (String[] args){
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }
    }

}
