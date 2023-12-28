import java.util.Random;
import java.util.Scanner;

// Class to represent a Pokémon
class Pokemon {
    String name;
    String type;
    int level;
    int experience;

    Pokemon(String name, String type, int level, int experience) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.experience = experience;
    }
}

public class PokemonTrainingGame {

    static final int MAX_POKEMON = 55;

    // Function to display Pokémon information
    static void displayPokemon(Pokemon pokemon) {
        System.out.println("Name: " + pokemon.name);
        System.out.println("Type: " + pokemon.type);
        System.out.println("Level: " + pokemon.level);
        System.out.println("Experience: " + pokemon.experience);
    }

    // Function to train a Pokémon
    static void trainPokemon(Pokemon pokemon) {
        Random rand = new Random();
        int experienceGain = rand.nextInt(10) + 1; // Gain random experience between 1 and 10
        System.out.println("Training " + pokemon.name + "...");
        System.out.println("Gained " + experienceGain + " experience points!");

        pokemon.experience += experienceGain;
        if (pokemon.experience >= 100) {
            pokemon.experience -= 100;
            pokemon.level++;
            System.out.println(pokemon.name + " leveled up to level " + pokemon.level + "!");

            // Check if the Pokémon evolves at a certain level
            if (pokemon.level == 3) {
                System.out.println(pokemon.name + " is evolving!");
                evolvePokemon(pokemon);
            }
        }
    }

    // Function to evolve a Pokémon
    static void evolvePokemon(Pokemon pokemon) {
        pokemon.name += " (Evolved)";
        pokemon.type = "Super"; // Example: Evolved Pokémon type
    }

    public static void main(String[] args) {
        // Create an array of Pokémon
        Pokemon[] allPokemons = {
                new Pokemon("Pikachu", "Electric", 1, 0),
                new Pokemon("Charmander", "Fire", 1, 0),
                new Pokemon("Squirtle", "Water", 1, 0),
                new Pokemon("Bulbasaur", "Grass/Poison", 1, 0),
                new Pokemon("Jigglypuff", "Normal/Fairy", 1, 0),
                new Pokemon("Meowth", "Normal", 1, 0),
                new Pokemon("Psyduck", "Water", 1, 0),
                new Pokemon("Growlithe", "Fire", 1, 0),
                new Pokemon("Geodude", "Rock/Ground", 1, 0),
                new Pokemon("Poliwag", "Water", 1, 0),
                new Pokemon("Abra", "Psychic", 1, 0),
                new Pokemon("Machop", "Fighting", 1, 0),
                new Pokemon("Tentacool", "Water/Poison", 1, 0),
                new Pokemon("Gastly", "Ghost/Poison", 1, 0),
                new Pokemon("Onix", "Rock/Ground", 1, 0),
                new Pokemon("Drowzee", "Psychic", 1, 0),
                new Pokemon("Krabby", "Water", 1, 0),
                new Pokemon("Voltorb", "Electric", 1, 0),
                new Pokemon("Exeggcute", "Grass/Psychic", 1, 0),
                new Pokemon("Cubone", "Ground", 1, 0),
                new Pokemon("Hitmonlee", "Fighting", 1, 0),
                new Pokemon("Lickitung", "Normal", 1, 0),
                new Pokemon("Koffing", "Poison", 1, 0),
                new Pokemon("Rhyhorn", "Ground/Rock", 1, 0),
                new Pokemon("Chansey", "Normal", 1, 0),
                new Pokemon("Tangela", "Grass", 1, 0),
                new Pokemon("Kangaskhan", "Normal", 1, 0),
                new Pokemon("Horsea", "Water", 1, 0),
                new Pokemon("Goldeen", "Water", 1, 0),
                new Pokemon("Staryu", "Water", 1, 0),
                new Pokemon("Mr. Mime", "Psychic/Fairy", 1, 0),
                new Pokemon("Scyther", "Bug/Flying", 1, 0),
                new Pokemon("Jynx", "Ice/Psychic", 1, 0),
                new Pokemon("Electabuzz", "Electric", 1, 0),
                new Pokemon("Magmar", "Fire", 1, 0),
                new Pokemon("Pinsir", "Bug", 1, 0),
                new Pokemon("Tauros", "Normal", 1, 0),
                new Pokemon("Magikarp", "Water", 1, 0),
                new Pokemon("Lapras", "Water/Ice", 1, 0),
                new Pokemon("Ditto", "Normal", 1, 0),
                new Pokemon("Eevee", "Normal", 1, 0),
                new Pokemon("Vaporeon", "Water", 1, 0),
                new Pokemon("Jolteon", "Electric", 1, 0),
                new Pokemon("Flareon", "Fire", 1, 0),
                new Pokemon("Porygon", "Normal", 1, 0),
                new Pokemon("Omanyte", "Rock/Water", 1, 0),
                new Pokemon("Kabuto", "Rock/Water", 1, 0),
                new Pokemon("Aerodactyl", "Rock/Flying", 1, 0),
                new Pokemon("Snorlax", "Normal", 1, 0),
                new Pokemon("Articuno", "Ice/Flying", 1, 0),
                new Pokemon("Zapdos", "Electric/Flying", 1, 0),
                new Pokemon("Moltres", "Fire/Flying", 1, 0),
                new Pokemon("Dratini", "Dragon", 1, 0),
                new Pokemon("Dragonair", "Dragon", 1, 0),
                new Pokemon("Dragonite", "Dragon/Flying", 1, 0)
        };

        // Main game loop
        Scanner scanner = new Scanner(System.in);
        int choice, pokemonIndex;
        do {
            System.out.println("\n--- Pokémon Training Game ---");
            System.out.println("1. Display Pokémon");
            System.out.println("2. Train Pokémon");
            System.out.println("3. Quit");
           
