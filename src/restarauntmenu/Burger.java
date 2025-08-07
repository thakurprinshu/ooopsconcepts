package restarauntmenu;

public class Burger implements Fooditem{
    private double price = 149.50;
    private int prepTime = 10;
    private String[] ingredients = {"Bun", "Lettuce", "Patty", "Cheese"};

    @Override
    public String getName() {
        return "Burger";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getPreparationTime() {
        return prepTime;
    }

    @Override
    public String[] getIngredients() {
        return ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Grilling Burger with " + String.join(", ", ingredients));
    }
}
