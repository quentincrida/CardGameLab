public class Card {

    private SuitType suit;
    private RankType value;

    public Card(SuitType suit, RankType value){
        this.suit = suit;
        this.value = value;

    }

    public SuitType getSuit() {
        return suit;
    }

    public RankType getRank() {
        return value;
    }

    public int getRankValue() {
        return this.value.getValue();
    }
}
