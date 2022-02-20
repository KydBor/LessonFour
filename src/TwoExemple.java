public class TwoExemple {
    public static void main(String[] args) {
        int a = 1;
        int[] array = new int[100];
        for (int i = 0; i < 50; i++) {
            array[i] = a;
            a += 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 99; i > 0; i -= 2) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }
}
