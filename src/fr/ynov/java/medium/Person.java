package fr.ynov.java.medium;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    public String name;
    public LocalDate birthDate;
    public String gender;
    public float height;
    public float weight;

    public enum Nationality {FRENCH, ENGLISH, SPANISH, ITALIAN}
    public Nationality nationality;

    public Person(String name, LocalDate birthDate, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void Introduce() {
        int age = calculateAge();
        System.out.print("name : " +  name + "\n" + "birthDate : " +  birthDate + ", age : " + age + "\n" + "gender : " +  gender + "\n" + "height : " +  height + "\n" + "weight : " +  weight + "\n" + "nationality : " +  nationality + "\n");
    }

    public int calculateAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2006, 9, 6);
        Person nino = new Person("Nino", date, "Male", 1.81f, 56.3f, Nationality.FRENCH);

        nino.Introduce();
    }
}
