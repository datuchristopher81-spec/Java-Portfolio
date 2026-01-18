public class TeacherStudentAssignment {
    public static void main(String[] args) {

        Student student1 = new Student("Ana Santos", 19, "Female", "S1023");
        student1.displayStudent();

        Course course1 = new Course("CS101", "Programming Fundamentals");
        Course course2 = new Course("CS102", "Object-Oriented Programming");
        Teacher teacher1 = new Teacher("Mr. Dela Cruz", 45, "Male", "Computer Studies", course1, course2);
        teacher1.displayTeacher();
    }
}


public class Teacher extends Person {
    String department;
    Course course1;
    Course course2;

    public Teacher(String name, int age, String gender, String department, Course course1, Course course2) {
        super(name, age, gender);
        this.department = department;
        this.course1 = course1;
        this.course2 = course2;
    }
    public void displayTeacher() {
        System.out.println("\n--- Teacher Information ---");
        displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Courses Handled: ");
        course1.displayCourse();
        course1.displayCourse();
    }
}

public class Student extends Person {
    String studentId;

    public Student( String name, int age, String gender, String studentId) { 
        super(name, age, gender);
        this.studentId = studentId;
    }
    public void displayStudent() {
        System.out.println("--- Student Information ---");
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

public class Course {
    String courseCode;
    String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    public void displayCourse() {
        System.out.println("   " + courseCode + " - " + courseName);
    }
}


public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
