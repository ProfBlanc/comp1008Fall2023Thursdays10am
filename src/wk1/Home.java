package wk1;

public class Home {

    int doors;

    protected short sqft;

    private byte numberOfBathrooms;

    //public byte NumberOfBathrooms{ get{} set{}}

    public byte getNumberOfBathrooms(){
        return numberOfBathrooms;
    }
    public void setNumberOfBathrooms(byte numberOfBathrooms){
        this.numberOfBathrooms = numberOfBathrooms;
    }

}
