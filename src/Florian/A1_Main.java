package Florian;

public class A1_Main {



    public static void main(String[] args) {
        A1_Author Author = new A1_Author("Bob", "bob@bob.com", 'm', "insta/author");
        A1_Author AuthorB = new A1_Author("Bib", "bib.bib.com", 'f', "insta/bib");
        A1_Book bookOfBob = new A1_Book("Bob's Book", AuthorB, 30.30);
        A1_Book failOfBob = new A1_Book("Bob's fail", Author, AuthorB, 50.05, 50);



        System.out.println(bookOfBob.tostring());
        System.out.println();
        System.out.print(failOfBob);

        System.out.println();
        System.out.printf( "%080d %n", 0);
        System.out.println();

        System.out.println( bookOfBob.getAuthorEmail() + "  " +bookOfBob.getAuthorName()+ "  " + bookOfBob.getAuthorGender());

        System.out.println();
        System.out.printf( "%080d %n", 0);
        System.out.println();

        System.out.println( failOfBob.getAuthorEmail() + "  " + failOfBob.getAuthorName()+ "  " + failOfBob.getAuthorGender());
        System.out.println( failOfBob.getAuthorEmail1() + "  " + failOfBob.getAuthorName1()+ "  " + failOfBob.getAuthorGender1());

        System.out.println();
        System.out.printf( "%080d %n", 0);
        System.out.println();

        bookOfBob.niceFormated();

        System.out.println();
        System.out.printf( "%080d %n", 0);
        System.out.println();

        failOfBob.niceFormatedTheSecond();


    }



}
