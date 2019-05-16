public class Main {

    public static void main(String[] args) {
	// write your code here
        Pokemon myPokemon = new Pokemon ();
        myPokemon.setName("Pikachu");
        myPokemon.setType("Electric");
        myPokemon.setGeneration("Primera");
        myPokemon.setEvolutionNumber(1);


        Pokedex myPokedex = new Pokedex();
        myPokedex.RegisterPokemon(myPokemon);
        myPokedex.ShowPokemon();

    }
}
