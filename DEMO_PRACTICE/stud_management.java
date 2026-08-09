
class Student{
    String name;
    int rollno;
    double marks;

    Student(String name, int rollno, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Rollno : " + rollno);
        System.out.println("marks : " + marks);
    }

    boolean isPassed(){
        return marks >= 3.5;
    }
}

public class stud_management{
    public static void main(String[] args) {
        
        Student s1 = new Student("dev", 34, 9.01);
        Student s2 = new Student("rahul", 23, 2.31);
        Student s3 = new Student("mehul", 56, 5.71);

        Student[] students = {s1, s2, s3};

        for(Student student : students){
            student.displayDetails();
        }

        for(Student student : students){
            if(student.isPassed()){
                System.out.println("Passed");
            }
            else{
                System.out.println("Failed");
            }
        }
    }
}