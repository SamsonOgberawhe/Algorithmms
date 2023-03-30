import java.util.Objects;

public class Fruit {
   public String name;
   public int number;

   public Fruit(String name, int number){
       this.name = name;
       this.number = number;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return number == fruit.number && name.equals(fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
