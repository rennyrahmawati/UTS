
package uts;
import java.util.Scanner;
public class Uts {

    public static double rata;
    public static double ip;
    public static int jumlahLulus = 0 ;
    public static int jumlahTidakLulus = 0;
    public static int jumlahData;
    double[] nilai = new double [100];
    
    public void HitungRata(){
      
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah IPK: ");
        double jml = input.nextDouble();
        
        double sum = 0;
        for (int i = 1; i <= jml; i++) {
            
            
                System.out.println("Nilai IPK " + i + ": " );
                nilai[i] = input.nextDouble();
                
                sum += nilai[i];
                
            }
        
        rata = sum / jml;
        int jmls = (int) (jml);
        
        System.out.println("Total nilai: " + " " + sum);
        System.out.println("IP:" + rata);
        
        if (rata >= 2.75 && rata <= 4.00)
            System.out.println("Lulus");
        else    
            System.out.println("Data IP tidak valid");
               
    }
    
    public void NilaiAkhir() {
        for (int i = 1; i <=rata; i++) {
            if (rata >= 2.75 && rata <= 4.00) {
                jumlahLulus = jumlahLulus + 1;
                               
            } else {
                jumlahTidakLulus = jumlahTidakLulus + 1;
                               
            }
        }
            
        }
    public void Panggil (){
       System.out.println("Jumlah Yang Lulus : " + jumlahLulus );
       System.out.println("Jumlah Yang Tidak Lulus : " + jumlahTidakLulus );
   }
   
    public static void main(String[] args) {
            
      UTSIP proses = new UTSIP ();
      proses.HitungRata();
      proses.NilaiAkhir();
      proses.Panggil();
    }
    
}

