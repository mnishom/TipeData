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
public class BooleanExample {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b adalah "+b);
        b = true;
        System.out.println("b adalah "+b);
        //Nilai boolean dapat mengendalikan pernyataan if
        if(b){
            System.out.println("pernyataan ini dieksekusi ");
        }
        b = false;
        if(b){
            System.out.println("Pernyataan ini tidak dieksekusi ");
        }
        //hasil dari operator relational
        System.out.println("10 > 7 adalah "+(10 > 7));
    }
}
