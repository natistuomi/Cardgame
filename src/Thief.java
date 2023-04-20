public class Thief extends Card{
    public Thief(String n) {
        setName(n);
        setStrength(random());
        setMagic(random());
        setAccuracy(random());
    }
}
