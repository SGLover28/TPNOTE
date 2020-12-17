import java.util.Objects;

public class Rôle {


    String nomRôle;

    Rôle(String s){
        nomRôle = s;
    }

    public boolean equals(Object o){
        return super.equals(o);
    }


    public int hashCode() {
        return Objects.hash(nomRôle);
    }
}
