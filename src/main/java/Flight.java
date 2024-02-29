import java.util.ArrayList;
import java.util.List;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNumber;
    private String destination;
    private String departAirport;
    private String departTime;

    public Flight(Pilot pilot, Plane plane, int flightNumber, String destination, String departAirport, String departTime) {
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departAirport = departAirport;
        this.departTime = departTime;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();

    }

    public int returnSeats(){
        return this.plane.getPlaneCapacity();
    }

    public int getPassenger(){
        return this.passengers.size();
    }

    public int getCrew(){
        return this.cabinCrewMembers.size();
    }

    public void addPassenger(Passenger passenger){
        if(this.plane.getPlaneCapacity() > this.getPassenger()){
            this.passengers.add(passenger);
        }
    }

    public Plane getPlane() {
        return plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartAirport() {
        return departAirport;
    }

    public String getDepartTime() {
        return departTime;
    }
}
