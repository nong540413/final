public class MoneyExchange {

    private double exchangeRate;
    private int foreignUnits, collectedBaht, customerBaht;

    public MoneyExchange(int foreignUnits) {
        this.foreignUnits = foreignUnits;
    }

    public MoneyExchange(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public MoneyExchange(double exchangeRate, int foreignUnits) {
        this.exchangeRate = exchangeRate;
        this.foreignUnits = foreignUnits;
    }

    public void receiveForeignUnitsFromAdmin(int received) {
        foreignUnits += received;
    }

    public void receiveBahtFromCustomer(int baht) {
        customerBaht += baht;
    }

    public int exchangeToForeignUnitsForCustomer(int forgeUnits) {
        int price = (int) Math.ceil(forgeUnits / this.exchangeRate);

        if(this.foreignUnits < forgeUnits) return -1;
        if(customerBaht < price) return -2;

        int toReturn = (customerBaht - price);
        this.foreignUnits -= forgeUnits;
        this.customerBaht = 0;

        return toReturn;
    }

    public int returnBahtToCustomer() {
        int toReturn = customerBaht;
        customerBaht = 0;
        return toReturn;
    }
    public int giveAllCollectedBahtToAdmin() {
        int toReturn = collectedBaht;
        collectedBaht = 0;
        return toReturn;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
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

    @Override
    public String toString() {
        return String.format("Exchanger{rate=%.2f, foreign %s units, collected %s baht, customer adds %s baht}",
                this.exchangeRate, this.foreignUnits, this.collectedBaht, this.customerBaht);
    }

}
