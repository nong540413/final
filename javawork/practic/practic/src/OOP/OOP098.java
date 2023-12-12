package OOP;


public class OOP098 {
    public static void main(String[] args) {
        testStudent();
    }
    public static  void testStudent(){
        Student student1 = new Student("john", 20, "A");
        System.out.println(student1.say("Hello"));
        student1.setName("karn");
        System.out.println(student1.getName());
        student1.setAge(15);
        System.out.println(student1.getAge());
        student1.setGroupBlood("AB");
        System.out.println(student1.getGroupBlood());

        Student student2 = new Student("Buss",10,"B");
        System.out.println(student2);
        System.out.println(student1.equals(student1));
        System.out.println(student2);



    }

}