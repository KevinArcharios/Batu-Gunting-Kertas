import random

while True:
    computer = random.choice(["batu", "gunting", "kertas"])

    print("\n== Selamat datang di permainan Batu, Gunting, Kertas! ==")
    player = input("Masukkan pilihan Anda (batu, gunting, kertas): ")

    if player == computer:
        hasil = "Seri"
    elif player == "batu":
        if computer == "gunting":
            hasil = "Menang"
        else:
            hasil = "Kalah"
    elif player == "gunting":
        if computer == "kertas":
            hasil = "Menang"
        else:
            hasil = "Kalah"
    elif player == "kertas":
        if computer == "batu":
            hasil = "Menang"
        else:
            hasil = "Kalah"        
    else:
        hasil = "memilih pilihan yang tidak valid"

    print(f"\n\tKomputer memilih {computer}")
    print(f"\tHasilnya anda {hasil}")

    ulang = input("\nMau main lagi? (y/n) : ")
    if ulang == "n":
        break

print("-= Terimakasih sudah bermain! =-")