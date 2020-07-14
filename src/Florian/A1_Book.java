package Florian;

public class A1_Book {
    private String name;
    private A1_Author[] Author = new A1_Author[2];
    private double price;
    private int quantity;

    A1_Book(String name, A1_Author AuthorB , A1_Author Author, double price, int quantity){
        this.name = name;
        this.Author[0] = AuthorB;
        this.Author[1] = Author;
        this.price = price;
        this.quantity = quantity;

    }
    A1_Book(String name, A1_Author AuthorB, double price){

        this.name = name;
        this.Author[0] = AuthorB;
        this.price = price;


    }


    public void niceFormated(){

        System.out.printf( "|%1s", "The Author's name is:");
        System.out.printf( " %40s| \n", Author[0].getName());
        System.out.printf( "|%s", "The Author's email is:");
        System.out.printf( " %40s| \n", Author[0].getEmail());
        System.out.printf( "|%s", "The Author's gender is:");
        System.out.printf( " %40s| \n", Author[0].getGender());
        System.out.printf( "|%s", "The Author's Instagram account is:");
        System.out.printf( " %40s| \n", Author[0].getInstagram());


    }

    public void niceFormatedTheSecond(){

        System.out.printf( "|%1s", "The Author's name is:");
        System.out.printf( " %40s| \n", Author[0].getName());
        System.out.printf( "|%s", "The Author's email is:");
        System.out.printf( " %40s| \n", Author[0].getEmail());
        System.out.printf( "|%s", "The Author's gender is:");
        System.out.printf( " %40s| \n", Author[0].getGender());
        System.out.printf( "|%s", "The Author's Instagram account is:");
        System.out.printf( " %40s| \n\n", Author[0].getInstagram());

        System.out.printf( "|%1s", "The Author's name is:");
        System.out.printf( " %40s| \n", Author[1].getName());
        System.out.printf( "|%s", "The Author's email is:");
        System.out.printf( " %40s| \n", Author[1].getEmail());
        System.out.printf( "|%s", "The Author's gender is:");
        System.out.printf( " %40s| \n", Author[1].getGender());
        System.out.printf( "|%s", "The Author's Instagram account is:");
        System.out.printf( " %40s| \n", Author[1].getInstagram());


    }



    public String toString(){
        return  "Book name: " +name + "| Author name:  " + Author[0].getName() + "| Author email:  "
                + Author[0].getEmail() + "| Author  name: " + Author[1].getName() +
                "| Author email: " + Author[1].getEmail() + "| Book price:  " + price + "| Produced books: " + quantity + "\n";


    }

    public String tostring(){
        return  "| Book name: " +name + "| Author name:  " + Author[0].getName() + "| Author email:  "
                + Author[0].getEmail() + "| Book price:  " + price + "\n";
    }



    public String getAuthorName(){
        return Author[0].getName();
    }
    public String getAuthorEmail(){
        return Author[0].getEmail();
    }
    public char getAuthorGender(){
        return Author[0].getGender();
    }

    public String getAuthorName1(){
        return Author[1].getName();
    }
    public String getAuthorEmail1(){
        return Author[1].getEmail();
    }
    public char getAuthorGender1(){
        return Author[1].getGender();
    }





    public String getName() {
        return name;
    }

    public A1_Author getAuthor() {
        return Author[0];
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(A1_Author author) {
        Author[0] = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
