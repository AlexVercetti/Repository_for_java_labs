import java.util.Arrays;
import java.util.Objects;

public class Bread implements Process_Object {
    private Name_Product[] names;
    private int number_batch;
    private String day;
    private boolean isNormal;

    public Bread(Name_Product[] names) {
        this.names = names;
    }

    public Bread(Name_Product[] names, int number_batch, String day, boolean isNormal) {
        this.names = names;
        this.number_batch = number_batch;
        this.day = day;
        this.isNormal = isNormal;
    }

    public Name_Product[] getNames() {
        return names;
    }

    public void setNames(Name_Product[] names) {
        this.names = names;
    }

    public int getNumber_batch() {
        return number_batch;
    }

    public void setNumber_batch(int number_batch) {
        this.number_batch = number_batch;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public boolean isNormal() {
        return isNormal;
    }

    public void setNormal(boolean normal) {
        isNormal = normal;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "names=" + Arrays.toString(names) +
                ", number_batch=" + number_batch +
                ", day='" + day + '\'' +
                ", isNormal=" + isNormal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bread bread = (Bread) o;
        return number_batch == bread.number_batch && isNormal == bread.isNormal && Arrays.equals(names, bread.names) && Objects.equals(day, bread.day);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(number_batch, day, isNormal);
        result = 31 * result + Arrays.hashCode(names);
        return result;
    }
}