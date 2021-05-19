public interface Process_Object {
    public int equalObject();

    public Names[] getNames();

    public void setNames(Names[] names);

    public int getNumber_batch();

    public void setNumber_batch(int number_batch);

    public String getDay();

    public void setDay(String day) throws ObjectException;

    public boolean isNormal();

    public void setNormal(boolean normal);

}
