package util098;

public class Tool098 {
    public static boolean isUsable098(String input){
        return (input != null && !input.isBlank());
    }
    public static boolean isUsable098(Object[] input){
        return (input !=null && input.length > 0);
    }
    public static int count098(Object[] input){
        if (!isUsable098(input))return -1;
        var c = 0;
        for (var o : input){
            if (o !=null) c++;
        }
        return c;
    }
}
