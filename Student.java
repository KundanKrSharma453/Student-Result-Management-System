public class Student {
    private int studentId;
    private String name;
    private String email;
    private int age;
    private int[] marks;

    public Student(int studentId, String name, String email, int age, int[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.age = age;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // CalculateTotal
    double totalMarks = 0;
    double calculateTotal(int[] marks) {
         for (int i : marks) {
            totalMarks += i;
        }
        System.out.println(totalMarks);
        return totalMarks;
    }


    // Calculate Average
    double calculateAverage(){
        return (totalMarks / marks.length);
    }

    // CalculatePercentage
    double calculatePercentage(){
        return (totalMarks / marks.length);
    }

    // Calculate Grade
    char calculateGrade(){
        if (calculateAverage() <= 100 && calculateAverage() >= 90)
            return 'A';
        else if (calculateAverage() <= 89 && calculateAverage() >= 80)
            return 'B';
        else if (calculateAverage() <= 79 && calculateAverage() >= 70)
            return 'C';
        else if (calculateAverage() <= 69 && calculateAverage() >= 60)
            return 'D';
        else
          return 'F';
    }

    // Display Student Details
    void displayStudentDetails(){
        System.out.println("Student Id: "+studentId);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Total Marks: "+calculateTotal(marks));
        System.out.println("Average: "+calculateAverage());
        System.out.println("Percentage: "+calculatePercentage());
        System.out.println("Grade: "+calculateGrade());
    }
}
