package eu.accesa.part;

import java.util.Objects;

public class SunRoof extends Part {
    private Boolean electric;

    public SunRoof(Boolean electric, Double price) {
        super(30d, electric ? price * 2 : price);
        this.electric = electric;
    }

    public SunRoof(SunRoof sunRoof) {
        super(sunRoof);
        this.electric = sunRoof.getElectric();
    }

    public Boolean getElectric() {
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
        SunRoof sunRoof = (SunRoof) o;
        return Objects.equals(electric, sunRoof.electric);
    }

}
