package kickstrat;

import lotr.Character;

import java.util.Random;

public class NobleStrategy implements KickStrategy{
    private static final Random random = new Random();

    @Override
    public void kick(Character c, Character target){
        target.setHp(target.getHp()-random.nextInt(c.getPower()+1));
    }
}
