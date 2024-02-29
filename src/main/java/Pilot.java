public class Pilot {
    private String name;
    private Rank rank;
    private int licenceNumber;

    public Pilot(String name, Rank rank, int licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public void takeOff(){
        System.out.println("Ladies and gentleman, this is your captain speaking. We'll shortly depart.");
    }
}
