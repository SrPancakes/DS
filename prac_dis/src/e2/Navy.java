package e2;

public class Navy {

    final private String name;
    private int hp;
    final private int armor;
    final private int firePower;
    final private int antiAircraft;
    final private int viewLine;

    public Navy(String name, int hp, int armor, int firePower, int antiAircraft, int viewLine) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.firePower = firePower;
        this.antiAircraft = antiAircraft;
        this.viewLine = viewLine;
    }

    public String getName(){
        return this.name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getArmor() {
        return armor;
    }

    public int getFirePower() {
        return firePower;
    }

    public int getAntiAircraft() {
        return antiAircraft;
    }

    public int getViewLine() {
        return viewLine;
    }

    @Override
    public String toString(){
        return "Navy " + name + ":\n\nHP: " + hp + "\nArmor: " + armor + "\nFire Power: " + firePower + "\nAnti Aircraft: " + antiAircraft + "\nView Line: " + viewLine;
    }
}
