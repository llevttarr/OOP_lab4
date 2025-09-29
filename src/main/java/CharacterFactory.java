
import lotr.*;
import lotr.Character;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.reflections.Reflections;

public class CharacterFactory {
    private static final Random random = new Random();
    public lotr.Character createCharacter(){
        Reflections reflections = new Reflections("lotr");
        ArrayList<Class<? extends Character>> charClasses = new ArrayList<>(reflections.getSubTypesOf(Character.class));
        charClasses.removeIf(c -> !Modifier.isFinal(c.getModifiers()));
        int idx = random.nextInt(charClasses.size());
        try{
            Constructor<? extends Character> constructor = charClasses.get(idx).getDeclaredConstructor();
            return constructor.newInstance();
        }catch (Exception e){
            return null;
        }
    }
}
