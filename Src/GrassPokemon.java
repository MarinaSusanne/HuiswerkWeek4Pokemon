public class GrassPokemon extends SuperPokemon {

    private double weight;

    boolean highAccuracy;

    public GrassPokemon(int healthPoints, String type, int experience, int level, String name, double weight, boolean highAccuracy) {
        super(healthPoints, type, experience, level, name);
        this.weight = weight;
        this.highAccuracy = highAccuracy;
    }


    @Override
    public void scratch(){
        if(highAccuracy) {
            System.out.println("Pokemon '" + getName() +  "' is super accurate and scratches out eyes of enemy" );
        }
        else {
            super.scratch();
        }
    }

    public void fatAttack(){
        if (weight >= 100.00){
            System.out.println("Pokemon '" + getName() +  "' is super fat and does a fat attack");
        }
        else {
            System.out.println("Pokemon '" + getName() +  "' is not fat enough for a fat attack and runs away");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHighAccuracy() {
        return highAccuracy;
    }

    public void setHighAccuracy(boolean highAccuracy) {
        this.highAccuracy = highAccuracy;
    }
}

