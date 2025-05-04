package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.readings = new ArrayList<>();
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public List<Integer> readings() {
        return this.readings;
    }

    @Override
    public boolean isOn() {
        if (this.sensors.stream().allMatch(senso -> senso.isOn())) {
            return true;
        }else return false;
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(senso -> senso.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(senso -> senso.setOff());
    }

    @Override
    public int read() {
        int result = (int) this.sensors.stream()
        .mapToInt(senso -> senso.read())
        .average()
        .orElse(0);

        this.readings.add(result);
        return result;
    }
    
}
