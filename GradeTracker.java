import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args) {
        Student_Data student = new Student_Data();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("+--------------------------+");
            System.out.println("*===Student Grade Tracker===*");
            System.out.println("+--------------------------+");
            System.out.println("1 for Add Student          |");
            System.out.println("2 for Display Summary Report");
            System.out.println("3 for Exit                 |");
            System.out.println("+--------------------------+");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();

            
            switch (choice) {
                case 1:
                    student.AddStudent(scanner);
                    break;
                case 2:
                    student.displayStudent();
                    break;
                case 3 :
                    System.out.println("Good Bye");
                    return;
                default:
                   System.out.println("Invalid Choice");
            }
        }
    }
}
