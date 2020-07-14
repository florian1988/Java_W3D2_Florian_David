package Florian;

public class A2_WeekdayMenu extends A2_Menu{



    A2_WeekdayMenu(String MainDish, String Desert, String Soup){
        super(MainDish, Desert, Soup);

    }


    public void soup(){
        System.out.println("The Soup of the day is " + getSoup());
    }




}
