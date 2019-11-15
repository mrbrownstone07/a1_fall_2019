package app;

/**
 * Author
 */
public class Author {
    private String name;
    private String emailId;
    private int age;
    private String gender;

    public Author(){}
    public Author(String name, String emailId, int age, String gender) {
        this.name = name;
        this.emailId = emailId;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getEmailId() {return emailId;}
    public void setEmailId(String emailId) {this.emailId = emailId;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}

    @Override
    public String toString() {
        return "\n name: " + this.name 
                + "age: " + this.age 
                + "email id: " + this.emailId 
                + "gender: " +this.gender;
    }   
}