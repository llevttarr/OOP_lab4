package kickstrat;

public class ElfStrategy implements KickStrategy{
    @Override
    public void kick(lotr.Character c, lotr.Character target) {
        if (c.getPower() > target.getPower()) {
            target.setHp(0);
        }else{
            target.setPower(target.getPower()-1);
        }
    }
}
