package src.lesson24.builderPattern;

public class Main {

    public static void main(String[] args) {

        GetTeacherResponse response = GetTeacherResponse
                .builder()
                .id(12L)
                .name("shirali")
                .surname("alihummatov")
                .birthDate("10/11/2000")
                .build();

    }

}
