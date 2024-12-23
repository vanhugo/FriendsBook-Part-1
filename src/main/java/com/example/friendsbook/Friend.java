package com.example.friendsbook;

public class Friend {
    public String name;
    public String age;
    public String cheese;

    public Friend(String name, String age, String cheese) {
        this.name = name;
        this.age = age;
        this.cheese = cheese;
    }

    // Override toString to return the name
    @Override
    public String toString() {
        return name;
    }
}

