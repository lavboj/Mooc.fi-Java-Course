package FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place departureID;
    private Place arrivalID;

    public Flight(Airplane airplane, Place departureID, Place arrivalID) {
        this.airplane = airplane;
        this.departureID = departureID;
        this.arrivalID = arrivalID;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getDepartureID() {
        return this.departureID;
    }

    public Place getArrivalID() {
        return this.arrivalID;
    }

    @Override
    public String toString() {
        return this.airplane + " (" + this.departureID + "-" + this.arrivalID + ")";
    }
}
