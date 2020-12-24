package WeaponPackage.Weapon;

public class M4A1 extends Weapon {
    public M4A1(){
        name="M4A1";
        aggressivity=40;
    }
    @Override
    public int attack() {
        System.out.println("造成"+this.aggressivity+"的伤害");
        return aggressivity;
    }
}
