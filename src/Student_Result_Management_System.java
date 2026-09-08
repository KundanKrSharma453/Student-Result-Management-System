import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Student_Result_Management_System {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter student ID: ");
        String studentIdInput = br.readLine();
        int studentID = Integer.parseInt(studentIdInput);

        System.out.print("Enter student name: ");
        String name = br.readLine();

        System.out.print("Enter Student email Id: ");
        String email = br.readLine();

        System.out.print("Enter student age: ");
        String studentAgeStr = br.readLine();
        int age = Integer.parseInt(studentAgeStr);
        if (age > 0 && age < 50) {

            System.out.println("Enter marks for 5 subjects: ");
            int [] marksArr = new int[5];
            for (int i = 1; i <= 5; i++) {
                System.out.print("Subject "+ i +": ");
                String Marksinput = br.readLine();
                marksArr[i - 1] = Integer.parseInt(Marksinput);
            }
            System.out.println("========================================");
            System.out.println("STUDENT RESULT SYSTEM");
            System.out.println("========================================");
            System.out.println("Student Id: "+studentID);
            System.out.println("Name: "+name);
            System.out.println("Email: "+email);
            System.out.println("Age: "+age);
            for (int i = 1; i <= 5; i++) {
                System.out.println("Subject "+ i +": "+marksArr[i - 1]);
            }

            System.out.println("========================================");
            System.out.println("STUDENT RESULT ");
            System.out.println("========================================");
            Student st = new Student(studentID , name, email, age,marksArr);
            st.displayStudentDetails();

        } else {
            System.out.println("pls valid age input between 1 to 50");
        }
    }
}
