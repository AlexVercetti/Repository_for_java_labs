import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws ObjectException {
        Names[] batch_1 = new Names[3];
        batch_1[0] = Names.Бородинский;
        batch_1[1] = Names.Молочный;
        batch_1[2] = Names.Деревенский;
        Names[] batch_2 = new Names[3];
        batch_2[0] = Names.Литовский;
        batch_2[1] = Names.Молочный;
        batch_2[2] = Names.Литовский;
        Names[] batch_3 = new Names[3];
        batch_3[0] = Names.Бородинский;
        batch_3[1] = Names.Деревенский;
        batch_3[2] = Names.Отрубной;
        Names[] batch_4 = new Names[3];
        batch_4[0] = Names.Вкусняшка;
        batch_4[1] = Names.Лакомка;
        batch_4[2] = Names.Маффин_светлый;
        Names[] batch_5 = new Names[3];
        batch_5[0] = Names.Вкусняшка;
        batch_5[1] = Names.Твороженка;
        batch_5[2] = Names.Маффин_светлый;
        Names[] batch_6 = new Names[3];
        batch_6[0] = Names.Вкусняшка;
        batch_6[1] = Names.Вкусняшка;
        batch_6[2] = Names.Маффин_чёрный;
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
        ArrayList<Process_Object> array_bread=new ArrayList<Process_Object>();
        ArrayList<Process_Object> array_sweet=new ArrayList<Process_Object>();
        for (int i=0;i<array_1.size();i++){
            if(array_1.get(i) instanceof Bread){
                array_bread.add(array_1.get(i));
            }
            else if(array_1.get(i) instanceof Sweet){
                array_sweet.add(array_1.get(i));
            }
        }

    }
}
