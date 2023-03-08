import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GamePlay {
    
    private List<Toy> toys = new ArrayList<>(); 
    
    public void startPack()
    {
        toys.add(new TeddyBear(1, "Teddy Bear", 10, 0.3));
        toys.add(new PlushCat(2, "Plush Cat", 10, 0.5));
        toys.add(new RubberDuck(3, "Rubber Duck", 10, 0.2));
    }
    
    public void addToy(int amount, String name) throws Exception {
        for (int i = 0; i < toys.size(); i++) {
            if(toys.get(i).getName() == name)
            {
                toys.get(i).toyAdd(amount);
                break;
            }
        }
    }

    public void receiveToyChange(double receiveToy, String name) throws Exception {
        for (int i = 0; i < toys.size(); i++) {
            if(toys.get(i).getName() == name)
            {
                toys.get(i).receiveToyChange(receiveToy);
                break;
            }
        }
    }

    private String toyRandom()
    {
        Random random = new Random();

        String winToy = null;

        while(winToy == null)
        {
            int randomToy = random.nextInt(0,toys.size());
            int allRandom = random.nextInt(1,101);

            switch (randomToy)
            {
                case 0:
                    if(allRandom <= toys.get(0).getReceiveToy() * 100)
                    {
                        if(toys.get(0).getCount() > 0)
                        {
                            toys.get(0).toyDelete();
                            winToy = toys.get(0).getName();
                            checkAvailability(0);
                        }
                    }
                    break;
                case 1:
                    if(allRandom <= toys.get(1).getReceiveToy() * 100)
                    {
                        toys.get(1).toyDelete();
                        winToy = toys.get(1).getName();
                        checkAvailability(1);
                    }
                    break;
                case 2:
                    if(allRandom <= toys.get(2).getReceiveToy() * 100)
                    {
                        toys.get(2).toyDelete();
                        winToy = toys.get(2).getName();
                        checkAvailability(2);
                    }
                    break;
            }
        }

        return winToy;
    }

    public String play()
    {
        String name = toyRandom();
        return name;
    }

    public void checkAvailability(int index)
    {
        if(toys.get(index).getCount() < 1)
            toys.remove(index);
    }

    public int gameEndCheck()
    {
        if(toys.isEmpty()) return 0;
        return 1;
    }
    public void print()
    {
        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i).toString());
        }
    }

}
