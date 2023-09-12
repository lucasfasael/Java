package components;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int registration;
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "\n ID: " + getRegistration() + ", NOME: " + getName();
    }
}
