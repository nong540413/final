package displayDetail;

public class Display098 {
    public static String nameDisplay(String name){
        return name;
    }
    public static int ageDisplay(int age){
        return age;
    }
    public static char groupBloodDisplay(char groupBlood){
        if(groupBlood !='A' && groupBlood !='B'&& groupBlood !='O'){
        throw new RuntimeException("this is now groupBlood");
        }
        return groupBlood;
    }
    public static String allDisplay(String name, int age, char groupBlood){
        return name + "" + age + "" + groupBlood;
    }

}
