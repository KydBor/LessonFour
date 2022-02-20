public class LessonFour {
    public static void main(String[] args) {
/*        int [] array = new int [3];
        array[0] = 56;
        array[1] = 345;
        array[2] = 123;
        //Через числа [] прыгать нельзя//
        //Чтобы писать много значений пригодится цикл for//
        for(int i = 0; i < 3; i++){
            System.out.println(array[i]);
        }
        */

/*             [0,  1,  2 ]
               [56,345,123] - array
                      1
               array [i]        i = 1;
               345
               */


/*            Scanner scanner = new Scanner(System.in); //сылочный тип данных, сканер предоставляет возможность вписывать инфу с клавы//
            System.out.println("Enter the value: "); // Есть команда next//
            int a = scanner.nextInt();
            System.out.println (a);//пишем любое число с клавы после run//
            */

/*        Scanner scanner = new Scanner(System.in);
        int [] array = new int [5];
        for(int i = 0; i < 5; i++){
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();//тут выводим данные после run//
        }
        for(int i = 0; i < 5; i++){
            System.out.println(array[i]);// эта команда выполняет данные после заполнения данных//
        }
        */


/*        Random random = new Random(); // позволяет генерировать случайные значения//
//        int a = random.nextInt(i); //необходимо написать длинну масива//
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100)); //( bound: 100))//
        }
        */
/*
// выводит рандомные чётные значения//
        int [] array = new int [10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array [i] = random.nextInt(50);
        }
        for (int i = 0; i < 10; i++) {
            if (array [i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
/* Выводит в верхней колонке значения которые не совпадают с другими, если в верхней колонке чётное то во второй нечётное и наоборот
                int [] array = new int [10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array [i] = random.nextInt(50);
        }
        System.out.println("========");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        System.out.println("========");
        for (int i = 0; i < 10; i++) {
            if (array [i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }*/



    }
}
