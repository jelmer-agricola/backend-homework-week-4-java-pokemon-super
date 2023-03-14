package src;

public class ElectricPokemon extends Pokemon {
    //2 private
    private String lightningColor;
    private String sound;

    public ElectricPokemon(String name, int hp, int level) {
        super(name, level, hp);

        this.lightningColor= lightningColor;
        this.sound = sound;
    }


    @Override
    public void eats() {
        System.out.println(super.getName() + " eats electric food.");
    }

    public void makeSound(){
        System.out.println(sound);
    }

    public void lightningBolt(){
        System.out.println(super.getName() + " throws a " + lightningColor + " lightning bolt");
    }

    public String getLightningColor() {
        return lightningColor;
    }

    public void setLightningColor(String lightningColor) {
        this.lightningColor = lightningColor;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
