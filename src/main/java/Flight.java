import java.util.List;

public class Flight {
    private Pilot pilot;
    private List<CabinCrewMember> cabinCrewMembers;
    private List<Passenger> passengers;
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

    }
}
