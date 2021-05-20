import java.util.Random;

public class SecondThread extends Thread {
    private Names[] arr;
    SecondThread(Names[] arr){
        this.arr=new Names[][arr.length];
        for (int i=0;i<arr.length;i++){
            this.arr[i]=arr[i];

        }
    }

    @Override
    public void run() {

        for (int i=0;i<arr.length;i++){
            System.out.println("Read "+arr[i]+" "+"from position "+i);

        }
    }


}
