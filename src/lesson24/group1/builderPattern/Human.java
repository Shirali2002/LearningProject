package src.lesson24.group1.builderPattern;

public class Human {

    private String name;
    private String surname;
    private String fatherName;

    public Human(HumanBuilder humanBuilder) {
        this.name = humanBuilder.name;
        this.surname = humanBuilder.surname;
        this.fatherName = humanBuilder.fatherName;
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {
        private String name;
        private String surname;
        private String fatherName;

        public HumanBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public HumanBuilder fatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}
