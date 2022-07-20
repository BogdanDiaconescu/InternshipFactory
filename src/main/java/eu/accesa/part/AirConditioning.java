package eu.accesa.part;

import java.util.Objects;

public class AirConditioning extends Part {

    private Integer vents;

    public AirConditioning(Integer vents) {
        super(0.1 * vents, 100d * vents);
        this.vents = vents;
    }

    public AirConditioning(AirConditioning airConditioning) {
        super(airConditioning);
        this.vents = airConditioning.getVents();
    }

    public Integer getVents() {
        return vents;
    }

    public void setVents(Integer vents) {
        this.vents = vents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AirConditioning that = (AirConditioning) o;
        return vents.equals(that.vents);
    }


}
