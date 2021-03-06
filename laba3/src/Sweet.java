import java.text.SimpleDateFormat;
import java.util.Date;

public class Sweet {
    private Sweet[] sweets;
    private String batch;//Партия
    private double weight;
    private Date dayWeek;
    private String name;

    Sweet() {

    }

    Sweet(double weight, String batch, String date, int count,String name,Sweet[] sweets) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            dayWeek = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.weight = weight;
        this.batch = batch;
        sweets = new Sweet[count];
        this.name=name;
        System.arraycopy(sweets,0,this.sweets,0,count);
    }
}
