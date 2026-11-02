package hu.unideb.inf;

import javax.persistence.*;

@Entity
public class Animal {
    @Id
    @GeneratedValue
    long id;
    String name;
    int age;
    @Enumerated(EnumType.STRING)
    GenderType gender;

    enum GenderType {
        MALE, FEMALE, UNKNOWN
    }

    public Animal() {
    }

    public Animal(String name, int age, GenderType gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }
}
