package Moves;

import Utils.Randomizer;
import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {

    public AncientPower(double power, double acc) {
        super(Type.ROCK, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p, damage);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        if (Randomizer.chance(0.1)) {
            Effect effect = new Effect().stat(Stat.ATTACK, 1).stat(Stat.DEFENSE, 1).stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1).stat(Stat.SPEED, 1);
            p.addEffect(effect);
            System.out.println(p.toString()+": все характеристики +1!");

        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }

}

