package Florian;

public class A2_Menu {

    private String MainDish;
    private String Desert;
    private String Soup;

    A2_Menu(String MainDish, String Desert, String Soup){
        this.MainDish = MainDish;
        this.Desert = Desert;
        this.Soup = Soup;


    }

    public void Menu(){
        System.out.println("The Menu for today: ");
        System.out.println("Main Dish: " + MainDish);
        System.out.println("Soup: " + Soup);
        System.out.println("Desert: " + Desert);



    }

    public void Soup(){

        System.out.println("Soup: " + Soup);


    }


    public String getMainDish() {
        return MainDish;
    }

    public String getDesert() {
        return Desert;
    }

    public String getSoup() {
        return Soup;
    }

    public void setMainDish(String mainDish) {
        MainDish = mainDish;
    }

    public void setDesert(String desert) {
        Desert = desert;
    }

    public void setSoup(String soup) {
        Soup = soup;
    }
}
