package ENDTASKS;
import java.util.Scanner;
public class task8 {
    public static void modifyArray(float[] array, int size) {
        //assuming each temperature needs a 2 degree upgrade
        System.out.println("After modifying array");
        for (int i = 0; i < size; i++) {
            array[i] = array[i] + 2;
            System.out.print(array[i] + " ");
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of temperatures you want to enter");
        int size = scanner.nextInt();
        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter temperature " + (i + 1));
            array[i] = scanner.nextFloat();
            scanner.nextLine();
        }
        for (float element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        modifyArray(array, size);

    }
}

