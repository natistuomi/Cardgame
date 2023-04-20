public class Warrior extends Card{
    public Warrior(String n) {
        setName(n);
        setStrength(randomMain());
        setMagic(randomLow());
        setAccuracy(randomLow());
    }
}
