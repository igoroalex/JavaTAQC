package hm2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate){
        setName(name);
        setBirthDate(birthDate);
    }

    public Person(){}

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (LocalDate.now().isBefore(birthDate)){
            throw new IllegalArgumentException("not born yet");
        }
        this.birthDate = birthDate;
    }

    public int age(){
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "" + this.name + ", " + this.birthDate;
    }

    public String output(){
        return "My name is " + this.name + " and " + this.age() + " age ";
    }

    public void changeName(String name){
        setName(name);
    }

    public static void main(String... args){
        Person person1 = new Person();
        person1.setName("Fox");
        person1.setBirthDate(LocalDate.of(1970, 1, 20));
        System.out.println(person1.age());

        Person person2 = new Person("Scally", LocalDate.of(1971, 1, 20));
        System.out.println(person2);
        System.out.println(person2.output());

        Person person3 = new Person("Scinner", LocalDate.of(2023, 1, 20));
        System.out.println(person3.output());
    }
}
