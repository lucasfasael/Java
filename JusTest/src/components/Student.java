package components;

public class Student {
    private int number;
    private String name;
    private int age;

    private double n1;
    private double n2;

    public Student(String name, double n1, double n2) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void calculator(){
        if((n1 + n2) / 2 >= 6){
            System.out.println("This student passed !");
        } else{
            System.out.println("You need to study more !");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getName();
    }
}
