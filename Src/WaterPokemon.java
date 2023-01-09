public class WaterPokemon extends SuperPokemon {

//instance variables

    private String sound;

    private int height;

    private Boolean canSwim;

    public WaterPokemon(int healthPoints, String type, int experience, int level, String name, String sound, int height, boolean canSwim) {
        super(healthPoints, type, experience, level, name);
        this.sound = sound;
        this.height = height;
        this.canSwim = canSwim;
    }

    @Override
    public void scratch() {

        if (canSwim = true) {
            System.out.println("Pokemon  ' " + super.getName() + "'  can swim and swims away");
        } else {
            super.pound();
        }
    }

    public void rainDance() {
        System.out.println("Pokemon '" + getName() +  "' does a raindance and all other Pokemon are in awe of the dance and surrender");
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Boolean getCanSwim() {
        return canSwim;
    }

    public void setCanSwim(Boolean canSwim) {
        this.canSwim = canSwim;
    }
}