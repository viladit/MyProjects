package Moves;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove {

    public BugBuzz(double power, double acc) {
        super(Type.BUG, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(effect);
        System.out.println(p.toString()+": защита -1!");
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }

}


