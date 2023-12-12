package Function.utils;

public class Utils098 {
    public static Boolean checkString(String aa){
        if (aa.isBlank() && aa == null){
            return false;
        }else return true;

    }
    public static Boolean checkInteger(int aa){
        if(aa ==0)return false;
        return true;
    }
}
