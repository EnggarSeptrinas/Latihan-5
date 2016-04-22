package StaticAndFinal;
import java.util.Scanner;
public class BukuTamuDemo {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Masukan Jumlah Tamu             \t: ");
         int tamu = input.nextInt();
         for (int i = 0; i < tamu; i++) {
             System.out.print("Masukan Nama Tamu ke"+(i+1)+"    \t:");
             String nama = input.next();
             System.out.print("Masukan Alamat Tamu ke"+(i+1)+"  \t:");
             String alamat = input.next();
             System.out.print("Masukan No.Hp Tamu ke"+(i+1)+"   \t:");
             String noHp = input.next();
             BukuTamu.NamaTamu(nama, i);
             BukuTamu.noHp(noHp, i);
             BukuTamu.AlamatTamu(alamat, i);
             System.out.println("============================================");
             System.out.println("Daftar Tamu Yang Hadir         \t:");
             BukuTamu.DisplayBT();
             System.out.println("============================================");
         }
     }
 }
    
       

