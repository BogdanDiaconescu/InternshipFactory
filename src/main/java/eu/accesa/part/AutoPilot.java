package eu.accesa.part;

import java.util.Objects;

public class AutoPilot extends Part {

    // 0 - 5 (degree of autonomy)
    private Integer level;

    public AutoPilot(Integer level) {
        super(0d, 2500d * level);
        this.level = level;
    }

    public AutoPilot(AutoPilot autoPilot) {
        super(autoPilot);
        this.level = autoPilot.getLevel();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AutoPilot autoPilot = (AutoPilot) o;
        return level.equals(autoPilot.level);
    }

}
