class Student {
    public String name;
    public int score;
    Student(String n, int s) {
        name = n;
        score = s;
    }
    public void getName() {
        return name;
    }
    public void setScore(int s) {
        score = s;
    }
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }
}
public class Main {
    public static void main(String[] agrs) {
        Student hong= new Student("Peter", 100);
        Student ruo = new Student("haoruo", 120);
        ruo.hellowWorld();
    }
}
