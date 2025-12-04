import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student_Data {
    private ArrayList<Student> studentList;

    Student_Data() {
        studentList = new ArrayList<>();
    }

    public void AddStudent(Scanner scanner) {
        System.out.print("Enter No of Student: ");
        int no = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < no; i++) {
            System.out.println("Enter Data for Student " + (i + 1));
            scanner.nextLine();
            System.out.print("Enter Name : ");
            String name = scanner.nextLine();
            int[] marks = new int[5];
            System.out.println("Enter 5 subjects marks:");
            int size = marks.length;
            for (int j = 0; j < size; j++) {
                marks[j] = scanner.nextInt();
            }
            studentList.add(new Student(name, marks));

        }

    }

    public void displayStudent() {
        if (studentList.isEmpty()) {
            System.out.println("+----------------------------------+");
            System.out.println("|    No Student added yet          |");
            System.out.println("+----------------------------------+");
            return;
        }
        System.out.println("\n*===== Student Summary Report =====*");
        System.out.println("+-------------+--------------------+--------------------+-------+-------");
        System.out.println("|Name         |Marks               |Average             |highest|lowest|");
        System.out.println("+-------------+---------------------+-------------------+-------+-------");
        for (Student s : studentList) {
            System.out.printf("|%-13s|%-20s|%-20s|%-7s|%-6s|\n", s.name, Arrays.toString(s.marks), s.getAverage(),
                    s.getHighest(), s.getLowest());
            System.out.println("+-------------+--------------------+--------------------+-------+-------");

        }
    }

}
