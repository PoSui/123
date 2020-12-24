package WeaponPackage.Soldier;

import WeaponPackage.Monster.Goblin;
import WeaponPackage.Weapon.Weapon;

import java.util.Scanner;

public class Soldier implements SoldierInterface {
    int HP=500;
    int Defense=30;
    public static int Number_of_monsters_encountered=0;
    int Current_Number_of_monsters_encountered=1;
    //public static int Number_of_monsters_encountered=0;
    static final int MAX_NUMBER_OF_MONSTERS_ENCOUNTERED=10;
    private Weapon repository[] =new Weapon[3];
    private int currentIndex=0;
    private Weapon currentWeapon;
    public Goblin[] goblins=new Goblin[]{new Goblin(),new Goblin(),new Goblin(),new Goblin(),new Goblin(),new Goblin(),new Goblin(),new Goblin(),new Goblin(),new Goblin()};

    private Soldier(){

    }
    public Soldier(Weapon w1,Weapon w2,Weapon w3) {

        repository[0]=w1;
        repository[1]=w2;
        repository[2]=w3;
    }
    public void show(){
        System.out.println("武器列表：");
        for(int i=0;i<repository.length;i++) {
            System.out.println((i+1)+":" + repository[i].getName());
        }
    }
    public void q(){
        currentWeapon=repository[currentIndex];
        currentIndex++;
        if(currentIndex==3){
            currentIndex=0;
        }
        System.out.println("武器已经切换为"+currentWeapon.getName());
    }

    public int l(){
        goblins[Number_of_monsters_encountered].HP -= currentWeapon.attack();
        System.out.println("怪物剩余生命值为"+goblins[Number_of_monsters_encountered].HP);
        HP=HP+Defense-goblins[Number_of_monsters_encountered].aggressivity;
        System.out.println("士兵剩余生命值为"+this.HP);
        return 1;
    }
    public static void heroDeath(){
        System.err.println("你的士兵死亡了");
    }
    public void go() {
        System.out.println("你遇上了一只怪物，这是你遇到的第" + (Current_Number_of_monsters_encountered) + "只怪物");
        System.out.println("这是一只Goblin");
        new Battle();
    }
    class Battle {
        public Battle() {
            while (HP > 0 || goblins[Number_of_monsters_encountered].HP > 0) {

                System.out.println("\t 【q】指令，切换装备 ");
                System.out.println("\t 【l】指令，开始攻击 ");
                System.out.println("\t 【s】指令，结束游戏 ");
                System.out.println("选择你的操作");
                Scanner s = new Scanner(System.in);
                String n = s.next();

                switch (n) {
                    case "q":
                        q();
                        break;
                    case "l":
                        l();
                        break;
                    case "s":
                        System.exit(0);
                        break;
                }
                if (goblins[Soldier.Number_of_monsters_encountered].HP <= 0) {
                    goblins[Soldier.Number_of_monsters_encountered].Death();
                    Number_of_monsters_encountered++;
                    Current_Number_of_monsters_encountered=Number_of_monsters_encountered+1;
                    if(Number_of_monsters_encountered==MAX_NUMBER_OF_MONSTERS_ENCOUNTERED){
                        System.out.println("你赢了");
                        System.exit(0);
                    }
                    System.out.println("要继续吗？（输入go）");
                    String n1 = s.next();
                    if("go".equals(n1)) {
                        go();
                    }
                    break;
                } else if (HP <= 0) {
                    Soldier.heroDeath();
                    System.exit(0);
                }

            }

        }
    }
    @Override
    public void Attack() {

    }

    @Override
    public void escape() {

    }

    public void showMe() {
        System.out.println("HP:"+HP);
        System.out.println("Defense:"+Defense);
        //System.out.println(Arrays.toString(repository));
        if(repository==null) {
            System.out.println("当前还没有装备武器武器，按q切换");
        }else{
           System.out.println("当前武器为"+repository[currentIndex].getName());

        }

    }
}

