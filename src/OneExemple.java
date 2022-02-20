public class OneExemple {
    public static void main(String[] args) {
        int a = 2;

        int [] array = new int [22];
        for (int i = 0; i < 10; i++) {
            array [i] = a;
            a += 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 2; i <= 20; i += 2) {
            array [i] = i;
            System.out.println(array[i]);
        }
    }
}
