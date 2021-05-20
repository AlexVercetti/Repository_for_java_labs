import java.util.Random;

public class FirsThread extends Thread {
    Random random=new Random();
    private Names[] arr;
    FirsThread(Names[] arr){
        this.arr=new Names[arr.length];
        for (int i=0;i<arr.length;i++){
            this.arr[i]=arr[i];

        }
    }
    private Names value(){
        Names[] name_bread=new Names[7];
        name_bread[0]=Names.Бородинский;
        name_bread[1]=Names.Старосельский;
        name_bread[2]=Names.Деревенский;
        name_bread[3]=Names.Литовский;
        name_bread[4]=Names.Зародышевый;
        name_bread[5]=Names.Молочный;
        name_bread[6]=Names.Отрубной;
        return name_bread[random.nextInt(7)];
    }
    @Override
    public void run() {


        for (int i=0;i<2;i++){
            arr[i]=value();
            System.out.println("Write: to position "+i);
        }

    }


}
