package fr.ynov.java.medium;

import java.util.Objects;

public class Quality {
    private int id;
    private String name;

    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getClass() != obj.getClass()) return false;
        Quality quality = (Quality) obj;
        return this.getId() == quality.getId() && this.getName().equals(quality.getName());
    }

    public static void main(String[] args) {
        Quality quality = new Quality(1, "High");
        Quality quality2 = new Quality(1, "High");
        System.out.println(quality.equals(quality2));

        System.out.print(quality);
        System.out.print(quality2);
    }
}

