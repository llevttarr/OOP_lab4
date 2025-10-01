import lotr.Elf;
import lotr.Hobbit;
import lotr.King;
import lotr.Knight;

import java.util.Scanner;

public class Main {
    public static void testing(){
        System.out.println("testing two hobbits");
        GameManager.fight(new Hobbit(), new Hobbit());
        System.out.println("testing two elfs");
        GameManager.fight(new Elf(), new Elf());
        System.out.println("testing king vs knight");
        GameManager.fight(new King(), new Knight());
        System.out.println("testing elf vs knight");
        GameManager.fight(new Elf(), new Knight());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arg = scanner.next();
        if (arg.equalsIgnoreCase("test")){
            Main.testing();
        }else{
            GameManager.fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
        }

    }
}
