/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid.SRP;

/**
 *
 * @author arian
 */
public class Lamp {

    private final int maxBrightness;
    private int remainingLevel;

    public Lamp(final int maxBrightness) {
        remainingLevel = maxBrightness;
        this.maxBrightness = maxBrightness;
    }

    public int getMaxBrightness() {
        return maxBrightness;
    }
    public int getRemainingLevel() {
        return remainingLevel;
    }
    public void setRemainingLevel(int remainingLevel) {
        this.remainingLevel = remainingLevel;
    }
    public void reduceLevel() {
        remainingLevel--;
    }
}
