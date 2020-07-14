package Florian;

import javax.xml.namespace.QName;

public class testAuthor {




    public static void main(String[] args) {


        A1_Author Author = new A1_Author("franz", "franz@franz.com", 'm', "insta_author");
        A1_Author author = new A1_Author();
        author.setName("franz");
        author.setEmail("franz.franz.com");
        author.setGender('m');
        author.setInstagram("insta/author");

        System.out.println(Author.toString());
        System.out.print(author.getName() + "  " + author.getEmail() + "  " + author.getGender() + "  " + author.getInstagram());


    }
}
