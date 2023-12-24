package src.lesson16.group2.objectMethods;

import java.util.Objects;

public class Human {

    public String name;
    public String hairColour;
    public int age;

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj; //downcasting
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(hairColour, human.hairColour);
    }

    public int hashCode() {
        return Objects.hash(name, hairColour, age);
    }

    // alt+insert
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", hairColour='" + hairColour + '\'' +
                ", age=" + age +
                '}';
    }
}
