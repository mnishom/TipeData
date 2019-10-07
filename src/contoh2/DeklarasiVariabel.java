package contoh2;

import java.util.List;

public class DeklarasiVariabel {
    //Type Identifier [=value][,Identifier=[value]...];
    String nama;
    String alamat, kelas, a="a", b="b", c;
    int x;
    Long y= (long)10;
    long z=10;
    long m=9;
    //Boolean d = m <= z ? true: false;
    Double d1 = (double)10;
    Integer ij = 15;
    Float f = 15F;
    Gaji g;
    List<Object> list;
    String[] str;
    byte _byte = 127;
    short _short = 32767;
    int _int = 2147483647;
    //long _long = 922337203685477580;
    //long _long = 9223372036854775807;
    char _char1 = 'A';
    char _char2 = '\u1000';
    
    private void cetak(){
        System.out.println(Long.min(z, m));
        System.out.println(Long.MAX_VALUE);
        System.out.println((int)'a');
        System.out.println("Float: "+Float.MAX_VALUE);
        // 3.4028235E38
        System.out.println("Float Range: "+2.4028235 * Math.pow(10, 38));
    }
    public static void main(String[] args) {
        DeklarasiVariabel dv = new DeklarasiVariabel();
        dv.cetak();
    }
}
