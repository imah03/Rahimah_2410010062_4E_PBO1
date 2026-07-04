package model;

import model.Showtime;
import model.PremiumShowtime;
import java.util.Scanner;

// [1. CLASS] - Main class untuk menjalankan aplikasi
public class CinemaApp {
    public static void main(String[] args) {
        // [12. IO SEDERHANA] - Menggunakan Scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);
        
        // [13. ARRAY] - Mendeklarasikan Array berorientasi objek untuk menyimpan daftar jadwal film
        Showtime[] schedule = new Showtime[3];

        // [2. OBJECT] - Membuat instansiasi atau objek baru dari class Showtime dan PremiumShowtime
        schedule[0] = new Showtime("Interstellar", "14:00", 40000);
        schedule[1] = new PremiumShowtime("Inception", "17:00", 50000, "IMAX Suite", 25000);
        schedule[2] = new Showtime("The Dark Knight", "20:00", 45000);

        System.out.println("=== Cinema Management System ===");
        
        // [11. PERULANGAN] - Menggunakan loop 'for' untuk menampilkan isi array schedule
        for (int i = 0; i < schedule.length; i++) {
            System.out.println((i + 1) + ". " + schedule[i].getDetails());
        }

        // [11. PERULANGAN] - Menggunakan 'while' loop untuk menjaga program tetap berjalan
        boolean running = true;
        while (running) {
            
            // [14. ERROR HANDLING] - Menggunakan blok try-catch untuk mengantisipasi error/crash input
            try {
                System.out.print("\nSelect showtime number (1-3) or 0 to exit: ");
                String input = scanner.nextLine();
                int choice = Integer.parseInt(input);

                // [10. SELEKSI] - Percabangan if-else untuk menentukan logika menu
                if (choice == 0) {
                    running = false;
                    System.out.println("Exiting system.");
                    break;
                }

                // [10. SELEKSI] - Validasi pilihan nomor menu
                if (choice < 1 || choice > schedule.length) {
                    System.out.println("Invalid selection. Please choose between 1 and " + schedule.length);
                    continue;
                }

                Showtime selected = schedule[choice - 1];

                System.out.print("Enter number of tickets to buy: ");
                int tickets = Integer.parseInt(scanner.nextLine());

                // [10. SELEKSI] - Validasi agar jumlah tiket tidak boleh 0 atau minus
                if (tickets <= 0) {
                    System.out.println("Ticket quantity must be greater than zero.");
                    continue;
                  }

                double totalCost = selected.calculateTicketPrice() * tickets;
                System.out.println("\n--- Booking Receipt ---");
                System.out.println("Movie: " + selected.getMovieTitle());
                System.out.println("Quantity: " + tickets);
                System.out.println("Total Payment: " + totalCost);

            } catch (NumberFormatException e) {
                // [14. ERROR HANDLING] - Menangkap error jika user menginput huruf/karakter saat meminta angka
                System.out.println("Error: Input must be a valid numeric format.");
            } catch (Exception e) {
                // [14. ERROR HANDLING] - Menangkap error umum lainnya
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }
}