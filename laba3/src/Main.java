import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Name_Product[] batch_1=new Name_Product[3];
        batch_1[0]=Name_Product.Бородинский;
        batch_1[1]=Name_Product.Молочный;
        batch_1[2]=Name_Product.Деревенский;
        Name_Product[] batch_2=new Name_Product[3];
        batch_1[0]=Name_Product.Литовский;
        batch_1[1]=Name_Product.Молочный;
        batch_1[2]=Name_Product.Старосельский;
        Name_Product[] batch_3=new Name_Product[3];
        batch_1[0]=Name_Product.Бородинский;
        batch_1[1]=Name_Product.Деревенский;
        batch_1[2]=Name_Product.Отрубной;
        Name_Product[] batch_4=new Name_Product[3];
        batch_1[0]=Name_Product.Вкусняшка;
        batch_1[1]=Name_Product.Маффин_светлый;
        batch_1[2]=Name_Product.Маффин_чёрный;
        ArrayList<Process_Object> array_1=new ArrayList<Process_Object>();
        array_1.add(new Bread(batch_1));
        array_1.add(new Bread(batch_2));
        array_1.add(new Bread(batch_3));
        array_1.add(new Sweet(batch_4));
        for(Process_Object i: array_1){
            System.out.print(i.toString()+"\n");
        }

    }
}
