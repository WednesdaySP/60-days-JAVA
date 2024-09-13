import java.util.*;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking both drink and food inputs from the user
        System.out.println("Select your drink: Cocola, Soda, Chocolate Shake, Beer");
        String dnk = sc.nextLine();

       

        boolean validDrink = false;
        boolean validFood = false;

        // Outer switch for drinks
        switch (dnk) {
            case "Cocola":
                System.out.println("Cocola done");
                validDrink = true;
                break;
            case "Soda":
                System.out.println("Soda done");
                validDrink = true;
                break;
            case "Chocolate Shake":
                System.out.println("Chocolate Shake done");
                validDrink = true;
                break;
            case "Beer":
                System.out.println("Beer done");
                validDrink = true;
                break;
            default:
                System.out.println("Sorry, we don't have that drink.");
                break;
        }

        System.out.println("Select your food: Pizza, Burger, Sandwitch, Pasta, Dosa");
        String food = sc.nextLine();
        sc.close();

        // Nested switch for food options
        switch (food) {
            case "Pizza":
                System.out.println("Pizza done");
                validFood = true;
                break;
            case "Burger":
                System.out.println("Burger done");
                validFood = true;
                break;
            case "Sandwitch":
                System.out.println("Sandwitch done");
                validFood = true;
                break;
            case "Pasta":
                System.out.println("Pasta done");
                validFood = true;
                break;
            case "Dosa":
                System.out.println("Dosa done");
                validFood = true;
                break;
            default:
                System.out.println("Sorry, we don't have that food.");
                break;
        }

        // Final order summary
        if (validDrink && validFood) {
            System.out.println("You ordered " + dnk + " and " + food + ".");
        } else if (validDrink) {
            System.out.println("You ordered " + dnk + ".");
        } else if (validFood) {
            System.out.println("You ordered " + food + ".");
        } else {
            System.out.println("No valid order was placed.");
        }
    }
}
