package Main.main;

import Functuin.math.MathFunc098;
import OOP.Student;
import javaType.type.Type098;
import displayDetail.Display098;

public class Mainkan {
    public static void main(String[] args) {
        System.out.println("add "+MathFunc098.add(1,2));
        System.out.println("subtract "+MathFunc098.subtract(1,2));
        System.out.println("multipy "+MathFunc098.multipy(1,2));
        System.out.println("divide "+MathFunc098.divide(1,2));

        System.out.println("int"+Type098.intType(10));
        System.out.println("int"+Type098.longType(10));
        System.out.println("int"+Type098.doubleType(10.0));
        System.out.println("int"+Type098.booleanType(true));
        System.out.println("int"+Type098.charType('s'));
        System.out.println("int"+Type098.StringType("kk"));

        System.out.println(Display098.nameDisplay("kan"));
        System.out.println(Display098.ageDisplay(10));
        System.out.println(Display098.groupBloodDisplay('A'));
        System.out.println(Display098.allDisplay("kan",10,'A'));

        Student st = new Student("kan",10,"d") ;
        System.out.println(st.say("ksdfsdf"));
        System.out.println(st);

    }
}