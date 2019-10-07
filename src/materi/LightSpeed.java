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
class LightSpeed {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;        
        //pendekatan kecepatan cahaya dalam km/detik
        lightspeed = 300000;
        days = 100;        
        //konversi hari ke detik
        seconds = days * 24 * 60 * 60;        
        //hitung jarak
        distance = lightspeed * seconds;        
        System.out.print("Dalam "+days+" hari, ");
        System.out.print("cahaya telah merambat sejauh  ");
        System.out.println(distance + " kilometer");
    }
}
