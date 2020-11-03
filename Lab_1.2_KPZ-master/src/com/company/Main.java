package com.company;

public class Main {

    public static void main(String[] args) {
	    Teacher teacher1 = new Teacher("Pisarchuk", "professor");
        Teacher teacher2 = new Teacher("Kazmirchuk", "docent");

        System.out.println(teacher1.getName());
        System.out.println(teacher1.getPost());
        System.out.println(teacher1.hashCode());
        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher2.toString());
        
    }
}
