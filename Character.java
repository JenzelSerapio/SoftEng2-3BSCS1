public class Character{
    private String type;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(String type, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
        this.type = type;
    }

    public void attack(){
        attackStrategy.attack();
    }

    public void defend(){
        defenseStrategy.defend();
    }

}