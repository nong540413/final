public class Main {
    public static void main(String[] args) {

        MemberCard mem = new MemberCard(54734545);
        mem.buy(400000);
        System.out.println(mem.getTotalPoints() +"++"+mem.getTotalPurchaseAmount());
        System.out.println(mem.getTotalPoints());
        System.out.println(mem.getUsagePoints());
        System.out.println(mem.redeem());
        System.out.println(mem.getTotalPoints());
        System.out.println(mem);
    }




}