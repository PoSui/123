package WeaponPackage.Weapon;

public class AK47 extends Weapon {
    public AK47(){
        name="AK47";
        aggressivity=50;
    }
    @Override
    public int attack() {
        System.out.println("造成"+this.aggressivity+"的伤害");
        return aggressivity;
    }
}
