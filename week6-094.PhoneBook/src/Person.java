public class Person {
    private String name;
    private String phoneNumber;

    public Person(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.phoneNumber;
    }

    public void changeNumber(String number){
        this.phoneNumber = number;
    }

    public String toString(){
        return this.name + "    number: " + this.phoneNumber;
    }
}
