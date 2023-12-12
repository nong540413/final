package work01; //2.
public final class Tool { //2.,2.1
    private Tool() {} //2.2
    public static double median(double d0, double d1, double d2) { //2.3
        if (d0<d1) {
            if (d1<d2) return d1; // d0<d1<d2
            if (d0<d2) return d2; // d0<d2<=d1
            return d0; // d2<=d0<d1
        }
        if (d0<d2) return d0; // d1<=d0<d2
        if (d1<d2) return d2; // d1<d2<=d0
        return d1; // d2<=d1<=d0
    }
    public static double compute(double d0, double d1, String operation) { //2.4
        return
                switch(operation) {
                    case "sum","add","plus" -> d0+d1;
                    case "difference","subtract","minus" -> d0-d1;
                    case "product","multiply","times" -> d0*d1;
                    case "division","by" -> d0/d1;
                    default -> throw new RuntimeException("Invalid Operation");
                };
    }
    public static int digitProduct(int value){
        if(value <0)return -1;
        int digit;
        int sum = 1;
        while (value >0) {
            digit = value % 10;
            if (digit != 0) {
                sum *= digit;
            }
            value /= 10;
        }
        return sum;
    }




    /*
        1.1 create a utility class (a public final class with
            a private constructor) named "Tool" in a package named "work01".
        1.2 create a public static method named "median" that
            receives three "double" parameters named "d0", "d1", and "d2".
            This method returns the median of these 3 values.
        1.3 create a public static method named "compute" that
            receives two "double" parameters named "d0" and "d1" and
            receives one "String" parameter named "operation".
            This method
            returns d0+d1 if "operation" is "sum", "add", or "plus";
            returns d0-d1 if "operation" is "difference", "subtract", or "minus";
            returns d0*d1 if "operation" is "product", "multiply", or "times";
            returns d0/d1 if "operation" is "division" or "by".
            Otherwise, this method throws a RuntimeException with a message
            "Invalid Operation". You must use "switch-case expression".
        1.4 create a public static method named "digitProduct" that
            receives an integer named "value" and returns the product of
            all of the digits in "value". However, if "value" contains digit 0,
            it skips digit 0. If "value" is negative, it returns -1 instead.
            Ex. digitProduct(3027) will return 42; digitProduct(0) will return 1.
         */
}
