import java.util.Scanner;
public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom,menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                   
                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Nomor baris atau kolom kursi tidak tersedia! Silahkan masukkan kembali.");
                    } else if (penonton[baris - 1][kolom - 1] !=null) {
                        System.out.println("Warning: Kursi tersebut sudah terisi oleh penonton lain! Silakan masukkan baris dan kolom kembali.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                            break;
                    }
                }
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("n")) {
                    break;
                  }
                }
            } else if (menu == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke-" + (i + 1) + ": " );
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
        sc.close();
    }
}
