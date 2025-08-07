package restarauntmenu;

public interface Fooditem {
    String getName();
    double getPrice();
    int getPreparationTime(); // in minutes
    String[] getIngredients();
    void prepare();
}
