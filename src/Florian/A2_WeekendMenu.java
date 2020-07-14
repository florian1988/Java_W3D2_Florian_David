package Florian;

public class A2_WeekendMenu extends A2_Menu{

    private String Appetizer;

    A2_WeekendMenu(String MainDish, String Desert, String Soup, String Appetizer){
        super(MainDish, Desert, Soup);
        this.Appetizer = Appetizer;
    }

    public void Menu(){
        super.Menu();
        System.out.print("Appetizer: " + Appetizer);
    }

    public void soup(){
        System.out.println("The Soup of the day is " + getSoup());
    }

    public String getAppetizer() {
        return Appetizer;
    }

    public void setAppetizer(String appetizer) {
        Appetizer = appetizer;
    }
}
