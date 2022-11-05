package ie.atu;

public class Passenger {
    private String title, name, id, phone;
    private int age;

    public Passenger(String title, String name, String id, String phone, int age){
        this.title = title;
        this.name =name;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void passy(String title, String name, String id, String phone, int age){
        if(title == "Mr" || title == "Ms" || title == "Mrs"){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Invalid title");
        }
        if(name.length() >= 3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Minimum character length is 3");
        }if(age >= 16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Minimum integer of age is 16");
        }
        if(id.length() >= 10){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("Minimum character length is 10");
        }if(phone.length() >= 7){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("Minimum phone number length is 7");
        }
    }
}