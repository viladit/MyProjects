package Moves;

import Utils.Randomizer;
import ru.ifmo.se.pokemon.*;

public class Moonblast extends SpecialMove {

    public Moonblast(double power, double acc) {
        super(Type.FAIRY, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Randomizer.chance(0.3)) {
            Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
            p.addEffect(effect);
            System.out.println(p.toString()+": спец. урон -1!");
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }

}

