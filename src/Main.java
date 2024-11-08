public class Main {
    public static void main(String[] args) {
        Student.change();
        //Creating object
        Student s1 = new Student(111, "Phong");
        Student s2 = new Student(222, "Thieu");
        Student s3 = new Student(333, "Truong");
        //call display method
        s1.display();
        s2.display();
        s3.display();
    }
}