class Student {
    String name;
    int age;
    String departement;

    public Student()
    {

    }
    public Student(String name)
    {
        this.name = name;
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age, String departement)
    {
        this.name =name;
        this.age =age;
        this.departement= departement;
    }
    public void printoutput()
    {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Departement: " + departement);
    }

}
public class ConsChaning {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printoutput();

        Student student2 = new Student("Nick");
        student2.printoutput();

        Student student3 = new Student("jacob", 25);
        student3.printoutput();

        Student student4 = new Student("Rabin" , 30, "Science");
        student4.printoutput();


    }


}
