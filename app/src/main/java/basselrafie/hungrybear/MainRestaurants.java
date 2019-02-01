package basselrafie.hungrybear;

public class MainRestaurants {
    public String restaurantName;
    public String openingTimes;
    public String[] catergories;
    boolean burger = false;
    boolean pizza = false;
    boolean italian = false;
    boolean baguette = false;
    boolean asian = false;
    boolean doener = false;
    boolean salad = false;
    boolean fish = false;
    boolean steak = false;


    public void setBaguette(boolean baguette) {
        this.baguette = baguette;
    }


    public void setAsian(boolean asian) {
        this.asian = asian;
    }

    public void setBurger(boolean burger) {
        this.burger = burger;
    }
    public void setDoener(boolean doener) {
        this.doener = doener;
    }

    public void setFish(boolean fish) {
        this.fish = fish;
    }

    public void setItalian(boolean italian) {
        this.italian = italian;
    }

    public void setPizza(boolean pizza) {
        this.pizza = pizza;
    }

    public void setSalad(boolean salad) {
        this.salad = salad;
    }

    public void setSteak(boolean steak) {
        this.steak = steak;
    }


    public void setRestaurantName(String restaurantName) {

    }

    public String getRestaurantName(){
        return restaurantName;
    }

    public boolean getPizza(){
        return pizza;
    }



    public  void setOpeningTimes(String openingTimes) {

    }


    public String getOpeningTimes() {
        return openingTimes;
    }

    public boolean getSteak() {
        return steak;
    }

    public boolean getAsian() {
        return asian;
    }

    public boolean getItalian() {
        return italian;
    }

    public boolean getSalad() {
        return salad;
    }

    public boolean getFish() {
        return fish;
    }

    public boolean getDoener() {
        return doener;
    }

    public boolean getBurger() {
        return burger;
    }

    public boolean getBaguette() {
        return baguette;
    }
}
