public class FirstClass_2 {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println("notebook.weight: " + notebook.weight + " " + "notebook.price: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2010);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight + " " + "heavyNotebook.price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook (1600, 500, 2015);
        System.out.println("oldNotebook.weight: "+ oldNotebook.weight + " " + "oldNotebook.price: "+ oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        }
    }

