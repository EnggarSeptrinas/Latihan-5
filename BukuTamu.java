package StaticAndFinal;
public class BukuTamu {
public static int id = 1;
private static String BT [][] = new String[4][20];

public static void NamaTamu(String nama, int idd) {
    String id = Integer.toString(idd);
    BT[0][idd] = id;
    BT[1][idd] = nama;
     }
public static void noHp(String noHp, int idd){
    BT[2][idd] = noHp;
}
public static void AlamatTamu(String alamat, int idd) {
    BT[3][idd] = alamat;
        }
public static void DisplayBT() {
         System.out.println("ID \t\t Nama \t\t Hp \t\t Alamat");
         for (int i = 0; i < id; i++) {
             for (int j = 0; j < 4; j++) {
                 System.out.print(BT[j][i] + "\t\t");
             }
            System.out.println("");
         }
         id++;
     }
 }

    
    


