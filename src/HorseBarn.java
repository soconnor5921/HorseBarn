public interface Horse
{
    String getName();
    int getWeight();
}

public class HorseBarn
{
    private Horse[] spaces;

    public int findHorseSpace(String name)
    {
        Horse tempHorse;
        for(int i = 0; i < spaces.length; i++)
        {
            tempHorse = spaces[i];
            if(name.equals(tempHorse) == true)
            {
                return i;
            }
        }
        return -1;
    }

    public void consolidate()
    {

    }
}
