package eu.accesa.part;

import java.util.Objects;

public class AllWheelDrive extends Part{
    private Integer performance;

    public AllWheelDrive(Integer performance, Double price) {
        super(100.0 * performance, price);
        this.performance = performance;
    }

    public AllWheelDrive(AllWheelDrive allWheelDrive) {
        super(allWheelDrive);
        this.performance = allWheelDrive.getPerformance();
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AllWheelDrive that = (AllWheelDrive) o;
        return performance.equals(that.performance);
    }

}
