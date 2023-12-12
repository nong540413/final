package aircon;

public class AirCon {
    private int target_temperature;
    private int fan_speed;
    private boolean airOn = false, fanOn = false;
    
    public AirCon(int target_temperature,int fan_speed){
        if (target_temperature < 20 ){this.target_temperature = 20;}
        else if (target_temperature > 30 ){this.target_temperature = 30;}
            else this.target_temperature = target_temperature;
        if (fan_speed < 0 ){this.fan_speed = 0;}
        else if (fan_speed > 2 ){this.fan_speed = 2;}
            else this.fan_speed = fan_speed;
        this.airOn = true;
        this.fanOn = true;
    }
    
    public boolean isAirOn(){
        return this.airOn && this.fanOn;
    }
    
    public int getTargetTemperature(){
        return this.target_temperature;
    }
    
    public void turnAirOnOff(){
        this.fanOn = !this.fanOn;
        this.airOn = !this.airOn;
    }
    
    public void increaseTemperature(){
        this.target_temperature += 1;
        if (this.target_temperature > 30){this.target_temperature = 30;}
    }
    
    public void decreaseTemperature(){
        this.target_temperature -= 1;
        if (this.target_temperature < 20){this.target_temperature = 20;}
    }
    
    public void changeFanSpeed(){
        this.fan_speed += 1;
        if(this.fan_speed >= 3){ this.fan_speed = 0;}
    }
    
    @Override
    public String toString(){
        String fan_speed_string = "";
        switch (this.fan_speed) {
            case 0:
                fan_speed_string = "low";
                break;
            case 1:
                fan_speed_string = "Medium";
                break;
            case 2:
                fan_speed_string = "High";
                break;
            default:
                break;
        }
        
        if(this.fanOn == true && this.fanOn == true){return "Air Conditioner {Status: on, Temp: " + this.target_temperature + ", Fan: " + fan_speed_string + "}";}
        else {return "Air Conditioner {Status: off}";}
    }

}

