package eu.accesa.part;

import java.util.Objects;

public class Chassis extends Part {

    private Integer stiffness;

    public Chassis(Integer stiffness) {
        super(100d * stiffness, 200.0 * stiffness);
        this.stiffness = stiffness;
    }

    public Chassis(Chassis chassis) {
        super(chassis);
        this.stiffness = chassis.getStiffness();
    }

    public Integer getStiffness() {
        return stiffness;
    }

    public void setStiffness(Integer stiffness) {
        this.stiffness = stiffness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chassis chassis = (Chassis) o;
        return stiffness.equals(chassis.stiffness);
    }

}
