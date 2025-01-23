import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO : Replace this comment with your code
        System.out.println("You're jane's friend!\n\"Whats your name?\"");
        String name = input.nextLine();

        System.out.println("Enter a floating point number: ");
        double spice = input.nextDouble();

        double expression = (4.0/3.0) * Math.pow(2, Math.sqrt(5.0)/Math.pow(spice,3.0));

        System.out.println("Well " + name + ", the spice value resulted in " + expression);
        System.out.println("And the converted value is " + (int)(expression*100)*0.01);
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        // define our named constants
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double wallArea = wallWidth*wallHeight;
        System.out.println("Wall area: " + (int)(wallArea) + " square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        System.out.printf("Paint needed: %.2f gallons\n", (wallArea/350));

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        System.out.println("Cans needed: " + (int)Math.ceil(wallArea/squareFeetPerGallons) + " can(s)");
    }
}


