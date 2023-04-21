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

    public int randomMain(){return getRandomNumber(50, 100);}

    public int randomLow(){return getRandomNumber(1, 50);}

    public int random() {return getRandomNumber(20, 80);}

    public int getRandomNumber(int min, int max) {return (int) ((Math.random() * (max - min)) + min);}

    public String playAgainst(Card b){
        String cardA = "" + getClass();
        cardA = cardA.substring(5);
        String cardB = "" + b.getClass();
        cardB = cardB.substring(5);
        int aValue = getAttackValue(cardA, getHealth(), getStrength(), getMagic(), getAccuracy());
        int bValue = getDefenseValue(cardA, cardB, b.getHealth(), b.getStrength(), b.getMagic(), b.getAccuracy());
        if(aValue > bValue){return "WIN";}
        else if(aValue == bValue){return "DRAW";}
        else{return "LOSE";}
    }

    public int getAttackValue(String a, int H, int S, int M, int A){
        int main;
        char x = a.charAt(2);
        if(x == 'a'){main = S;}
        else if(x == 'i'){main = M;}
        else if(x == 'r'){main = A;}
        else{
            int i = getRandomNumber(0, 2);
            if (i == 0){main = S;}
            else if (i == 1){main = M;}
            else{main = A;}
        }
        return H * (main + main);
    }

    public int getDefenseValue(String a, String b, int H, int S, int M, int A){
        int mainA;
        int mainB;
        char x = a.charAt(2);
        if(x == 'a'){mainA = S;}
        else if(x == 'i'){mainA = M;}
        else if(x == 'r'){mainA = A;}
        else{
            int i = getRandomNumber(0, 2);
            if (i == 0){mainA = S;}
            else if (i == 1){mainA = M;}
            else{mainA = A;}
        }
        x = b.charAt(2);
        if(x == 'a'){mainB = S;}
        else if(x == 'i'){mainB = M;}
        else if(x == 'r'){mainB = A;}
        else{
            int i = getRandomNumber(0, 2);
            if (i == 0){mainB = S;}
            else if (i == 1){mainB = M;}
            else{mainB = A;}
        }
        return H * (mainA + mainB);
    }

}
