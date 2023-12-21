package src.lesson16.group1.objectMethods;

import java.util.Objects;

public class Human extends Object{

    public String name;
    public int age;
    public String hairColour;

    // alt + insert

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColour='" + hairColour + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return age == human.age && name.equals(human.name) && hairColour.equals(human.hairColour);
    }

    public int hashCode() {
        return Objects.hash(name, age, hairColour);
    }

}
