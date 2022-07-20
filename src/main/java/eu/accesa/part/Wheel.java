package eu.accesa.part;

import java.util.Objects;

public class Wheel extends Part {

    private Integer numberOfSpokes;

    public Wheel(Integer numberOfSpokes) {
        super(1d * numberOfSpokes, 30d * numberOfSpokes);
        this.numberOfSpokes = numberOfSpokes;
    }

    public Wheel(Wheel wheel) {
        super(wheel);
        this.numberOfSpokes = wheel.getNumberOfSpokes();
    }

    public Integer getNumberOfSpokes() {
        return numberOfSpokes;
    }

    public void setNumberOfSpokes(Integer numberOfSpokes) {
        this.numberOfSpokes = numberOfSpokes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wheel wheel = (Wheel) o;
        return Objects.equals(numberOfSpokes, wheel.numberOfSpokes);
    }

}
