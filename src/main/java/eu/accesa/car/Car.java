package eu.accesa.car;

import eu.accesa.enums.Parts;
import eu.accesa.part.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Car implements Comparable<Car> {

    private Map<Parts, List<Part>> parts;
    private AirConditioning airConditioning;
    private AllWheelDrive allWheelDrive;
    private AutoPilot autoPilot;
    private List<Brake> brakes;
    private Chassis chassis;
    private Engine engine;
    private List<Seat> seats;
    private List<Sensor> sensors;
    private SteeringWheel steeringWheel;
    private SunRoof sunRoof;
    private List<Wheel> wheels;

    public Car() {
        parts = new HashMap<>();
    }

    public Double getPrice() {
        return parts.values().stream().mapToDouble(partList -> partList.stream().mapToDouble(Part::getPrice).sum()).sum();
    }

    public AirConditioning getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
        parts.put(Parts.AIR_CONDITIONING, List.of(airConditioning));
    }

    public AllWheelDrive getAllWheelDrive() {
        return allWheelDrive;
    }

    public void setAllWheelDrive(AllWheelDrive allWheelDrive) {
        this.allWheelDrive = allWheelDrive;
        parts.put(Parts.ALL_WHEEL_DRIVE, List.of(allWheelDrive));
    }

    public AutoPilot getAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(AutoPilot autoPilot) {
        this.autoPilot = autoPilot;
        parts.put(Parts.AUTO_PILOT, List.of(autoPilot));
    }

    public List<Brake> getBrakes() {
        return brakes;
    }

    public void setBrakes(List<Brake> brakes) {
        this.brakes = brakes;
        parts.put(Parts.BRAKE, brakes.stream().map(x -> new Part(x)).collect(Collectors.toList()));
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
        parts.put(Parts.CHASSIS, List.of(chassis));
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        parts.put(Parts.ENGINE, List.of(engine));
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
        parts.put(Parts.SEAT, seats.stream().map(x -> new Part(x)).collect(Collectors.toList()));
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
        parts.put(Parts.SENSOR, sensors.stream().map(x -> new Part(x)).collect(Collectors.toList()));
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
        parts.put(Parts.STEERING_WHEEL, List.of(steeringWheel));
    }

    public SunRoof getSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(SunRoof sunRoof) {
        this.sunRoof = sunRoof;
        parts.put(Parts.SUN_ROOF, List.of(sunRoof));
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
        parts.put(Parts.WHEEL, wheels.stream().map(x -> new Part(x)).collect(Collectors.toList()));
    }

    @Override
    public int compareTo(Car o) {
        return Double.compare(getPrice(), o.getPrice());
    }
}
