import java.io.*;
import java.util.ArrayList;

public interface Process_Object {
    public int equalObject();

    public Name_Product[] getNames();

    public void setNames(Name_Product[] names);

    public int getNumber_batch();

    public void setNumber_batch(int number_batch);

    public String getDay();

    public void setDay(String day) throws ObjectException;

    public boolean isNormal();

    public void setNormal(boolean normal);

    void write(FileWriter out) throws IOException;


    void writeAsText(Writer out);
}
