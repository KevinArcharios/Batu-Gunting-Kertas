#include <iostream>
#include <random>
#include <string>

using namespace std;

int main() {
    while (true){
        // buat angka acak
        random_device rd;
        mt19937 gen(rd()); 
        uniform_int_distribution<> dis(1, 3);
        int random = dis(gen);
    
        // buat pilihan komputer
        string computer;
            if (random == 1) {
                computer = "batu";
            } else if (random == 2) {
                computer = "gunting";
            } else {
                computer = "kertas";
            }
    
        // buat pilihan player
        string player;
        cout << "\n== Selamat datang di permainan Batu, Gunting, Kertas! ==" << endl;
        cout << "Masukkan pilihan Anda ( batu , gunting , kertas ): ";
        cin >> player;
    
        // buat sistem permainan
        string hasil;
        if (player == computer) {
            hasil = "Seri";
        } else if (player == "batu") {
            if (computer == "gunting") {
                hasil = "Menang!";
            } else {
                hasil = "Kalah!";
            }
        } else if (player == "gunting") {
            if (computer == "kertas") {
                hasil = "Menang!";
            } else {
                hasil = "Kalah!";
            }
        } else if (player == "kertas") {
            if (computer == "batu") {
                hasil = "Menang!";
            } else {
                hasil = "Kalah!";
            }
        } else {
            hasil = "memilih pilihan tidak valid!";
        }

        // tampilkan hasil 
        cout << "\tKomputer memilih " << computer << endl;
        cout << "\tHasilnya anda " << hasil << endl;

        // lanjut?
        string lanjut;
        cout << "\nMau lanjut main? (y/n): ";
        cin >> lanjut;
        if (lanjut != "y") {
            break;
        }
    }

    cout << "-= Terima kasih sudah bermain! =-" << endl;

    return 0;
}
