package com.github.bsferreira.solid.lsp.violation;

/**
 * Created by bsferreira on 16-04-2016.
 */
public class Car extends Vehicle {
// en esta clase solo llamaremos al método del padre por medio del "super".
// para realizar dicho proceso se debe de controlar el atributo changeGear por medio del metodo "setChangeGear"
    @Override
    public void changeGear(Gear gear) {
        setChangeGear(!Gear.R.equals(gear)||Gear.D.equals(getGear()));
        super.changeGear(gear);
    }
    // de esta manera controlamos el diferente comportamiento que puede tener esta clase llamando al metodo de su clase padre
}
