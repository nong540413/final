import java.util.StringJoiner;

public class MemberCard {
    private static final int PONTS2CASH100 = 800;
    private static final int BAHT2POINTS = 25;
    private long memberId;
    private double totalPurchaseAmount;
    private int totalPoints;
    private int usagePoints;

    public MemberCard(long idCard){
        this.memberId = idCard;
    }
    public void buy(double purchaseAmount){
        this.totalPurchaseAmount += purchaseAmount ;
        addPoints(purchaseAmount);
    }
    public void addPoints(double purchaseAmount){
        this.totalPoints += this.totalPurchaseAmount/BAHT2POINTS;
    }
    public int redeem(){
        if(this.totalPoints >= PONTS2CASH100){
            this.totalPoints-=PONTS2CASH100;
            this.usagePoints +=PONTS2CASH100;
            return 100;
        }else return 0;


    }

    public int getTotalPoints() {
        return totalPoints;
    }
    public double getTotalPurchaseAmount(){
        return totalPurchaseAmount;
    }
    public long getMemberId() {
        return memberId;
    }

    public int getUsagePoints() {
        return usagePoints;
    }
    public double getRemainingPoint(){
        return  this.totalPoints;
    }
    public int getNumberOfRedeem(){
        return (int) (this.usagePoints /PONTS2CASH100);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MemberCard  {memberId=");
        sb.append(memberId);
        sb.append(", totalPurchaseAmount=").append(totalPurchaseAmount);
        sb.append(", totalPoints=").append(totalPoints);
        sb.append(", usagePoints=").append(usagePoints).append(", remainingPoints=").append(getRemainingPoint());
        sb.append("number").append(getNumberOfRedeem()).append('}');
        return sb.toString();
    }
}
