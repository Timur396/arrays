import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //  task5();
        // task6();
        // task7();


    }

    public static void task1()
    //Задача1.1
    {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 4;
        weight[2] = 83;
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");

            }
        }
        System.out.println();
    }

    public static void task2()

    //Задача1.2
    {
        double[] fraction = {1.57, 7.654, 9.986};
        for (int i = 0; i < fraction.length; i++) {
            System.out.print(fraction[i]);
            if (i != fraction.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fraction.length - 1; i >= 0; i--) {
            System.out.print(fraction[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
    }


    public static void task3() {
//Задача1.3
        String[] fraction = {"one", "two"};
        for (int i = 0; i < fraction.length; i++) {
            System.out.print(fraction[i]);
            if (i != fraction.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = fraction.length - 1; i >= 0; i--) {
            System.out.print(fraction[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
    }

    public static void task4() {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                arr[i]+=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}



