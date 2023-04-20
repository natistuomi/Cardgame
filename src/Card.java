public abstract class Card {
    private int health = 100;
    private int magic;
    private int strength;
    private int accuracy;
    private String name;

    public void setHealth(int health) {this.health = health;}

    public void setMagic(int magic) {this.magic = magic;}

    public void setStrength(int strength) {this.strength = strength;}

    public void setAccuracy(int accuracy) {this.accuracy = accuracy;}

    public void setName(String name) {this.name = name;}

    public int getHealth() {return health;}

    public int getMagic() {return magic;}

    public int getStrength() {return strength;}

    public int getAccuracy() {return accuracy;}

    public String getName() {return name;}

    @Override
    public String toString() {
        return "Card{" +
                "health=" + health +
                ", magic=" + magic +
                ", strength=" + strength +
                ", accuracy=" + accuracy +
                ", name='" + name + '\'' +
                '}';
    }

    public int randomMain(){return getRandomNumber(60, 100);}

    public int randomLow(){return getRandomNumber(20, 80);}

    public int random() {return getRandomNumber(10, 90);}

    public String getCardClass(){
        String x = "" + getClass();
        return x;
    }

    public int getRandomNumber(int min, int max) {return (int) ((Math.random() * (max - min)) + min);}

    public String playAgainst(Card b){

        return "";
    }
}
