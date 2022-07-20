package eu.accesa.part;

import java.util.Objects;

public class Part {
    private Double steelContentInKg;
    private Double price;

    public Part(Double steelContentInKg, Double price) {
        this.steelContentInKg = steelContentInKg;
        this.price = price;
    }

    public Part(Part part) {
        this.steelContentInKg = part.getSteelContentInKg();
        this.price = part.getPrice();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSteelContentInKg() {
        return steelContentInKg;
    }

    public void setSteelContentInKg(Double steelContentInKg) {
        this.steelContentInKg = steelContentInKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Part part = (Part) o;
        return Objects.equals(steelContentInKg, part.steelContentInKg) && Objects.equals(price, part.price);
    }


}
