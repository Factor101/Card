package Card;

public class Card
{
    private final Suite suite;
    private final Rank rank;
    private static int cardCount = 0;
    private int value;

    private enum Suite
    {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    private enum Rank
    {
        ACE,
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
        JACK, QUEEN, KING
    }

    public Card(int n)
    {
        cardCount++;

        rank = Rank.values()[n - 1];
        suite = Suite.values()[cardCount % 4];

        int value = rank.ordinal();
        this.value = value < 10  ? value + 1 : 10;

        if(cardCount == 52) cardCount = 0;
    }

    public int getValue()
    {
        return value;
    }

    public String getName()
    {
        return rank.toString();
    }

    public String getSuite()
    {
        return suite.toString();
    }
}