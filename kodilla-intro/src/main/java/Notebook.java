import java.awt.*;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price < 1000 && this.price > 600) {
            System.out.println("The price is good");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light as a feather");
        } else if (this.weight > 700 && this.weight < 1700) {
            System.out.println("This nootebook is an average weight");
        } else if (this.weight > 1700) {
            System.out.println("This notebook is damn heavy");
        }
    }

    public void checkYear() {
        if (this.price > 1500 && this.year < 2016) {
            System.out.println("This notebook is not worth the price");
        } else if (this.price <= 1000 && this.year >= 2020) {
            System.out.println("This notebook is a MUST have");
        } else if (this.price < 1000 || this.year > 2014) {
            System.out.println("This notebook is a good stuff for a good price");
        }
    }
}



