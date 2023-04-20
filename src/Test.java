public class Test {
    public static void main(String[] args){
        Warrior wa = new Warrior("Wayne");
        Wizard wi = new Wizard("William");
        Archer a = new Archer("Andrea");
        Thief t = new Thief("Thalia");
        System.out.println(wa.toString() + "\n" + wi.toString() + "\n" + a.toString() + "\n" + t.toString());
        System.out.println("Warrior attacks Wizard: " + wa.playAgainst(wi));
    }
}
