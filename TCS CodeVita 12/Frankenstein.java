import java.util.*;

public class Frankenstein {
    // Memoization map to store minimum orbs required for each potion
    private static Map<String, Integer> memo = new HashMap<>();
    private static Map<String, List<String>> recipes = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of recipes
        int N = Integer.parseInt(scanner.nextLine().trim());
        
        // Reading the recipes
        for (int i = 0; i < N; i++) {
            String recipe = scanner.nextLine().trim();
            String[] parts = recipe.split("=");
            String potion = parts[0].trim();
            String[] ingredients = parts[1].split("\\+");
            recipes.put(potion, Arrays.asList(ingredients));
        }
        
        // Potion to brew
        String targetPotion = scanner.nextLine().trim();
        
        // Output the minimum number of magical orbs required to brew the target potion
        System.out.println(minOrbs(targetPotion));
        
        scanner.close();
    }
    
    // Recursive function to calculate the minimum orbs required to brew a potion
    private static int minOrbs(String potion) {
        // If the result is already computed, return it
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }
        
        // If the potion is a raw ingredient, it requires no orbs
        if (!recipes.containsKey(potion)) {
            return 0;
        }
        
        // Get the list of ingredients for this potion
        List<String> ingredients = recipes.get(potion);
        
        // Calculate the number of orbs required for each ingredient
        int orbsRequired = 0;
        for (String ingredient : ingredients) {
            orbsRequired += minOrbs(ingredient);
        }
        
        // The number of magical orbs required is the sum of orbs for ingredients minus one
        int result = orbsRequired + ingredients.size() - 1;
        
        // Memoize the result for the current potion
        memo.put(potion, result);
        
        return result;
    }
}