public class Passenger {
    private String name;
    private int numberBags;

    public Passenger(String name, int numberBags) {
        this.name = name;
        this.numberBags = numberBags;
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
}
