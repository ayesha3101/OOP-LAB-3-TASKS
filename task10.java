package ENDTASKS;
import java.util.ArrayList;
import java.util.Scanner;
public class task10 {
    public static void Update(ArrayList<String> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name with which you registered");
        String target = sc.nextLine();
        System.out.println("Enter the updated name");
        String newName = sc.nextLine();
        int found=0;
        for(int i=0;i<students.size();i++){
            if(students.get(i).equals(target)){
                students.set(i,newName);
                found=1;
            }
        }
        if(found==1){
            System.out.println("No student found");
        }
        else {
            System.out.println("The name has been updated successfully");
        }
        sc.close();

    }
    public static void Delete(ArrayList<String> students){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to delete");
        String target = sc.nextLine();
        students.remove(target);
        System.out.println("The name has been deleted successfully");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students you want to register");
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> students = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of student " + (i + 1));
            String name = scanner.nextLine();
            students.add(name);
        }
        System.out.println("Enter 1 to update a students name\nEnter 2 to delete a student\nEnter 0 to exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
        Update(students);
        }
        else if (choice == 2) {
        Delete(students);
        }
        else if (choice == 0) {
            //do nothing
        }
        for (String names : students){
            System.out.println(names);
        }
       scanner.close();

    }
}
