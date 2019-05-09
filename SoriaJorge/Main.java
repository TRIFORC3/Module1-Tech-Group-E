public class Main {
    public static void main(String [] args) {
        //2 options, assign a new random pokemon, or input the pokemon ID
        //and pull an specific pokemon information
        //This will assign a new favorite pokemon, I will need a table import
        //to select a pokemon from the 151 original pokemons
        public int newPokemon () {
            double randomNumber = Math.random();
            randomNumber = randomNumber * 151;
            randomNumber = randomNumber + 1;
            int randomInt = (int) randomNumber;
            return randomInt;
        }
        public String favoritePokemon(){
            //need to find a way to use table value vlookup style
        }
        System.out.println("The pokemon you chose is" + favoritePokemon);
   //need to pull also the type of pokemon it is
        //with a commnand, choose between what to display
        //either strong against or weak against
    class Pokedex{
        int pokemonId;
        Pokedex (){
        }
    }
    }

}
