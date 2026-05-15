import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            // buat angka acak
            Scanner input = new Scanner(System.in);
            Random random = new Random();
            int acak = random.nextInt(2);
            
            // buat pilihan computer
            String computer;
    
            if (acak == 0) {
                computer = "batu";
            } else if (acak == 1) {
                computer = "gunting";
            } else {
                computer = "kertas";
            }
    
            // buat pilihan player
            System.out.println("\n== Selamat datang di permainan batu gunting kertas ==");
    
            System.out.print("Masukkan pilihan anda (batu , gunting , kertas) : ");
            String player = input.nextLine();
    
            // buat sistem game
            String hasil;
    
            if (player.equals(computer)) {
                hasil = "Seri";
            } else if (player.equals("batu")) {
                if (computer.equals("gunting")) {
                    hasil = "Menang!";
                } else {
                    hasil = "Kalah!";
                }
            } else if (player.equals("gunting")) {
                if (computer.equals("kertas")) {
                    hasil = "Menang!";
                } else {
                    hasil = "Kalah!";
                }
            } else if (player.equals("kertas")) {
                if (computer.equals("batu")) {
                    hasil = "Menang!";
                } else {
                    hasil = "Kalah!";
                }
            } else {
                hasil = "memilih pilihan tidak valid!";
            }
    
            // tampilkan hasil
            System.out.println("\tKomputer memilih " + computer);
            System.out.println("\tHasilnya anda " + hasil);
    
            // lanjut?
            System.out.print("\nMau keluar? (y/n) : ");
            String lanjut = input.nextLine();
    
            if (lanjut.equals("y")) {
                System.out.println("-= Terimakasih sudah bermain");
                input.close();
                break;
            }
        }
    }
}