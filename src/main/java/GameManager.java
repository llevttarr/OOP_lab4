import lotr.Character;
import lotr.Elf;
import lotr.Hobbit;

public class GameManager {
    public static void fight(Character c1, Character c2){
        if (c1 instanceof Hobbit && c2 instanceof Hobbit){
            System.out.println("Two hobbits fighting! Stopping the fight");
            return;
        }
        if (c1 instanceof Elf && c2 instanceof Elf){
            System.out.println("Two elves fighting! Stopping the fight");
            return;
        }
        while (true){
            System.out.println("- - - - - -");
            c1.kick(c2);
            System.out.println("Character 1 ("+c1.getClass().getName()+") kicks character 2!");
            System.out.println("Character 1 new power: "+c1.getPower());
            System.out.println("Character 1 new hp: "+c1.getHp());
            System.out.println("Character 2 new power: "+c2.getPower());
            System.out.println("Character 2 new hp: "+c2.getHp());
            if (c2.getHp() < 0){
                System.out.println("Character 2 loses!");
                return;
            }
            c2.kick(c1);
            System.out.println("Character 2 ("+c2.getClass().getName()+") kicks character 1!");
            System.out.println("Character 1 new power: "+c1.getPower());
            System.out.println("Character 1 new hp: "+c1.getHp());
            System.out.println("Character 2 new power: "+c2.getPower());
            System.out.println("Character 2 new hp: "+c2.getHp());
            if (c1.getHp() < 0){
                System.out.println("Character 1 loses!");
                return;
            }
        }
    }
}
