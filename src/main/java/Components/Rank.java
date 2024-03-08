package Components;

public enum Rank {
    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    FLIGHTATTENDANT("Components.Flight Attendant");

    private final String rank;

    Rank(String rank){
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }
}
