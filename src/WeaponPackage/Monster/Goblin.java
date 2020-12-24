package WeaponPackage.Monster;

import WeaponPackage.Soldier.Soldier;

public class Goblin extends Monster {
    public Goblin(){
        HP=100;
        aggressivity=50;
        Defense=0;
    }
    @Override
    public void Attack() {

    }

    @Override
    public void Death() {
        System.err.println("哥布林死了");
    }
    public void BeAttack(){

    }
}
