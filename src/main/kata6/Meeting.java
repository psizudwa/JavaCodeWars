package main.kata6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Meeting {
    public static String meeting(String s) {
        class Person implements Comparable <Person>{
            private String name;
            private  String lastName;
            public Person(){}
            public Person (String name, String lastName){
                this.name = name;
                this.lastName = lastName;
            }

            @Override
            public int compareTo(Person person) {
                int result = this.lastName.compareTo(person.lastName);
                if (result == 0){
                    result = this.name.compareTo(person.name);
                }
                return result;
            }

            public String getName() {
                return name;
            }

            public String getLastName() {
                return lastName;
            }
        }

        List<Person> personList = new ArrayList<>();
        StringBuilder inputStr = new StringBuilder(s.toUpperCase());
        String name = "";
        String lastName = "";
        while(inputStr.length()>0){
            name = inputStr.substring(0,inputStr.indexOf(":"));
            if (inputStr.indexOf(";")!=-1){
                lastName = inputStr.substring(inputStr.indexOf(":")+1,inputStr.indexOf(";"));
                inputStr.delete(0,inputStr.indexOf(";")+1);
            } else{
                lastName = inputStr.substring(inputStr.indexOf(":")+1,inputStr.length());
                inputStr.delete(0,inputStr.length());
            }
            personList.add(new Person(name, lastName));
        }
        Collections.sort(personList);
        for(Person person : personList){
            inputStr.append("(").append(person.getLastName()).append(", ").append(person.getName()).append(")");
        }
    return inputStr.toString();
    }

    public static void main(String[] args) {
        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        System.out.println(Meeting.meeting(s));
    }
}
