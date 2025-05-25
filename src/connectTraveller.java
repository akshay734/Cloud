public class connectTraveller{
    private Traveller t1;
    private Traveller t2;
    public connectTraveller(Traveller t1, Traveller t2){
        this.t1=t1;
        this.t2=t2;
    }
    public String getConnectionMessage(){
        String result;
        result="Traveller "+t1.name()+" Connects to Traveller "+t2.name()+" Please have a save journey";
        return result;
    }

}
