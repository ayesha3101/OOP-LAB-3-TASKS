package ENDTASKS;

import java.util.Scanner;

public class task9 {
    public static void discount(float[] price , int size){
        System.out.println("Prices after discount");
     for(int i=0;i<size;i++){
         price[i]= (float) (price[i]-(price[i]*0.1));
         System.out.print(price[i]+" ");
     }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of products whose prices you want to enter");
        int size = scanner.nextInt();
        float[] price = new float[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the price for item "+(i+1));
            price[i] = scanner.nextFloat();
        }
        System.out.println("Price before discount");
        for(float element: price ){
            System.out.print(element+" ");
        }
        System.out.println();
        discount(price,size);

    }
}
