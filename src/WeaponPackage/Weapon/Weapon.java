package WeaponPackage.Weapon;

public abstract class Weapon {
    protected String name;
    protected int aggressivity=0; //攻击力
    public String getName(){
        return name;
    }

    public abstract int attack();
}
