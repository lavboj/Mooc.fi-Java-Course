package FlightControl.ui;

import java.util.Scanner;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;

public class UserInterface {
    private Scanner scanner;
    private FlightControl flightControl;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.flightControl = new FlightControl();
    }

    public void start() {
        assetControl();
        System.out.println();
        flightControl();
        System.out.println();
    }

    public void assetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String userIn = this.scanner.nextLine();

            if (userIn.equals("x")) {
                break;
            }

            processingCommandsAC(userIn);
        }
    }

    public void flightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String userIn = this.scanner.nextLine();

            if (userIn.equals("x")) {
                break;
            }

            processingCommandsFC(userIn);
        }
    }

    public void processingCommandsAC(String command) {
        if (command.equals("1")) {
            addAirplane();
        }else if (command.equals("2")) {
            addFlight();
        }
    }

    public void processingCommandsFC(String command) {
        if (command.equals("1")) {
            printAirplanes();
        }else if (command.equals("2")) {
            printFlights();
        }else if(command.equals("3")) {
            printDetails();
        }
    }

    public void addAirplane() {
        System.out.print("Give the airplane id: ");
        String inputID = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        String inputCapacity = scanner.nextLine();
        
        this.flightControl.addAirplane(inputID, Integer.valueOf(inputCapacity));
    }

    public void addFlight() {
        System.out.print("Give the airplane id: ");
        String inputID = scanner.nextLine();
        System.out.print("Give the departure airport id: ");
        String inputDep = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String inputTar = scanner.nextLine();

        // this.flightControl.addFlight(inputID, inputDep, inputTar);
    }

    private Airplane askForAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = flightControl.getAirplane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }

    private void printAirplanes() {
        for (Airplane plane : flightControl.getAirplanes()) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        for (Flight flight : flightControl.getFlights()) {
            System.out.println(flight);
            System.out.println("");
        }
    }

    private void printDetails() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();
        System.out.println(plane);
        System.out.println();
    }
}
