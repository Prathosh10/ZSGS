public class Flight {
    private final int flightNumber;
    private String name;
    private int totalSeats;
    private String type;
    private String company;
    private static int autoNumber = 1000;

    public Flight(String name, int totalSeats, String type, String company) {
        this.flightNumber = autoNumber++;
        this.name = name;
        this.totalSeats = totalSeats;
        this.type = type;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void flightDetails() {
        System.out.println(this.name + " - " + this.flightNumber);
        System.out.println("Flight Number : " + this.flightNumber + "\n" +
                "Flight Name : " + this.name + "\n" +
                "Total No.Of.Seats : " + this.totalSeats + "\n" +
                "Flight Type : " + this.type + "\n" +
                "Company : " + this.company
        );

        System.out.println();
    }
}

class FlightDemo {
    public static void main(String[] args) {
        Flight flight_1 = new Flight("hugo", 150, "Passenger", "Kingfisher");
        Flight flight_2 = new Flight("fugo", 200, "Cargo", "Air India");
        flight_1.flightDetails();
        flight_2.flightDetails();
    }
}
