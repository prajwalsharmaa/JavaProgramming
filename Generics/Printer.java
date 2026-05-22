public class Printer <T extends Animal> {//make sures that only Animal printer is possible
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}