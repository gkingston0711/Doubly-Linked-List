package com.company;
import java.util.*;
import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        list obj = new list();
        Scanner input;
        input = new Scanner(System.in);

        int option = 0;

        while (option >= 0) {

            System.out.println("INT DLL\n" +
                    "Select one of the following: \n" +
                    "1: add to DLL \n" +
                    "2: remove from DLL \n" +
                    "3: display DLL  \n"+
                    //"4: change name \n"+
                    "-1: exit \n");

            option = input.nextInt();


            switch (option) {
                case 1:
                    input = new Scanner(System.in);

                    String name;
                    int age;

                    System.out.println("What is the name: ");
                    name = input.nextLine();
                    input.nextLine();

                    System.out.println("what is their age: ");
                    age = input.nextInt();
                    input.nextLine();

                    obj.insert(name, age);
                    break;

                case 2:
                    input = new Scanner(System.in);

                    String Dname;

                    System.out.println("what name would you like to delete: ");
                    Dname = input.nextLine();
                    input.nextLine();

                    String NAME;

                    NAME=obj.remove_node(Dname);
                    System.out.println("name removed is: "+NAME);

                    break;

                case 3:
                    obj.display();

                    break;
/*
                case 4:

                    String old_name;
                    String new_name;

                    System.out.println("what name do you want to change?");

                    old_name=input.nextLine();
                    input.nextLine();

                    System.out.println("what is the name you want to change that name to?");

                    new_name=input.nextLine();
                    input.nextLine();

                    obj.change_node_name(old_name,new_name);

                    break;

 */
            }


        }
    }
}
