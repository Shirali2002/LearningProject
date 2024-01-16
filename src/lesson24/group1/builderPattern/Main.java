package src.lesson24.group1.builderPattern;

public class Main {

    public static void main(String[] args) {
        Human human = Human.builder()
                .name("shirali")
                .surname("alihummatov")
                .fatherName("rasim")
                .build();



//        Human human = new Human();
//        human.setName("sakdjn");
//        human.setSurname("jshdbfj");
    }

}
