package restarauntmenu;

public class Pasta implements Fooditem{
    private double price = 199.75;
    private int prepTime = 15;
    private String[] ingredients = {"Pasta", "White Sauce", "Cheese", "Vegetables"};

    @Override
    public String getName() {
        return "Pasta";
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
        System.out.println("Cooking Pasta with " + String.join(", ", ingredients));
    }
}
