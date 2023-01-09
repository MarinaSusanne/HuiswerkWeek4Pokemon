public class FirePokemon extends SuperPokemon {

    //instance variables

    private double temperature;
    private String food;


    // constructor
    public FirePokemon(int healthPoints, String type, int experience, int level, String name, double temperature, String food) {
        super(healthPoints, type, experience, level, name);
        this.temperature = temperature;
        this.food = food;
    }

    // methode
    @Override
    public void pound(){
        System.out.println("Pokemon '" + getName() + "' ' does not know how to pound");
    }

    public void flameThrower(){
        System.out.println("Pokemon '" + getName() +  "' is throwing with fire");
    }


    // getters and setters
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
