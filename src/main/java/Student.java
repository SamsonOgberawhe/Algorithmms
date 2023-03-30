import java.rmi.StubNotFoundException;


public class Student{

    @CustomInterface
    private final String name;
    private final int score;
    private final String description;

    Student(String name, int score, String description){
        this.name = name;
        this.score = score;
        this. description = description;
    }

    public static class Builder{
        private String name = "Anonymous";
        private int score = 0;
;       private String description = "NOT_PROVIDED";


        public Builder setName(String name){return this;}
        public Builder setScore(int score){
            return this;
        }
        public Builder setDescription(String description){
            return this;
        }

        public Student build(){
            return new Student(
                name,
                score,
                description
            );
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", description='" + description + '\'' +
                '}';
    }
}


