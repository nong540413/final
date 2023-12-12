package school;

import java.util.Arrays;
import java.util.StringJoiner;

public class Student implements Comparable<Student>{
    private final int id;
    private String name;
    private double allowance;
    private static Student[] all;
    private static int count;
    public Student(int id,String name, double allowance){
        this.id = id;
        this.name = name;
        this.allowance = allowance;
        if (name == null || allowance <= 0 || id <0){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < count; i++) {
            if (all[i].id == id){
                throw new IllegalArgumentException();
            }
        }
        if (all == null){
            all = new Student[2];
        }else if (all.length == count){
            all = Arrays.copyOf(all,all.length*2);
        }
        all[count++]= this;

    }
    public static int averageAllowance(){
        if (count == 0)return -1;
        var sum = 0;
        for (int i = 0; i < count ; i++) {
                sum += all[i].allowance;
        }
        return sum/count;
    }
    public static Student remove(int id){
        for (int i = 0; i < count; i++) {
            if (all[i].id == id){
                var temp = all[i];
                all[i] = all[--count];
                all[count] = null;
                return temp;
            }
        }
        return null;
    }
    public static void sort(){
        Arrays.sort(all,0,count);
    }
    public static String listAll(){
        var s = new StringJoiner("; ");
        for (int i = 0; i < count; i++) {
            s.add(all[i].toString());
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        return (this == o || o != null || getClass() == o.getClass());
    }
    @Override
    public int hashCode() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getAllowance() {
        return allowance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return String.format("student{%d,'%s,'%f",name,id,allowance);
    }

    @Override
    public int compareTo(Student o) {
        return id - o.id;
    }
}
