import java.util.Random;

public class FirsThread extends Thread {
    private int[] arr;
    FirsThread(int[] arr){
        this.arr=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            this.arr[i]=arr[i];

        }
    }

    @Override
    public void run() {
        Random random=new Random();

        for (int i=0;i<2;i++){
            arr[i]=random.nextInt(100);
            System.out.println("Write: to position "+i);
        }

    }


}
