package OOP;

import Functuin.math.MathFunc098;

public class Emloyee {
    private final int id = 1;
    private  String fname,lname;
    private int age,salary;
    private int bonus;

    public Emloyee(String fname,String lname,int age){
        if(!MathFunc098.checkInteger(age)) throw new IllegalArgumentException();
        this.fname=fname;
        this.lname=lname;
        this.age=age;

    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int addBonus(int bonus) {
        return this.bonus += bonus;
    }
    public int getFinalSalary(){
        return this.salary += this.bonus;
    }

    public int addage(){
        return age++;
    }
    public  String getFullName(){
        return this.getFname()+""+getLname();
    }
    public  int getSalaryPerDay(){
        int salary2 = this.salary;
        return salary2/=30;
    }
    public int getSalaryPerWeek(){
        int salary3 = this.salary;
        return  salary3/24;
    }

    @Override
    public String toString() {
        return "Employed(id="+this.age+", firstName="+this.fname+", lastName="+this.lname+", age="+this.age+", salary="+this.salary+", bonus="+this.bonus+", finalSalary="+getFinalSalary();
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }
}
