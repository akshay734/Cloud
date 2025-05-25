//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Traveller t1=new SoloTraveller("Mike",56,"canada","Casual");
        Traveller t2=new SoloTraveller("Ann",58,"canada","Casual");

        if (t1.from_location().equals(t2.from_location())){
            connectTraveller connectT=new connectTraveller(t1,t2);
            System.out.print(connectT.getConnectionMessage());
        }

    }
}