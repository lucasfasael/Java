package components;

public class Person {
    private String name;
    private int yearOfRegister;
    private String nick;

    public Person(String name, int yearOfRegister, String nick) {
        this.name = name;
        this.yearOfRegister = yearOfRegister;
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRegister() {
        return yearOfRegister;
    }

    public void setYearOfRegister(int yearOfRegister) {
        this.yearOfRegister = yearOfRegister;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", yearOfRegister=" + yearOfRegister +
                ", nick='" + nick + '\'' +
                '}';
    }
}
