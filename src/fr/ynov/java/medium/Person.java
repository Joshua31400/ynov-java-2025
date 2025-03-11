package fr.ynov.java.medium;

public class Person {
    private String name;
    private int age;
    private String gender;
    private float height;
    private float weight;
    private Nationality nationality;

    public Person(String name, int age, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void printAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Nationality: " + nationality);
    }

    public enum Nationality {
        FRENCH,
        AMERICAN,
        ENGLISH
    }

    public static void main(String[] args) {
        Person person = new Person("John", 25, "male", 6.1f, 85.5f, Nationality.FRENCH);
        person.printAttributes();
    }
}