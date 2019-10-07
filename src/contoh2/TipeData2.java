package contoh2;

public class TipeData2 {
    
    public static void main(String[] args) {
        int usia = 1;
        double d1 = (double) usia;
        double d2 = Double.valueOf(usia);
        Double d3 = (double)usia;
        Double d4 = Double.valueOf(usia);
        byte b1 = d4.byteValue();
        short s1 = d4.shortValue();
        int i1 = d4.intValue();
        long l1 = d4.longValue();
        float f1 = d4.floatValue();
        float f2 = Float.parseFloat(""+d4);
        double _d1 = d4;
        String s;
        
        s = ""+f1;
        s = String.valueOf(_d1); 
        int p = (int)l1;
        int p1 = Integer.parseInt(""+l1);
        int p2 = Integer.parseInt(String.valueOf(l1)); 
        
        System.out.println("123"+l1);
        System.out.println("123".concat(String.valueOf(l1)));
        byte _by = 127;
        short _sh = 32767;
        int _in = 2147483647;
        int A = (int)'A';
        int a = (int)'a';
        System.out.println("A=> "+A);
        System.out.println("a=> "+a);
        
        System.out.println("================");
        
        long l = (long) (1.7 * Math.pow(10, 308));
        double dMin = 1.7 * Math.pow(10, -308);
        double dMax = 1.7 * Math.pow(10, 308);
        System.out.println(l);
        System.out.println(dMin);
        System.out.println(dMax);
        
        //9.223.372.036.854.775.807
        
        boolean bol=false;
        boolean bol1 = 1+1-2+3/2 > 3;
        if(bol1){
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        char rArrow = '\u2192';
        System.out.println(rArrow);
    }
    
}
