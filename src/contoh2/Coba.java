package contoh2;

import java.util.Scanner;

/**
 *
 * @author nishom
 */
public class Coba {
    public static void main(String[] args) {
        String loop, pilihMenu = ""; 
        System.out.println("=========================================");
        System.out.println("| MENU Perhitungan FISIKA |");
        System.out.println("========================================= ");
        System.out.println("| 1. Menghitung Hukum OHM |");
        System.out.println("| 2. Momentum |");
        System.out.println("| 3. Usaha & Energi |");
        System.out.println("| 4. Tekanan |");
        System.out.println("| 5. Gaya |");
        System.out.println("=========================================");

        Scanner scan = new Scanner(System.in);
        for (loop="Y"; loop.equals("Y")||loop.equals("y");) {
            System.out.print("Pilih Menu [1 - 5] : ");
            int pilihan = scan.nextInt();
            switch (pilihan) {
               case 1:
                  System.out.println("-------------------------------------------------------------------------------------------");
                  System.out.println("==---===---===[ Mengitung Hukum OHM ]===---===---===");
                  System.out.println("Rumus HUKUM OHM Adalah : R=V/I");
                  System.out.println("Mencari Hambatan Listrik (R). Dengan Memasukan Beda Potensial (V) dan Kuat Arus Listrik (I)");
                  System.out.println("-------------------------------------------------------------------------------------------");
                  System.out.print("Masukan [ V ] = ");
                  float V = scan.nextFloat();
                  System.out.print("Masukan [ I ] = ");
                  float I = scan.nextFloat();
                  double R;
                  R = V/I;
                  System.out.println("Diketahui : ");
                  System.out.println("Beda Potensial [V] Adalah "+V);
                  System.out.println("Kuat Arus Listrik [I] Adalah "+I);
                  System.out.println("Maka, R = V/I Adalah "+R);
                  System.out.println("-------------------------------------------------------------------------------------------");

                  System.out.print("Ada Sebuah Studi Kasus.. "
                  + "\nJika Anda Mau Menghitung Tekan [1] atau Tekan [2] Untuk Ke Menu Sebelumnya : ");

                  int pilihmenu = scan.nextInt();
                  if (pilihmenu==1) {
                      System.out.println("[ Study Kasus (1) ]");
                      System.out.println("-------------------");
                      System.out.println("Mencari, Hambatan Listrik (R) dengan Beda Potensial 12 Volt dan Kuat Arus Listrik 2 A. Berapa Hambatan Listrik yan didapat");
                      System.out.print("Masukan [ V ] = ");
                      float V1 = scan.nextFloat();
                      System.out.print("Masukan [ I ] = ");
                      float I1 = scan.nextFloat();
                      double R1;
                      R1 = (V1/I1);
                      System.out.println("Maka, Hambatan Listrik yang diperoleh adalah "+R1);
                      System.out.println("-------------------------------------------------");

                  }else if (pilihmenu==2) {
                      System.out.println("Silahkan Pilih Menu Yang Lain.. Terima Kasih");
                      System.out.println("-------------------------------------------------------------------------------------------");
                  }
                  break;

               case 2:
                  for (loop="Y"; loop.equals("Y")||loop.equals("y");) {
                      System.out.println("-------------------------------------------------------------------------------------------");
                      System.out.println("---===---===---===---[ MOMENTUM ]---===---===---===---");
                      System.out.println("==---===---===[ Persamaan Arus Listrik ]===---===---===");
                      System.out.println("Rumus Persamaan Arus Listrik Adalah ");
                      System.out.println("[1] Untuk Mencari Kuat Arus Listrik Yaitu I = Q/t ");
                      System.out.println("[2] Untuk Mencari Besar Muatan Listrik Yaitu Q = I*t ");
                      System.out.println("[3] Untuk Mencari Selang Waktu Yaitu t = Q/I ");
                      System.out.println("-------------------------------------------------------------------------------------------");
                      System.out.println("Keterangan : ");
                      System.out.println("I = Kuat Arus Listrik (Ampere = A)");
                      System.out.println("Q = Besar Muatan Listrik (Coulomb = C");
                      System.out.println("t = Selang Waktu (Sekon = s");
                      System.out.println("-------------------------------------------------------------------------------------------");
                      System.out.println("Contoh Soal dan Penyelesaian : ");
                      System.out.println("Dalam Suatu Penghantar Mengalir arus 15 Ampere selama 3 detik. Tentukan Besar Muatan Listrik");

                      System.out.print("Kuat Arus Listrik [I] = ");
                      double I2 = scan.nextDouble();
                      System.out.print("Selang Waktu [ t ] = ");
                      double t = scan.nextDouble();
                      double Q;
                      Q = I2*t;
                      System.out.println("Maka, Besar Muatan Listrik [Q], dengan rumus Q = I*t Adalah "+Q);
                      System.out.println("-------------------------------------------------------------------------------------------");
                      System.out.print("Jika Anda Ingin Mencoba Untuk Menggunakan Rumus dengan Pencarian yg Lain, "
                      + "\nSilahkan.. Pilih dan tekan [1][2][3] - Jika Tidak Tekan [4] = ");

                      int pilihmenu2 = scan.nextInt();
                      switch (pilihmenu2) {
                          case 1:
                              {
                                  System.out.println("[1] Untuk Mencari Kuat Arus Listrik.. Yaitu I = Q/t ");
                                  System.out.println("-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-");
                                  System.out.println("Berarti, Nilai yang ingin didapat adalah Kuat Arus Listrik atau I");
                                  System.out.print("Silahkan Input Nilai Untuk mencari I ");
                                  System.out.print("Besar Muatan Arus Listrik [Q] = ");
                                  double Q2 = scan.nextDouble();
                                  System.out.print("Selang Waktu [ t ] = ");
                                  double t2 = scan.nextDouble();
                                  double I3;
                                  I3 = Q2/t2;
                                  System.out.println("Maka, Kuat Arus Listrik [I], dengan rumus I = Q/t Adalah "+I3);
                                  System.out.println("-------------------------------------------------------------");
                                  break;
                              }
                          case 2:
                              {
                                  System.out.println("[2] Untuk Mencari Besar Muatan Listrik Yaitu Q = I*t ");
                                  System.out.println("-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-");
                                  System.out.println("Berarti, Nilai yang ingin didapat adalah Besar Muatan Listrik atau Q");
                                  System.out.print("Silahkan Input Nilai Untuk mencari Q ");
                                  System.out.print("Kuat Arus Listrik [I] = ");
                                  double I3 = scan.nextDouble();
                                  System.out.print("Selang Waktu [ t ] = ");
                                  double t2 = scan.nextDouble();
                                  double Q2;
                                  Q2 = I3*t2;
                                  System.out.println("Maka, Besar Muatan Listrik [Q], dengan rumus Q = I*t Adalah "+Q2);
                                  System.out.println("-------------------------------------------------------------");
                                  break;
                              }
                          case 3:
                              {
                                  System.out.println("[3] Untuk Mencari Selang Waktu Yaitu t = Q/I ");
                                  System.out.println("-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-[-]-");
                                  System.out.println("Berarti, Nilai yang ingin didapat adalah Selang Waktu atau t");
                                  System.out.print("Silahkan Input Nilai Untuk mencari t ");
                                  System.out.print("Besar Muatan Listrik [ Q ] = ");
                                  double Q2 = scan.nextDouble();
                                  System.out.print("Kuat Arus Listrik [ I ] = ");
                                  double I3 = scan.nextDouble();
                                  double t2;
                                  t2 = Q2/I3;
                                  System.out.println("Maka, Selang Waktu [t], dengan rumus Q = I*t Adalah "+t2);
                                  System.out.println("-------------------------------------------------------------");
                                  break;
                              }
                          default:
                              System.out.println("Silahkan Pilih Menu Yang Lain.. Terima Kasih");
                              System.out.println("-------------------------------------------------------------------------------------------");
                              break;
                      }
                      System.out.print("Pilih yang lain Hayooo.. Tekan [Y/N] : ");
                      loop = scan.next();
                  }
                  break;
               case 3:
                  for (loop="Y"; loop.equals("Y")||loop.equals("y");) {
                      System.out.println("-------------------------------------------------------------------------------------------");
                      System.out.println("---===---===---===---[ Usaha Dan Energi ]---===---===---===---");
                      System.out.println("[1] Usaha ");
                      System.out.println("[2] Energi ");
                      System.out.print("Pilih Menu Tersebut = ");
                      int pilihmenu3 = scan.nextInt();
                      if (pilihmenu3==1) {
                      System.out.println("---===---===---===--[ Usaha ]--===---===---===---===");
                      System.out.println("Rumus [ W = F*S ] "
                      + "\nKeterangan :"
                      + "\n[ W = usaha (newton meter atau Joule) ]"
                      + "\n[ F = gaya (newton) ]"
                      + "\n[ S = jarak (meter) ]"
                      + "\nUsaha Yang Dilakukan Oleh Pegas"
                      + "[ W = (1/2*k*x^2) ]"
                      + "\n[ W = usaha (newton meter atau Joule) ]"
                      + "\n[ k = konstanta pegas (Newton/m2) ]"
                      + "\n[ x = pertambahan panjang pegas (meter) ]");

                      System.out.print("Jika ada sebuah Kasus/Soal Tekan [1], Jika Ingin menghitung sendiri Tekan [2]"
                      + "\nPilih dan Tekan = ");

                      int pilihmenu32 = scan.nextInt();
                          switch (pilihmenu32) {
                              case 1:
                                  System.out.println("=====******======[ Sebuah Kasus / Soal ]=====******======");
                                  System.out.println("Gaya 20 Newton dikerjakan pada balok hingga balok berpindah sejauh 2 meter. Usaha yang dikerjakan gaya F pada balok adalah ");
                                  System.out.println("Diketahui : "
                                          + "\nF = 20 Newton"
                                          + "\ns = 2 meter");
                                  float F = 20;
                                  System.out.println("Nilai Gaya (F) = "+F);
                                  float s = 2;
                                  System.out.println("Nilai Jarak (S) = "+s);
                                  float W;
                                  W = (F*s);
                                  System.out.println("Maka, usaha yang diperoleh dari Soal tersebut (W = F*S) adalah "+W);
                                  System.out.println("-------------------------------------------------------------------------------------------");
                                  break;
                              case 2:
                                  System.out.println("=====******======[ Input Soal Sendiri ]=====******======");
                                  System.out.println("Tentukan Nilai Gaya dan Jarak : ");
                                  float F2 = scan.nextFloat();
                                  System.out.print("Masukan Nilai Gaya (F) = ");
                                  float s2 = scan.nextFloat();
                                  System.out.print("Masukan Nilai Jarak (s) = ");
                                  System.out.println("Diketahui : "
                                          + "\nGaya = "+F2
                                          + "\nJarak = "+s2);
                                  System.out.println("Hasil perhitungan = ");
                                  float W2;
                                  W2 = (F2*s2);
                                  System.out.println("Maka, usaha yang diperoleh dari Soal tersebut (W = F*S) adalah "+W2);
                                  System.out.println("-------------------------------------------------------------------------------------------");
                                  break;
                              default:
                                  System.out.println("Silahkan Pilih Menu Lain... ");
                                  break;
                          }
                      }
                      if (pilihmenu3==2) {
                          System.out.println("---===---===---===--[ Energi ]--===---===---===---===");
                          System.out.println("Rumus [ Em = Ep + Ek ] "
                          + "\n------------------------------------------------------------------------------"
                          + "\n Untuk Mencari Em, Terlebih dahulu menghitung Ep & Ek... Dengan Cara : "
                          + "\n[1] Energi mekanik"
                          + "\n[2] Energi Kinetik");

                          System.out.println("------------------------------------------------------------------------");
                          System.out.print("Pilih Energi yang ingin dihitung = ");
                          int pilihmenu31 = scan.nextInt();
                          if (pilihmenu31==1) {
                              System.out.println("=========[ Energi Mekanik ]========="
                              + "\nRumus [ Ep = m*g*h ]"
                              + "\nKeterangan : "
                              + "\n[Ep : Energi potensial (J) ]"
                              + "\n[ m : massa benda (kg) ]"
                              + "\n[ g : percepatan gravitasi (m/s2) ]"
                              + "\n[ h : tinggi benda dari permukaan tanah (meter) ");

                              System.out.println("=========[ Energi Mekanik ]========="
                              + "\nRumus [ Ek = 1/2 * m * v^2 ]"
                              + "\n[ Ek = Energi Kinetik (J) ]"
                              + "\n[ m = Massa benda (kg) "
                              + "\n[ v = kecepatan benda (kg) ]");

                              System.out.println("");
                          }
                      }
                      System.out.print("Pilih yang lain Hayooo.. Tekan [Y/N] : ");
                      loop = scan.next();
                  }
                  break;

               case 4:
                  System.out.println("-------------------------------------------------------------------------------------------");
                  System.out.println("---===---===---===---[ TEKANAN ]---===---===---===---");
                  System.out.println("Rumus [ p = F/A ] "
                  + "\np = Tekanan (N/m^2 atau dn/cm^2"
                  + "\nF = Gaya (N atau dn)"
                  + "\nA = Luas alas/penampang (m^2 atau cm^2)");
                  System.out.println("-------------------------------------------------------------------------------------------");
                  System.out.println("Untuk mencari Tekanan (p), harus menentukan nilai Gaya dan Luas Alas terlebih dahulu ");
                  System.out.print("Tentukan Nilai Gaya (N) = ");
                  float F = scan.nextFloat();
                  System.out.print("Tentukan Nilai Luas alas (cm^2) = ");
                  float A = scan.nextFloat();

                  System.out.println("Diketahui ");
                  System.out.println("Gaya = "+F);
                  System.out.println("Luas alas = "+A);
                  System.out.println("Jawab : ");
                  float p;
                  p = F/A;
                  System.out.println("Maka, Tekanan yang diperoleh dari perhitungan tersebut dengan Rumus p = F/A adalah "+p);
                  System.out.println("-------------------------------------------------------------------------------------------");

               break;

               case 5:
                  for (loop="Y"; loop.equals("Y")||loop.equals("y");) {
                     System.out.println("-------------------------------------------------------------------------------------------");
                     System.out.println("---===---===---===---[ Gaya ]---===---===---===---");
                     System.out.println("[1] Gaya Gesek"
                     + "\n[2] Gaya Berat"
                     + "\n[3] Berat Jenis");
                     System.out.println("-------------------------------------------------------------------------------------------");
                     System.out.print("Pilih Gaya yang ingin anda Hitung [1/2] = ");
                     int pilihmenu33 = scan.nextInt();
                      switch (pilihmenu33) {
                          case 1:
                              System.out.println("-_-_-_-_-_-[ Gaya Gesek ]-_-_-_-_-_-");
                              System.out.println("Rumus (Fg = Miu*N)"
                                      + "\nFg = Gaya Gesek (N)"
                                      + "\nMiu = Koefisien Gesekan"
                                      + "\nN = Gaya Normal");
                              break;
                          case 2:
                              System.out.println("-_-_-_-_-_-[ Gaya Berat ]-_-_-_-_-_-");
                              System.out.println("Rumus (w = m*g)"
                                      + "\nw = Gaya Berat (N)"
                                      + "\nm = massa benda (kg)"
                                      + "\ng = Gravitasi bumi (m/s^2)");
                              break;
                          case 3:
                              System.out.println("-_-_-_-_-_-[ Berat Jenis ]-_-_-_-_-_-");
                              System.out.println("Rumus (s = p*g atau s = w/V)"
                                      + "\ns = berat bersih (N/m^3)"
                                      + "\nw = berat janda (kg)"
                                      + "\nv = volume oli (m^3)"
                                      + "\np = massak kompor (kg/m^3)");
                              break;
                          default:
                              break;
                      }

                     System.out.print("Pilih yang lain Hayooo.. Tekan [Y/N] : ");
                     loop = scan.next();
                  }
                  break;

                  default:
                  System.out.println("Menu yang anda pilih Tidak Ada");
                  break;
               }

            System.out.print("Silahkan Pilih Menu Yang Lain.. Seru Lhooo.. Tekan [Y/N] : ");
            loop = scan.next();
            //System("CLS");

        }
        System.out.println("Terima Kasih.. ");
    }
}
