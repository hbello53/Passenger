package ie.gmit;

public class Passenger {
    private String title;
    private String name;
    private String ID;
    private String phone;
    private int age;

    public Passenger ( String title , String name , String ID , String phone , int age ) {
        if((title == "") || (name == "") || (ID == "") || (phone == "")) {
            this.title = title;
        }
        this.name = name;
        this.ID = ID;
        this.phone = phone;
        this.age = age;
    }

    public String getTitle ( ) {
        return title;
    }

    public String getName ( ) {
        return name;
    }

    public String getID ( ) {
        return ID;
    }

    public String getPhone ( ) {
        return phone;
    }

    public int getAge ( ) {
        return age;
    }
}
