package Diogof;

import Diogof.Sigleton.SingletonEager;
import Diogof.Sigleton.SingletonLazy;
import Diogof.Strategy.AgressiveBehavior;
import Diogof.Strategy.Bot;
import Diogof.Strategy.DefensiveBehavior;
import Diogof.Strategy.NormalBehavior;

/*singleton test */

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getinstance();
        System.out.println(Eager);
        Eager = SingletonEager.getinstance();
        System.out.println(Eager);

        System.out.println(Eager);
        System.out.println(Eager);

/*Strategy Test */

NormalBehavior Normal = new NormalBehavior();
AgressiveBehavior Agressive = new AgressiveBehavior();
DefensiveBehavior Defensive = new DefensiveBehavior();

Bot robot = new Bot();
robot.setStrategy(Defensive);
robot.move();
robot.move();
robot.setStrategy(Agressive);
robot.move();
robot.move();
robot.setStrategy(Normal);
robot.move();
robot.move();


    }
}
