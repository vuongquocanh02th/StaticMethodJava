public class Student {
    private int rollNo;
    private String name;
    private static String college = "IloveU";

    //Khoi tao bien
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    //Thay doi gia tri cua bien tinh
    static void change() {
        college = "IhateU";
    }
    //display value
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
