public class Archer extends Card{
    public Archer(String n) {
        setName(n);
        setAccuracy(randomMain());
        setStrength(randomLow());
        setMagic(randomLow());
    }
}
