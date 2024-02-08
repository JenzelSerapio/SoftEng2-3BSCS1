public class CharacterDemo{


public static void main(String[] args){

    Character knight = new Knight();
    Character wizard = new Wizard();
    Character archer = new Archer();

    knight.attack();
    knight.defend();

    wizard.attack();
    wizard.defend();
    
    archer.attack();
    archer.defend();


    
}
}