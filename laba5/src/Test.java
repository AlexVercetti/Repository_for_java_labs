import javax.naming.Name;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Random random=new Random();

        Names[] name_sweet=new Names[6];
        Names[] name_bread=new Names[7];
        name_sweet[0]=Names.Маффин_чёрный;
        name_sweet[1]=Names.Твороженка;
        name_sweet[2]=Names.Сладкая_булочка;
        name_sweet[3]=Names.Старосельский;
        name_sweet[4]=Names.Вкусняшка;
        name_sweet[5]=Names.Лакомка;

        name_bread[0]=Names.Бородинский;
        name_bread[1]=Names.Старосельский;
        name_bread[2]=Names.Деревенский;
        name_bread[3]=Names.Литовский;
        name_bread[4]=Names.Зародышевый;
        name_bread[5]=Names.Молочный;
        name_bread[6]=Names.Отрубной;

        Names bt_1[]=new Names[2];

        int[] arr=new int[10];
        FirsThread thr=new FirsThread(arr);
        SecondThread thr_1=new SecondThread(arr);
        thr.run();
        thr_1.run();







    }
}
