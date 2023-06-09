/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid.SRP;

/**
 *
 * @author arian
 */
public class ControlCenter {

    public void IncreaseBrightness(final Lamp lamp){
        final int remainingLevel = lamp.getRemainingLevel();
        final int additionalLevel = lamp.getMaxBrightness() - remainingLevel;
        lamp.setRemainingLevel(remainingLevel + additionalLevel);
    }
}
