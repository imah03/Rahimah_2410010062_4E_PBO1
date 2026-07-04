package model;

// [1. CLASS] - Mendefinisikan class untuk tipe premium
// [8. INHERITANCE] - Menggunakan keyword 'extends' untuk mewarisi sifat dari class Showtime
public class PremiumShowtime extends Showtime {
    
    // [7. ENCAPSULATION] - Menggunakan modifier private untuk membatasi akses langsung
    private String loungeType;        // [3. ATRIBUT]
    private double premiumSurcharge;  // [3. ATRIBUT]

    // [4. CONSTRUCTOR] - Constructor Subclass
    public PremiumShowtime(String movieTitle, String timeSlot, double basePrice, String loungeType, double premiumSurcharge) {
        super(movieTitle, timeSlot, basePrice); // Memanggil constructor class induk
        this.loungeType = loungeType;
        this.premiumSurcharge = premiumSurcharge;
    }

    // [5. MUTATOR / SETTER]
    public void setLoungeType(String loungeType) {
        this.loungeType = loungeType;
    }

    public void setPremiumSurcharge(double premiumSurcharge) {
        this.premiumSurcharge = premiumSurcharge;
    }

    // [6. ACCESSOR / GETTER]
    public String getLoungeType() {
        return loungeType;
    }

    public double getPremiumSurcharge() {
        return premiumSurcharge;
    }

    // [9. POLYMORPHISM - OVERRIDING] - Mengubah perilaku method calculateTicketPrice dari class induk
    @Override
    public double calculateTicketPrice() {
        return basePrice + premiumSurcharge;
    }

    // [9. POLYMORPHISM - OVERRIDING] - Mengubah perilaku method getDetails dari class induk
    @Override
    public String getDetails() {
        return super.getDetails() + " [Premium Lounge: " + loungeType + "]";
    }
}