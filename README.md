# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data transaksi menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa pilihan nomor jadwal film dan jumlah tiket yang ingin dibeli, kemudian memproses data tersebut untuk memberikan output berupa informasi detail dari struk pemesanan bioskop seperti nama studio, tipe lounge premium, akumulasi biaya tambahan, serta kalkulasi total harga pembayaran tiket secara otomatis.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Showtime`, `PremiumShowtime`, dan `CinemaApp` adalah contoh dari class.

```java
public class Showtime {
    ...
}

public class PremiumShowtime extends Showtime {
    ...
}

public class CinemaApp {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `schedule[0] = new Showtime("Interstellar", "14:00", 40000);` adalah contoh pembuatan object.

```java
schedule[0] = new Showtime("Interstellar", "14:00", 40000);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `movieTitle`, `timeSlot`, `basePrice`, `loungeType`, dan `premiumSurcharge` adalah contoh atribut.

```java
protected String movieTitle;
protected String timeSlot;
protected double basePrice;

private String loungeType;
private double premiumSurcharge;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor terdapat pada class `Showtime` dan `PremiumShowtime`.

```java
public Showtime(String movieTitle, String timeSlot, double basePrice) {
    this.movieTitle = movieTitle;
    this.timeSlot = timeSlot;
    this.basePrice = basePrice;
}

public PremiumShowtime(String movieTitle, String timeSlot, double basePrice,
                       String loungeType, double premiumSurcharge) {
    super(movieTitle, timeSlot, basePrice);
    this.loungeType = loungeType;
    this.premiumSurcharge = premiumSurcharge;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMovieTitle`, `setTimeSlot`, dan `setBasePrice` adalah contoh method mutator.

```java
public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
}

public void setTimeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
}

public void setBasePrice(double basePrice) {
    this.basePrice = basePrice;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMovieTitle`, `getTimeSlot`, dan `getBasePrice` adalah contoh method accessor.

```java
public String getMovieTitle() {
    return movieTitle;
}

public String getTimeSlot() {
    return timeSlot;
}

public double getBasePrice() {
    return basePrice;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private atau menggunakan tingkat visibilitas tertentu dan diakses melalui method. Pada kode ini, atribut `loungeType` dan `premiumSurcharge` dienkapsulasi menggunakan access modifier `private`.

```java
private String loungeType;
private double premiumSurcharge;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PremiumShowtime` mewarisi `Showtime` dengan sintaks `extends`.

```java
public class PremiumShowtime extends Showtime {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Pada kode ini diterapkan menggunakan **Method Overriding**, yaitu method `calculateTicketPrice()` dan `getDetails()` pada class `PremiumShowtime` menggantikan implementasi milik class `Showtime`.

```java
@Override
public double calculateTicketPrice() {
    return basePrice + premiumSurcharge;
}

@Override
public String getDetails() {
    return super.getDetails() + " [Premium Lounge: " + loungeType + "]";
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini digunakan seleksi `if` untuk memvalidasi pilihan menu dan jumlah tiket.

```java
if (choice == 0) {
    running = false;
    System.out.println("Exiting system.");
    break;
}

if (choice < 1 || choice > schedule.length) {
    System.out.println("Invalid selection. Please choose between 1 and " + schedule.length);
    continue;
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode secara berulang. Pada kode ini digunakan `for` untuk menampilkan daftar jadwal dan `while` sebagai perulangan utama aplikasi.

```java
for (int i = 0; i < schedule.length; i++) {
    System.out.println((i + 1) + ". " + schedule[i].getDetails());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini digunakan class `Scanner` untuk menerima input dan `System.out.println` untuk menampilkan hasil transaksi.

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Select showtime number (1-3) or 0 to exit: ");
String input = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Showtime[] schedule = new Showtime[3];` adalah contoh penggunaan array berbasis object.

```java
Showtime[] schedule = new Showtime[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini digunakan `try catch` untuk menangani kesalahan input berupa `NumberFormatException` maupun exception lainnya.

```java
try {
    // blok kode yang berpotensi memicu error input
} catch (NumberFormatException e) {
    System.out.println("Error: Input must be a valid numeric format.");
} catch (Exception e) {
    System.out.println("An unexpected error occurred: " + e.getMessage());
}
```

## Usulan Nilai

| No  | Materi         | Nilai |
| :-: | -------------- | :---: |
|  1  | Class          |   5   |
|  2  | Object         |   5   |
|  3  | Atribut        |   5   |
|  4  | Constructor    |   5   |
|  5  | Mutator        |   5   |
|  6  | Accessor       |   5   |
|  7  | Encapsulation  |   5   |
|  8  | Inheritance    |   5   |
|  9  | Polymorphism   |  10   |
| 10  | Seleksi        |   5   |
| 11  | Perulangan     |   5   |
| 12  | IO Sederhana   |  10   |
| 13  | Array          |  15   |
| 14  | Error Handling |  15   |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rahimah  
NPM: 2410010062
