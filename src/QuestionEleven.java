import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class QuestionEleven {
    public void run()
    {
        Scanner console = new Scanner (System.in);
        System.out.print("Enter the number of cheese pizzas ($10): ");
        int cp = console.nextInt(); // cp is cheese pizza
        while(cp < 0){ // checks in var is negative value, repeats until it isn't
            System.out.print("Please enter 0 or above: ");
            cp = console.nextInt();}

        System.out.print("Enter the number of vegetarian pizzas ($12): ");
        int vp = console.nextInt();
        while(vp < 0) {
            System.out.print("Please enter 0 or above: ");
            vp = console.nextInt();}

        System.out.print("Enter the number of salami pizzas ($15): ");
        int sp = console.nextInt();
        while(sp < 0) {
            System.out.print("Please enter 0 or above: ");
            sp = console.nextInt();}

        int del = 0;
        double init_cost = (cp*10) + (vp*12) + (sp*15); // adds the cost of all pizzas together

        if(init_cost < 30){ // adds 7 delivery fee if the pizzas cost less than $30
            del = 7;
        }

        double cost = init_cost+del;  // adds the pizza cost and delivery cost(if it exists)
        if(cost > 50){ // gives a discount of 5% if pizza purchase is over $50
            cost/=1.05;
        }
        System.out.println("Total cost: $"+calcRoundedCost(cost));


    }
    public double calcRoundedCost(double inputCost){return new BigDecimal(inputCost).setScale(2, RoundingMode.HALF_EVEN).doubleValue();}
    // method to round cost to 2 decimal places :)

    public static void main(String[] args){

        QuestionEleven eleven = new QuestionEleven();
        eleven.run();

    }
}
