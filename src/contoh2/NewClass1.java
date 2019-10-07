/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh2;

/**
 *
 * @author nishom
 */
public class NewClass1 {
    
    private static double angka(double a){
        return a*5;
    }
    
    private static String data(String... s){
        StringBuilder sb = new StringBuilder();
        for (String string : s) {
            sb.append(string.concat("\n"));
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        //casting example
        int a = 50;
        double x = angka( (double) a);
        System.out.println(x);
        
        //composite example
        String s1 = data("S1","S2","S3","S4","S5");
        System.out.println(s1);
        
        //boolean example
        boolean b = true;
        int i = 10;
        int j = 11;
        boolean c = j>i;
        if(c){        
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}
