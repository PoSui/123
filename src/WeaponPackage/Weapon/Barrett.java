package WeaponPackage.Weapon;

public class Barrett extends Weapon {
    public Barrett(){
        name="Barrett";
        aggressivity=80;
    }
    @Override
    public int attack() {
        System.out.println("造成"+this.aggressivity+"的伤害,对自己造成10点伤害");
        return aggressivity;
    }
}
