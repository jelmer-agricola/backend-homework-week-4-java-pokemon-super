package src;

public abstract class Pokemon {

//  overerfbare eigenschappen
//    hp, aanvallen en type

   private String name;
    private int hp;
    private int level;
    private String type;

    public Pokemon(String name, int hp, int level ) {
        this.name = name;
        this.hp = hp;
        this.level = level;
    }



}
