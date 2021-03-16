package Card;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck
{
    private ArrayList<Card> deck = new ArrayList<>();

    public Deck()
    {
        for(int i = 1; i < 14; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                deck.add(new Card(i));
            }
        }
    }

    public void shuffle(int times)
    {
        int max, index;
        do {
            final ArrayList<Card> newDeck = new ArrayList<>();
            for(int i = 0; i < 52; i++)
            {
                max = deck.size() - 1;
                index = ThreadLocalRandom.current().nextInt(0, max + 1);
                newDeck.add(deck.get(index));
                deck.remove(index);
            }
            deck = (ArrayList<Card>) newDeck.clone();
        } while(--times > 0);
    }

    public ArrayList<Card> getDeck()
    {
        return deck;
    }
}
