public abstract class Toy {

    private int id;
    private String name;
    private int count;
    private double receiveToy;

    public Toy(int id , String name, int count, double receiveToy)
    {
        this.id = id;
        this.name = name;
        this.count = count;
        this.receiveToy = receiveToy;
    }

    public void toyAdd(int addAmount) throws Exception {
        if(addAmount > 0)
            count = count + addAmount;
        else throw new Exception("Amount should be more than 0");
    }

    public void toyDelete()
    {
        count = count - 1;
    }

    public void receiveToyChange(double receiveToy) throws Exception {
        if(receiveToy > 0 && receiveToy < 1)
            this.receiveToy = receiveToy;
        else throw new Exception("Receiving chance should be more than 0 and less than 1");
    }

    public int getId()
    {
       return id;
    }

    public String getName()
    {
        return name;
    }

    public int getCount()
    {
        return count;
    }

    public double getReceiveToy()
    {
        return receiveToy;
    }

    @Override
    public String toString()
    {
        return "ID: " + id +
                ", Name: " + name +
                ", Amount: " + count +
                ", Chance of receiving toy: " + (int)(receiveToy * 100) + "%";
    }
}
