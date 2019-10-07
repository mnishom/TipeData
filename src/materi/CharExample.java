/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi;

/**
 *
 * @author nishom
 */
public class CharExample {
    public static void main(String[] args) {
        char ch1, ch2, ch3;
        
        //kode untuk 'X'
        ch1 = 88;
        ch2 = 'Y';
        System.out.print("ch1 dan ch2 : ");
        System.out.println(ch1+ " "+ch2);
        
        System.out.println();
        //char diperlukan seperti bilangan bulat
        ch3 = 'X';
        System.out.println("ch3 berisi "+ch3);
        
        //menaikkan nilai ch3
        ch3++;
        System.out.println("ch3 sekarang bernilai "+ch3);
    }
}
