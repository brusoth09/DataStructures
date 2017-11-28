package com.burusoth.dsa.general;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    private Set<Employee> map = new TreeSet<Employee>();

    public void add(Employee e){
        map.add(e);
    }

    public void printAll() {
        for (Employee e : map) {
            System.out.println(e.getId() +" "+e.getName());
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "AAC");
        Employee e2 = new Employee(1, "AAB");
        Employee e3 = new Employee(2, "BBB");
        Employee e4 = new Employee(3, "AAA");
        Employee e5 = new Employee(5, "AAA");


        Test test = new Test();
        test.add(e1);
        test.add(e2);
        test.add(e3);
        test.add(e4);
        test.add(e5);

        test.printAll();

    }
}
