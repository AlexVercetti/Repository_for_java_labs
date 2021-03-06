import java.text.SimpleDateFormat;
import java.util.*;

public class Bread {
    private Bread[] breads;
    private String batch;//Партия
    private double weight;
    private Date dayWeek;
    private String name;

    Bread() {

    }

    Bread(double weight, String batch, String date, int count,String name,Bread[] breads) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            dayWeek = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.weight = weight;
        this.batch = batch;
        breads = new Bread[count];
        this.name=name;
        System.arraycopy(breads,0,this.breads,0,count);
    }

    public Date getDay() {
        return dayWeek;
    }

    public double getWeight() {
        return weight;
    }

    public String getBatch() {
        return batch;
    }

    public Bread[] getHealthy() {
        return breads;
    }

    public int getDefect() {
        int countDefect = 0;
        for (int i = 0; i < breads.length; i++) {
            if (breads[i].weight > 800) {
                countDefect += 1;
            }
        }
        return countDefect;
    }
    public int getValueBreads(){
        return breads.length;
    }

    public String[] dayProduction(String day){
        String[] dayBreads=new String[this.breads.length];
        for (int i=0;i<this.breads.length;i++){
            if(breads[i].dayWeek.toString()==day){
                dayBreads[i]=breads[i].dayWeek.toString();
            }
        }

        return dayBreads;

    }
    public double averageWeight(){
        double sum=0;
        for (int i=0;i<breads.length;i++){
            sum+=breads[i].weight;
        }
        return sum/2;
    }


}
