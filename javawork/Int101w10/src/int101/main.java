package int101;

import work01.Tool;
import work02.FriendList;

public class main {
        public static void main(String[] args) { //4.5
            testMedian();
            testCompute();
            testDigitProduct();
            testFriendList();
        }
// (Please continue the next page.)
        static void testMedian() { //4.1
            System.out.println("## test Tool.median() ##");
            double x=1.0,y=2.0,z=3.0;
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    x,y,z,Tool.median(x,y,z));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    x,z,y,Tool.median(x,z,y));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    y,x,z,Tool.median(y,x,z));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    y,z,x,Tool.median(y,z,x));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    z,x,y,Tool.median(z,x,y));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    z,y,x,Tool.median(z,y,x));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    x,y,y,Tool.median(x,y,y));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    y,x,y,Tool.median(y,x,y));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    y,y,x,Tool.median(y,y,x));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    x,x,y,Tool.median(x,x,y));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    x,y,x,Tool.median(x,y,x));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    y,x,x,Tool.median(y,x,x));
            System.out.format("median of %3.1f,%3.1f,%3.1f = %3.1f%n",
                    z,z,z,Tool.median(z,z,z));
        }
        static void testCompute() { //4.2
            System.out.println("## test Tool.compute() ##");
            double d0=9.0,d1=2.0;
            String op = "sum";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "add";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "plus";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "difference";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "subtract";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "minus";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "product";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "multiply";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "times";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "division";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op = "by";
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
// (Please continue the next page.)
            d1=0.0; // divided by zero
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            d0=-3.0; // a negative number divided by zero
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            d0=0.0; // zero divided by zero
            System.out.format("%3.1f,%3.1f,%s = %3.1f%n",d0,d1,op,Tool.compute(d0,d1,op));
            op ="power"; // an invalid operation
            try {
                System.out.format("%3.1f,%3.1f,%s = %3.1f%n",
                        d0,d1,op,Tool.compute(d0,d1,op));
            } catch (Exception e) {
                System.out.format("Operation %s with %3.1f, %3.1f: %s%n",op,d0,d1,e);
            }
        }
        static void testDigitProduct() { //4.3
            System.out.println("## test Tool.digitProduct() ##");
            int n = 20900751;
            System.out.format("product of all digits in %d ... %d%n",n,Tool.digitProduct(n));
            n = 165310;
            System.out.format("product of all digits in %d ... %d%n",n,Tool.digitProduct(n));
            n = 123;
            System.out.format("product of all digits in %d ... %d%n",n,Tool.digitProduct(n));
            n = 0;
            System.out.format("product of all digits in %d ... %d%n",n,Tool.digitProduct(n));
            n = 1;
            System.out.format("product of all digits in %d ... %d%n",n,Tool.digitProduct(n));
        }
        static void testFriendList() { //4.4
            System.out.println("## test FriendList ##");
            FriendList f = FriendList.newList();
            System.out.format("f: [%s]%n", f);
            String name = null;
            System.out.format("f.addFriend(%s): %b --> [%s]%n",name,f.addFriend(name),f);
            name = "first";
            System.out.format("f.addFriend(%s): %b --> [%s]%n",name,f.addFriend(name),f);
            name = "second";
            System.out.format("f.addFriend(%s): %b --> [%s]%n",name,f.addFriend(name),f);
            name = "third";
            System.out.format("f.addFriend(%s): %b --> [%s]%n",name,f.addFriend(name),f);
            name = "second"; // a duplicate name
            System.out.format("f.addFriend(%s): %b --> [%s]%n",name,f.addFriend(name),f);
            name = "first"; // a duplicate name
            System.out.format("f.addFriend(%s): %b --> [%s]%n",name,f.addFriend(name),f);
            name = "forth";
            System.out.format("f.addFriend(%s): %b --> [%s]%n",name,f.addFriend(name),f);
            name = " "; // a blank name
            System.out.format("f.addFriend(%s): %b --> ",name,f.addFriend(name),f);
            name = ""; // an empty name
            System.out.format("f.addFriend(%s): %b --> [%s]%n",name,f.addFriend(name),f);
            name = "fifth";
            System.out.format("f.addFriend(%s): %b --> [%s]%n",name,f.addFriend(name),f);
        }
}

