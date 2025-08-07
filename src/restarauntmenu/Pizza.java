package restarauntmenu;

public class Pizza implements Fooditem{
    private double price = 299.99;
    private int prepTime = 20;
    private String[] ingredients = {"Cheese", "Tomato Sauce", "Dough"};

    @Override
    public String getName() {
        return "Pizza";
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
        System.out.println("Preparing Pizza with " + String.join(", ", ingredients));
    }
}
