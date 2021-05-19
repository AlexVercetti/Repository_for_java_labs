import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws ObjectException, IOException {
        Name_Product[] batch_1 = new Name_Product[3];
        batch_1[0] = Name_Product.Бородинский;
        batch_1[1] = Name_Product.Молочный;
        batch_1[2] = Name_Product.Деревенский;
        Name_Product[] batch_2 = new Name_Product[3];
        batch_2[0] = Name_Product.Литовский;
        batch_2[1] = Name_Product.Молочный;
        batch_2[2] = Name_Product.Литовский;
        Name_Product[] batch_3 = new Name_Product[3];
        batch_3[0] = Name_Product.Бородинский;
        batch_3[1] = Name_Product.Деревенский;
        batch_3[2] = Name_Product.Отрубной;
        Name_Product[] batch_4 = new Name_Product[3];
        batch_4[0] = Name_Product.Вкусняшка;
        batch_4[1] = Name_Product.Лакомка;
        batch_4[2] = Name_Product.Маффин_светлый;
        Name_Product[] batch_5 = new Name_Product[3];
        batch_5[0] = Name_Product.Вкусняшка;
        batch_5[1] = Name_Product.Твороженка;
        batch_5[2] = Name_Product.Маффин_светлый;
        Name_Product[] batch_6 = new Name_Product[3];
        batch_6[0] = Name_Product.Вкусняшка;
        batch_6[1] = Name_Product.Вкусняшка;
        batch_6[2] = Name_Product.Маффин_чёрный;
        ArrayList<Process_Object> array_1 = new ArrayList<Process_Object>();
        array_1.add(new Bread(batch_1, 1, "Четверг", true));
        array_1.add(new Bread(batch_2, 2, "Среда", true));
        array_1.add(new Bread(batch_3, 3, "Понедельник", true));
        array_1.add(new Sweet(batch_4, 4, "Четверг", true));
        array_1.add(new Sweet(batch_5, 5, "Суббота", true));
        array_1.add(new Sweet(batch_6, 6, "Вторник", true));
        for (Process_Object obj : array_1) {
            System.out.print(obj + "\n");
        }

        ArrayList<Process_Object> array_2 = new ArrayList<Process_Object>();
        for (int i = 0; i <= array_1.size() - 1; i++) {
            for (int j = i + 1; j < array_1.size(); j++) {
                if (array_1.get(i).equalObject() == array_1.get(j).equalObject() && array_1.get(i).equalObject() > 0 && array_1.get(j).equalObject() > 0) {
                    if (array_2.contains(array_1.get(i)) && array_2.contains(array_1.get(j))){
                        continue;
                    }
                    else {
                        array_2.add(array_1.get(i));
                        array_2.add(array_1.get(j));
                    }
                }
            }
        }
        System.out.print("\n");
        for (Process_Object obj : array_2) {
            System.out.print(obj + "\n");
        }
        String[] day = new String[array_1.size()];
        int[] number_batch = new int[array_1.size()];
        for (int i = 0; i < array_1.size(); i++) {
            day[i] = array_1.get(i).getDay();
            number_batch[i] = array_1.get(i).getNumber_batch();
        }
        for (int i = 0; i < day.length; i++) {
            if (day[i] == null) {
                continue;
            }
            System.out.print(day[i] + " ");


        }
        System.out.print("\n");
        for (int i = 0; i < number_batch.length; i++) {
            if (number_batch[i] == 0) {
                continue;
            }
            System.out.print(number_batch[i] + " ");

        }
        FileWriter out= new FileWriter("G:/bread/bread.txt",true);
        array_1.get(3).write(out);
        array_1.get(4).writeAsText(out);

    }
}
