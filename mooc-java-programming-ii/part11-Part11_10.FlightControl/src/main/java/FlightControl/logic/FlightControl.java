package FlightControl.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import FlightControl.domain.*;

public class FlightControl {
    private Map<String, Airplane> airplanes;
    private Map<String, List<Flight>> flights;
    private Map<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String airplaneID, int capacity) {
        this.airplanes.put(airplaneID, new Airplane(airplaneID, capacity));
    }

    public void addFlight(Airplane airplaneID, String departureID, String arrivalID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
    this.places.putIfAbsent(arrivalID, new Place(arrivalID));

    Flight flight = new Flight(
        airplaneID,
        this.places.get(departureID),
        this.places.get(arrivalID)
    );

    this.flights.putIfAbsent(airplaneID.getID(), new ArrayList<>());
    this.flights.get(airplaneID.getID()).add(flight);
    }

    public Airplane getAirplane(String airplaneID) {
        return this.airplanes.get(airplaneID);
    }

    // public Flight getFlight(String airplaneID) {
    //     return this.flights.get(airplaneID);
    // }
    
     public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        List<Flight> allFlights = new ArrayList<>();
    for (List<Flight> flightsForPlane : this.flights.values()) {
        allFlights.addAll(flightsForPlane);
    }
    return allFlights;
    }
}
