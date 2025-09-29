package lotr;

import kickstrat.HobbitStrategy;

public class Hobbit extends lotr.Character {
    public Hobbit(){
        super(0,3, new HobbitStrategy());
    }
}
