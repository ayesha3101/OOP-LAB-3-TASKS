package ENDTASKS;
import java.util.Scanner;
import java.util.ArrayList;
public class task11 {
 public static void addMember(ArrayList<String> Members ){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the name you want to add");
     String name = sc.nextLine();
     Members.add(name);
     System.out.println("the name has been added!");
 }
 public static void UpdateMember(ArrayList<String> Members ){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the name you want to update");
     String name = sc.nextLine();
     System.out.println("Enter the updated name");
     String updatedName = sc.nextLine();
     int found=0;
     for (int i = 0; i < Members.size(); i++){
         if (Members.get(i).equals(name)){
             Members.set(i,updatedName);
             found =1;
         }
     }
     if (found==1){
         System.out.println("The name has been updated!");
     }
     else {
         System.out.println("No member with such a name!");
     }
 }
 public static void deleteMember(ArrayList<String> Members ){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the name you want to delete");
     String name = sc.nextLine();
     Members.remove(name);
     System.out.println("the name has been deleted!");
 }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Members = new ArrayList<>();
        System.out.println("Enter the number of members");
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of member "+(i+1));
            Members.add(scanner.next());
        }
        System.out.println("enter 1 to add a member\n enter to update name\nEnter 3 to cancel membership\nEnter 0 to exit");
        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1) {
         addMember(Members);
        }
        else if (option == 2) {
         UpdateMember(Members);
        }
        else if (option == 3) {
            deleteMember(Members);
        }
        else if (option == 0) {
           // do nothing
        }
        else {
            System.out.println("Invalid option");
        }
        for( String name : Members){
            System.out.println(name);
        }

    }
}
