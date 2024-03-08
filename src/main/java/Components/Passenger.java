package Components;

public class Passenger {
    private String name;
    private int numberBags;
    private int flightNumber;
    private int seatNumber;

    public Passenger(String name, int numberBags, int flightNumber, int seatNumber) {
        this.name = name;
        this.numberBags = numberBags;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberBags() {
        return numberBags;
    }

    public void setNumberBags(int numberBags) {
        this.numberBags = numberBags;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
