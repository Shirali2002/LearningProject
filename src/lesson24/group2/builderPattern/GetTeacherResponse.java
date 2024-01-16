package src.lesson24.group2.builderPattern;

public class GetTeacherResponse {

    private Long id;
    private String name;
    private String surname;
    private String birthDate;

    public GetTeacherResponse(GetTeacherResponseBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.surname = builder.getSurname();
        this.birthDate = builder.getBirthDate();
    }

    public static GetTeacherResponseBuilder builder() {
        return new GetTeacherResponseBuilder();
    }

    public static class GetTeacherResponseBuilder {
        private Long id;
        private String name;
        private String surname;
        private String birthDate;

        public GetTeacherResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public GetTeacherResponseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public GetTeacherResponseBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public GetTeacherResponseBuilder birthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public GetTeacherResponse build() {
            return new GetTeacherResponse(this);
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getBirthDate() {
            return birthDate;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
