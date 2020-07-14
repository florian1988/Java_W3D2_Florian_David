package Florian;

public class A1_Author {

    private String name;
    private String email;
    private char gender;
    private String instagram;


    A1_Author(String name, String email, char gender, String instagram){
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.instagram = instagram;

    }

    A1_Author(){

    }



    public String toString(){
        return name + "  " + email + "  " + gender + "  " + instagram;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

}
