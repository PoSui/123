package WeaponPackage;

import WeaponPackage.Soldier.Soldier;
import WeaponPackage.Weapon.AK47;
import WeaponPackage.Weapon.Barrett;
import WeaponPackage.Weapon.M4A1;
import WeaponPackage.Weapon.Weapon;

import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {
        Weapon w = new AK47();
        Weapon w1 = new M4A1();
        Weapon w2 = new Barrett();
        Soldier soldier = new Soldier(w, w1, w2);

        System.out.println("游戏开始，可以输入指令来控制士兵");
        System.out.println("\t 【showme】指令，查看自身信息");
        System.out.println("\t 【show】指令，查看装备库");
        System.out.println("\t 【q】指令，切换装备 ");
//      System.out.println("\t 【l】指令，开始攻击 ");
        System.out.println("\t 【go】指令，开始行动 ");
        System.out.println("\t 【s】指令，退出游戏 ");
        while (true) {
            System.out.println("要做什么");
            Scanner s = new Scanner(System.in);
            String n = s.next();
            switch (n) {
                case "showme":
                    soldier.showMe();
                    break;
                case "show":
                    soldier.show();
                    break;
                case "q":
                    soldier.q();
                    break;
//                case "l":
//                    soldier.l();
//                    break;
                case "go":
                    soldier.go();
                    break;
                case "s":
                    System.exit(0);
            }

        }
    }
}

