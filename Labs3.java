package com.revature
import java.util.Scanner;
public class Ball{
    String size;
    String color;
}
public class ClassA{
    String name = "name";
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class ClassB{
    ClassA classA = new ClassA(); 
    //declares an instance variable of type classa.
}
public class Labs3{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("please type ina  line and hit enter");
String line = scanner.nextLine();
System.out.println("You have type: " + line);
String numbers = "1 2 3 5 7 9";
scanner = new Scanner(numbers);
while(scanner.hasNextInt()){
    System.out.println(scanner.nextInt());
}
scanner.close();
String str = "Hello";
System.out.println(str.equals("Hello"));
int x = str.length;
int y = str.indexOf("H");
Ball b1 = new Ball();
}
}