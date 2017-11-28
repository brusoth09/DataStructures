package com.burusoth.dsa.general;


public class Employee implements Comparable<Employee>{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Employee o) {
        if(this.id == o.id){
            return 0;
        }
        return this.name.compareTo(o.name);
    }
}
