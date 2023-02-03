package Sets;

import java.awt.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Setts {

    public static void main(String[] args){

        Set<String> stringSet = new HashSet<>();

        stringSet.add("blue");
        stringSet.add("blue");
        stringSet.add("orange");

        Set<Colors> colorSet = new HashSet<>();
        colorSet.add(new Colors("yellow"));
        colorSet.add(new Colors("Yellow"));
        colorSet.add(new Colors("white"));

        System.out.println(colorSet.size());

        System.out.println(stringSet.size());

    }

    static class Colors{
        String name;

        public Colors(String name){
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Colors)) return false;
            Colors colors = (Colors) o;
            return Objects.equals(name, colors.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

}
