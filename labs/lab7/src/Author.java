public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        setName(name);
        this.email = email;
        this.gender = gender;
    }

    public Author(String name) {
        setName(name);
        email = "random_mail@gmail.com";
        gender = 'F';
    }

    public String getName() {return name;}
    public void setName(String newName) {
        if (newName.length() > 2)
            name = newName;
    }

    public String getEmail() {return email;}
    public void setEmail(String newEmail) {
        if (newEmail.length() > 2)
            email = newEmail;
    }

    public char getGender() {return gender;}
    public void setGender(char newGender) {
        if (newGender == 'M' || newGender == 'F')
            gender = newGender;
    }

    public String toString() {
        return "Author [name = " + getName() + ", email = " + getEmail()
                + ", gender = " + getGender() + "]";
    }
}
