package Moves;

import Utils.Randomizer;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {

    public FocusBlast(double power, double acc) {
        super(Type.FIGHTING, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Randomizer.chance(0.1)) {
            Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(effect);
            System.out.println(p.toString()+": спец. защита -1!");
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }

}

