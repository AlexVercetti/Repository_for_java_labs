import java.util.Arrays;
import java.util.Objects;

public class Sweet implements Process_Object {
    private Names[] names;
    private int number_batch;
    private String day;
    private boolean isNormal;

    public Sweet(Names[] names) {
        this.names = names;
    }

    public Sweet(Names[] names, int number_batch, String day, boolean isNormal) {
        this.names = names;
        this.number_batch = number_batch;
        this.day = day;
        this.isNormal = isNormal;
    }

    @Override
    public String toString() {
        return "Sweet{" +
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
        Sweet sweet = (Sweet) o;
        return number_batch == sweet.number_batch && isNormal == sweet.isNormal && Arrays.equals(names, sweet.names) && Objects.equals(day, sweet.day);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(number_batch, day, isNormal);
        result = 31 * result + Arrays.hashCode(names);
        return result;
    }

    @Override
    public int equalObject() {
        int count = 0;
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {

                if (names[i] == names[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }

    @Override
    public Names[] getNames() {
        return names;
    }

    @Override
    public void setNames(Names[] names) {
        try {
            this.names = names;
        } catch (ArrayStoreException ex) {
            System.out.print("Ошибка. Введён не правильный тип данных ");
        }

    }

    @Override
    public int getNumber_batch() {
        return this.number_batch;
    }

    @Override
    public void setNumber_batch(int number_batch) {
        try {
            this.number_batch = number_batch;
        } catch (IllegalArgumentException ex) {
            System.out.print("Неверный тип дружок");
        }
    }

    @Override
    public String getDay() {
        return day;
    }

    @Override
    public void setDay(String day) throws ObjectException {
        if (day == "Понедельник" || day == "Вторник" || day == "Среда" || day == "Четверг" || day == "Пятница" || day == "Суббота" || day == "Воскресенье") {
            this.day = day;
        } else
            throw new ObjectException("Ошибка. Наверное это не день");

    }

    @Override
    public boolean isNormal() {
        return false;
    }

    @Override
    public void setNormal(boolean normal) {

    }
}