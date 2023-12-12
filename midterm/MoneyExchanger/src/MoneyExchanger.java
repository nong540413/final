import java.util.StringJoiner;

public class MoneyExchanger {
    private double exchanger;
    private int foreignUnits,collectedBaht,customerBaht;

    public MoneyExchanger(int foreignUnits) {
        this.foreignUnits = foreignUnits;
    }

    public MoneyExchanger(double exchangeRate){
        this.exchanger = exchangeRate;
    }
    public MoneyExchanger(double exchangeRate, int foreignUnits){
        this.exchanger = exchangeRate;
        this.foreignUnits = foreignUnits;
    }

    public double getExchanger() {
        return exchanger;
    }

    public int getForeignUnits() {
        return foreignUnits;
    }

    public int getCollectedBaht() {
        return collectedBaht;
    }

    public int getCustomerBaht() {
        return customerBaht;
    }

    public void setExchanger(double exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MoneyExchanger.class.getSimpleName() + "[", "]")
                .add("exchanger=" + exchanger)
                .add("foreignUnits=" + foreignUnits)
                .add("collectedBaht=" + collectedBaht)
                .add("customerBaht=" + customerBaht)
                .toString();
    }

    public void receiveForeignUnitsFromAdmin(int foreignUnits){

    }
    public int giveAllCollectedBahtToAdmin(){
        return
    }
}
