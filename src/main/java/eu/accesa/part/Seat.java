package eu.accesa.part;

import java.util.Objects;

public class Seat extends Part {
    private Boolean heated;
    private Boolean manual;
    private Boolean electric;

    public Seat(Double price, Boolean heated, Boolean manual, Boolean electric) {
        super(10.0, price);
        this.heated = heated;
        this.manual = manual;
        this.electric = electric;
    }

    public Seat(Seat seat) {
        super(seat);
        this.heated = seat.getHeated();
        this.manual = seat.getManual();
        this.electric = seat.isElectric();
    }

    public Boolean getHeated() {
        return heated;
    }

    public void setHeated(Boolean heated) {
        this.heated = heated;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(Boolean electric) {
        this.electric = electric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Seat seat = (Seat) o;
        return Objects.equals(heated, seat.heated) && Objects.equals(manual, seat.manual) && Objects.equals(electric, seat.electric);
    }

}
