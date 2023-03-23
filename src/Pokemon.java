package src;

public abstract class Pokemon {

//  overerfbare eigenschappen
//    hp, aanvallen en type

   private String name;
    private int hp;
    private int level;
    private String type;
    private String food;
    private String sound;

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food =food;
        this.sound = sound;

    }

    public abstract void eats();

    public void tackle(){
        System.out.println(name + " performs tackle");
    }

    public void levelUp(){
        this.level++;
        System.out.println("Congratulations, " + name + " has now reached level " + level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }



}
