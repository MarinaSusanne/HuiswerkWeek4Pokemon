public class Main {
    public static void main(String[] args) {

        FirePokemon charmender = new FirePokemon(15,"Fire", 30,8,"charmender",28.9, "iets lekkers");
        SuperPokemon pikachu = new SuperPokemon(20, "electric", 20,6, "pikachu");
        ElectricPokemon raichu = new ElectricPokemon(5, "electric", 40, 20, "raichu", true, false);
        WaterPokemon wartortle = new WaterPokemon(100, "water", 2, 50, "wartortle", "psjjjjt", 55, true);
        GrassPokemon bayleef = new GrassPokemon(1, "grass",15, 27, "bayleef", 130.05, true);
        GrassPokemon  bellsprout = new GrassPokemon(20,"grass", 90, 16, "bellsprout", 78.98, false);

        charmender.pound();
        pikachu.pound();
        pikachu.scratch();
        raichu.pound();
        charmender.flameThrower();
        raichu.thunder();
        wartortle.scratch();
        wartortle.rainDance();
        bayleef.scratch();
        bayleef.fatAttack();
        bellsprout.fatAttack();
    }

}
