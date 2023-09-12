package main;

import components.Person;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        int i = 1;
        while(i != 0) {
            System.out.println("\nWrite 0 to leave or 1 to register another, 2 to remove, 3 to list all, 4 to search : ");
            int option = input.nextInt();
            if(option == 1) {
                Scanner input2 = new Scanner(System.in);
                System.out.println("What is this player name ? : ");
                String name = input2.nextLine();
                System.out.println("What is this player year of register ? : ");
                int year = input2.nextInt();
                System.out.println("What is this player nickname ? : ");
                String nick = input2.nextLine();
                people.add(new Person(name, year, nick));
                people.sort(Comparator.comparing(Person::getYearOfRegister));
                System.out.println(people);
                System.out.println("--------------");
                for (Person e:people
                     ) {
                    System.out.println("Nome: " + e.getName() + " index: " + people.indexOf(e));
                }
            } else if(option == 2){
                Scanner input2 = new Scanner(System.in);
                System.out.println("What element do you want to remove(choose an index) ? : ");
                int index = input2.nextInt();
                System.out.println("You have sure that you want to remove: " + people.get(index));
                System.out.println("Write 0 to cancel or 1 to confirm: ");
                int confirm = input2.nextInt();
                if(confirm == 1){
                    System.out.println("You removed: " + people.get(index) + " with sucess !");
                    people.remove(index);
                } else{
                    System.out.println("Canceled ...");
                }
            }else if(option == 0){
                System.out.println("Leaving ...");
                i = 0;
            } else if(option == 3){
                System.out.println(people);
            } else if (option == 4){
                Scanner input2 = new Scanner(System.in);
                System.out.println("Write the letters you want to search: ");
                String search = input2.next();
                System.out.println("Result of search: ");
                for (Person element: people
                     ) {
                    if(element.getName().toUpperCase().contains(search.toUpperCase())){
                        System.out.println(element);
                    }
                }
            }
            else{
                System.out.println("INVALID OPTION !!!!");
            }
        }
    }
}
