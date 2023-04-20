public class Wizard extends Card {
    public Wizard(String n) {
        setName(n);
        setMagic(randomMain());
        setStrength(randomLow());
        setAccuracy(randomLow());
    }
}
