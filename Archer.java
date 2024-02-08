public class Archer {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Archer(){
        this.attackStrategy = new ShootArrow();
        this.defenseStrategy = new Dodge();
    }
    public void attack(){
        attackStrategy.attack();
    }
    
    public void defend(){
        defenseStrategy.defend();
    }
}
