import java.util.Random;

public class SecondThread extends Thread {
    private int[] arr;
    SecondThread(int[] arr){
        this.arr=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            this.arr[i]=arr[i];

        }
    }

    @Override
    public void run() {

        for (int i=0;i<2;i++){
            System.out.println("Read "+arr[i]+" "+"from position "+i);

        }
    }


}
