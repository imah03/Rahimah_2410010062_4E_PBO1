package model;

// [1. CLASS] - Mendefinisikan class induk untuk jadwal film
public class Showtime {
    
    // [7. ENCAPSULATION] - Mengamankan atribut menggunakan access modifier protected
    protected String movieTitle; // [3. ATRIBUT]
    protected String timeSlot;   // [3. ATRIBUT]
    protected double basePrice;  // [3. ATRIBUT]

    // [4. CONSTRUCTOR] - Constructor untuk menginisialisasi objek Showtime
    public Showtime(String movieTitle, String timeSlot, double basePrice) {
        this.movieTitle = movieTitle;
        this.timeSlot = timeSlot;
        this.basePrice = basePrice;
    }

    // [5. MUTATOR / SETTER] - Method untuk mengubah nilai atribut
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
  
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    // [6. ACCESSOR / GETTER] - Method untuk mengambil nilai atribut
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Method yang nantinya akan di-override di subclass (Polymorphism)
    public double calculateTicketPrice() {
        return basePrice;
    }

    public String getDetails() {
        return "Movie: " + movieTitle + " | Time: " + timeSlot + " | Price: " + calculateTicketPrice();
    }
}