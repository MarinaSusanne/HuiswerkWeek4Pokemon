public class ElectricPokemon extends SuperPokemon {

// instance variables
    private boolean hasTail;

    private boolean hasEars;

//constructor
    public ElectricPokemon(int healthPoints, String type, int experience, int level, String name, boolean hasTail, boolean hasEars) {
        super(healthPoints, type, experience, level, name);
        this.hasTail= hasTail;
        this.hasEars = hasEars;
    }

@Override
public void pound() {

    if (hasTail) {
        System.out.println(super.getName() + "  has a tail, tailwhips insteads of pounds");
    } else {
        super.pound();

    }
}

public void thunder(){
        System.out.println("Pokemon '" + getName() +  "' creates a thunderstorm with its electricity");

}

//getters and setters
    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public boolean isHasEars() {
        return hasEars;
    }

    public void setHasEars(boolean hasEars) {
        this.hasEars = hasEars;
    }
}


