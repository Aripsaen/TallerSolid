package com.github.bsferreira.solid.lsp.violation;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Vehicle {
    private boolean changeGear = true;
    private Gear gear;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        if(!(changeGear)){
            throw new RuntimeException("No se puede cambiar de cambio a Revrersa cuando"+ getGear().toString()+"esta en marcha");
        }
        this.gear = gear;
    }

    public boolean isChangeGear() {
        return changeGear;
    }

    public void setChangeGear(boolean changeGear) {
        this.changeGear = changeGear;
    }
}