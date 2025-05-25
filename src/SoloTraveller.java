public class SoloTraveller implements Traveller{
    int age;
    String name;
    String traveller_type;
    String from_location;
    public SoloTraveller(String name,int age,String from_location,String traveller_type)
    {
        this.name=name;
        this.age=age;
        this.from_location=from_location;
        this.traveller_type=traveller_type;
    }
    public int age() {
        return age;
    }
    public String name() {
        return name;
    }
    public String traveller_type() {
        return traveller_type;
    }
    public String from_location() {
        return from_location;
    }

}
