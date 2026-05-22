
public class IntegerPrinter{//If we wanted to do this same thing for double or string or float we have to rewrite the entire code for seperate functionality so
    Integer thingToPrint;
    public IntegerPrinter(Integer thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}