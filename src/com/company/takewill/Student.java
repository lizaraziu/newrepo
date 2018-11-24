package com.company.takewill;

public class Student {

    String name;
    private int age;
    double height;


    Student(){

        this("Ion", 23, 1.78);

    }

    Student(String name){
     this( name, 23, 1.78);
    }

    Student(String name, int age){
this(name, age, 1.78);
    }

    Student(String name, int age, double height ){
this.name = name;
this.age = age;
this.height = height;
    }
    //int o = ((y/x)<3) ? (x+=y) : (x*=y);


    void printDetails() {
        printAge();
        printName();
    }
   public void setAge(int x ){

        if(x < 0){

            System.out.println("nu s-a nascut");

        }else{
            age = x;
        }
   }

    public int getAge() {
        return age;
    }

    void printName() {
        System.out.println("My name is " + name);
    }

    void printAge() {
        System.out.println("Age " + age);
    }

}

