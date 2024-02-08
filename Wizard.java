public class Wizard{
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Wizard(){
        this.attackStrategy = new CastSpell();
        this.defenseStrategy = new CreateMagic();
    }
    public void attack(){
        attackStrategy.attack();
    }
    
    public void defend(){
        defenseStrategy.defend();
    }
}
