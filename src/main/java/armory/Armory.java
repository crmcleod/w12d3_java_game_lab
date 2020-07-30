package armory;

import actions.IAttack;

public abstract class Armory {
    private int damageToDeal;

    public Armory(int damageToDeal){
        this.damageToDeal = damageToDeal;
    }

    public int getDamageToDeal(){
        return this.damageToDeal;
    }

}
