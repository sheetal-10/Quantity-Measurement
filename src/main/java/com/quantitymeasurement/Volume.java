package com.quantitymeasurement;

public class Volume {
    enum Unit {GALLON, LITRE };

    private static final double GALLON_TO_LITRE = 3.78;
    private final Unit unit;
    private final double value;

    public Volume(Unit unit, double value){
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Volume that) {
        if (this.unit.equals(Volume.Unit.GALLON) && that.unit.equals(Volume.Unit.GALLON))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITRE))
            return Double.compare(this.value * GALLON_TO_LITRE, that.value) == 0;
        if (this.unit.equals(Unit.LITRE) && that.unit.equals(Unit.GALLON))
            return Double.compare(this.value, that.value * GALLON_TO_LITRE) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }
}
