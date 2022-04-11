package TravelerDenomination.model;

public class Minnotes {
    public void minnotes(int[] array, int amt)
    {
        int[] num = new int[array.length];
        for (int i=0;i<array.length;i++)
        {
            if (amt>=array[i])
            {
                num[i]=amt/array[i];
                amt=amt%array[i];
            }
        }
        if (amt>0)
        {
            System.out.println("Exact change cannot be rendered for the given amount: " + amt);
        }
        else
        {
            for(int i=0,j=0;i<array.length;i++,j++)
            {
                if(num[j]!=0)
                {
                    System.out.println("Amount can be exchanged in: " + array[i] + "*" + num[j]);
                }
            }
        }
    }
}
