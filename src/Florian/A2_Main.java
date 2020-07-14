package Florian;

public class A2_Main {

    public static void main(String[] args) {

        A2_WeekdayMenu Monday = new A2_WeekdayMenu("Schnitzel", "Moor im Hemd", "Fridatensuppe");
        A2_WeekdayMenu Tuesday = new A2_WeekdayMenu("Schmarn", "Cockies", "Nudelsuppe");
        A2_WeekdayMenu Wednesday = new A2_WeekdayMenu("Schweinsbraten", "Kuchen", "Schwamerlsuppe");
        A2_WeekdayMenu Thursday = new A2_WeekdayMenu("Auflauf", "Apfelstrudel", "Chremesuppe");

        A2_WeekendMenu Friday = new A2_WeekendMenu("Pizza", "Ice", "Kürbischremesupe", "Schnaps");
        A2_WeekendMenu Saturday = new A2_WeekendMenu("Spagetti", "Zeug", "Nocheinesuppe", "Wein");
        A2_WeekendMenu Sunday = new A2_WeekendMenu("Germknödel", "nochmehrzeug", "Gummibärensuppe", "Bier");

        Monday.soup();
        Friday.Menu();

        System.out.println();
        System.out.printf( "%080d %n", 0);
        System.out.println();

        A2_Menu[] Menu = new A2_Menu[7];

        Menu[0] = Monday;
        Menu[1] = Tuesday;
        Menu[2] = Wednesday;
        Menu[3] = Thursday;
        Menu[4] = Friday;
        Menu[5] = Saturday;
        Menu[6] = Sunday;


        for ( int i = 0 ; i < Menu.length; i ++){
            Menu[i].Menu();
            System.out.println();
            System.out.printf( "%080d %n", 0);
            System.out.println();

        }


        for ( int i = 0 ; i < Menu.length; i ++){
            Menu[i].Soup();
            System.out.println();
            System.out.printf( "%080d %n", 0);
            System.out.println();

        }





    }

}
