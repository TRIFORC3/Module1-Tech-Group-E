import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private List<Pokemon> registeredPokemons;

    //Constructor
    public Pokedex (){
        this.registeredPokemons = new ArrayList<>();
    }

    public void RegisterPokemon (Pokemon foundPokemon){
        this.registeredPokemons.add(foundPokemon);
    }

    public void ShowPokemon (){
        System.out.println("This is my catched Pokemon list\n");

        for (Pokemon pokemon : registeredPokemons) {
            System.out.println(pokemon.getName() + " : " + pokemon.getType() + " : " + pokemon.getGeneration());
        }
    }

}
