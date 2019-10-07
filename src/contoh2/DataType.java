package contoh2;

public class DataType {
    //Type Identifier [= value][,  Identifier=[value]…];
    int a = 10;
    String b = "", c, d="", e;
    CurriculumVitae cv;
    
    private void task1(){
        byte b1;
        short s1;
        int a1 = 1; 
        long l1;
        float f1 = 2.1F;
        double d1;
        boolean bol1;
        String _str = "Jefri Nicole.mp3";
        String _str2 = _str.substring(0, _str.lastIndexOf("."));
        System.out.println(_str2);
        
        MyList myList;   
    }
    
    private void task2(){
        byte b = 127;
        short s = 32767;
        
    }
    
    private void task3(){
        boolean b = false;
        int n = 11;
        int k = 12;
        b = n >= k;
        if(b){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
    
    private void task4(){
        System.out.println("\u2192");
    }
    
    private void task5(){
        int a = 128;
        byte b = (byte)a;
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        DataType d = new DataType();
        d.task5();
        
//        System.out.println(Float.MAX_EXPONENT);
//        System.out.println(Double.MAX_EXPONENT);
    }
}
