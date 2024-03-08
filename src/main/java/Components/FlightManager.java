package Components;

public class FlightManager {

    Flight flight;
    int flightBags;

    public FlightManager(Flight flight){
        this.flight = flight;
        this.flightBags = flight.getPlane().getPlaneCapacity();
    }

    public Flight getFlight() {
        return flight;
    }

    public int getFlightBags() {
        return flightBags;
    }

    public int getBaggageAllowancePerPassanger(){
        int passengerCount = this.flight.getPassengers().size();
        return (this.getFlightBags()/passengerCount);
    }
}
