public class SuperPokemon {

    // instance variables
    private int healthPoints;
    private String type;
    private int experience;
    private int level;
    private String name;


    // constructor

    public SuperPokemon (int healthPoints, String type, int experience, int level, String name){
        this.healthPoints = healthPoints;
        this.type = type;
        this.experience = experience;
        this.level = level;
        this.name = name;
    }

    // methode (moet in kleine letter)
    public void pound() {
        System.out.println("Pokemon '" + name + "' pounds");
    }

    public void scratch(){
        System.out.println("Pokemon '" + name + "' scratches");
    }


// setters en getters

    public int gethealthPoints(){
    return healthPoints;
    }

    public String getType(){
        return type;
    }

    public int getExperience(){
        return experience;
    }

    public int getLevel(){
        return level;
    }

    public void setHealthPoints(int hp) {
        healthPoints = hp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExperience(int exp) {
        experience = exp;
    }

    public void setLevel(int lvl) {
       level = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
