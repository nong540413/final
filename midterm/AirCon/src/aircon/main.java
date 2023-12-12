package aircon;

public class main {

    public static void main(String[] args) {
        AirCon ac1 = new AirCon(20,0); // create object name ac1 -> temp: 20 , Fan : 0 "Low"
        System.out.println(ac1.isAirOn()); // test isAirOn() method 
        System.out.println(ac1);
        System.out.println("================================================");
        System.out.println("test getTargetTemperature() method"); // 20 Celcius from line 6
        System.out.println(ac1.getTargetTemperature());
        System.out.println("================================================");
        System.out.println("switch on/off ac1");
        ac1.turnAirOnOff(); // test turnAirOnOff() method
        System.out.println(ac1);
        System.out.println("================================================");
        System.out.println("test 1.2");
        AirCon ac2 = new AirCon(35,3); // create new object name ac2 -> should be temp: 30 , Fan : 2 "High"
        System.out.println(ac2);
        AirCon ac3 = new AirCon(10,-1); // create new object name ac3 -> should be temp: 20 , Fan : 0 "Low"
        System.out.println(ac3);
        System.out.println("================================================");
        System.out.println("increaseTemperature() method");
        ac2.increaseTemperature(); // cant increase cuz maximum is 30
        System.out.println(ac2);
        ac3.increaseTemperature(); // increase by 1 -> sould be 21
        System.out.println(ac3);
        System.out.println("================================================");
        System.out.println("decreaseTemperature() method");
        ac2.decreaseTemperature(); // decrease by 1 -> sould be 30 from 29
        System.out.println(ac2);
        ac3.decreaseTemperature(); // cant decrease cuz minimum is 20
        System.out.println(ac3);
        System.out.println("================================================");
        System.out.println("test changeFanSpeed() method");
        System.out.println(ac3);
        ac3.changeFanSpeed();// increase fan speed by 1 -> 0 "low" -> 1 "Medium"
        System.out.println(ac3);
        ac3.changeFanSpeed();// increase fan speed by 1 -> 1 "Medium" -> 2 "High"
        System.out.println(ac3);
        ac3.changeFanSpeed();// change fan speed -> 2 "High" -> 0 "low"
        System.out.println(ac3);
    }
    
}
