import java.util.*;

class Student{
    String name;
    int rollno;
    double marks;

    Student(String name, int rollno, double marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}

public class comaparator_demo{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("dev", 11, 95.5));
        students.add(new Student("harit", 12, 89.5));
        students.add(new Student("abhay", 13, 44.5));
        students.add(new Student("amit", 14, 67.5));
        students.add(new Student("abhay", 15, 75.5));

        Comparator<Student> marksComparator = new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                return Double.compare(b.marks, a.marks);
            }
        };

        Collections.sort(students, marksComparator);

        for(Student s : students){
            System.out.println(s.name + "=" + s.rollno + "=" + s.marks);
        }
    }
}