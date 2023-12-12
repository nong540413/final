package valuablethanawat;

import util098.Tool098;

public class Item098 {
    private final String name;
    private  int amount;
    public  Item098(String name,int amount){
        this.name=name;
        this.amount=amount;
    }
    public static Item098 create(String name, int amount){
        if (Tool098.isUsable098(name) && amount>0)return new Item098(name,amount);
        return null;
    }

    @Override
    public String toString() {
        return String.format(",%s,%d",name,amount);
    }
    public int add(Item098 item){
        if (item == null)  throw new RuntimeException();
        amount += item.amount;
        return amount;
    }
    public boolean isMatched(Item098 item){
        if (item != null || name.equals(item.name))return true;
        return false;
    }

}
