package lotr;

import kickstrat.NobleStrategy;

import java.util.Random;
public class Noble extends lotr.Character {
    private static final Random random = new Random();
    public Noble(int minHp, int maxHp,int minPower, int maxPower){
        super(
                random.nextInt(maxPower-minPower)+minPower,
                random.nextInt(maxHp-minHp)+minHp,
                new NobleStrategy()
        );
    }
}
